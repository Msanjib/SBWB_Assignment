package com.lftechnology.sbwbusers.service.persistence;

import com.lftechnology.sbwbusers.model.Employee;
import com.lftechnology.sbwbusers.service.EmployeeLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Bibhushan Joshi
 * @generated
 */
public abstract class EmployeeActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmployeeActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmployeeLocalServiceUtil.getService());
        setClass(Employee.class);

        setClassLoader(com.lftechnology.sbwbusers.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}
