package com.lftechnology.sbwbtraining.division.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DivisionLocalService}.
 * </p>
 *
 * @author    Sanjib Maharjan
 * @see       DivisionLocalService
 * @generated
 */
public class DivisionLocalServiceWrapper implements DivisionLocalService,
    ServiceWrapper<DivisionLocalService> {
    private DivisionLocalService _divisionLocalService;

    public DivisionLocalServiceWrapper(
        DivisionLocalService divisionLocalService) {
        _divisionLocalService = divisionLocalService;
    }

    /**
    * Adds the division to the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was added
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division addDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.addDivision(division);
    }

    /**
    * Creates a new division with the primary key. Does not add the division to the database.
    *
    * @param divisionId the primary key for the new division
    * @return the new division
    */
    public com.lftechnology.sbwbtraining.division.model.Division createDivision(
        long divisionId) {
        return _divisionLocalService.createDivision(divisionId);
    }

    /**
    * Deletes the division with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param divisionId the primary key of the division
    * @return the division that was removed
    * @throws PortalException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division deleteDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.deleteDivision(divisionId);
    }

    /**
    * Deletes the division from the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division deleteDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.deleteDivision(division);
    }

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _divisionLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.dynamicQuery(dynamicQuery, start, end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.lftechnology.sbwbtraining.division.model.Division fetchDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.fetchDivision(divisionId);
    }

    /**
    * Returns the division with the primary key.
    *
    * @param divisionId the primary key of the division
    * @return the division
    * @throws PortalException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division getDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.getDivision(divisionId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getDivisions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.getDivisions(start, end);
    }

    /**
    * Returns the number of divisions.
    *
    * @return the number of divisions
    * @throws SystemException if a system exception occurred
    */
    public int getDivisionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.getDivisionsCount();
    }

    /**
    * Updates the division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division updateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.updateDivision(division);
    }

    /**
    * Updates the division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @param merge whether to merge the division with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the division that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division updateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.updateDivision(division, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _divisionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _divisionLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _divisionLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
    * This method fetches all entry of {@link Division} from the database table
    * and returns them as a list
    *
    * @return the list of all {@link Division} entry from the database table
    * @author sanjib maharjan
    */
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getEveryDivisions()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.getEveryDivisions();
    }

    /**
    * This method add or update the entry of {@link Division} instance in the
    * database table
    *
    * @param division
    a {@link Division} instance to be added or updated to the
    database
    * @author sanjib maharjan
    */
    public com.lftechnology.sbwbtraining.division.model.Division addUpdateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _divisionLocalService.addUpdateDivision(division);
    }

    /**
    * This method removes entry of {@link Division} from the database table
    * that matches with the divisionId
    *
    * @param divisionId
    the response sent by the portlet
    * @author sanjib maharjan
    */
    public void deleteDivisionById(long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _divisionLocalService.deleteDivisionById(divisionId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public DivisionLocalService getWrappedDivisionLocalService() {
        return _divisionLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedDivisionLocalService(
        DivisionLocalService divisionLocalService) {
        _divisionLocalService = divisionLocalService;
    }

    public DivisionLocalService getWrappedService() {
        return _divisionLocalService;
    }

    public void setWrappedService(DivisionLocalService divisionLocalService) {
        _divisionLocalService = divisionLocalService;
    }
}
