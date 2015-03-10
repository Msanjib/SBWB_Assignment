package com.lftechnology.sbwbtraining.userapplication.model;

import com.lftechnology.sbwbtraining.userapplication.service.ClpSerializer;
import com.lftechnology.sbwbtraining.userapplication.service.EmpLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EmpClp extends BaseModelImpl<Emp> implements Emp {
    private long _userId;
    private String _userUuid;
    private String _firstName;
    private String _lastName;
    private String _address;
    private String _phoneNumber;
    private String _email;
    private String _companyName;
    private long _depId;
    private String _userDesc;
    private Boolean _status;
    private long _companyId;
    private long _groupId;
    private BaseModel<?> _empRemoteModel;

    public EmpClp() {
    }

    public Class<?> getModelClass() {
        return Emp.class;
    }

    public String getModelClassName() {
        return Emp.class.getName();
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long primaryKey) {
        setUserId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_userId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
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

    @Override
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

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_empRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setFirstName", String.class);

                method.invoke(_empRemoteModel, firstName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setLastName", String.class);

                method.invoke(_empRemoteModel, lastName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setAddress", String.class);

                method.invoke(_empRemoteModel, address);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setPhoneNumber", String.class);

                method.invoke(_empRemoteModel, phoneNumber);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setEmail", String.class);

                method.invoke(_empRemoteModel, email);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getCompanyName() {
        return _companyName;
    }

    public void setCompanyName(String companyName) {
        _companyName = companyName;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyName", String.class);

                method.invoke(_empRemoteModel, companyName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public long getDepId() {
        return _depId;
    }

    public void setDepId(long depId) {
        _depId = depId;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setDepId", long.class);

                method.invoke(_empRemoteModel, depId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public String getUserDesc() {
        return _userDesc;
    }

    public void setUserDesc(String userDesc) {
        _userDesc = userDesc;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setUserDesc", String.class);

                method.invoke(_empRemoteModel, userDesc);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public Boolean getStatus() {
        return _status;
    }

    public void setStatus(Boolean status) {
        _status = status;

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setStatus", Boolean.class);

                method.invoke(_empRemoteModel, status);
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

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_empRemoteModel, companyId);
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

        if (_empRemoteModel != null) {
            try {
                Class<?> clazz = _empRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_empRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmpRemoteModel() {
        return _empRemoteModel;
    }

    public void setEmpRemoteModel(BaseModel<?> empRemoteModel) {
        _empRemoteModel = empRemoteModel;
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

        Class<?> remoteModelClass = _empRemoteModel.getClass();

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

        Object returnValue = method.invoke(_empRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            EmpLocalServiceUtil.addEmp(this);
        } else {
            EmpLocalServiceUtil.updateEmp(this);
        }
    }

    @Override
    public Emp toEscapedModel() {
        return (Emp) ProxyUtil.newProxyInstance(Emp.class.getClassLoader(),
            new Class[] { Emp.class }, new AutoEscapeBeanHandler(this));
    }

    public Emp toUnescapedModel() {
        return this;
    }

    @Override
    public Object clone() {
        EmpClp clone = new EmpClp();

        clone.setUserId(getUserId());
        clone.setFirstName(getFirstName());
        clone.setLastName(getLastName());
        clone.setAddress(getAddress());
        clone.setPhoneNumber(getPhoneNumber());
        clone.setEmail(getEmail());
        clone.setCompanyName(getCompanyName());
        clone.setDepId(getDepId());
        clone.setUserDesc(getUserDesc());
        clone.setStatus(getStatus());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());

        return clone;
    }

    public int compareTo(Emp emp) {
        int value = 0;

        value = getFirstName().compareTo(emp.getFirstName());

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

        if (!(obj instanceof EmpClp)) {
            return false;
        }

        EmpClp emp = (EmpClp) obj;

        long primaryKey = emp.getPrimaryKey();

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
        StringBundler sb = new StringBundler(25);

        sb.append("{userId=");
        sb.append(getUserId());
        sb.append(", firstName=");
        sb.append(getFirstName());
        sb.append(", lastName=");
        sb.append(getLastName());
        sb.append(", address=");
        sb.append(getAddress());
        sb.append(", phoneNumber=");
        sb.append(getPhoneNumber());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", companyName=");
        sb.append(getCompanyName());
        sb.append(", depId=");
        sb.append(getDepId());
        sb.append(", userDesc=");
        sb.append(getUserDesc());
        sb.append(", status=");
        sb.append(getStatus());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(40);

        sb.append("<model><model-name>");
        sb.append("com.lftechnology.sbwbtraining.userapplication.model.Emp");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>firstName</column-name><column-value><![CDATA[");
        sb.append(getFirstName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastName</column-name><column-value><![CDATA[");
        sb.append(getLastName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>address</column-name><column-value><![CDATA[");
        sb.append(getAddress());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
        sb.append(getPhoneNumber());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyName</column-name><column-value><![CDATA[");
        sb.append(getCompanyName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>depId</column-name><column-value><![CDATA[");
        sb.append(getDepId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userDesc</column-name><column-value><![CDATA[");
        sb.append(getUserDesc());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>status</column-name><column-value><![CDATA[");
        sb.append(getStatus());
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
