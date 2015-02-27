package com.lftechnology.sbwbusers.model.impl;

import com.lftechnology.sbwbusers.model.Employee;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Bibhushan Joshi
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Serializable {
    public long userId;
    public String firstName;
    public String lastName;
    public String address;
    public String phoneNumber;
    public String email;
    public String companyName;
    public long depId;
    public String userDesc;
    public Boolean status;
    public long companyId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{userId=");
        sb.append(userId);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", address=");
        sb.append(address);
        sb.append(", phoneNumber=");
        sb.append(phoneNumber);
        sb.append(", email=");
        sb.append(email);
        sb.append(", companyName=");
        sb.append(companyName);
        sb.append(", depId=");
        sb.append(depId);
        sb.append(", userDesc=");
        sb.append(userDesc);
        sb.append(", status=");
        sb.append(status);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setUserId(userId);

        if (firstName == null) {
            employeeImpl.setFirstName(StringPool.BLANK);
        } else {
            employeeImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            employeeImpl.setLastName(StringPool.BLANK);
        } else {
            employeeImpl.setLastName(lastName);
        }

        if (address == null) {
            employeeImpl.setAddress(StringPool.BLANK);
        } else {
            employeeImpl.setAddress(address);
        }

        if (phoneNumber == null) {
            employeeImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setPhoneNumber(phoneNumber);
        }

        if (email == null) {
            employeeImpl.setEmail(StringPool.BLANK);
        } else {
            employeeImpl.setEmail(email);
        }

        if (companyName == null) {
            employeeImpl.setCompanyName(StringPool.BLANK);
        } else {
            employeeImpl.setCompanyName(companyName);
        }

        employeeImpl.setDepId(depId);

        if (userDesc == null) {
            employeeImpl.setUserDesc(StringPool.BLANK);
        } else {
            employeeImpl.setUserDesc(userDesc);
        }

        employeeImpl.setStatus(status);
        employeeImpl.setCompanyId(companyId);
        employeeImpl.setGroupId(groupId);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }
}
