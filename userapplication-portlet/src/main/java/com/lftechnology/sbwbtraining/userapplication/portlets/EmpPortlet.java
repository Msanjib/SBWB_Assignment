package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.service.persistence.EmpPersistence;
import com.lftechnology.sbwbtraining.userapplication.service.persistence.EmpPersistenceImpl;
import com.lftechnology.sbwbtraining.userapplication.portlets.ActionUtils;
import com.liferay.portal.NoSuchAccountException;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmpPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		System.out.println("inside view");
		super.doView(renderRequest, renderResponse);
	}
	
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		// TODO Auto-generated method stub
		super.serveResource(resourceRequest, resourceResponse);
	}
	
	public void getList(ActionRequest request, ActionResponse response)
			throws IOException, PortletException, NoSuchAccountException,
			PortalException {
		System.out.println("inside getlist search");
		try {
			if (request.getParameter("search") == null) {
				System.out.println("null value of search item");
				List<Emp> objectList = EmpLocalServiceUtil.getAllEmployees();
				writeJSON(request, response, ActionUtils.getData(objectList));
			} else {
				System.out.println("not a null value");
				List<Emp> object = searchUser(request, response);
				writeJSON(request, response, ActionUtils.getData(object));
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// super.serveResource(resourceRequest, resourceResponse);
	}

	@SuppressWarnings("null")
	public void addUser(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		System.out.println("Inside addEmployee method.");
		Emp user = null;
		// requested parameter from input box
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");
		String companyName = request.getParameter("companyName");
		String email = request.getParameter("email");
		user = EmpLocalServiceUtil.createEmp(0);
		if (request.getParameter("userId") != null
				&& !request.getParameter("userId").isEmpty()) {
			String primaryKey = request.getParameter("userId");
			user.setPrimaryKey(Long.parseLong(primaryKey));
		}
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAddress(address);
		user.setPhoneNumber(phoneNumber);
		user.setCompanyName(companyName);
		user.setEmail(email);
		user.setCompanyId(PortalUtil.getCompanyId(request));
		PortalUtil.getUserId(request);
		try {
			user.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
					PortalUtil.getCompanyId(request)).getGroupId());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			EmpLocalServiceUtil.addUpdateEmp(user);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws NoSuchAccountException
	 * @throws SystemException
	 * @throws PortalException
	 */
	public void deleteUser(ActionRequest request, ActionResponse response)
			throws NoSuchAccountException, SystemException, PortalException {
		System.out.print("inside delete employee");
		long userId = ParamUtil.getLong(request, "userId");
		EmpLocalServiceUtil.deleteEmp(userId);
	}

	public List<Emp> searchUser(ActionRequest request, ActionResponse response)
			throws NoSuchAccountException, SystemException, PortalException {
		System.out.print("inside search");
		String searchItem = request.getParameter("search");
		System.out.println(searchItem);
		List<Emp> objectList = EmpLocalServiceUtil.searchEmployees(searchItem);
		System.out.print("results:------->" + objectList);
		// return objectList;
		return objectList;
	}
}
