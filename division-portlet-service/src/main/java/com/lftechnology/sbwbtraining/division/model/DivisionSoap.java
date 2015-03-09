package com.lftechnology.sbwbtraining.division.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.sbwbtraining.division.service.http.DivisionServiceSoap}.
 *
 * @author    Sanjib Maharjan
 * @see       com.lftechnology.sbwbtraining.division.service.http.DivisionServiceSoap
 * @generated
 */
public class DivisionSoap implements Serializable {
    private long _divisionId;
    private String _divisionName;
    private String _createdBy;
    private String _createdOn;
    private long _companyId;
    private long _groupId;

    public DivisionSoap() {
    }

    public static DivisionSoap toSoapModel(Division model) {
        DivisionSoap soapModel = new DivisionSoap();

        soapModel.setDivisionId(model.getDivisionId());
        soapModel.setDivisionName(model.getDivisionName());
        soapModel.setCreatedBy(model.getCreatedBy());
        soapModel.setCreatedOn(model.getCreatedOn());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());

        return soapModel;
    }

    public static DivisionSoap[] toSoapModels(Division[] models) {
        DivisionSoap[] soapModels = new DivisionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static DivisionSoap[][] toSoapModels(Division[][] models) {
        DivisionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new DivisionSoap[models.length][models[0].length];
        } else {
            soapModels = new DivisionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static DivisionSoap[] toSoapModels(List<Division> models) {
        List<DivisionSoap> soapModels = new ArrayList<DivisionSoap>(models.size());

        for (Division model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new DivisionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _divisionId;
    }

    public void setPrimaryKey(long pk) {
        setDivisionId(pk);
    }

    public long getDivisionId() {
        return _divisionId;
    }

    public void setDivisionId(long divisionId) {
        _divisionId = divisionId;
    }

    public String getDivisionName() {
        return _divisionName;
    }

    public void setDivisionName(String divisionName) {
        _divisionName = divisionName;
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
