package com.lftechnology.sbwbtraining.division.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the division local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DivisionLocalServiceUtil
 * @see com.lftechnology.sbwbtraining.division.service.base.DivisionLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.division.service.impl.DivisionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface DivisionLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DivisionLocalServiceUtil} to access the division local service. Add custom service methods to {@link com.lftechnology.sbwbtraining.division.service.impl.DivisionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the division to the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was added
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division addDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new division with the primary key. Does not add the division to the database.
    *
    * @param divisionId the primary key for the new division
    * @return the new division
    */
    public com.lftechnology.sbwbtraining.division.model.Division createDivision(
        long divisionId);

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
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the division from the database. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division deleteDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
        throws com.liferay.portal.kernel.exception.SystemException;

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
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.lftechnology.sbwbtraining.division.model.Division fetchDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the division with the primary key.
    *
    * @param divisionId the primary key of the division
    * @return the division
    * @throws PortalException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.lftechnology.sbwbtraining.division.model.Division getDivision(
        long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getDivisions(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of divisions.
    *
    * @return the number of divisions
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getDivisionsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the division in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param division the division
    * @return the division that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division updateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.SystemException;

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
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> getEveryDivisions()
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.lftechnology.sbwbtraining.division.model.Division addUpdateDivision(
        com.lftechnology.sbwbtraining.division.model.Division division)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public void deleteDivisionById(long divisionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
