package com.lftechnology.sbwbusers.service.impl;


import com.lftechnology.sbwbusers.model.Employee;
import com.lftechnology.sbwbusers.service.EmployeeLocalServiceUtil;
import com.lftechnology.sbwbusers.service.base.EmployeeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the m o user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.sbworkbench.training.user.service.MOUserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bibhushan Joshi
 * @see com.lftechnology.sbworkbench.training.user.service.base.MOUserLocalServiceBaseImpl
 * @see com.lftechnology.sbworkbench.training.user.service.MOUserLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
	/**
	 * Method use to add or udpate MOUser 
	 * @author bibhushan
	 */
	public Employee addUpdateEmployee(Employee dmemployee)
			throws SystemException, PortalException {
		Employee employee;
		if(dmemployee.getUserId()==0){
			// Case: create new
			employee = employeePersistence.create(counterLocalService.increment(Employee.class.getName()));
		} else {
			// Case: Edit
			employee = EmployeeLocalServiceUtil.getEmployee(dmemployee.getUserId());
		}
		employee.setFirstName(dmemployee.getFirstName());
		employee.setLastName(dmemployee.getLastName());
		employee.setAddress(dmemployee.getAddress());
		employee.setEmail(dmemployee.getEmail());
		employee.setPhoneNumber(dmemployee.getPhoneNumber());
		employee.setCompanyName(dmemployee.getCompanyName());
		employee.setGroupId(dmemployee.getGroupId());
		employee.setCompanyId(dmemployee.getCompanyId());
		return employeePersistence.update(dmemployee, true);
	}
}