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

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

public class EmpPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("Do view called"
					+ DivisionLocalServiceUtil.getEveryDivisions().size());
			List<Division> departments = DivisionLocalServiceUtil.getEveryDivisions();
			renderRequest.setAttribute("departments", departments);
			renderRequest.setAttribute("jsonDepartments", ActionUtils.getDepartmentsAsJson(departments));
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse) throws IOException,
			PortletException {
		System.out.println("served");
		String uid = resourceRequest.getParameter("uid");
		if (uid != null) {
			if (uid.equalsIgnoreCase("add")) {
				System.out.println("add");
				Emp employee = EmpLocalServiceUtil.createEmp(0);
				employee.setFirstName(resourceRequest.getParameter("fname"));
				employee.setLastName(resourceRequest.getParameter("lname"));
				employee.setPhoneNumber(resourceRequest.getParameter("phone"));
				System.out.println(resourceRequest.getParameter("status")
						+ "  dfd"
						+ Boolean.parseBoolean(resourceRequest
								.getParameter("status")));
				employee.setStatus(Boolean.parseBoolean(resourceRequest
						.getParameter("status")));
				employee.setDepId(Long.parseLong(resourceRequest.getParameter("department")));
				employee.setAddress(resourceRequest.getParameter("address"));
				employee.setCompanyId(PortalUtil.getCompanyId(resourceRequest));
				employee.setCompanyName(PortalUtil.getComputerName());
				employee.setEmail(resourceRequest.getParameter("email"));
				try {
					employee.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
							employee.getCompanyId()).getGroupId());
				} catch (PortalException e1) {
					e1.printStackTrace();
				} catch (SystemException e1) {
					e1.printStackTrace();
				}

				try {
					EmpLocalServiceUtil.addUpdateEmployee(employee);
				} catch (PortalException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SystemException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				JSONObject recordsjsonObject = JSONFactoryUtil
						.createJSONObject();
				recordsjsonObject.put("firstName", "");
				resourceResponse.getWriter().print(recordsjsonObject);
				super.serveResource(resourceRequest, resourceResponse);
			} else {
				Emp employee = null;
				try {
					employee = EmpLocalServiceUtil.getEmp(Long.parseLong(uid));
					if (employee != null) {
						resourceResponse.getWriter().print(
								ActionUtils.convertUsersDataToJson(employee));
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
			}

		} else {
			try {
				resourceResponse.getWriter().print(
						ActionUtils.getAllEmployeeAsJson().toString());
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

	public void addUser(ActionRequest req, ActionResponse res) {
		System.out.println("delete called");
	}

	public void goToUserInfo(ActionRequest req, ActionResponse res) {
		String uid = req.getParameter("idSelected");
		if (uid != null) {
			// System.out.println("called "+resourceRequest.getParameter("uid"));
			Emp employee = null;
			try {
				employee = EmpLocalServiceUtil.getEmp(Long.parseLong(uid));
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
			Long deptId = Long.parseLong(req.getParameter("departmentName"));
			System.out.println(deptId+"  fdfdf");
			Boolean status = Boolean.parseBoolean(req.getParameter("status"));
			String address = req.getParameter("address");
			String phoneNumber = req.getParameter("phoneNumber");
			String email = req.getParameter("email");
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
				EmpLocalServiceUtil.addUpdateEmployee(employee);
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
					EmpLocalServiceUtil.deleteEmployeeById(Long
							.parseLong(sbwbUserId));
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

		// product.setProductId(Long.parseLong(productId));
		// product.setProductName(productName);
		// product.setSerialNumber(productSerial);
		// product.setCompanyId(PortalUtil.getCompanyId(request));
		// PortalUtil.getUserId(request);
		// try {
		// product.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
		// PortalUtil.getCompanyId(request)).getGroupId());
		// } catch (PortalException e1) {
		// e1.printStackTrace();
		// } catch (SystemException e1) {
		// e1.printStackTrace();
		// }
		// ArrayList<String> errors = new ArrayList<String>();
		// if (ProdRegValidator.validateProduct(product, errors)) {
		// try {
		// PRProductLocalServiceUtil.addUpdatePRProduct(product,
		// themeDisplay.getUserId());
		// } catch (PortalException | SystemException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// SessionMessages.add(request, "request_processed",
		// "product-updated-successfully");
		// } else {
		// SessionErrors.add(request, "fields-required");
		// }

	}
}
