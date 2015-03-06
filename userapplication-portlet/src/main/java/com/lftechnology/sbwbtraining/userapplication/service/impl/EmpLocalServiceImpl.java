package com.lftechnology.sbwbtraining.userapplication.service.impl;

import java.util.List;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;
import com.lftechnology.sbwbtraining.userapplication.service.base.EmpLocalServiceBaseImpl;
import com.liferay.portal.kernel.dao.orm.Criterion;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the emp local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.sbwbtraining.userapplication.service.EmpLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bibhushan Joshi
 * @see com.lftechnology.sbwbtraining.userapplication.service.base.EmpLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil
 */
public class EmpLocalServiceImpl extends EmpLocalServiceBaseImpl {
	/**
	 * Method use to add or udpate MOUser
	 * 
	 * @author bibhushan
	 */
	public Emp addUpdateEmp(Emp moUser) throws SystemException,
			PortalException {
		Emp user;
		if (moUser.getUserId() == 0) {
			// Case: create new
			user = empPersistence.create(counterLocalService
					.increment(Emp.class.getName()));
		} else {
			// Case: Edit
			user = EmpLocalServiceUtil.getEmp(moUser.getUserId());
		}
		user.setFirstName(moUser.getFirstName());
		user.setLastName(moUser.getLastName());
		user.setAddress(moUser.getAddress());
		user.setEmail(moUser.getEmail());
		user.setPhoneNumber(moUser.getPhoneNumber());
		user.setCompanyName(moUser.getCompanyName());
		user.setGroupId(moUser.getGroupId());
		user.setCompanyId(moUser.getCompanyId());
		return empPersistence.update(user, true);
	}
	public List<Emp> getAllEmployees() throws SystemException {
		List<Emp> user = empPersistence.findAll();
		return user;
	}
	/**
	 * This method searches the string search in the data base to give out the search list
	 */
	public List<Emp> searchEmployees(String search) throws SystemException {
		System.out.println("inside search emp local service:");
		String searchTerm =new StringBuilder("%").append(search).append("%").toString();
		DynamicQuery query2 = DynamicQueryFactoryUtil
				.forClass(Emp.class);
		Criterion criterion =  RestrictionsFactoryUtil.like("firstName",searchTerm);
		criterion=RestrictionsFactoryUtil.or(criterion,RestrictionsFactoryUtil.like("lastName",searchTerm));
		criterion=RestrictionsFactoryUtil.or(criterion,RestrictionsFactoryUtil.like("address",searchTerm));
		query2.add(criterion);
		@SuppressWarnings("unchecked")
		List<Emp> results=EmpLocalServiceUtil.dynamicQuery(query2);
		return results;
	}
}
