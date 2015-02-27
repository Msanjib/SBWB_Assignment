package com.lftechnology.sbwbusers.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link EmployeeService}.
 * </p>
 *
 * @author    Bibhushan Joshi
 * @see       EmployeeService
 * @generated
 */
public class EmployeeServiceWrapper implements EmployeeService,
    ServiceWrapper<EmployeeService> {
    private EmployeeService _employeeService;

    public EmployeeServiceWrapper(EmployeeService employeeService) {
        _employeeService = employeeService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _employeeService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _employeeService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _employeeService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public EmployeeService getWrappedEmployeeService() {
        return _employeeService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedEmployeeService(EmployeeService employeeService) {
        _employeeService = employeeService;
    }

    public EmployeeService getWrappedService() {
        return _employeeService;
    }

    public void setWrappedService(EmployeeService employeeService) {
        _employeeService = employeeService;
    }
}
