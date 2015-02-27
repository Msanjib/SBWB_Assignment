package com.lftechnology.sbwbtraining.model;

import com.lftechnology.sbwbtraining.service.ClpSerializer;
import com.lftechnology.sbwbtraining.service.DepartmentLocalServiceUtil;

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


public class DepartmentClp extends BaseModelImpl<Department>
    implements Department {
    private long _departmentId;
    private String _departmentName;
    private String _createdBy;
    private String _createdOn;
    private long _companyId;
    private long _groupId;
    private BaseModel<?> _departmentRemoteModel;

    public DepartmentClp() {
    }

    public Class<?> getModelClass() {
        return Department.class;
    }

    public String getModelClassName() {
        return Department.class.getName();
    }

    public long getPrimaryKey() {
        return _departmentId;
    }

    public void setPrimaryKey(long primaryKey) {
        setDepartmentId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_departmentId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
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

    @Override
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

    public long getDepartmentId() {
        return _departmentId;
    }

    public void setDepartmentId(long departmentId) {
        _departmentId = departmentId;

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentId", long.class);

                method.invoke(_departmentRemoteModel, departmentId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getDepartmentName() {
        return _departmentName;
    }

    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setDepartmentName",
                        String.class);

                method.invoke(_departmentRemoteModel, departmentName);
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

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedBy", String.class);

                method.invoke(_departmentRemoteModel, createdBy);
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

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setCreatedOn", String.class);

                method.invoke(_departmentRemoteModel, createdOn);
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

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_departmentRemoteModel, companyId);
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

        if (_departmentRemoteModel != null) {
            try {
                Class<?> clazz = _departmentRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_departmentRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getDepartmentRemoteModel() {
        return _departmentRemoteModel;
    }

    public void setDepartmentRemoteModel(BaseModel<?> departmentRemoteModel) {
        _departmentRemoteModel = departmentRemoteModel;
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

        Class<?> remoteModelClass = _departmentRemoteModel.getClass();

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

        Object returnValue = method.invoke(_departmentRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            DepartmentLocalServiceUtil.addDepartment(this);
        } else {
            DepartmentLocalServiceUtil.updateDepartment(this);
        }
    }

    @Override
    public Department toEscapedModel() {
        return (Department) ProxyUtil.newProxyInstance(Department.class.getClassLoader(),
            new Class[] { Department.class }, new AutoEscapeBeanHandler(this));
    }

    public Department toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        DepartmentClp clone = new DepartmentClp();

        clone.setDepartmentId(getDepartmentId());
        clone.setDepartmentName(getDepartmentName());
        clone.setCreatedBy(getCreatedBy());
        clone.setCreatedOn(getCreatedOn());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    public int compareTo(Department department) {
        int value = 0;

        value = getDepartmentName().compareTo(department.getDepartmentName());

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

        if (!(obj instanceof DepartmentClp)) {
            return false;
        }

        DepartmentClp department = (DepartmentClp) obj;

        long primaryKey = department.getPrimaryKey();

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

        sb.append("{departmentId=");
        sb.append(getDepartmentId());
        sb.append(", departmentName=");
        sb.append(getDepartmentName());
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
        sb.append("com.lftechnology.sbwbtraining.model.Department");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>departmentId</column-name><column-value><![CDATA[");
        sb.append(getDepartmentId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>departmentName</column-name><column-value><![CDATA[");
        sb.append(getDepartmentName());
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
