package com.lftechnology.sbwbtraining.service.persistence;

import com.lftechnology.sbwbtraining.model.Department;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the department service. This utility wraps {@link DepartmentPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DepartmentPersistence
 * @see DepartmentPersistenceImpl
 * @generated
 */
public class DepartmentUtil {
    private static DepartmentPersistence _persistence;

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
    public static void clearCache(Department department) {
        getPersistence().clearCache(department);
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
    public static List<Department> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Department> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Department> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Department update(Department department, boolean merge)
        throws SystemException {
        return getPersistence().update(department, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Department update(Department department, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(department, merge, serviceContext);
    }

    /**
    * Caches the department in the entity cache if it is enabled.
    *
    * @param department the department
    */
    public static void cacheResult(
        com.lftechnology.sbwbtraining.model.Department department) {
        getPersistence().cacheResult(department);
    }

    /**
    * Caches the departments in the entity cache if it is enabled.
    *
    * @param departments the departments
    */
    public static void cacheResult(
        java.util.List<com.lftechnology.sbwbtraining.model.Department> departments) {
        getPersistence().cacheResult(departments);
    }

    /**
    * Creates a new department with the primary key. Does not add the department to the database.
    *
    * @param departmentId the primary key for the new department
    * @return the new department
    */
    public static com.lftechnology.sbwbtraining.model.Department create(
        long departmentId) {
        return getPersistence().create(departmentId);
    }

    /**
    * Removes the department with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param departmentId the primary key of the department
    * @return the department that was removed
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department remove(
        long departmentId)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(departmentId);
    }

    public static com.lftechnology.sbwbtraining.model.Department updateImpl(
        com.lftechnology.sbwbtraining.model.Department department, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(department, merge);
    }

    /**
    * Returns the department with the primary key or throws a {@link com.lftechnology.sbwbtraining.NoSuchDepartmentException} if it could not be found.
    *
    * @param departmentId the primary key of the department
    * @return the department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department findByPrimaryKey(
        long departmentId)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(departmentId);
    }

    /**
    * Returns the department with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param departmentId the primary key of the department
    * @return the department, or <code>null</code> if a department with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByPrimaryKey(
        long departmentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(departmentId);
    }

    /**
    * Returns all the departments where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_DN(groupId, departmentName);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_DN(groupId, departmentName, start, end);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByG_DN(
        long groupId, java.lang.String departmentName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN(groupId, departmentName, start, end,
            orderByComparator);
    }

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
    public static com.lftechnology.sbwbtraining.model.Department findByG_DN_First(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_First(groupId, departmentName, orderByComparator);
    }

    /**
    * Returns the first department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByG_DN_First(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_DN_First(groupId, departmentName, orderByComparator);
    }

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
    public static com.lftechnology.sbwbtraining.model.Department findByG_DN_Last(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_Last(groupId, departmentName, orderByComparator);
    }

    /**
    * Returns the last department in the ordered set where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByG_DN_Last(
        long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_DN_Last(groupId, departmentName, orderByComparator);
    }

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
    public static com.lftechnology.sbwbtraining.model.Department[] findByG_DN_PrevAndNext(
        long departmentId, long groupId, java.lang.String departmentName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_DN_PrevAndNext(departmentId, groupId,
            departmentName, orderByComparator);
    }

    /**
    * Returns all the departments where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last department in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

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
    public static com.lftechnology.sbwbtraining.model.Department[] findByGroupId_PrevAndNext(
        long departmentId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(departmentId, groupId,
            orderByComparator);
    }

    /**
    * Returns all the departments where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department
    * @throws com.lftechnology.sbwbtraining.NoSuchDepartmentException if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last department in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching department, or <code>null</code> if a matching department could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbtraining.model.Department fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

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
    public static com.lftechnology.sbwbtraining.model.Department[] findByCompanyId_PrevAndNext(
        long departmentId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbtraining.NoSuchDepartmentException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(departmentId, companyId,
            orderByComparator);
    }

    /**
    * Returns all the departments.
    *
    * @return the departments
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<com.lftechnology.sbwbtraining.model.Department> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the departments where groupId = &#63; and departmentName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_DN(long groupId,
        java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_DN(groupId, departmentName);
    }

    /**
    * Removes all the departments where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Removes all the departments where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Removes all the departments from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of departments where groupId = &#63; and departmentName = &#63;.
    *
    * @param groupId the group ID
    * @param departmentName the department name
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_DN(long groupId, java.lang.String departmentName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_DN(groupId, departmentName);
    }

    /**
    * Returns the number of departments where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of departments where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching departments
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Returns the number of departments.
    *
    * @return the number of departments
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static DepartmentPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (DepartmentPersistence) PortletBeanLocatorUtil.locate(com.lftechnology.sbwbtraining.service.ClpSerializer.getServletContextName(),
                    DepartmentPersistence.class.getName());

            ReferenceRegistry.registerReference(DepartmentUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(DepartmentPersistence persistence) {
    }
}
