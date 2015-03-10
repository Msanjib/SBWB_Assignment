package com.lftechnology.sbwbtraining.userapplication.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.sbwbtraining.userapplication.service.http.EmpServiceSoap}.
 *
 * @author    Bibhushan Joshi
 * @see       com.lftechnology.sbwbtraining.userapplication.service.http.EmpServiceSoap
 * @generated
 */
public class EmpSoap implements Serializable {
    private long _userId;
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

    public EmpSoap() {
    }

    public static EmpSoap toSoapModel(Emp model) {
        EmpSoap soapModel = new EmpSoap();

        soapModel.setUserId(model.getUserId());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setLastName(model.getLastName());
        soapModel.setAddress(model.getAddress());
        soapModel.setPhoneNumber(model.getPhoneNumber());
        soapModel.setEmail(model.getEmail());
        soapModel.setCompanyName(model.getCompanyName());
        soapModel.setDepId(model.getDepId());
        soapModel.setUserDesc(model.getUserDesc());
        soapModel.setStatus(model.getStatus());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static EmpSoap[] toSoapModels(Emp[] models) {
        EmpSoap[] soapModels = new EmpSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmpSoap[][] toSoapModels(Emp[][] models) {
        EmpSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmpSoap[models.length][models[0].length];
        } else {
            soapModels = new EmpSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmpSoap[] toSoapModels(List<Emp> models) {
        List<EmpSoap> soapModels = new ArrayList<EmpSoap>(models.size());

        for (Emp model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmpSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _userId;
    }

    public void setPrimaryKey(long pk) {
        setUserId(pk);
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }

    public String getPhoneNumber() {
        return _phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        _phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }

    public String getCompanyName() {
        return _companyName;
    }

    public void setCompanyName(String companyName) {
        _companyName = companyName;
    }

    public long getDepId() {
        return _depId;
    }

    public void setDepId(long depId) {
        _depId = depId;
    }

    public String getUserDesc() {
        return _userDesc;
    }

    public void setUserDesc(String userDesc) {
        _userDesc = userDesc;
    }

    public Boolean getStatus() {
        return _status;
    }

    public void setStatus(Boolean status) {
        _status = status;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }
}
