package com.lftechnology.sbwbtraining.division.service.persistence;

import com.lftechnology.sbwbtraining.division.model.Division;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DivisionPersistenceImpl
 * @see DivisionUtil
 * @generated
 */
public interface DivisionPersistence extends BasePersistence<Division> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DivisionUtil} to access the division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the division in the entity cache if it is enabled.
    *
    * @param division the division
    */
    public void cacheResult(
        com.lftechnology.sbwbtraining.division.model.Division division);

    /**
    * Caches the divisions in the entity cache if it is enabled.
    *
    * @param divisions the divisions
    */
    public void cacheResult(
        java.util.List<com.lftechnology.sbwbtraining.division.model.Division> divisions);

    /**
    * Creates a new division with the primary key. Does not add the division to the database.
    *
    * @param divisionId the primary key for the new division
    * @return the new division
    */
    public com.lftechnology.sbwbtraining.division.model.Division create(
        long divisionId);

    /**
    * Removes the division with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param divisionId the primary key of the division
    * @return the division that was removed
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division remove(
        long divisionId)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.lftechnology.sbwbtraining.division.model.Division updateImpl(
        com.lftechnology.sbwbtraining.division.model.Division division,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the division with the primary key or throws a {@link com.lftechnology.sbwbtraining.division.NoSuchDivisionException} if it could not be found.
    *
    * @param divisionId the primary key of the division
    * @return the division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division findByPrimaryKey(
        long divisionId)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the division with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param divisionId the primary key of the division
    * @return the division, or <code>null</code> if a division with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByPrimaryKey(
        long divisionId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the divisions where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByG_DN(
        long groupId, java.lang.String divisionName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbtraining.division.model.Division findByG_DN_First(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByG_DN_First(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbtraining.division.model.Division findByG_DN_Last(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last division in the ordered set where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByG_DN_Last(
        long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbtraining.division.model.Division[] findByG_DN_PrevAndNext(
        long divisionId, long groupId, java.lang.String divisionName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the divisions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last division in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbtraining.division.model.Division[] findByGroupId_PrevAndNext(
        long divisionId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the divisions where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching divisions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division
    * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last division in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching division, or <code>null</code> if a matching division could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.division.model.Division fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbtraining.division.model.Division[] findByCompanyId_PrevAndNext(
        long divisionId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the divisions.
    *
    * @return the divisions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbtraining.division.model.Division> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the divisions where groupId = &#63; and divisionName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_DN(long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the divisions where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the divisions where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the divisions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of divisions where groupId = &#63; and divisionName = &#63;.
    *
    * @param groupId the group ID
    * @param divisionName the division name
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public int countByG_DN(long groupId, java.lang.String divisionName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of divisions where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of divisions where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching divisions
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of divisions.
    *
    * @return the number of divisions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
