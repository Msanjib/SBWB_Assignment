package com.lftechnology.sbwbtraining.division.model.impl;

import com.lftechnology.sbwbtraining.division.model.Division;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Division in entity cache.
 *
 * @author Sanjib Maharjan
 * @see Division
 * @generated
 */
public class DivisionCacheModel implements CacheModel<Division>, Serializable {
    public long divisionId;
    public String divisionName;
    public String createdBy;
    public String createdOn;
    public long companyId;
    public long groupId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{divisionId=");
        sb.append(divisionId);
        sb.append(", divisionName=");
        sb.append(divisionName);
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

    public Division toEntityModel() {
        DivisionImpl divisionImpl = new DivisionImpl();

        divisionImpl.setDivisionId(divisionId);

        if (divisionName == null) {
            divisionImpl.setDivisionName(StringPool.BLANK);
        } else {
            divisionImpl.setDivisionName(divisionName);
        }

        if (createdBy == null) {
            divisionImpl.setCreatedBy(StringPool.BLANK);
        } else {
            divisionImpl.setCreatedBy(createdBy);
        }

        if (createdOn == null) {
            divisionImpl.setCreatedOn(StringPool.BLANK);
        } else {
            divisionImpl.setCreatedOn(createdOn);
        }

        divisionImpl.setCompanyId(companyId);
        divisionImpl.setGroupId(groupId);

        divisionImpl.resetOriginalValues();

        return divisionImpl;
    }
}
