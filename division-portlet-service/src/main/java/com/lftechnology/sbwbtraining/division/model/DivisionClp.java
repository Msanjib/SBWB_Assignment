package com.lftechnology.sbwbtraining.division.model;

import com.lftechnology.sbwbtraining.division.service.ClpSerializer;
import com.lftechnology.sbwbtraining.division.service.DivisionLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class DivisionClp extends BaseModelImpl<Division> implements Division {
    private long _divisionId;
    private String _divisionName;
    private String _createdBy;
    private String _createdOn;
    private long _companyId;
    private long _groupId;
    private BaseModel<?> _divisionRemoteModel;

    public DivisionClp() {
    }

    public Class<?> getModelClass() {
        return Division.class;
    }

    public String getModelClassName() {
        return Division.class.getName();
    }

    public long getPrimaryKey() {
        return _divisionId;
    }

    public void setPrimaryKey(long primaryKey) {
        setDivisionId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_divisionId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
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

    @Override
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

    public long getDivisionId() {
        return _divisionId;
    }

    public void setDivisionId(long divisionId) {
        _divisionId = divisionId;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setDivisionId", long.class);

                method.invoke(_divisionRemoteModel, divisionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getDivisionName() {
        return _divisionName;
    }

    public void setDivisionName(String divisionName) {
        _divisionName = divisionName;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setDivisionName", String.class);

                method.invoke(_divisionRemoteModel, divisionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getCreatedBy() {
        return _createdBy;
    }

    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", String.class);

                method.invoke(_divisionRemoteModel, createdBy);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getCreatedOn() {
        return _createdOn;
    }

    public void setCreatedOn(String createdOn) {
        _createdOn = createdOn;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedOn", String.class);

                method.invoke(_divisionRemoteModel, createdOn);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_divisionRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_divisionRemoteModel != null) {
            try {
                Class<?> clazz = _divisionRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_divisionRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDivisionRemoteModel() {
        return _divisionRemoteModel;
    }

    public void setDivisionRemoteModel(BaseModel<?> divisionRemoteModel) {
        _divisionRemoteModel = divisionRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _divisionRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_divisionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            DivisionLocalServiceUtil.addDivision(this);
        } else {
            DivisionLocalServiceUtil.updateDivision(this);
        }
    }

    @Override
    public Division toEscapedModel() {
        return (Division) ProxyUtil.newProxyInstance(Division.class.getClassLoader(),
            new Class[] { Division.class }, new AutoEscapeBeanHandler(this));
    }

    public Division toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        DivisionClp clone = new DivisionClp();

        clone.setDivisionId(getDivisionId());
        clone.setDivisionName(getDivisionName());
        clone.setCreatedBy(getCreatedBy());
        clone.setCreatedOn(getCreatedOn());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    public int compareTo(Division division) {
        int value = 0;

        value = getDivisionName().compareTo(division.getDivisionName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof DivisionClp)) {
            return false;
        }

        DivisionClp division = (DivisionClp) obj;

        long primaryKey = division.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{divisionId=");
        sb.append(getDivisionId());
        sb.append(", divisionName=");
        sb.append(getDivisionName());
        sb.append(", createdBy=");
        sb.append(getCreatedBy());
        sb.append(", createdOn=");
        sb.append(getCreatedOn());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.lftechnology.sbwbtraining.division.model.Division");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>divisionId</column-name><column-value><![CDATA[");
        sb.append(getDivisionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>divisionName</column-name><column-value><![CDATA[");
        sb.append(getDivisionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdBy</column-name><column-value><![CDATA[");
        sb.append(getCreatedBy());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createdOn</column-name><column-value><![CDATA[");
        sb.append(getCreatedOn());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
