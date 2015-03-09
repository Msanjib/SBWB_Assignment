package com.lftechnology.sbwbtraining.division.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Division}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       Division
 * @generated
 */
public class DivisionWrapper implements Division, ModelWrapper<Division> {
    private Division _division;

    public DivisionWrapper(Division division) {
        _division = division;
    }

    public Class<?> getModelClass() {
        return Division.class;
    }

    public String getModelClassName() {
        return Division.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("divisionId", getDivisionId());
        attributes.put("divisionName", getDivisionName());
        attributes.put("createdBy", getCreatedBy());
        attributes.put("createdOn", getCreatedOn());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long divisionId = (Long) attributes.get("divisionId");

        if (divisionId != null) {
            setDivisionId(divisionId);
        }

        String divisionName = (String) attributes.get("divisionName");

        if (divisionName != null) {
            setDivisionName(divisionName);
        }

        String createdBy = (String) attributes.get("createdBy");

        if (createdBy != null) {
            setCreatedBy(createdBy);
        }

        String createdOn = (String) attributes.get("createdOn");

        if (createdOn != null) {
            setCreatedOn(createdOn);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }
    }

    /**
    * Returns the primary key of this division.
    *
    * @return the primary key of this division
    */
    public long getPrimaryKey() {
        return _division.getPrimaryKey();
    }

    /**
    * Sets the primary key of this division.
    *
    * @param primaryKey the primary key of this division
    */
    public void setPrimaryKey(long primaryKey) {
        _division.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the division ID of this division.
    *
    * @return the division ID of this division
    */
    public long getDivisionId() {
        return _division.getDivisionId();
    }

    /**
    * Sets the division ID of this division.
    *
    * @param divisionId the division ID of this division
    */
    public void setDivisionId(long divisionId) {
        _division.setDivisionId(divisionId);
    }

    /**
    * Returns the division name of this division.
    *
    * @return the division name of this division
    */
    public java.lang.String getDivisionName() {
        return _division.getDivisionName();
    }

    /**
    * Sets the division name of this division.
    *
    * @param divisionName the division name of this division
    */
    public void setDivisionName(java.lang.String divisionName) {
        _division.setDivisionName(divisionName);
    }

    /**
    * Returns the created by of this division.
    *
    * @return the created by of this division
    */
    public java.lang.String getCreatedBy() {
        return _division.getCreatedBy();
    }

    /**
    * Sets the created by of this division.
    *
    * @param createdBy the created by of this division
    */
    public void setCreatedBy(java.lang.String createdBy) {
        _division.setCreatedBy(createdBy);
    }

    /**
    * Returns the created on of this division.
    *
    * @return the created on of this division
    */
    public java.lang.String getCreatedOn() {
        return _division.getCreatedOn();
    }

    /**
    * Sets the created on of this division.
    *
    * @param createdOn the created on of this division
    */
    public void setCreatedOn(java.lang.String createdOn) {
        _division.setCreatedOn(createdOn);
    }

    /**
    * Returns the company ID of this division.
    *
    * @return the company ID of this division
    */
    public long getCompanyId() {
        return _division.getCompanyId();
    }

    /**
    * Sets the company ID of this division.
    *
    * @param companyId the company ID of this division
    */
    public void setCompanyId(long companyId) {
        _division.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this division.
    *
    * @return the group ID of this division
    */
    public long getGroupId() {
        return _division.getGroupId();
    }

    /**
    * Sets the group ID of this division.
    *
    * @param groupId the group ID of this division
    */
    public void setGroupId(long groupId) {
        _division.setGroupId(groupId);
    }

    public boolean isNew() {
        return _division.isNew();
    }

    public void setNew(boolean n) {
        _division.setNew(n);
    }

    public boolean isCachedModel() {
        return _division.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _division.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _division.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _division.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _division.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _division.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _division.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DivisionWrapper((Division) _division.clone());
    }

    public int compareTo(
        com.lftechnology.sbwbtraining.division.model.Division division) {
        return _division.compareTo(division);
    }

    @Override
    public int hashCode() {
        return _division.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.lftechnology.sbwbtraining.division.model.Division> toCacheModel() {
        return _division.toCacheModel();
    }

    public com.lftechnology.sbwbtraining.division.model.Division toEscapedModel() {
        return new DivisionWrapper(_division.toEscapedModel());
    }

    public com.lftechnology.sbwbtraining.division.model.Division toUnescapedModel() {
        return new DivisionWrapper(_division.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _division.toString();
    }

    public java.lang.String toXmlString() {
        return _division.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _division.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DivisionWrapper)) {
            return false;
        }

        DivisionWrapper divisionWrapper = (DivisionWrapper) obj;

        if (Validator.equals(_division, divisionWrapper._division)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public Division getWrappedDivision() {
        return _division;
    }

    public Division getWrappedModel() {
        return _division;
    }

    public void resetOriginalValues() {
        _division.resetOriginalValues();
    }
}
