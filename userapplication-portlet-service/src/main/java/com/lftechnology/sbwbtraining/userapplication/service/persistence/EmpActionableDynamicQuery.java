package com.lftechnology.sbwbtraining.userapplication.service.persistence;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Bibhushan Joshi
 * @generated
 */
public abstract class EmpActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmpActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmpLocalServiceUtil.getService());
        setClass(Emp.class);

        setClassLoader(com.lftechnology.sbwbtraining.userapplication.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("userId");
    }
}
