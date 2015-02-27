package com.lftechnology.sbwbtraining.model.impl;

import com.lftechnology.sbwbtraining.model.Department;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Department in entity cache.
 *
 * @author Sanjib Maharjan
 * @see Department
 * @generated
 */
public class DepartmentCacheModel implements CacheModel<Department>,
    Serializable {
    public long departmentId;
    public String departmentName;
    public String createdBy;
    public String createdOn;
    public long companyId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{departmentId=");
        sb.append(departmentId);
        sb.append(", departmentName=");
        sb.append(departmentName);
        sb.append(", createdBy=");
        sb.append(createdBy);
        sb.append(", createdOn=");
        sb.append(createdOn);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append("}");

        return sb.toString();
    }

    public Department toEntityModel() {
        DepartmentImpl departmentImpl = new DepartmentImpl();

        departmentImpl.setDepartmentId(departmentId);

        if (departmentName == null) {
            departmentImpl.setDepartmentName(StringPool.BLANK);
        } else {
            departmentImpl.setDepartmentName(departmentName);
        }

        if (createdBy == null) {
            departmentImpl.setCreatedBy(StringPool.BLANK);
        } else {
            departmentImpl.setCreatedBy(createdBy);
        }

        if (createdOn == null) {
            departmentImpl.setCreatedOn(StringPool.BLANK);
        } else {
            departmentImpl.setCreatedOn(createdOn);
        }

        departmentImpl.setCompanyId(companyId);
        departmentImpl.setGroupId(groupId);

        departmentImpl.resetOriginalValues();

        return departmentImpl;
    }
}
