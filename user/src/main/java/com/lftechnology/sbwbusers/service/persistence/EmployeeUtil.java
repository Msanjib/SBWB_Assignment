package com.lftechnology.sbwbusers.service.persistence;

import com.lftechnology.sbwbusers.model.Employee;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
    private static EmployeePersistence _persistence;

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
    public static void clearCache(Employee employee) {
        getPersistence().clearCache(employee);
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
    public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Employee update(Employee employee, boolean merge)
        throws SystemException {
        return getPersistence().update(employee, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Employee update(Employee employee, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee, merge, serviceContext);
    }

    /**
    * Caches the employee in the entity cache if it is enabled.
    *
    * @param employee the employee
    */
    public static void cacheResult(
        com.lftechnology.sbwbusers.model.Employee employee) {
        getPersistence().cacheResult(employee);
    }

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public static void cacheResult(
        java.util.List<com.lftechnology.sbwbusers.model.Employee> employees) {
        getPersistence().cacheResult(employees);
    }

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param userId the primary key for the new employee
    * @return the new employee
    */
    public static com.lftechnology.sbwbusers.model.Employee create(long userId) {
        return getPersistence().create(userId);
    }

    /**
    * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the employee
    * @return the employee that was removed
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee remove(long userId)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(userId);
    }

    public static com.lftechnology.sbwbusers.model.Employee updateImpl(
        com.lftechnology.sbwbusers.model.Employee employee, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee, merge);
    }

    /**
    * Returns the employee with the primary key or throws a {@link com.lftechnology.sbwbusers.NoSuchEmployeeException} if it could not be found.
    *
    * @param userId the primary key of the employee
    * @return the employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByPrimaryKey(
        long userId)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(userId);
    }

    /**
    * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the employee
    * @return the employee, or <code>null</code> if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(userId);
    }

    /**
    * Returns all the employees where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_FN(groupId, firstName);
    }

    /**
    * Returns a range of all the employees where groupId = &#63; and firstName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_FN(groupId, firstName, start, end);
    }

    /**
    * Returns an ordered range of all the employees where groupId = &#63; and firstName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN(groupId, firstName, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_First(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_FN_First(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_Last(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_FN_Last(groupId, firstName, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByG_FN_PrevAndNext(
        long userId, long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_FN_PrevAndNext(userId, groupId, firstName,
            orderByComparator);
    }

    /**
    * Returns all the employees where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_LN(groupId, lastName);
    }

    /**
    * Returns a range of all the employees where groupId = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_LN(groupId, lastName, start, end);
    }

    /**
    * Returns an ordered range of all the employees where groupId = &#63; and lastName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN(groupId, lastName, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_First(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_LN_First(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_Last(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_LN_Last(groupId, lastName, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByG_LN_PrevAndNext(
        long userId, long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_LN_PrevAndNext(userId, groupId, lastName,
            orderByComparator);
    }

    /**
    * Returns all the employees where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_CN(groupId, companyName);
    }

    /**
    * Returns a range of all the employees where groupId = &#63; and companyName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_CN(groupId, companyName, start, end);
    }

    /**
    * Returns an ordered range of all the employees where groupId = &#63; and companyName = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN(groupId, companyName, start, end,
            orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_First(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_CN_First(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_Last(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_CN_Last(groupId, companyName, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByG_CN_PrevAndNext(
        long userId, long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_CN_PrevAndNext(userId, groupId, companyName,
            orderByComparator);
    }

    /**
    * Returns all the employees where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_GS(groupId, status);
    }

    /**
    * Returns a range of all the employees where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByG_GS(groupId, status, start, end);
    }

    /**
    * Returns an ordered range of all the employees where groupId = &#63; and status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param status the status
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_GS(groupId, status, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_GS_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_GS_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_GS_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_GS_First(groupId, status, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByG_GS_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_GS_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByG_GS_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByG_GS_Last(groupId, status, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByG_GS_PrevAndNext(
        long userId, long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByG_GS_PrevAndNext(userId, groupId, status,
            orderByComparator);
    }

    /**
    * Returns all the employees where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId);
    }

    /**
    * Returns a range of all the employees where depId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param depId the dep ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId, start, end);
    }

    /**
    * Returns an ordered range of all the employees where depId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param depId the dep ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId(depId, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId_First(depId, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDepId_First(depId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByDepId_Last(depId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByDepId_Last(depId, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where depId = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByDepId_PrevAndNext(
        long userId, long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByDepId_PrevAndNext(userId, depId, orderByComparator);
    }

    /**
    * Returns all the employees where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId);
    }

    /**
    * Returns a range of all the employees where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the employees where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where groupId = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByGroupId_PrevAndNext(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByGroupId_PrevAndNext(userId, groupId, orderByComparator);
    }

    /**
    * Returns all the employees where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId);
    }

    /**
    * Returns a range of all the employees where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByCompanyId(companyId, start, end);
    }

    /**
    * Returns an ordered range of all the employees where companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param companyId the company ID
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId(companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_First(companyId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByCompanyId_Last(companyId, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where companyId = &#63;.
    *
    * @param userId the primary key of the current employee
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.lftechnology.sbwbusers.model.Employee[] findByCompanyId_PrevAndNext(
        long userId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByCompanyId_PrevAndNext(userId, companyId,
            orderByComparator);
    }

    /**
    * Returns all the employees.
    *
    * @return the employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employees where groupId = &#63; and firstName = &#63; from the database.
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
    * Removes all the employees where groupId = &#63; and lastName = &#63; from the database.
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
    * Removes all the employees where groupId = &#63; and companyName = &#63; from the database.
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
    * Removes all the employees where groupId = &#63; and status = &#63; from the database.
    *
    * @param groupId the group ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByG_GS(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByG_GS(groupId, status);
    }

    /**
    * Removes all the employees where depId = &#63; from the database.
    *
    * @param depId the dep ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByDepId(depId);
    }

    /**
    * Removes all the employees where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByGroupId(groupId);
    }

    /**
    * Removes all the employees where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByCompanyId(companyId);
    }

    /**
    * Removes all the employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employees where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_FN(long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_FN(groupId, firstName);
    }

    /**
    * Returns the number of employees where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_LN(long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_LN(groupId, lastName);
    }

    /**
    * Returns the number of employees where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_CN(long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_CN(groupId, companyName);
    }

    /**
    * Returns the number of employees where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByG_GS(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByG_GS(groupId, status);
    }

    /**
    * Returns the number of employees where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByDepId(depId);
    }

    /**
    * Returns the number of employees where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByGroupId(groupId);
    }

    /**
    * Returns the number of employees where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByCompanyId(companyId);
    }

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeePersistence) PortletBeanLocatorUtil.locate(com.lftechnology.sbwbusers.service.ClpSerializer.getServletContextName(),
                    EmployeePersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(EmployeePersistence persistence) {
    }
}
