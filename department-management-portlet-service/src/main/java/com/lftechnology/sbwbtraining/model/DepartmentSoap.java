package com.lftechnology.sbwbtraining.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.sbwbtraining.service.http.DepartmentServiceSoap}.
 *
 * @author    Sanjib Maharjan
 * @see       com.lftechnology.sbwbtraining.service.http.DepartmentServiceSoap
 * @generated
 */
public class DepartmentSoap implements Serializable {
    private long _departmentId;
    private String _departmentName;
    private String _createdBy;
    private String _createdOn;
    private long _companyId;
    private long _groupId;

    public DepartmentSoap() {
    }

    public static DepartmentSoap toSoapModel(Department model) {
        DepartmentSoap soapModel = new DepartmentSoap();

        soapModel.setDepartmentId(model.getDepartmentId());
        soapModel.setDepartmentName(model.getDepartmentName());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedOn(model.getCreatedOn());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static DepartmentSoap[] toSoapModels(Department[] models) {
        DepartmentSoap[] soapModels = new DepartmentSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[][] toSoapModels(Department[][] models) {
        DepartmentSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DepartmentSoap[models.length][models[0].length];
        } else {
            soapModels = new DepartmentSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DepartmentSoap[] toSoapModels(List<Department> models) {
        List<DepartmentSoap> soapModels = new ArrayList<DepartmentSoap>(models.size());

        for (Department model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DepartmentSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _departmentId;
    }

    public void setPrimaryKey(long pk) {
        setDepartmentId(pk);
    }

    public long getDepartmentId() {
        return _departmentId;
    }

    public void setDepartmentId(long departmentId) {
        _departmentId = departmentId;
    }

    public String getDepartmentName() {
        return _departmentName;
    }

    public void setDepartmentName(String departmentName) {
        _departmentName = departmentName;
    }

    public String getCreatedBy() {
        return _createdBy;
    }

    public void setCreatedBy(String createdBy) {
        _createdBy = createdBy;
    }

    public String getCreatedOn() {
        return _createdOn;
    }

    public void setCreatedOn(String createdOn) {
        _createdOn = createdOn;
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
