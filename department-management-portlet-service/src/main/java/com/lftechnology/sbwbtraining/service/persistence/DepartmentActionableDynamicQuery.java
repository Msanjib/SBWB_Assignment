package com.lftechnology.sbwbtraining.service.persistence;

import com.lftechnology.sbwbtraining.model.Department;
import com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Sanjib Maharjan
 * @generated
 */
public abstract class DepartmentActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DepartmentActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DepartmentLocalServiceUtil.getService());
        setClass(Department.class);

        setClassLoader(com.lftechnology.sbwbtraining.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("departmentId");
    }
}
