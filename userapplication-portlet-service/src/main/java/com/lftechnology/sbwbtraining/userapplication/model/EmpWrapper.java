package com.lftechnology.sbwbtraining.userapplication.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Emp}.
 * </p>
 *
 * @author    Bibhushan Joshi
 * @see       Emp
 * @generated
 */
public class EmpWrapper implements Emp, ModelWrapper<Emp> {
    private Emp _emp;

    public EmpWrapper(Emp emp) {
        _emp = emp;
    }

    public Class<?> getModelClass() {
        return Emp.class;
    }

    public String getModelClassName() {
        return Emp.class.getName();
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
    * Returns the primary key of this emp.
    *
    * @return the primary key of this emp
    */
    public long getPrimaryKey() {
        return _emp.getPrimaryKey();
    }

    /**
    * Sets the primary key of this emp.
    *
    * @param primaryKey the primary key of this emp
    */
    public void setPrimaryKey(long primaryKey) {
        _emp.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the user ID of this emp.
    *
    * @return the user ID of this emp
    */
    public long getUserId() {
        return _emp.getUserId();
    }

    /**
    * Sets the user ID of this emp.
    *
    * @param userId the user ID of this emp
    */
    public void setUserId(long userId) {
        _emp.setUserId(userId);
    }

    /**
    * Returns the user uuid of this emp.
    *
    * @return the user uuid of this emp
    * @throws SystemException if a system exception occurred
    */
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _emp.getUserUuid();
    }

    /**
    * Sets the user uuid of this emp.
    *
    * @param userUuid the user uuid of this emp
    */
    public void setUserUuid(java.lang.String userUuid) {
        _emp.setUserUuid(userUuid);
    }

    /**
    * Returns the first name of this emp.
    *
    * @return the first name of this emp
    */
    public java.lang.String getFirstName() {
        return _emp.getFirstName();
    }

    /**
    * Sets the first name of this emp.
    *
    * @param firstName the first name of this emp
    */
    public void setFirstName(java.lang.String firstName) {
        _emp.setFirstName(firstName);
    }

    /**
    * Returns the last name of this emp.
    *
    * @return the last name of this emp
    */
    public java.lang.String getLastName() {
        return _emp.getLastName();
    }

    /**
    * Sets the last name of this emp.
    *
    * @param lastName the last name of this emp
    */
    public void setLastName(java.lang.String lastName) {
        _emp.setLastName(lastName);
    }

    /**
    * Returns the address of this emp.
    *
    * @return the address of this emp
    */
    public java.lang.String getAddress() {
        return _emp.getAddress();
    }

    /**
    * Sets the address of this emp.
    *
    * @param address the address of this emp
    */
    public void setAddress(java.lang.String address) {
        _emp.setAddress(address);
    }

    /**
    * Returns the phone number of this emp.
    *
    * @return the phone number of this emp
    */
    public java.lang.String getPhoneNumber() {
        return _emp.getPhoneNumber();
    }

    /**
    * Sets the phone number of this emp.
    *
    * @param phoneNumber the phone number of this emp
    */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        _emp.setPhoneNumber(phoneNumber);
    }

    /**
    * Returns the email of this emp.
    *
    * @return the email of this emp
    */
    public java.lang.String getEmail() {
        return _emp.getEmail();
    }

    /**
    * Sets the email of this emp.
    *
    * @param email the email of this emp
    */
    public void setEmail(java.lang.String email) {
        _emp.setEmail(email);
    }

    /**
    * Returns the company name of this emp.
    *
    * @return the company name of this emp
    */
    public java.lang.String getCompanyName() {
        return _emp.getCompanyName();
    }

    /**
    * Sets the company name of this emp.
    *
    * @param companyName the company name of this emp
    */
    public void setCompanyName(java.lang.String companyName) {
        _emp.setCompanyName(companyName);
    }

    /**
    * Returns the dep ID of this emp.
    *
    * @return the dep ID of this emp
    */
    public long getDepId() {
        return _emp.getDepId();
    }

    /**
    * Sets the dep ID of this emp.
    *
    * @param depId the dep ID of this emp
    */
    public void setDepId(long depId) {
        _emp.setDepId(depId);
    }

    /**
    * Returns the user desc of this emp.
    *
    * @return the user desc of this emp
    */
    public java.lang.String getUserDesc() {
        return _emp.getUserDesc();
    }

    /**
    * Sets the user desc of this emp.
    *
    * @param userDesc the user desc of this emp
    */
    public void setUserDesc(java.lang.String userDesc) {
        _emp.setUserDesc(userDesc);
    }

    /**
    * Returns the status of this emp.
    *
    * @return the status of this emp
    */
    public java.lang.Boolean getStatus() {
        return _emp.getStatus();
    }

    /**
    * Sets the status of this emp.
    *
    * @param status the status of this emp
    */
    public void setStatus(java.lang.Boolean status) {
        _emp.setStatus(status);
    }

    /**
    * Returns the company ID of this emp.
    *
    * @return the company ID of this emp
    */
    public long getCompanyId() {
        return _emp.getCompanyId();
    }

    /**
    * Sets the company ID of this emp.
    *
    * @param companyId the company ID of this emp
    */
    public void setCompanyId(long companyId) {
        _emp.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this emp.
    *
    * @return the group ID of this emp
    */
    public long getGroupId() {
        return _emp.getGroupId();
    }

    /**
    * Sets the group ID of this emp.
    *
    * @param groupId the group ID of this emp
    */
    public void setGroupId(long groupId) {
        _emp.setGroupId(groupId);
    }

    public boolean isNew() {
        return _emp.isNew();
    }

    public void setNew(boolean n) {
        _emp.setNew(n);
    }

    public boolean isCachedModel() {
        return _emp.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _emp.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _emp.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _emp.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _emp.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _emp.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _emp.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmpWrapper((Emp) _emp.clone());
    }

    public int compareTo(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp) {
        return _emp.compareTo(emp);
    }

    @Override
    public int hashCode() {
        return _emp.hashCode();
    }

    public com.liferay.portal.model.CacheModel<com.lftechnology.sbwbtraining.userapplication.model.Emp> toCacheModel() {
        return _emp.toCacheModel();
    }

    public com.lftechnology.sbwbtraining.userapplication.model.Emp toEscapedModel() {
        return new EmpWrapper(_emp.toEscapedModel());
    }

    public com.lftechnology.sbwbtraining.userapplication.model.Emp toUnescapedModel() {
        return new EmpWrapper(_emp.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _emp.toString();
    }

    public java.lang.String toXmlString() {
        return _emp.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _emp.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmpWrapper)) {
            return false;
        }

        EmpWrapper empWrapper = (EmpWrapper) obj;

        if (Validator.equals(_emp, empWrapper._emp)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public Emp getWrappedEmp() {
        return _emp;
    }

    public Emp getWrappedModel() {
        return _emp;
    }

    public void resetOriginalValues() {
        _emp.resetOriginalValues();
    }
}
