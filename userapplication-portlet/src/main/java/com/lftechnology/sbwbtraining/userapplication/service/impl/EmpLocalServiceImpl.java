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
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.lftechnology.sbwbtraining.userapplication.service.EmpLocalService}
 * interface.
 * 
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 * 
 * @author Bibhushan Joshi
 * @see com.lftechnology.sbwbtraining.userapplication.service.base.EmpLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil
 */
public class EmpLocalServiceImpl extends EmpLocalServiceBaseImpl {

	/**
	 * This methods retrives all the {@link Emp} instances stored in the database.
	 * 
	 * @return the list of {@link Emp} instances
	 * @throws SystemException
	 * @author sanjib maharjan
	 */
	public List<Emp> getEveryEmployee() throws SystemException {
		return empPersistence.findAll();
	}

	/**
	 * This method adds or updates the given model of {@link Emp} to the
	 * database. The addition or update depends on the identification stored in
	 * given <code>employee</code> as parameter.If it is 0 then addition
	 * operation is done or else update operation is done.
	 * 
	 * @param employee
	 *            a {@link Emp} instance to store or update in the database
	 * @return added or updated {@link Emp} instance
	 * @throws SystemException
	 * @throws PortalException
	 * @author sanjib maharjan
	 */
	public Emp addUpdateEmployee(Emp employee) throws SystemException,
			PortalException {
		Emp employee_temp;
		if (employee.getUserId() == 0) {
			// Case: create new
			employee_temp = empPersistence.create(counterLocalService
					.increment(Emp.class.getName()));

			employee_temp.setCompanyName(employee.getCompanyName());
			employee_temp.setCompanyId(employee.getCompanyId());
			employee_temp.setGroupId(employee.getGroupId());
		} else {
			// Case: Edit
			System.out.println("Successfully edited Confirmed");
			employee_temp = EmpLocalServiceUtil.getEmp(employee.getUserId());

		}
		employee_temp.setFirstName(employee.getFirstName());
		employee_temp.setLastName(employee.getLastName());
		employee_temp.setAddress(employee.getAddress());
		employee_temp.setPhoneNumber(employee.getPhoneNumber());
		employee_temp.setEmail(employee.getEmail());

		return empPersistence.update(employee_temp, true);
	}

	/**
	 * This method removes all {@link Emp} instances that matches with the
	 * provided id as parameter from the databases.
	 * 
	 * @param userId
	 *            the identification of the employee to delete.
	 * @return delete employee{@link Emp}
	 * @throws SystemException
	 * @throws PortalException
	 * @author sanjib maharjan
	 */
	public Emp deleteEmployeeById(long userId) throws SystemException,
			PortalException {
		Emp employee = empPersistence.findByPrimaryKey(userId);
		return deleteEmp(employee);

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
