package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.portlets.ActionUtils;
import com.liferay.portal.NoSuchAccountException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
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
	
	public void getList(ActionRequest request, ActionResponse response)
			throws IOException, PortletException, NoSuchAccountException,
			PortalException {
		System.out.println("inside getlist search");
		try {
			if (request.getParameter("search") == null) {
				System.out.println("null value of search item");
				List<Emp> objectList = EmpLocalServiceUtil.getAllEmployees();
				writeJSON(request, response, ActionUtils.getAllEmployeeAsJson(objectList));
			} else {
				System.out.println("not a null value");
				List<Emp> object = searchUser(request, response);
				writeJSON(request, response, ActionUtils.getAllEmployeeAsJson(object));
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
	
	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		String uid = resourceRequest.getParameter("uid");
		if (uid != null) {
			// System.out.println("called "+resourceRequest.getParameter("uid"));
			Emp employee = null;
			try {
				employee = EmpLocalServiceUtil.getEmp(Long
						.parseLong(uid));
				if (employee != null) {
					//List<Emp> objectList = EmpLocalServiceUtil.searchEmployees(searchItem);
					//resourceResponse.getWriter().print(ActionUtils.convertUsersDataToJson(objectList));
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("dsf:" + employee.getFirstName());
			
			super.serveResource(resourceRequest, resourceResponse);
			// resourceRequest.setRenderParameter("jspPage", "/view.jsp");
		} else {
			try {
				List<Emp> objectList = EmpLocalServiceUtil.getAllEmployees();
				resourceResponse.getWriter().print(
						ActionUtils.getAllEmployeeAsJson(objectList).toString());
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// super.serveResource(resourceRequest, resourceResponse);
	}
	public void update(ActionRequest req, ActionResponse res) {
		System.out.println("update called");
	}

	public void goToUserInfo(ActionRequest req, ActionResponse res) {
		String uid = req.getParameter("idSelected");
		if (uid != null) {
			// System.out.println("called "+resourceRequest.getParameter("uid"));
			Emp employee = null;
			try {
				employee = EmpLocalServiceUtil.getEmp(Long
						.parseLong(uid));
				if (employee != null) {
					req.setAttribute("userInfo", employee);
					res.setRenderParameter("jspPage", "/user-profile-view.jsp");
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("dsf:" + employee.getFirstName());
			
			// resourceRequest.setRenderParameter("jspPage", "/view.jsp");
		} 
		
		
		
	}
	

	public void showUserInfo(ActionRequest req, ActionResponse res)
			throws NumberFormatException, PortalException, SystemException {
		// System.out.println("called "+req.getParameter("uid"));
		// SBWBUsers sbwbUsers =
		// SBWBUsersLocalServiceUtil.getSBWBUsers(Long.parseLong(req.getParameter("uid").toString()));
		// System.out.println("dsf:"+sbwbUsers.getFirstName());
		// req.setAttribute("product", "");
		//
	}

	public void editOrDeleteSBWBUsers(ActionRequest req, ActionResponse res) {
		String action = req.getParameter("oper");
		String sbwbUserId = req.getParameter("userId");
		if (action.equals("edit")) {
			String firstName = req.getParameter("firstName");
			String lastName = req.getParameter("lastName");
			String address = req.getParameter("address");
			String phoneNumber = req.getParameter("phoneNumber");
			String email = req.getParameter("email");
			Emp employee = EmpLocalServiceUtil.createEmp(0);
			employee.setFirstName(firstName);
			employee.setLastName(lastName);
			employee.setAddress(address);
			employee.setPhoneNumber(phoneNumber);
			employee.setEmail(email);
			employee.setUserId(Long.parseLong(sbwbUserId));
			try {
				EmpLocalServiceUtil.addUpdateEmp(employee);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (action.equals("del")) {
			sbwbUserId = req.getParameter("id");
			if (Validator.isNotNull(sbwbUserId)) {
				try {
					EmpLocalServiceUtil.deleteEmp(Long.parseLong(sbwbUserId));
					//deleteEmployeeById(Long.parseLong(sbwbUserId));
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("Delete Unsuccessful");
			}
		}
	}
}
