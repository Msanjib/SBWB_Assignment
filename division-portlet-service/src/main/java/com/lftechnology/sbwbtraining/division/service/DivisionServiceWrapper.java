package com.lftechnology.sbwbtraining.division.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DivisionService}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       DivisionService
 * @generated
 */
public class DivisionServiceWrapper implements DivisionService,
    ServiceWrapper<DivisionService> {
    private DivisionService _divisionService;

    public DivisionServiceWrapper(DivisionService divisionService) {
        _divisionService = divisionService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _divisionService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _divisionService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _divisionService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public DivisionService getWrappedDivisionService() {
        return _divisionService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedDivisionService(DivisionService divisionService) {
        _divisionService = divisionService;
    }

    public DivisionService getWrappedService() {
        return _divisionService;
    }

    public void setWrappedService(DivisionService divisionService) {
        _divisionService = divisionService;
    }
}
