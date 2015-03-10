package com.lftechnology.sbwbtraining.division.service.impl;

import java.util.List;

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;
import com.lftechnology.sbwbtraining.division.service.base.DivisionLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the division local service.
 * 
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.lftechnology.sbwbtraining.division.service.DivisionLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Sanjib Maharjan
 * @see com.lftechnology.sbwbtraining.division.service.base.DivisionLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil
 */
public class DivisionLocalServiceImpl extends DivisionLocalServiceBaseImpl {
	/**
	 * This method fetches all entry of {@link Division} from the database table
	 * and returns them as a list
	 * 
	 * @return the list of all {@link Division} entry from the database table
	 * @author sanjib maharjan
	 */
	public List<Division> getEveryDivisions() throws SystemException {
		return divisionPersistence.findAll();
	}

	/**
	 * This method add or update the entry of {@link Division} instance in the
	 * database table
	 * 
	 * @param division
	 *            a {@link Division} instance to be added or updated to the
	 *            database
	 * @author sanjib maharjan
	 */
	public Division addUpdateDivision(Division division)
			throws PortalException, SystemException {
		Division divisionTemp;
		boolean merge = true;
		if (division.getDivisionId() == 0) {
			// Case: create new
			divisionTemp = divisionPersistence.create(counterLocalService
					.increment(Division.class.getName()));
			divisionTemp.setCreatedBy(division.getCreatedBy());
			divisionTemp.setCreatedOn(division.getCreatedOn());
			divisionTemp.setCompanyId(division.getCompanyId());
			divisionTemp.setGroupId(division.getGroupId());
			merge = false;
		} else {
			// Case: Edit
			divisionTemp = DivisionLocalServiceUtil.getDivision(division
					.getDivisionId());

		}
		divisionTemp.setDivisionName(division.getDivisionName());
		return divisionPersistence.update(divisionTemp, merge);
	}

	/**
	 * This method removes entry of {@link Division} from the database table
	 * that matches with the divisionId
	 * 
	 * @param divisionId
	 *            the response sent by the portlet
	 * @author sanjib maharjan
	 */
	public void deleteDivisionById(long divisionId) throws SystemException,
			PortalException {
		Division division = divisionPersistence.findByPrimaryKey(divisionId);
		deleteDivision(division);
	}

}
