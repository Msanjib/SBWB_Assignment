package com.lftechnology.sbwbtraining.service.impl;

import java.util.List;

import com.lftechnology.sbwbtraining.model.Department;
import com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil;
import com.lftechnology.sbwbtraining.service.base.DepartmentLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the department local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.sbwbtraining.service.DepartmentLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see com.lftechnology.sbwbtraining.service.base.DepartmentLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil
 */
public class DepartmentLocalServiceImpl extends DepartmentLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil} to access the department local service.
     */
	/**
	 * Method use to get list of all department.
	 * @author leapfrog
	 * @return {@link List} of {@link Department}
	 */
	public List<Department> getEveryDepartments() throws SystemException {
		return departmentPersistence.findAll();
	}

	public Department addUpdateDepartment(Department department)
			throws SystemException, PortalException {
		Department departmenttemp;
		if (department.getDepartmentId() == 0) {
			// Case: create new
			departmenttemp = departmentPersistence.create(counterLocalService
					.increment(Department.class.getName()));
			departmenttemp.setCreatedBy(department.getCreatedBy());
			departmenttemp.setCreatedOn(department.getCreatedOn());
			departmenttemp.setCompanyId(department.getCompanyId());
			departmenttemp.setGroupId(department.getGroupId());
			System.out.println("Successfully added Confirmed");
			
		} else {
			// Case: Edit
			departmenttemp = DepartmentLocalServiceUtil.getDepartment(department.getDepartmentId());
			
		}
		departmenttemp.setDepartmentName(department.getDepartmentName());
//		departmenttemp.setDepartmentId(department.getDepartmentId());
//		departmenttemp.setCreatedBy(department.getCreatedBy());
//		departmenttemp.setCreatedOn(department.getCreatedOn());
//		departmenttemp.setCompanyId(department.getCompanyId());
//		departmenttemp.setGroupId(department.getGroupId());

		return departmentPersistence.update(departmenttemp, true);
	}

	public void deleteDepartmentById(long departmentId) throws
			SystemException, PortalException {
		Department department = departmentPersistence.findByPrimaryKey(departmentId);
		deleteDepartment(department);
	}
}
