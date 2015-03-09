package com.lftechnology.sbwbtraining.division.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the division local service. This utility wraps {@link com.lftechnology.sbwbtraining.division.service.impl.DivisionLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DivisionLocalService
 * @see com.lftechnology.sbwbtraining.division.service.base.DivisionLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.division.service.impl.DivisionLocalServiceImpl
 * @generated
 */
public class DivisionLocalServiceUtil {
    private static DivisionLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.lftechnology.sbwbtraining.division.service.impl.DivisionLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the division to the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division addDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addDivision(division);
    }

    /**
    * Creates a new division with the primary key. Does not add the division to the database.
    *
    * @param divisionId the primary key for the new division
    * @return the new division
    */
    public static com.lftechnology.sbwbtraining.division.model.Division createDivision(
        long divisionId) {
        return getService().createDivision(divisionId);
    }

    /**
    * Deletes the division with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param divisionId the primary key of the division
    * @return the division that was removed
    * @throws PortalException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division deleteDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDivision(divisionId);
    }

    /**
    * Deletes the division from the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division deleteDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteDivision(division);
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

    public static com.lftechnology.sbwbtraining.division.model.Division fetchDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchDivision(divisionId);
    }

    /**
    * Returns the division with the primary key.
    *
    * @param divisionId the primary key of the division
    * @return the division
    * @throws PortalException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division getDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getDivision(divisionId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the divisions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @return the range of divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getDivisions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDivisions(start, end);
    }

    /**
    * Returns the number of divisions.
    *
    * @return the number of divisions
    * @throws SystemException if a system exception occurred
    */
    public static int getDivisionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getDivisionsCount();
    }

    /**
    * Updates the division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division updateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDivision(division);
    }

    /**
    * Updates the division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @param merge whether to merge the division with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the division that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division updateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateDivision(division, merge);
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

    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getEveryDivisions()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getEveryDivisions();
    }

    public static com.lftechnology.sbwbtraining.division.model.Division addUpdateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().addUpdateDivision(division);
    }

    public static void deleteDivisionById(long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deleteDivisionById(divisionId);
    }

    public static void clearService() {
        _service = null;
    }

    public static DivisionLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    DivisionLocalService.class.getName());

            if (invokableLocalService instanceof DivisionLocalService) {
                _service = (DivisionLocalService) invokableLocalService;
            } else {
                _service = new DivisionLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(DivisionLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(DivisionLocalService service) {
    }
}
