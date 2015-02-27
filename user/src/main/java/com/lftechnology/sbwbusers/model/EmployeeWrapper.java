package com.lftechnology.sbwbusers.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author    Bibhushan Joshi
 * @see       Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    public Class<?> getModelClass() {
        return Employee.class;
    }

    public String getModelClassName() {
        return Employee.class.getName();
    }

    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("userId", getUserId());
        attributes.put("firstName", getFirstName());
        attributes.put("lastName", getLastName());
        attributes.put("address", getAddress());
        attributes.put("phoneNumber", getPhoneNumber());
        attributes.put("email", getEmail());
        attributes.put("companyName", getCompanyName());
        attributes.put("depId", getDepId());
        attributes.put("userDesc", getUserDesc());
        attributes.put("status", getStatus());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());

        return attributes;
    }

    public void setModelAttributes(Map<String, Object> attributes) {
        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }

        String phoneNumber = (String) attributes.get("phoneNumber");

        if (phoneNumber != null) {
            setPhoneNumber(phoneNumber);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String companyName = (String) attributes.get("companyName");

        if (companyName != null) {
            setCompanyName(companyName);
        }

        Long depId = (Long) attributes.get("depId");

        if (depId != null) {
            setDepId(depId);
        }

        String userDesc = (String) attributes.get("userDesc");

        if (userDesc != null) {
            setUserDesc(userDesc);
        }

        Boolean status = (Boolean) attributes.get("status");

        if (status != null) {
            setStatus(status);
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
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this employee.
    *
    * @return the user ID of this employee
    */
    public long getUserId() {
        return _employee.getUserId();
    }

    /**
    * Sets the user ID of this employee.
    *
    * @param userId the user ID of this employee
    */
    public void setUserId(long userId) {
        _employee.setUserId(userId);
    }

    /**
    * Returns the user uuid of this employee.
    *
    * @return the user uuid of this employee
    * @throws SystemException if a system exception occurred
    */
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _employee.getUserUuid();
    }

    /**
    * Sets the user uuid of this employee.
    *
    * @param userUuid the user uuid of this employee
    */
    public void setUserUuid(java.lang.String userUuid) {
        _employee.setUserUuid(userUuid);
    }

    /**
    * Returns the first name of this employee.
    *
    * @return the first name of this employee
    */
    public java.lang.String getFirstName() {
        return _employee.getFirstName();
    }

    /**
    * Sets the first name of this employee.
    *
    * @param firstName the first name of this employee
    */
    public void setFirstName(java.lang.String firstName) {
        _employee.setFirstName(firstName);
    }

    /**
    * Returns the last name of this employee.
    *
    * @return the last name of this employee
    */
    public java.lang.String getLastName() {
        return _employee.getLastName();
    }

    /**
    * Sets the last name of this employee.
    *
    * @param lastName the last name of this employee
    */
    public void setLastName(java.lang.String lastName) {
        _employee.setLastName(lastName);
    }

    /**
    * Returns the address of this employee.
    *
    * @return the address of this employee
    */
    public java.lang.String getAddress() {
        return _employee.getAddress();
    }

    /**
    * Sets the address of this employee.
    *
    * @param address the address of this employee
    */
    public void setAddress(java.lang.String address) {
        _employee.setAddress(address);
    }

    /**
    * Returns the phone number of this employee.
    *
    * @return the phone number of this employee
    */
    public java.lang.String getPhoneNumber() {
        return _employee.getPhoneNumber();
    }

    /**
    * Sets the phone number of this employee.
    *
    * @param phoneNumber the phone number of this employee
    */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _employee.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the email of this employee.
    *
    * @return the email of this employee
    */
    public java.lang.String getEmail() {
        return _employee.getEmail();
    }

    /**
    * Sets the email of this employee.
    *
    * @param email the email of this employee
    */
    public void setEmail(java.lang.String email) {
        _employee.setEmail(email);
    }

    /**
    * Returns the company name of this employee.
    *
    * @return the company name of this employee
    */
    public java.lang.String getCompanyName() {
        return _employee.getCompanyName();
    }

    /**
    * Sets the company name of this employee.
    *
    * @param companyName the company name of this employee
    */
    public void setCompanyName(java.lang.String companyName) {
        _employee.setCompanyName(companyName);
    }

    /**
    * Returns the dep ID of this employee.
    *
    * @return the dep ID of this employee
    */
    public long getDepId() {
        return _employee.getDepId();
    }

    /**
    * Sets the dep ID of this employee.
    *
    * @param depId the dep ID of this employee
    */
    public void setDepId(long depId) {
        _employee.setDepId(depId);
    }

    /**
    * Returns the user desc of this employee.
    *
    * @return the user desc of this employee
    */
    public java.lang.String getUserDesc() {
        return _employee.getUserDesc();
    }

    /**
    * Sets the user desc of this employee.
    *
    * @param userDesc the user desc of this employee
    */
    public void setUserDesc(java.lang.String userDesc) {
        _employee.setUserDesc(userDesc);
    }

    /**
    * Returns the status of this employee.
    *
    * @return the status of this employee
    */
    public java.lang.Boolean getStatus() {
        return _employee.getStatus();
    }

    /**
    * Sets the status of this employee.
    *
    * @param status the status of this employee
    */
    public void setStatus(java.lang.Boolean status) {
        _employee.setStatus(status);
    }

    /**
    * Returns the company ID of this employee.
    *
    * @return the company ID of this employee
    */
    public long getCompanyId() {
        return _employee.getCompanyId();
    }

    /**
    * Sets the company ID of this employee.
    *
    * @param companyId the company ID of this employee
    */
    public void setCompanyId(long companyId) {
        _employee.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this employee.
    *
    * @return the group ID of this employee
    */
    public long getGroupId() {
        return _employee.getGroupId();
    }

    /**
    * Sets the group ID of this employee.
    *
    * @param groupId the group ID of this employee
    */
    public void setGroupId(long groupId) {
        _employee.setGroupId(groupId);
    }

    public boolean isNew() {
        return _employee.isNew();
    }

    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    public int compareTo(com.lftechnology.sbwbusers.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.lftechnology.sbwbusers.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    public com.lftechnology.sbwbusers.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    public com.lftechnology.sbwbusers.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    public Employee getWrappedModel() {
        return _employee;
    }

    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
