package com.lftechnology.sbwbtraining.userapplication.service.persistence;

import com.lftechnology.sbwbtraining.userapplication.model.Emp;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the emp service. This utility wraps {@link EmpPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmpPersistence
 * @see EmpPersistenceImpl
 * @generated
 */
public class EmpUtil {
    private static EmpPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Emp emp) {
        getPersistence().clearCache(emp);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Emp> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Emp> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Emp> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Emp update(Emp emp, boolean merge) throws SystemException {
        return getPersistence().update(emp, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Emp update(Emp emp, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(emp, merge, serviceContext);
    }

    /**
    * Caches the emp in the entity cache if it is enabled.
    *
    * @param emp the emp
    */
    public static void cacheResult(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp) {
        getPersistence().cacheResult(emp);
    }

    /**
    * Caches the emps in the entity cache if it is enabled.
    *
    * @param emps the emps
    */
    public static void cacheResult(
        java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> emps) {
        getPersistence().cacheResult(emps);
    }

    /**
    * Creates a new emp with the primary key. Does not add the emp to the database.
    *
    * @param userId the primary key for the new emp
    * @return the new emp
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp create(
        long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the emp
    * @return the emp that was removed
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp remove(
        long userId)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(userId);
    }

    public static com.lftechnology.sbwbtraining.userapplication.model.Emp updateImpl(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(emp, merge);
    }

    /**
    * Returns the emp with the primary key or throws a {@link com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException} if it could not be found.
    *
    * @param userId the primary key of the emp
    * @return the emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByPrimaryKey(
        long userId)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the emp
    * @return the emp, or <code>null</code> if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the emps where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_FN(
        long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_FN(groupId, firstName);
    }

    /**
    * Returns a range of all the emps where groupId = &#63; and firstName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_FN(groupId, firstName, start, end);
    }

    /**
    * Returns an ordered range of all the emps where groupId = &#63; and firstName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN(groupId, firstName, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_First(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_FN_First(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_Last(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_FN_Last(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByG_FN_PrevAndNext(
        long userId, long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_PrevAndNext(userId, groupId, firstName,
            orderByComparator);
    }

    /**
    * Returns all the emps where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_LN(
        long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_LN(groupId, lastName);
    }

    /**
    * Returns a range of all the emps where groupId = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_LN(groupId, lastName, start, end);
    }

    /**
    * Returns an ordered range of all the emps where groupId = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN(groupId, lastName, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_First(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_LN_First(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_Last(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_LN_Last(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByG_LN_PrevAndNext(
        long userId, long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_PrevAndNext(userId, groupId, lastName,
            orderByComparator);
    }

    /**
    * Returns all the emps where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_CN(
        long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_CN(groupId, companyName);
    }

    /**
    * Returns a range of all the emps where groupId = &#63; and companyName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_CN(groupId, companyName, start, end);
    }

    /**
    * Returns an ordered range of all the emps where groupId = &#63; and companyName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN(groupId, companyName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_First(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_CN_First(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_Last(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_CN_Last(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByG_CN_PrevAndNext(
        long userId, long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_PrevAndNext(userId, groupId, companyName,
            orderByComparator);
    }

    /**
    * Returns all the emps where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_PP(
        long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_PP(groupId, status);
    }

    /**
    * Returns a range of all the emps where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_PP(
        long groupId, java.lang.Boolean status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_PP(groupId, status, start, end);
    }

    /**
    * Returns an ordered range of all the emps where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByG_PP(
        long groupId, java.lang.Boolean status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_PP(groupId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_PP_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_PP_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_PP_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_PP_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByG_PP_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_PP_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByG_PP_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_PP_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByG_PP_PrevAndNext(
        long userId, long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_PP_PrevAndNext(userId, groupId, status,
            orderByComparator);
    }

    /**
    * Returns all the emps where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByDepId(
        long depId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId);
    }

    /**
    * Returns a range of all the emps where depId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param depId the dep ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByDepId(
        long depId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId, start, end);
    }

    /**
    * Returns an ordered range of all the emps where depId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param depId the dep ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByDepId(
        long depId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId_First(depId, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDepId_First(depId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId_Last(depId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDepId_Last(depId, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where depId = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByDepId_PrevAndNext(
        long userId, long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDepId_PrevAndNext(userId, depId, orderByComparator);
    }

    /**
    * Returns all the emps where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the emps where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the emps where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where groupId = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByGroupId_PrevAndNext(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(userId, groupId, orderByComparator);
    }

    /**
    * Returns all the emps where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

    /**
    * Returns a range of all the emps where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @return the range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

    /**
    * Returns an ordered range of all the emps where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first emp in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last emp in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching emp, or <code>null</code> if a matching emp could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the emps before and after the current emp in the ordered set where companyId = &#63;.
    *
    * @param userId the primary key of the current emp
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next emp
    * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.userapplication.model.Emp[] findByCompanyId_PrevAndNext(
        long userId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(userId, companyId,
            orderByComparator);
    }

    /**
    * Returns all the emps.
    *
    * @return the emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the emps.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of emps
    * @param end the upper bound of the range of emps (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of emps
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.userapplication.model.Emp> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the emps where groupId = &#63; and firstName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_FN(long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_FN(groupId, firstName);
    }

    /**
    * Removes all the emps where groupId = &#63; and lastName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_LN(long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_LN(groupId, lastName);
    }

    /**
    * Removes all the emps where groupId = &#63; and companyName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_CN(long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_CN(groupId, companyName);
    }

    /**
    * Removes all the emps where groupId = &#63; and status = &#63; from the database.
    *
    * @param groupId the group ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_PP(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_PP(groupId, status);
    }

    /**
    * Removes all the emps where depId = &#63; from the database.
    *
    * @param depId the dep ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDepId(depId);
    }

    /**
    * Removes all the emps where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Removes all the emps where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Removes all the emps from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of emps where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_FN(long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_FN(groupId, firstName);
    }

    /**
    * Returns the number of emps where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_LN(long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_LN(groupId, lastName);
    }

    /**
    * Returns the number of emps where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_CN(long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_CN(groupId, companyName);
    }

    /**
    * Returns the number of emps where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_PP(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_PP(groupId, status);
    }

    /**
    * Returns the number of emps where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDepId(depId);
    }

    /**
    * Returns the number of emps where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of emps where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching emps
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Returns the number of emps.
    *
    * @return the number of emps
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmpPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmpPersistence) PortletBeanLocatorUtil.locate(com.lftechnology.sbwbtraining.userapplication.service.ClpSerializer.getServletContextName(),
                    EmpPersistence.class.getName());

            ReferenceRegistry.registerReference(EmpUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(EmpPersistence persistence) {
    }
}
