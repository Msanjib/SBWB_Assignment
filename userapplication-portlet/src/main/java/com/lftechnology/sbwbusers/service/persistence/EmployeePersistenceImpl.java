package com.lftechnology.sbwbusers.service.persistence;

import com.lftechnology.sbwbusers.NoSuchEmployeeException;
import com.lftechnology.sbwbusers.model.Employee;
import com.lftechnology.sbwbusers.model.impl.EmployeeImpl;
import com.lftechnology.sbwbusers.model.impl.EmployeeModelImpl;
import com.lftechnology.sbwbusers.service.persistence.EmployeePersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
    implements EmployeePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_FN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_FN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_FN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
            EmployeeModelImpl.FIRSTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_FN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_FN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_LN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_LN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
            EmployeeModelImpl.LASTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_LN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_LN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_CN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_CN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
            EmployeeModelImpl.COMPANYNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_CN = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_CN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_GS = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_GS",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GS = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_GS",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            EmployeeModelImpl.GROUPID_COLUMN_BITMASK |
            EmployeeModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_GS = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_GS",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepId",
            new String[] { Long.class.getName() },
            EmployeeModelImpl.DEPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEPID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            EmployeeModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            EmployeeModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
    private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
    private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
    private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
    private static final String _FINDER_COLUMN_G_FN_GROUPID_2 = "employee.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_1 = "employee.firstName IS NULL";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_2 = "employee.firstName = ?";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_3 = "(employee.firstName IS NULL OR employee.firstName = ?)";
    private static final String _FINDER_COLUMN_G_LN_GROUPID_2 = "employee.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_1 = "employee.lastName IS NULL";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_2 = "employee.lastName = ?";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_3 = "(employee.lastName IS NULL OR employee.lastName = ?)";
    private static final String _FINDER_COLUMN_G_CN_GROUPID_2 = "employee.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_1 = "employee.companyName IS NULL";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_2 = "employee.companyName = ?";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_3 = "(employee.companyName IS NULL OR employee.companyName = ?)";
    private static final String _FINDER_COLUMN_G_GS_GROUPID_2 = "employee.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_GS_STATUS_2 = "employee.status = ?";
    private static final String _FINDER_COLUMN_DEPID_DEPID_2 = "employee.depId = ?";
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "employee.groupId = ?";
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "employee.companyId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
    private static Employee _nullEmployee = new EmployeeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employee> toCacheModel() {
                return _nullEmployeeCacheModel;
            }
        };

    private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
            public Employee toEntityModel() {
                return _nullEmployee;
            }
        };

    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the employee in the entity cache if it is enabled.
     *
     * @param employee the employee
     */
    public void cacheResult(Employee employee) {
        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        employee.resetOriginalValues();
    }

    /**
     * Caches the employees in the entity cache if it is enabled.
     *
     * @param employees the employees
     */
    public void cacheResult(List<Employee> employees) {
        for (Employee employee : employees) {
            if (EntityCacheUtil.getResult(
                        EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, employee.getPrimaryKey()) == null) {
                cacheResult(employee);
            } else {
                employee.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmployeeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employee employee) {
        EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Employee> employees) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employee employee : employees) {
            EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, employee.getPrimaryKey());
        }
    }

    /**
     * Creates a new employee with the primary key. Does not add the employee to the database.
     *
     * @param userId the primary key for the new employee
     * @return the new employee
     */
    public Employee create(long userId) {
        Employee employee = new EmployeeImpl();

        employee.setNew(true);
        employee.setPrimaryKey(userId);

        return employee;
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the employee
     * @return the employee that was removed
     * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee remove(long userId)
        throws NoSuchEmployeeException, SystemException {
        return remove(Long.valueOf(userId));
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee that was removed
     * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee remove(Serializable primaryKey)
        throws NoSuchEmployeeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employee employee = (Employee) session.get(EmployeeImpl.class,
                    primaryKey);

            if (employee == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employee);
        } catch (NoSuchEmployeeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employee removeImpl(Employee employee) throws SystemException {
        employee = toUnwrappedModel(employee);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, employee);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(employee);

        return employee;
    }

    @Override
    public Employee updateImpl(
        com.lftechnology.sbwbusers.model.Employee employee, boolean merge)
        throws SystemException {
        employee = toUnwrappedModel(employee);

        boolean isNew = employee.isNew();

        EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl) employee;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, employee, merge);

            employee.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalGroupId()),
                        
                        employeeModelImpl.getOriginalFirstName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_FN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN,
                    args);

                args = new Object[] {
                        Long.valueOf(employeeModelImpl.getGroupId()),
                        
                        employeeModelImpl.getFirstName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_FN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalGroupId()),
                        
                        employeeModelImpl.getOriginalLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);

                args = new Object[] {
                        Long.valueOf(employeeModelImpl.getGroupId()),
                        
                        employeeModelImpl.getLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalGroupId()),
                        
                        employeeModelImpl.getOriginalCompanyName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
                    args);

                args = new Object[] {
                        Long.valueOf(employeeModelImpl.getGroupId()),
                        
                        employeeModelImpl.getCompanyName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalGroupId()),
                        Boolean.valueOf(employeeModelImpl.getOriginalStatus())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_GS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GS,
                    args);

                args = new Object[] {
                        Long.valueOf(employeeModelImpl.getGroupId()),
                        Boolean.valueOf(employeeModelImpl.getStatus())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_GS, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GS,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalDepId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID,
                    args);

                args = new Object[] { Long.valueOf(employeeModelImpl.getDepId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalGroupId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { Long.valueOf(employeeModelImpl.getGroupId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(employeeModelImpl.getOriginalCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] {
                        Long.valueOf(employeeModelImpl.getCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        return employee;
    }

    protected Employee toUnwrappedModel(Employee employee) {
        if (employee instanceof EmployeeImpl) {
            return employee;
        }

        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setNew(employee.isNew());
        employeeImpl.setPrimaryKey(employee.getPrimaryKey());

        employeeImpl.setUserId(employee.getUserId());
        employeeImpl.setFirstName(employee.getFirstName());
        employeeImpl.setLastName(employee.getLastName());
        employeeImpl.setAddress(employee.getAddress());
        employeeImpl.setPhoneNumber(employee.getPhoneNumber());
        employeeImpl.setEmail(employee.getEmail());
        employeeImpl.setCompanyName(employee.getCompanyName());
        employeeImpl.setDepId(employee.getDepId());
        employeeImpl.setUserDesc(employee.getUserDesc());
        employeeImpl.setStatus(employee.getStatus());
        employeeImpl.setCompanyId(employee.getCompanyId());
        employeeImpl.setGroupId(employee.getGroupId());

        return employeeImpl;
    }

    /**
     * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee
     * @throws com.liferay.portal.NoSuchModelException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the employee with the primary key or throws a {@link com.lftechnology.sbwbusers.NoSuchEmployeeException} if it could not be found.
     *
     * @param userId the primary key of the employee
     * @return the employee
     * @throws com.lftechnology.sbwbusers.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee findByPrimaryKey(long userId)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByPrimaryKey(userId);

        if (employee == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + userId);
            }

            throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                userId);
        }

        return employee;
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByPrimaryKey(long userId) throws SystemException {
        Employee employee = (Employee) EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, userId);

        if (employee == _nullEmployee) {
            return null;
        }

        if (employee == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                employee = (Employee) session.get(EmployeeImpl.class,
                        Long.valueOf(userId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (employee != null) {
                    cacheResult(employee);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, userId, _nullEmployee);
                }

                closeSession(session);
            }
        }

        return employee;
    }

    /**
     * Returns all the employees where groupId = &#63; and firstName = &#63;.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByG_FN(long groupId, String firstName)
        throws SystemException {
        return findByG_FN(groupId, firstName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Employee> findByG_FN(long groupId, String firstName, int start,
        int end) throws SystemException {
        return findByG_FN(groupId, firstName, start, end, null);
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
    public List<Employee> findByG_FN(long groupId, String firstName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN;
            finderArgs = new Object[] { groupId, firstName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_FN;
            finderArgs = new Object[] {
                    groupId, firstName,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((groupId != employee.getGroupId()) ||
                        !Validator.equals(firstName, employee.getFirstName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_FN_GROUPID_2);

            if (firstName == null) {
                query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_1);
            } else {
                if (firstName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (firstName != null) {
                    qPos.add(firstName);
                }

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByG_FN_First(long groupId, String firstName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_FN_First(groupId, firstName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstName=");
        msg.append(firstName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_FN_First(long groupId, String firstName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByG_FN(groupId, firstName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByG_FN_Last(long groupId, String firstName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_FN_Last(groupId, firstName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstName=");
        msg.append(firstName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_FN_Last(long groupId, String firstName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_FN(groupId, firstName);

        List<Employee> list = findByG_FN(groupId, firstName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByG_FN_PrevAndNext(long userId, long groupId,
        String firstName, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByG_FN_PrevAndNext(session, employee, groupId,
                    firstName, orderByComparator, true);

            array[1] = employee;

            array[2] = getByG_FN_PrevAndNext(session, employee, groupId,
                    firstName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByG_FN_PrevAndNext(Session session,
        Employee employee, long groupId, String firstName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_G_FN_GROUPID_2);

        if (firstName == null) {
            query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_1);
        } else {
            if (firstName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_3);
            } else {
                query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_2);
            }
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (firstName != null) {
            qPos.add(firstName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where groupId = &#63; and lastName = &#63;.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByG_LN(long groupId, String lastName)
        throws SystemException {
        return findByG_LN(groupId, lastName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Employee> findByG_LN(long groupId, String lastName, int start,
        int end) throws SystemException {
        return findByG_LN(groupId, lastName, start, end, null);
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
    public List<Employee> findByG_LN(long groupId, String lastName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN;
            finderArgs = new Object[] { groupId, lastName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LN;
            finderArgs = new Object[] {
                    groupId, lastName,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((groupId != employee.getGroupId()) ||
                        !Validator.equals(lastName, employee.getLastName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

            if (lastName == null) {
                query.append(_FINDER_COLUMN_G_LN_LASTNAME_1);
            } else {
                if (lastName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_LN_LASTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_LN_LASTNAME_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (lastName != null) {
                    qPos.add(lastName);
                }

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByG_LN_First(long groupId, String lastName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_LN_First(groupId, lastName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_LN_First(long groupId, String lastName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByG_LN(groupId, lastName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByG_LN_Last(long groupId, String lastName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_LN_Last(groupId, lastName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_LN_Last(long groupId, String lastName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_LN(groupId, lastName);

        List<Employee> list = findByG_LN(groupId, lastName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByG_LN_PrevAndNext(long userId, long groupId,
        String lastName, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByG_LN_PrevAndNext(session, employee, groupId,
                    lastName, orderByComparator, true);

            array[1] = employee;

            array[2] = getByG_LN_PrevAndNext(session, employee, groupId,
                    lastName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByG_LN_PrevAndNext(Session session,
        Employee employee, long groupId, String lastName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

        if (lastName == null) {
            query.append(_FINDER_COLUMN_G_LN_LASTNAME_1);
        } else {
            if (lastName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_LN_LASTNAME_3);
            } else {
                query.append(_FINDER_COLUMN_G_LN_LASTNAME_2);
            }
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (lastName != null) {
            qPos.add(lastName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where groupId = &#63; and companyName = &#63;.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByG_CN(long groupId, String companyName)
        throws SystemException {
        return findByG_CN(groupId, companyName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Employee> findByG_CN(long groupId, String companyName,
        int start, int end) throws SystemException {
        return findByG_CN(groupId, companyName, start, end, null);
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
    public List<Employee> findByG_CN(long groupId, String companyName,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN;
            finderArgs = new Object[] { groupId, companyName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN;
            finderArgs = new Object[] {
                    groupId, companyName,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((groupId != employee.getGroupId()) ||
                        !Validator.equals(companyName, employee.getCompanyName())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

            if (companyName == null) {
                query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_1);
            } else {
                if (companyName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (companyName != null) {
                    qPos.add(companyName);
                }

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByG_CN_First(long groupId, String companyName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_CN_First(groupId, companyName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", companyName=");
        msg.append(companyName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_CN_First(long groupId, String companyName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByG_CN(groupId, companyName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByG_CN_Last(long groupId, String companyName,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_CN_Last(groupId, companyName,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", companyName=");
        msg.append(companyName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_CN_Last(long groupId, String companyName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_CN(groupId, companyName);

        List<Employee> list = findByG_CN(groupId, companyName, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByG_CN_PrevAndNext(long userId, long groupId,
        String companyName, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByG_CN_PrevAndNext(session, employee, groupId,
                    companyName, orderByComparator, true);

            array[1] = employee;

            array[2] = getByG_CN_PrevAndNext(session, employee, groupId,
                    companyName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByG_CN_PrevAndNext(Session session,
        Employee employee, long groupId, String companyName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

        if (companyName == null) {
            query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_1);
        } else {
            if (companyName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_3);
            } else {
                query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_2);
            }
        }

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (companyName != null) {
            qPos.add(companyName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByG_GS(long groupId, Boolean status)
        throws SystemException {
        return findByG_GS(groupId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Employee> findByG_GS(long groupId, Boolean status, int start,
        int end) throws SystemException {
        return findByG_GS(groupId, status, start, end, null);
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
    public List<Employee> findByG_GS(long groupId, Boolean status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_GS;
            finderArgs = new Object[] { groupId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_GS;
            finderArgs = new Object[] {
                    groupId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((groupId != employee.getGroupId()) ||
                        !Validator.equals(status, employee.getStatus())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_GS_GROUPID_2);

            query.append(_FINDER_COLUMN_G_GS_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status.booleanValue());

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByG_GS_First(long groupId, Boolean status,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_GS_First(groupId, status, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_GS_First(long groupId, Boolean status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByG_GS(groupId, status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByG_GS_Last(long groupId, Boolean status,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByG_GS_Last(groupId, status, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
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
    public Employee fetchByG_GS_Last(long groupId, Boolean status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_GS(groupId, status);

        List<Employee> list = findByG_GS(groupId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByG_GS_PrevAndNext(long userId, long groupId,
        Boolean status, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByG_GS_PrevAndNext(session, employee, groupId,
                    status, orderByComparator, true);

            array[1] = employee;

            array[2] = getByG_GS_PrevAndNext(session, employee, groupId,
                    status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByG_GS_PrevAndNext(Session session,
        Employee employee, long groupId, Boolean status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_G_GS_GROUPID_2);

        query.append(_FINDER_COLUMN_G_GS_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status.booleanValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where depId = &#63;.
     *
     * @param depId the dep ID
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByDepId(long depId) throws SystemException {
        return findByDepId(depId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Employee> findByDepId(long depId, int start, int end)
        throws SystemException {
        return findByDepId(depId, start, end, null);
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
    public List<Employee> findByDepId(long depId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID;
            finderArgs = new Object[] { depId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPID;
            finderArgs = new Object[] { depId, start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((depId != employee.getDepId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_DEPID_DEPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(depId);

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByDepId_First(long depId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByDepId_First(depId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("depId=");
        msg.append(depId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where depId = &#63;.
     *
     * @param depId the dep ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByDepId_First(long depId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByDepId(depId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByDepId_Last(long depId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByDepId_Last(depId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("depId=");
        msg.append(depId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where depId = &#63;.
     *
     * @param depId the dep ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByDepId_Last(long depId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByDepId(depId);

        List<Employee> list = findByDepId(depId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByDepId_PrevAndNext(long userId, long depId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByDepId_PrevAndNext(session, employee, depId,
                    orderByComparator, true);

            array[1] = employee;

            array[2] = getByDepId_PrevAndNext(session, employee, depId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByDepId_PrevAndNext(Session session,
        Employee employee, long depId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_DEPID_DEPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(depId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Employee> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
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
    public List<Employee> findByGroupId(long groupId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID;
            finderArgs = new Object[] { groupId, start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((groupId != employee.getGroupId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByGroupId_First(groupId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByGroupId_Last(groupId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        List<Employee> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByGroupId_PrevAndNext(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, employee, groupId,
                    orderByComparator, true);

            array[1] = employee;

            array[2] = getByGroupId_PrevAndNext(session, employee, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByGroupId_PrevAndNext(Session session,
        Employee employee, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    public List<Employee> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
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
    public List<Employee> findByCompanyId(long companyId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID;
            finderArgs = new Object[] { companyId, start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((companyId != employee.getCompanyId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<Employee>) QueryUtil.list(q, getDialect(), start,
                        end);
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
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
    public Employee findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByCompanyId_First(companyId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByCompanyId(companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByCompanyId_Last(companyId, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    public Employee fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        List<Employee> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Employee[] findByCompanyId_PrevAndNext(long userId, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, employee, companyId,
                    orderByComparator, true);

            array[1] = employee;

            array[2] = getByCompanyId_PrevAndNext(session, employee, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByCompanyId_PrevAndNext(Session session,
        Employee employee, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the employees.
     *
     * @return the employees
     * @throws SystemException if a system exception occurred
     */
    public List<Employee> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Employee> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    public List<Employee> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEE.concat(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employees where groupId = &#63; and firstName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_FN(long groupId, String firstName)
        throws SystemException {
        for (Employee employee : findByG_FN(groupId, firstName)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where groupId = &#63; and lastName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_LN(long groupId, String lastName)
        throws SystemException {
        for (Employee employee : findByG_LN(groupId, lastName)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where groupId = &#63; and companyName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_CN(long groupId, String companyName)
        throws SystemException {
        for (Employee employee : findByG_CN(groupId, companyName)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_GS(long groupId, Boolean status)
        throws SystemException {
        for (Employee employee : findByG_GS(groupId, status)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where depId = &#63; from the database.
     *
     * @param depId the dep ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByDepId(long depId) throws SystemException {
        for (Employee employee : findByDepId(depId)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByGroupId(long groupId) throws SystemException {
        for (Employee employee : findByGroupId(groupId)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyId(long companyId) throws SystemException {
        for (Employee employee : findByCompanyId(companyId)) {
            remove(employee);
        }
    }

    /**
     * Removes all the employees from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (Employee employee : findAll()) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees where groupId = &#63; and firstName = &#63;.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByG_FN(long groupId, String firstName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, firstName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_FN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_FN_GROUPID_2);

            if (firstName == null) {
                query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_1);
            } else {
                if (firstName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_FN_FIRSTNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (firstName != null) {
                    qPos.add(firstName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_FN,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where groupId = &#63; and lastName = &#63;.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByG_LN(long groupId, String lastName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, lastName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_LN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_LN_GROUPID_2);

            if (lastName == null) {
                query.append(_FINDER_COLUMN_G_LN_LASTNAME_1);
            } else {
                if (lastName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_LN_LASTNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_LN_LASTNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (lastName != null) {
                    qPos.add(lastName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_LN,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where groupId = &#63; and companyName = &#63;.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByG_CN(long groupId, String companyName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, companyName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_CN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_CN_GROUPID_2);

            if (companyName == null) {
                query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_1);
            } else {
                if (companyName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_CN_COMPANYNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (companyName != null) {
                    qPos.add(companyName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_CN,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByG_GS(long groupId, Boolean status)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, status };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_GS,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_G_GS_GROUPID_2);

            query.append(_FINDER_COLUMN_G_GS_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status.booleanValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_GS,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where depId = &#63;.
     *
     * @param depId the dep ID
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByDepId(long depId) throws SystemException {
        Object[] finderArgs = new Object[] { depId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_DEPID_DEPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(depId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_DEPID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByGroupId(long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_GROUPID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyId(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of employees.
     *
     * @return the number of employees
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employee persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lftechnology.sbwbusers.model.Employee")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<Employee>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
