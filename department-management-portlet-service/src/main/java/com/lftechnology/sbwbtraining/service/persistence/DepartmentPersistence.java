package com.lftechnology.sbwbtraining.service.persistence;

import com.lftechnology.sbwbtraining.model.Department;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the department service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DepartmentPersistenceImpl
 * @see DepartmentUtil
 * @generated
 */
public interface DepartmentPersistence extends BasePersistence<Department> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DepartmentUtil} to access the department persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the department in the entity cache if it is enabled.
    *
    * @param department the department
    */
    public void cacheResult(
        com.lftechnology.sbwbtraining.model.Department department);

    /**
    * Caches the departments in the entity cache if it is enabled.
    *
    * @param departments the departments
    */
    public void cacheResult(
        java.util.List<com.lftechnology.sbwbtraining.model.Department> departments);

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param departmentId the primary key for the new department
    * @return the new department
    */
    public com.lftechnology.sbwbtraining.model.Department create(
        long departmentId);

    /**
    * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param departmentId the primary key of the department
    * @return the department that was removed
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department remove(
        long departmentId)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.lftechnology.sbwbtraining.model.Department updateImpl(
        com.lftechnology.sbwbtraining.model.Department department, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the department with the primary key or throws a {@link com.lftechnology.sbwbtraining.NoSuchDepartmentException} if it could not be found.
    *
    * @param departmentId the primary key of the department
    * @return the department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByPrimaryKey(
        long departmentId)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the department with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param departmentId the primary key of the department
    * @return the department, or <code>null</code> if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByPrimaryKey(
        long departmentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the departments where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the departments where groupId = &#63; and departmentName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the departments where groupId = &#63; and departmentName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByG_DN_First(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByG_DN_First(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByG_DN_Last(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByG_DN_Last(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the departments before and after the current department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param departmentId the primary key of the current department
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department[] findByG_DN_PrevAndNext(
        long departmentId, long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the departments where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the departments where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the departments where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the departments before and after the current department in the ordered set where groupId = &#63;.
    *
    * @param departmentId the primary key of the current department
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department[] findByGroupId_PrevAndNext(
        long departmentId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the departments where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the departments where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the departments where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the departments before and after the current department in the ordered set where companyId = &#63;.
    *
    * @param departmentId the primary key of the current department
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbtraining.model.Department[] findByCompanyId_PrevAndNext(
        long departmentId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the departments.
    *
    * @return the departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @return the range of departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the departments.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of departments
    * @param end the upper bound of the range of departments (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of departments
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the departments where groupId = &#63; and departmentName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_DN(long groupId, java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the departments where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the departments where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the departments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of departments where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public int countByG_DN(long groupId, java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of departments where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of departments where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
