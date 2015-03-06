package com.lftechnology.sbwbtraining.userapplication.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the emp local service. This utility wraps {@link com.lftechnology.sbwbtraining.userapplication.service.impl.EmpLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmpLocalService
 * @see com.lftechnology.sbwbtraining.userapplication.service.base.EmpLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.userapplication.service.impl.EmpLocalServiceImpl
 * @generated
 */
public class EmpLocalServiceUtil {
    private static EmpLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lftechnology.sbwbtraining.userapplication.service.impl.EmpLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the emp to the database. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp addEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addEmp(emp);
    }

    /**
    * Creates a new emp with the primary key. Does not add the emp to the database.
    *
    * @param userId the primary key for the new emp
    * @return the new emp
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp createEmp(
        long userId) {
        return getService().createEmp(userId);
    }

    /**
    * Deletes the emp with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the emp
    * @return the emp that was removed
    * @throws PortalException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp deleteEmp(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEmp(userId);
    }

    /**
    * Deletes the emp from the database. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp deleteEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteEmp(emp);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchEmp(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchEmp(userId);
    }

    /**
    * Returns the emp with the primary key.
    *
    * @param userId the primary key of the emp
    * @return the emp
    * @throws PortalException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp getEmp(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmp(userId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the emps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> getEmps(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmps(start, end);
    }

    /**
    * Returns the number of emps.
    *
    * @return the number of emps
    * @throws SystemException if a system exception occurred
    */
    public static int getEmpsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEmpsCount();
    }

    /**
    * Updates the emp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp updateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEmp(emp);
    }

    /**
    * Updates the emp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @param merge whether to merge the emp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the emp that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp updateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateEmp(emp, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * Method use to add or udpate MOUser
    *
    * @author bibhushan
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp addUpdateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp moUser)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addUpdateEmp(moUser);
    }

    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> getAllEmployees()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getAllEmployees();
    }

    /**
    * This method searches the string search in the data base to give out the search list
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> searchEmployees(
        java.lang.String search)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().searchEmployees(search);
    }

    public static void clearService() {
        _service = null;
    }

    public static EmpLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    EmpLocalService.class.getName());

            if (invokableLocalService instanceof EmpLocalService) {
                _service = (EmpLocalService) invokableLocalService;
            } else {
                _service = new EmpLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(EmpLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(EmpLocalService service) {
    }
}
