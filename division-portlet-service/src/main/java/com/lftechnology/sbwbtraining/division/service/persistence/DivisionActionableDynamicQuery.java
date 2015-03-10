package com.lftechnology.sbwbtraining.division.service.persistence;

import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Sanjib Maharjan
 * @generated
 */
public abstract class DivisionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public DivisionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(DivisionLocalServiceUtil.getService());
        setClass(Division.class);

        setClassLoader(com.lftechnology.sbwbtraining.division.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("divisionId");
    }
}
