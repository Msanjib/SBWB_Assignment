package com.lftechnology.sbwbtraining.portlet.division;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ManageDivisionPortlet
 */
public class ManageDivisionPortlet extends MVCPortlet {
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		// TODO Auto-generated method stub
		try {
			renderRequest.setAttribute("noDep",
					DivisionLocalServiceUtil.getDivisionsCount());
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
		try {
			resourceResponse.getWriter()
					.print(ActionUtils.getData().toString());
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// super.serveResource(resourceRequest, resourceResponse);
	}

	public void update(ActionRequest req, ActionResponse res) {
		System.out.println("update called");
	}

	public void deleteDivision(ActionRequest req, ActionResponse res) {
		System.out.println("delete called");
	}

	public void editOrDeleteDivision(ActionRequest req, ActionResponse res) {
		String action = req.getParameter("oper");
		String divisionId = req.getParameter("divisionId");
		if (action.equals("edit")) {
			String divisionName = req.getParameter("divisionName");
			// String createdBy = req.getParameter("createdBy");
			// String createdOn = req.getParameter("createdOn");
			// String companyId = req.getParameter("companyId");
			// String groupId = req.getParameter("groupId");

			// System.out.println("productName"+ productName);
			// System.out.println("productSerial"+ productSerial);
			// TODO Validate
			// Save to database
			Division division = DivisionLocalServiceUtil.createDivision(0);
			division.setDivisionName(divisionName);
			division.setDivisionId(Long.parseLong(divisionId));
			// department.setCreatedBy(createdBy);
			// department.setCreatedOn(createdOn);
			// department.setCompanyId(Long.parseLong(companyId));
			// department.setGroupId(Long.parseLong(groupId));
			try {
				DivisionLocalServiceUtil.addUpdateDivision(division);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SystemException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (action.equals("del")) {
			divisionId = req.getParameter("id");
			if (Validator.isNotNull(divisionId)) {
				// PRProduct product = PRProductLocalServiceUtil
				// .getPRProduct(productKey);
				// request.setAttribute("product", product);
				// response.setRenderParameter("jspPage", "/edit_product");
				try {
					DivisionLocalServiceUtil.deleteDivision(Long
							.parseLong(divisionId));
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

	public void addNewDivision(ActionRequest req, ActionResponse res) {
		String divisionName = req.getParameter("divisionName");
		Division division = DivisionLocalServiceUtil.createDivision(0);
		division.setDivisionName(divisionName);
		division.setCompanyId(PortalUtil.getCompanyId(req));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		division.setCreatedOn(dateFormat.format(date));
		// PortalUtil.getUserId(request);
		try {
			division.setCreatedBy(PortalUtil.getUser(req).getFullName());
			division.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
					PortalUtil.getCompanyId(req)).getGroupId());
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SystemException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			DivisionLocalServiceUtil.addUpdateDivision(division);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
