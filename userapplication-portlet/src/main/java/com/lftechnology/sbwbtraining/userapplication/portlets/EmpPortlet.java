package com.lftechnology.sbwbtraining.userapplication.portlets;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.portlets.ActionUtils;
import com.liferay.portal.NoSuchAccountException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * This class helps in control of Portlet {@link Emp}
 * 
 * @author bibhushan
 * 
 */
public class EmpPortlet extends MVCPortlet {
	public static Logger LOGGER = Logger.getLogger(EmpPortlet.class
			.getSimpleName());

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse){
		try {
			List<Division> departments = DivisionLocalServiceUtil
					.getEveryDivisions();
			renderRequest.setAttribute("departments", departments);
			renderRequest.setAttribute("jsonDepartments",
					ActionUtils.getDepartmentsAsJson(departments));
		} catch (SystemException e) {
			LOGGER.log(Level.SEVERE, "System Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		}
		
		try {
			super.doView(renderRequest, renderResponse);
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		} catch (PortletException e) {
			LOGGER.log(Level.SEVERE, "Portlet Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		}
	}

	/**
	 * This method prints JSON {@link List} of {@link Emp} instance according to
	 * parameter <code>search</code>.
	 * 
	 * @param request
	 * @param response
	 * 
	 * @author bibhushan
	 */
	public void getEmployeeList(ActionRequest request, ActionResponse response) {
		try {
			if (request.getParameter("search") == null) {
				List<Emp> objectList = EmpLocalServiceUtil.getAllEmployees();
				writeJSON(request, response,
						ActionUtils.getAllEmployeeAsJson(objectList));
			} else {
				List<Emp> object = ActionUtils.searchUser(request, response);
				writeJSON(request, response,
						ActionUtils.getAllEmployeeAsJson(object));
			}
		} catch (SystemException e) {
			LOGGER.log(Level.SEVERE, "System Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}", new Object[] {
					e.getClass(), e.getMessage(), e.getCause() });
		} catch (NoSuchAccountException e) {
			LOGGER.log(Level.SEVERE, "No Such Account Exception.{0} {1} {2}", new Object[] {
					e.getClass(), e.getMessage(), e.getCause() });
		} catch (PortalException e) {
			LOGGER.log(Level.SEVERE, "Portal Exception.{0} {1} {2}", new Object[] {
					e.getClass(), e.getMessage(), e.getCause() });
		}
	}

	/**
	 * This method deletes the {@link Emp} by using its userId.
	 * 
	 * @param request
	 * @param response
	 * 
	 * @author bibhushan
	 */
	public void deleteUser(ActionRequest request, ActionResponse response){
		long userId = ParamUtil.getLong(request, "userId");
		try {
			EmpLocalServiceUtil.deleteEmp(userId);
		} catch (PortalException e) {
			LOGGER.log(Level.SEVERE, "Portal Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		} catch (SystemException e) {
			LOGGER.log(Level.SEVERE, "System Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		}
	}

	/**
	 * This method handles the ajax call for addition of records to database,
	 * getting user info as {@link JSON} with provided id and also retrives the
	 * information of all the employee as {@link JSON} according to the
	 * conditions met.
	 * 
	 * @param resourceRequest
	 *            the request sent to the portlet
	 * @param resourceResponse
	 *            the response sent by the portlet
	 * 
	 * @author sanjib maharjan
	 */
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse){
		String uid = resourceRequest.getParameter("uid");
		if (uid != null) {
			if (uid.equalsIgnoreCase("add")) {
				Emp employee = EmpLocalServiceUtil.createEmp(0);
				employee.setFirstName(resourceRequest.getParameter("fname"));
				employee.setLastName(resourceRequest.getParameter("lname"));
				employee.setPhoneNumber(resourceRequest.getParameter("phone"));
				employee.setStatus(Boolean.parseBoolean(resourceRequest
						.getParameter("status")));
				employee.setDepId(Long.parseLong(resourceRequest
						.getParameter("department")));
				employee.setAddress(resourceRequest.getParameter("address"));
				employee.setCompanyId(PortalUtil.getCompanyId(resourceRequest));
				employee.setEmail(resourceRequest.getParameter("email"));

				try {
					employee.setCompanyName(PortalUtil.getCompany(
							resourceRequest).getName());
					employee.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
							employee.getCompanyId()).getGroupId());
					EmpLocalServiceUtil.addUpdateEmp(employee);
				} catch (PortalException e) {
					LOGGER.log(
							Level.SEVERE,
							"Portal Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				} catch (SystemException e) {
					LOGGER.log(
							Level.SEVERE,
							"System Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				}

				JSONObject recordsjsonObject = JSONFactoryUtil
						.createJSONObject();
				recordsjsonObject.put("firstName", "");
				try {
					resourceResponse.getWriter().print(recordsjsonObject);
					super.serveResource(resourceRequest, resourceResponse);
				} catch (IOException e) {
					LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(), e.getCause() });
				} catch (PortletException e) {
					LOGGER.log(Level.SEVERE, "Portlet Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(), e.getCause() });
				}
			} else {
				Emp employee = null;
				try {
					employee = EmpLocalServiceUtil.getEmp(Long.parseLong(uid));
					if (employee != null) {
						try {
							resourceResponse.getWriter().print(
									ActionUtils.convertUsersDataToJson(employee));
						} catch (IOException e) {
							LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
									new Object[] { e.getClass(), e.getMessage(), e.getCause() });
						}
					}
				} catch (NumberFormatException e) {
					LOGGER.log(
							Level.SEVERE,
							"Number format exception occured on uid.It cannot be parsed as Long.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				} catch (PortalException e) {
					LOGGER.log(
							Level.SEVERE,
							"Portal Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				} catch (SystemException e) {
					LOGGER.log(
							Level.SEVERE,
							"System Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				}
				try {
					super.serveResource(resourceRequest, resourceResponse);
				} catch (IOException e) {
					LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(), e.getCause() });
				} catch (PortletException e) {
					LOGGER.log(Level.SEVERE, "Portlet Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(), e.getCause() });
				}
			}

		} else {
			try {
				resourceResponse.getWriter().print(
						ActionUtils.getAllEmployeeAsJson(
								EmpLocalServiceUtil.getAllEmployees())
								.toString());
			} catch (SystemException e) {
				LOGGER.log(
						Level.SEVERE,
						"System Exception.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
			} catch (IOException e) {
				LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(), e.getCause() });
			}
		}
	}

	/**
	 * This method redirects the page to the user profile page to view the
	 * information of user with the selected id
	 * 
	 * @param request
	 *            the request sent to the portlet
	 * @param response
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void goToUserInfo(ActionRequest request, ActionResponse response) {
		String uid = request.getParameter("idSelected");
		if (uid != null) {
			Emp employee = null;
			try {
				employee = EmpLocalServiceUtil.getEmp(Long.parseLong(uid));
				if (employee != null) {
					request.setAttribute("userInfo", employee);
					response.setRenderParameter("jspPage",
							"/user-profile-view.jsp");
				}
			} catch (NumberFormatException e) {
				LOGGER.log(
						Level.SEVERE,
						"The userid cannot be casted to the Long.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
			} catch (PortalException e) {
				LOGGER.log(
						Level.SEVERE,
						"Something went wrong with portal.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
			} catch (SystemException e) {
				LOGGER.log(
						Level.SEVERE,
						"System exception.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
			}
		}

	}

	/**
	 * This method performs the edit or delete operation according to the action
	 * parameter passed as <code>oper</code>.If <code>oper</code> is edit then
	 * the edit operation takes place with the provided information or if
	 * <code>oper</code> is del then delete operation will takes place with the
	 * action of deleting the user info from database with the matched ids.
	 * 
	 * @param request
	 *            the request sent to the portlet
	 * @param response
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void editOrDeleteSBWBUsers(ActionRequest request,
			ActionResponse response) {
		String action = request.getParameter("oper");
		String sbwbUserId = request.getParameter("userId");
		if (action.equals("edit")) {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			Long deptId = Long
					.parseLong(request.getParameter("departmentName"));
			Boolean status = Boolean.parseBoolean(request
					.getParameter("status"));
			String address = request.getParameter("address");
			String phoneNumber = request.getParameter("phoneNumber");
			String email = request.getParameter("email");
			Emp employee = EmpLocalServiceUtil.createEmp(0);
			employee.setFirstName(firstName);
			employee.setStatus(status);
			employee.setDepId(deptId);
			employee.setLastName(lastName);
			employee.setAddress(address);
			employee.setPhoneNumber(phoneNumber);
			employee.setEmail(email);
			employee.setUserId(Long.parseLong(sbwbUserId));
			try {
				EmpLocalServiceUtil.addUpdateEmp(employee);
			} catch (PortalException e) {
				LOGGER.log(
						Level.SEVERE,
						"Portal Exception.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
				e.printStackTrace();
			} catch (SystemException e) {
				LOGGER.log(
						Level.SEVERE,
						"System Exception.{0} {1} {2}",
						new Object[] { e.getClass(), e.getMessage(),
								e.getCause() });
			}
		} else if (action.equals("del")) {
			sbwbUserId = request.getParameter("id");
			if (Validator.isNotNull(sbwbUserId)) {
				try {
					EmpLocalServiceUtil.deleteEmp(Long.parseLong(sbwbUserId));
				} catch (NumberFormatException e) {
					LOGGER.log(
							Level.SEVERE,
							"The sbwbUserId cannot be parsed as Long.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				} catch (PortalException e) {
					LOGGER.log(
							Level.SEVERE,
							"Portal Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				} catch (SystemException e) {
					LOGGER.log(
							Level.SEVERE,
							"System Exception.{0} {1} {2}",
							new Object[] { e.getClass(), e.getMessage(),
									e.getCause() });
				}
			} else {
				LOGGER.log(Level.SEVERE, "The sbwbUserId is null");
			}
		}
	}
}
