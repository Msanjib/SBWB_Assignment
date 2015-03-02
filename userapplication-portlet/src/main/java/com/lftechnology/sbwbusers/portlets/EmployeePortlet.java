package com.lftechnology.sbwbusers.portlets;

import java.io.IOException;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import com.liferay.util.bridges.mvc.MVCPortlet;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.lftechnology.sbwbusers.model.Employee;
import com.lftechnology.sbwbusers.service.EmployeeLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class EmployeePortlet extends MVCPortlet {
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		super.doView(renderRequest, renderResponse);
	}

	/**
	 * 
	 * @param request
	 * @param response
	 * @throws PortalException
	 * @throws SystemException
	 */
	public void addUser(ActionRequest request, ActionResponse response)
			throws PortalException, SystemException {
		System.out.println("Inside addEmployee method.");
		// requested parameter from input box
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String address = request.getParameter("address");
		String phoneNumber = request.getParameter("phoneNumber");
		String companyName = request.getParameter("companyName");
		String email = request.getParameter("email");
		Employee employee = EmployeeLocalServiceUtil.createEmployee(0);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);
		employee.setAddress(address);
		employee.setPhoneNumber(phoneNumber);
		employee.setCompanyName(companyName);
		employee.setEmail(email);
		employee.setCompanyId(PortalUtil.getCompanyId(request));
		PortalUtil.getUserId(request);
		try {
			employee.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
					PortalUtil.getCompanyId(request)).getGroupId());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			EmployeeLocalServiceUtil.addUpdateEmployee(employee);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}