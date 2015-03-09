package com.lftechnology.sbwbtraining.portlet.division;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class ManageDivisionPortlet
 * @author sanjib maharjan
 */
public class ManageDivisionPortlet extends MVCPortlet {
	public static Logger LOGGER = Logger.getLogger(ManageDivisionPortlet.class
			.getSimpleName());

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse){
		try {
			renderRequest.setAttribute("noDep",
					DivisionLocalServiceUtil.getDivisionsCount());
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
	 * This method handles the ajax call for getting the records from database.
	 * 
	 * @param resourceRequest
	 *            the request sent to the portlet
	 * @param resourceResponse
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void serveResource(ResourceRequest resourceRequest,
			ResourceResponse resourceResponse){
		try {
			resourceResponse.getWriter().print(
					ActionUtils.getDepartmentAsJson().toString());
		} catch (SystemException e) {
			LOGGER.log(Level.SEVERE, "System Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "IO Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		}
	}

	/**
	 * This method edits or deletes the entry in the database as per the action
	 * set by the parameter oper.If the action is edit the database will be
	 * modified with the provided model of {@link Division} or if the action is
	 * delete the entry will be deleted from the database that matches with the
	 * divisionId.
	 * 
	 * @param request
	 *            the request sent to the portlet
	 * @param response
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void editOrDeleteDivision(ActionRequest request,
			ActionResponse response) {
		String action = request.getParameter("oper");
		String divisionId = request.getParameter("divisionId");
		if (action.equals("edit")) {
			String divisionName = request.getParameter("divisionName");
			Division division = DivisionLocalServiceUtil.createDivision(0);
			division.setDivisionName(divisionName);
			division.setDivisionId(Long.parseLong(divisionId));
			try {
				DivisionLocalServiceUtil.addUpdateDivision(division);
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
		} else if (action.equals("del")) {
			divisionId = request.getParameter("id");
			if (Validator.isNotNull(divisionId)) {
				try {
					DivisionLocalServiceUtil.deleteDivision(Long
							.parseLong(divisionId));
				} catch (NumberFormatException e) {
					LOGGER.log(
							Level.SEVERE,
							"Number Format Exception on divisionId.cannot parse to Long.{0} {1} {2}",
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
				LOGGER.log(Level.SEVERE,
						"Delete unsuccessful.The division id is null.");
			}
		}
	}

	/**
	 * This method adds the division {@link Division} entry to the database
	 * 
	 * @param request
	 *            the request sent to the portlet
	 * @param response
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void addNewDivision(ActionRequest request, ActionResponse response) {
		String divisionName = request.getParameter("divisionName");
		Division division = DivisionLocalServiceUtil.createDivision(0);
		division.setDivisionName(divisionName);
		division.setCompanyId(PortalUtil.getCompanyId(request));
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		division.setCreatedOn(dateFormat.format(date));
		try {
			division.setCreatedBy(PortalUtil.getUser(request).getFullName());
			division.setGroupId(GroupLocalServiceUtil.getCompanyGroup(
					PortalUtil.getCompanyId(request)).getGroupId());
			DivisionLocalServiceUtil.addUpdateDivision(division);
		} catch (PortalException e) {
			LOGGER.log(Level.SEVERE, "Portal Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		} catch (SystemException e) {
			LOGGER.log(Level.SEVERE, "System Exception.{0} {1} {2}",
					new Object[] { e.getClass(), e.getMessage(), e.getCause() });
		}

	}

}
