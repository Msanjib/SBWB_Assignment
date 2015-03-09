package com.lftechnology.sbwbtraining.userapplication.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the emp local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmpLocalServiceUtil
 * @see com.lftechnology.sbwbtraining.userapplication.service.base.EmpLocalServiceBaseImpl
 * @see com.lftechnology.sbwbtraining.userapplication.service.impl.EmpLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface EmpLocalService extends BaseLocalService, InvokableLocalService,
    PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmpLocalServiceUtil} to access the emp local service. Add custom service methods to {@link com.lftechnology.sbwbtraining.userapplication.service.impl.EmpLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the emp to the database. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was added
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp addEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new emp with the primary key. Does not add the emp to the database.
    *
    * @param userId the primary key for the new emp
    * @return the new emp
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp createEmp(
        long userId);

    /**
    * Deletes the emp with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the emp
    * @return the emp that was removed
    * @throws PortalException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp deleteEmp(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the emp from the database. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp deleteEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
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
    public com.lftechnology.sbwbtraining.userapplication.model.Emp fetchEmp(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the emp with the primary key.
    *
    * @param userId the primary key of the emp
    * @return the emp
    * @throws PortalException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.lftechnology.sbwbtraining.userapplication.model.Emp getEmp(
        long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

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
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> getEmps(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of emps.
    *
    * @return the number of emps
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getEmpsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the emp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @return the emp that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp updateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the emp in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param emp the emp
    * @param merge whether to merge the emp with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the emp that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp updateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp,
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

    /**
    * This method adds or updates the given model of {@link Emp} to the
    * database. The addition or update depends on the identification stored in
    * given <code>employee</code> as parameter.If it is 0 then addition
    * operation is done or else update operation is done.
    *
    * @param employee
    a {@link Emp} instance to store or update in the database
    * @return added or updated {@link Emp} instance
    * @throws SystemException
    * @throws PortalException
    * @author sanjib maharjan
    */
    public com.lftechnology.sbwbtraining.userapplication.model.Emp addUpdateEmp(
        com.lftechnology.sbwbtraining.userapplication.model.Emp employee)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * This method searches the {@link String} in the database that matches the
    * firstName, lastName or address of {@link Emp}.The {@link List} of
    * {@link Emp} is returned as are result.
    *
    * @param {@link String} to be searched in the database
    * @return {@link List} of {@link Emp} instance
    * @throws SystemException
    * @author bibhushan
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> searchEmployees(
        java.lang.String search)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * This method return the {@link List} of all the {@link Emp} from the
    * database.
    *
    * @return {@link List} of {@link Emp} instance
    * @throws SystemException
    * @author bibhushan
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> getAllEmployees()
        throws com.liferay.portal.kernel.exception.SystemException;
}
