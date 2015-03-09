package com.lftechnology.sbwbtraining.division.service.persistence;

import com.lftechnology.sbwbtraining.division.model.Division;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the division service. This utility wraps {@link DivisionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DivisionPersistence
 * @see DivisionPersistenceImpl
 * @generated
 */
public class DivisionUtil {
    private static DivisionPersistence _persistence;

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
    public static void clearCache(Division division) {
        getPersistence().clearCache(division);
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
    public static List<Division> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Division> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Division> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Division update(Division division, boolean merge)
        throws SystemException {
        return getPersistence().update(division, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Division update(Division division, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(division, merge, serviceContext);
    }

    /**
    * Caches the division in the entity cache if it is enabled.
    *
    * @param division the division
    */
    public static void cacheResult(
        com.lftechnology.sbwbtraining.division.model.Division division) {
        getPersistence().cacheResult(division);
    }

    /**
    * Caches the divisions in the entity cache if it is enabled.
    *
    * @param divisions the divisions
    */
    public static void cacheResult(
        java.util.List<com.lftechnology.sbwbtraining.division.model.Division> divisions) {
        getPersistence().cacheResult(divisions);
    }

    /**
    * Creates a new division with the primary key. Does not add the division to the database.
    *
    * @param divisionId the primary key for the new division
    * @return the new division
    */
    public static com.lftechnology.sbwbtraining.division.model.Division create(
        long divisionId) {
        return getPersistence().create(divisionId);
    }

    /**
    * Removes the division with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param divisionId the primary key of the division
    * @return the division that was removed
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division remove(
        long divisionId)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(divisionId);
    }

    public static com.lftechnology.sbwbtraining.division.model.Division updateImpl(
        com.lftechnology.sbwbtraining.division.model.Division division,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(division, merge);
    }

    /**
    * Returns the division with the primary key or throws a {@link com.lftechnology.sbwbtraining.division.NoSuchDivisionException} if it could not be found.
    *
    * @param divisionId the primary key of the division
    * @return the division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByPrimaryKey(
        long divisionId)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(divisionId);
    }

    /**
    * Returns the division with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param divisionId the primary key of the division
    * @return the division, or <code>null</code> if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByPrimaryKey(
        long divisionId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(divisionId);
    }

    /**
    * Returns all the divisions where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_DN(groupId, divisionName);
    }

    /**
    * Returns a range of all the divisions where groupId = &#63; and divisionName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @return the range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_DN(groupId, divisionName, start, end);
    }

    /**
    * Returns an ordered range of all the divisions where groupId = &#63; and divisionName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN(groupId, divisionName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByG_DN_First(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_First(groupId, divisionName, orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByG_DN_First(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_DN_First(groupId, divisionName, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByG_DN_Last(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_Last(groupId, divisionName, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByG_DN_Last(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_DN_Last(groupId, divisionName, orderByComparator);
    }

    /**
    * Returns the divisions before and after the current division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param divisionId the primary key of the current division
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division[] findByG_DN_PrevAndNext(
        long divisionId, long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_PrevAndNext(divisionId, groupId, divisionName,
            orderByComparator);
    }

    /**
    * Returns all the divisions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the divisions where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @return the range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the divisions where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the divisions before and after the current division in the ordered set where groupId = &#63;.
    *
    * @param divisionId the primary key of the current division
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division[] findByGroupId_PrevAndNext(
        long divisionId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(divisionId, groupId,
            orderByComparator);
    }

    /**
    * Returns all the divisions where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

    /**
    * Returns a range of all the divisions where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @return the range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

    /**
    * Returns an ordered range of all the divisions where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the divisions before and after the current division in the ordered set where companyId = &#63;.
    *
    * @param divisionId the primary key of the current division
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.division.model.Division[] findByCompanyId_PrevAndNext(
        long divisionId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(divisionId, companyId,
            orderByComparator);
    }

    /**
    * Returns all the divisions.
    *
    * @return the divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the divisions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of divisions
    * @param end the upper bound of the range of divisions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of divisions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the divisions where groupId = &#63; and divisionName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_DN(long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_DN(groupId, divisionName);
    }

    /**
    * Removes all the divisions where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Removes all the divisions where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Removes all the divisions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of divisions where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_DN(long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_DN(groupId, divisionName);
    }

    /**
    * Returns the number of divisions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of divisions where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Returns the number of divisions.
    *
    * @return the number of divisions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DivisionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DivisionPersistence) PortletBeanLocatorUtil.locate(com.lftechnology.sbwbtraining.division.service.ClpSerializer.getServletContextName(),
                    DivisionPersistence.class.getName());

            ReferenceRegistry.registerReference(DivisionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(DivisionPersistence persistence) {
    }
}
