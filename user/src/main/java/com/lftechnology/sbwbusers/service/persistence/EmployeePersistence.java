package com.lftechnology.sbwbusers.service.persistence;

import com.lftechnology.sbwbusers.model.Employee;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmployeePersistenceImpl
 * @see EmployeeUtil
 * @generated
 */
public interface EmployeePersistence extends BasePersistence<Employee> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the employee in the entity cache if it is enabled.
    *
    * @param employee the employee
    */
    public void cacheResult(com.lftechnology.sbwbusers.model.Employee employee);

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public void cacheResult(
        java.util.List<com.lftechnology.sbwbusers.model.Employee> employees);

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param userId the primary key for the new employee
    * @return the new employee
    */
    public com.lftechnology.sbwbusers.model.Employee create(long userId);

    /**
    * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param userId the primary key of the employee
    * @return the employee that was removed
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee remove(long userId)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.lftechnology.sbwbusers.model.Employee updateImpl(
        com.lftechnology.sbwbusers.model.Employee employee, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee with the primary key or throws a {@link com.lftechnology.sbwbusers.NoSuchEmployeeException} if it could not be found.
    *
    * @param userId the primary key of the employee
    * @return the employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByPrimaryKey(
        long userId)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param userId the primary key of the employee
    * @return the employee, or <code>null</code> if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByPrimaryKey(
        long userId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_FN(
        long groupId, java.lang.String firstName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_FN_First(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_FN_Last(
        long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByG_FN_PrevAndNext(
        long userId, long groupId, java.lang.String firstName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_LN(
        long groupId, java.lang.String lastName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_LN_First(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_LN_Last(
        long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByG_LN_PrevAndNext(
        long userId, long groupId, java.lang.String lastName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_CN(
        long groupId, java.lang.String companyName, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_CN_First(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_CN_Last(
        long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByG_CN_PrevAndNext(
        long userId, long groupId, java.lang.String companyName,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByG_GS(
        long groupId, java.lang.Boolean status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_GS_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_GS_First(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee findByG_GS_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByG_GS_Last(
        long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByG_GS_PrevAndNext(
        long userId, long groupId, java.lang.Boolean status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByDepId(
        long depId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByDepId_First(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where depId = &#63;.
    *
    * @param depId the dep ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByDepId_Last(
        long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByDepId_PrevAndNext(
        long userId, long depId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByGroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByGroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByGroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByGroupId_PrevAndNext(
        long userId, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findByCompanyId(
        long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByCompanyId_First(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee findByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last employee in the ordered set where companyId = &#63;.
    *
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.lftechnology.sbwbusers.model.Employee fetchByCompanyId_Last(
        long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.lftechnology.sbwbusers.model.Employee[] findByCompanyId_PrevAndNext(
        long userId, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.lftechnology.sbwbusers.NoSuchEmployeeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the employees.
    *
    * @return the employees
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.lftechnology.sbwbusers.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where groupId = &#63; and firstName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_FN(long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where groupId = &#63; and lastName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_LN(long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where groupId = &#63; and companyName = &#63; from the database.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_CN(long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where groupId = &#63; and status = &#63; from the database.
    *
    * @param groupId the group ID
    * @param status the status
    * @throws SystemException if a system exception occurred
    */
    public void removeByG_GS(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where depId = &#63; from the database.
    *
    * @param depId the dep ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees where companyId = &#63; from the database.
    *
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where groupId = &#63; and firstName = &#63;.
    *
    * @param groupId the group ID
    * @param firstName the first name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByG_FN(long groupId, java.lang.String firstName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where groupId = &#63; and lastName = &#63;.
    *
    * @param groupId the group ID
    * @param lastName the last name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByG_LN(long groupId, java.lang.String lastName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where groupId = &#63; and companyName = &#63;.
    *
    * @param groupId the group ID
    * @param companyName the company name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByG_CN(long groupId, java.lang.String companyName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where groupId = &#63; and status = &#63;.
    *
    * @param groupId the group ID
    * @param status the status
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByG_GS(long groupId, java.lang.Boolean status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where depId = &#63;.
    *
    * @param depId the dep ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByDepId(long depId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByGroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees where companyId = &#63;.
    *
    * @param companyId the company ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public int countByCompanyId(long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
