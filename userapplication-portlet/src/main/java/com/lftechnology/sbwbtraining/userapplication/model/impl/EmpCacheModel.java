package com.lftechnology.sbwbtraining.userapplication.model.impl;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Emp in entity cache.
 *
 * @author Bibhushan Joshi
 * @see Emp
 * @generated
 */
public class EmpCacheModel implements CacheModel<Emp>, Serializable {
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

    public Emp toEntityModel() {
        EmpImpl empImpl = new EmpImpl();

        empImpl.setUserId(userId);

        if (firstName == null) {
            empImpl.setFirstName(StringPool.BLANK);
        } else {
            empImpl.setFirstName(firstName);
        }

        if (lastName == null) {
            empImpl.setLastName(StringPool.BLANK);
        } else {
            empImpl.setLastName(lastName);
        }

        if (address == null) {
            empImpl.setAddress(StringPool.BLANK);
        } else {
            empImpl.setAddress(address);
        }

        if (phoneNumber == null) {
            empImpl.setPhoneNumber(StringPool.BLANK);
        } else {
            empImpl.setPhoneNumber(phoneNumber);
        }

        if (email == null) {
            empImpl.setEmail(StringPool.BLANK);
        } else {
            empImpl.setEmail(email);
        }

        if (companyName == null) {
            empImpl.setCompanyName(StringPool.BLANK);
        } else {
            empImpl.setCompanyName(companyName);
        }

        empImpl.setDepId(depId);

        if (userDesc == null) {
            empImpl.setUserDesc(StringPool.BLANK);
        } else {
            empImpl.setUserDesc(userDesc);
        }

        empImpl.setStatus(status);
        empImpl.setCompanyId(companyId);
        empImpl.setGroupId(groupId);

        empImpl.resetOriginalValues();

        return empImpl;
    }
}
