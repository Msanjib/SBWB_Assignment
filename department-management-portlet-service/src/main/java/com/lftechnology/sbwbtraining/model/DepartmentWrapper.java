package com.lftechnology.sbwbtraining.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Department}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       Department
 * @generated
 */
public class DepartmentWrapper implements Department, ModelWrapper<Department> {
    private Department _department;

    public DepartmentWrapper(Department department) {
        _department = department;
    }

    public Class<?> getModelClass() {
        return Department.class;
    }

    public String getModelClassName() {
        return Department.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("departmentId", getDepartmentId());
        attributes.put("departmentName", getDepartmentName());
        attributes.put("createdBy", getCreatedBy());
        attributes.put("createdOn", getCreatedOn());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long departmentId = (Long) attributes.get("departmentId");

        if (departmentId != null) {
            setDepartmentId(departmentId);
        }

        String departmentName = (String) attributes.get("departmentName");

        if (departmentName != null) {
            setDepartmentName(departmentName);
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
    * Returns the primary key of this department.
    *
    * @return the primary key of this department
    */
    public long getPrimaryKey() {
        return _department.getPrimaryKey();
    }

    /**
    * Sets the primary key of this department.
    *
    * @param primaryKey the primary key of this department
    */
    public void setPrimaryKey(long primaryKey) {
        _department.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the department ID of this department.
    *
    * @return the department ID of this department
    */
    public long getDepartmentId() {
        return _department.getDepartmentId();
    }

    /**
    * Sets the department ID of this department.
    *
    * @param departmentId the department ID of this department
    */
    public void setDepartmentId(long departmentId) {
        _department.setDepartmentId(departmentId);
    }

    /**
    * Returns the department name of this department.
    *
    * @return the department name of this department
    */
    public java.lang.String getDepartmentName() {
        return _department.getDepartmentName();
    }

    /**
    * Sets the department name of this department.
    *
    * @param departmentName the department name of this department
    */
    public void setDepartmentName(java.lang.String departmentName) {
        _department.setDepartmentName(departmentName);
    }

    /**
    * Returns the created by of this department.
    *
    * @return the created by of this department
    */
    public java.lang.String getCreatedBy() {
        return _department.getCreatedBy();
    }

    /**
    * Sets the created by of this department.
    *
    * @param createdBy the created by of this department
    */
    public void setCreatedBy(java.lang.String createdBy) {
        _department.setCreatedBy(createdBy);
    }

    /**
    * Returns the created on of this department.
    *
    * @return the created on of this department
    */
    public java.lang.String getCreatedOn() {
        return _department.getCreatedOn();
    }

    /**
    * Sets the created on of this department.
    *
    * @param createdOn the created on of this department
    */
    public void setCreatedOn(java.lang.String createdOn) {
        _department.setCreatedOn(createdOn);
    }

    /**
    * Returns the company ID of this department.
    *
    * @return the company ID of this department
    */
    public long getCompanyId() {
        return _department.getCompanyId();
    }

    /**
    * Sets the company ID of this department.
    *
    * @param companyId the company ID of this department
    */
    public void setCompanyId(long companyId) {
        _department.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this department.
    *
    * @return the group ID of this department
    */
    public long getGroupId() {
        return _department.getGroupId();
    }

    /**
    * Sets the group ID of this department.
    *
    * @param groupId the group ID of this department
    */
    public void setGroupId(long groupId) {
        _department.setGroupId(groupId);
    }

    public boolean isNew() {
        return _department.isNew();
    }

    public void setNew(boolean n) {
        _department.setNew(n);
    }

    public boolean isCachedModel() {
        return _department.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _department.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _department.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _department.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _department.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _department.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _department.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new DepartmentWrapper((Department) _department.clone());
    }

    public int compareTo(Department department) {
        return _department.compareTo(department);
    }

    @Override
    public int hashCode() {
        return _department.hashCode();
    }

    public com.liferay.portal.model.CacheModel<Department> toCacheModel() {
        return _department.toCacheModel();
    }

    public Department toEscapedModel() {
        return new DepartmentWrapper(_department.toEscapedModel());
    }

    public Department toUnescapedModel() {
        return new DepartmentWrapper(_department.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _department.toString();
    }

    public java.lang.String toXmlString() {
        return _department.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _department.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DepartmentWrapper)) {
            return false;
        }

        DepartmentWrapper departmentWrapper = (DepartmentWrapper) obj;

        if (Validator.equals(_department, departmentWrapper._department)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public Department getWrappedDepartment() {
        return _department;
    }

    public Department getWrappedModel() {
        return _department;
    }

    public void resetOriginalValues() {
        _department.resetOriginalValues();
    }
}
