package com.lftechnology.sbwbtraining.userapplication.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link EmpService}.
 * </p>
 *
 * @author    Bibhushan Joshi
 * @see       EmpService
 * @generated
 */
public class EmpServiceWrapper implements EmpService,
    ServiceWrapper<EmpService> {
    private EmpService _empService;

    public EmpServiceWrapper(EmpService empService) {
        _empService = empService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _empService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _empService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _empService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public EmpService getWrappedEmpService() {
        return _empService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedEmpService(EmpService empService) {
        _empService = empService;
    }

    public EmpService getWrappedService() {
        return _empService;
    }

    public void setWrappedService(EmpService empService) {
        _empService = empService;
    }
}
