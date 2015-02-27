package com.lftechnology.sbwbtraining.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DepartmentService}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       DepartmentService
 * @generated
 */
public class DepartmentServiceWrapper implements DepartmentService,
    ServiceWrapper<DepartmentService> {
    private DepartmentService _departmentService;

    public DepartmentServiceWrapper(DepartmentService departmentService) {
        _departmentService = departmentService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _departmentService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _departmentService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _departmentService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public DepartmentService getWrappedDepartmentService() {
        return _departmentService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedDepartmentService(DepartmentService departmentService) {
        _departmentService = departmentService;
    }

    public DepartmentService getWrappedService() {
        return _departmentService;
    }

    public void setWrappedService(DepartmentService departmentService) {
        _departmentService = departmentService;
    }
}
