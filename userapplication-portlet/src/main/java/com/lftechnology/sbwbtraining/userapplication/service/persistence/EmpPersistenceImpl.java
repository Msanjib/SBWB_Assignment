package com.lftechnology.sbwbtraining.userapplication.service.persistence;

import com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException;
import com.lftechnology.sbwbtraining.userapplication.model.Emp;
import com.lftechnology.sbwbtraining.userapplication.model.impl.EmpImpl;
import com.lftechnology.sbwbtraining.userapplication.model.impl.EmpModelImpl;
import com.lftechnology.sbwbtraining.userapplication.service.persistence.EmpPersistence;

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
 * The persistence implementation for the emp service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Bibhushan Joshi
 * @see EmpPersistence
 * @see EmpUtil
 * @generated
 */
public class EmpPersistenceImpl extends BasePersistenceImpl<Emp>
    implements EmpPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmpUtil} to access the emp persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmpImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_FN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_FN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_FN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmpModelImpl.GROUPID_COLUMN_BITMASK |
            EmpModelImpl.FIRSTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_FN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_FN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_LN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_LN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_LN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmpModelImpl.GROUPID_COLUMN_BITMASK |
            EmpModelImpl.LASTNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_LN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_LN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_CN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_CN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_CN",
            new String[] { Long.class.getName(), String.class.getName() },
            EmpModelImpl.GROUPID_COLUMN_BITMASK |
            EmpModelImpl.COMPANYNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_CN = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_CN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_PP = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_PP",
            new String[] {
                Long.class.getName(), Boolean.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PP = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_PP",
            new String[] { Long.class.getName(), Boolean.class.getName() },
            EmpModelImpl.GROUPID_COLUMN_BITMASK |
            EmpModelImpl.STATUS_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_PP = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_PP",
            new String[] { Long.class.getName(), Boolean.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DEPID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDepId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDepId",
            new String[] { Long.class.getName() },
            EmpModelImpl.DEPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_DEPID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDepId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            EmpModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            EmpModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, EmpImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EMP = "SELECT emp FROM Emp emp";
    private static final String _SQL_SELECT_EMP_WHERE = "SELECT emp FROM Emp emp WHERE ";
    private static final String _SQL_COUNT_EMP = "SELECT COUNT(emp) FROM Emp emp";
    private static final String _SQL_COUNT_EMP_WHERE = "SELECT COUNT(emp) FROM Emp emp WHERE ";
    private static final String _FINDER_COLUMN_G_FN_GROUPID_2 = "emp.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_1 = "emp.firstName IS NULL";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_2 = "emp.firstName = ?";
    private static final String _FINDER_COLUMN_G_FN_FIRSTNAME_3 = "(emp.firstName IS NULL OR emp.firstName = ?)";
    private static final String _FINDER_COLUMN_G_LN_GROUPID_2 = "emp.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_1 = "emp.lastName IS NULL";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_2 = "emp.lastName = ?";
    private static final String _FINDER_COLUMN_G_LN_LASTNAME_3 = "(emp.lastName IS NULL OR emp.lastName = ?)";
    private static final String _FINDER_COLUMN_G_CN_GROUPID_2 = "emp.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_1 = "emp.companyName IS NULL";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_2 = "emp.companyName = ?";
    private static final String _FINDER_COLUMN_G_CN_COMPANYNAME_3 = "(emp.companyName IS NULL OR emp.companyName = ?)";
    private static final String _FINDER_COLUMN_G_PP_GROUPID_2 = "emp.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_PP_STATUS_2 = "emp.status = ?";
    private static final String _FINDER_COLUMN_DEPID_DEPID_2 = "emp.depId = ?";
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "emp.groupId = ?";
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "emp.companyId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "emp.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Emp exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Emp exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmpPersistenceImpl.class);
    private static Emp _nullEmp = new EmpImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Emp> toCacheModel() {
                return _nullEmpCacheModel;
            }
        };

    private static CacheModel<Emp> _nullEmpCacheModel = new CacheModel<Emp>() {
            public Emp toEntityModel() {
                return _nullEmp;
            }
        };

    @BeanReference(type = EmpPersistence.class)
    protected EmpPersistence empPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the emp in the entity cache if it is enabled.
     *
     * @param emp the emp
     */
    public void cacheResult(Emp emp) {
        EntityCacheUtil.putResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpImpl.class, emp.getPrimaryKey(), emp);

        emp.resetOriginalValues();
    }

    /**
     * Caches the emps in the entity cache if it is enabled.
     *
     * @param emps the emps
     */
    public void cacheResult(List<Emp> emps) {
        for (Emp emp : emps) {
            if (EntityCacheUtil.getResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
                        EmpImpl.class, emp.getPrimaryKey()) == null) {
                cacheResult(emp);
            } else {
                emp.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all emps.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmpImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmpImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the emp.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Emp emp) {
        EntityCacheUtil.removeResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpImpl.class, emp.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Emp> emps) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Emp emp : emps) {
            EntityCacheUtil.removeResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
                EmpImpl.class, emp.getPrimaryKey());
        }
    }

    /**
     * Creates a new emp with the primary key. Does not add the emp to the database.
     *
     * @param userId the primary key for the new emp
     * @return the new emp
     */
    public Emp create(long userId) {
        Emp emp = new EmpImpl();

        emp.setNew(true);
        emp.setPrimaryKey(userId);

        return emp;
    }

    /**
     * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param userId the primary key of the emp
     * @return the emp that was removed
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp remove(long userId) throws NoSuchEmpException, SystemException {
        return remove(Long.valueOf(userId));
    }

    /**
     * Removes the emp with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the emp
     * @return the emp that was removed
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Emp remove(Serializable primaryKey)
        throws NoSuchEmpException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Emp emp = (Emp) session.get(EmpImpl.class, primaryKey);

            if (emp == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(emp);
        } catch (NoSuchEmpException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Emp removeImpl(Emp emp) throws SystemException {
        emp = toUnwrappedModel(emp);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, emp);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(emp);

        return emp;
    }

    @Override
    public Emp updateImpl(
        com.lftechnology.sbwbtraining.userapplication.model.Emp emp,
        boolean merge) throws SystemException {
        emp = toUnwrappedModel(emp);

        boolean isNew = emp.isNew();

        EmpModelImpl empModelImpl = (EmpModelImpl) emp;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, emp, merge);

            emp.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmpModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalGroupId()),
                        
                        empModelImpl.getOriginalFirstName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_FN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN,
                    args);

                args = new Object[] {
                        Long.valueOf(empModelImpl.getGroupId()),
                        
                        empModelImpl.getFirstName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_FN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_FN,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalGroupId()),
                        
                        empModelImpl.getOriginalLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);

                args = new Object[] {
                        Long.valueOf(empModelImpl.getGroupId()),
                        
                        empModelImpl.getLastName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_LN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_LN,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalGroupId()),
                        
                        empModelImpl.getOriginalCompanyName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
                    args);

                args = new Object[] {
                        Long.valueOf(empModelImpl.getGroupId()),
                        
                        empModelImpl.getCompanyName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_CN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_CN,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PP.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalGroupId()),
                        Boolean.valueOf(empModelImpl.getOriginalStatus())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_PP, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PP,
                    args);

                args = new Object[] {
                        Long.valueOf(empModelImpl.getGroupId()),
                        Boolean.valueOf(empModelImpl.getStatus())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_PP, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PP,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalDepId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID,
                    args);

                args = new Object[] { Long.valueOf(empModelImpl.getDepId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_DEPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DEPID,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalGroupId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { Long.valueOf(empModelImpl.getGroupId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((empModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(empModelImpl.getOriginalCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] { Long.valueOf(empModelImpl.getCompanyId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
            EmpImpl.class, emp.getPrimaryKey(), emp);

        return emp;
    }

    protected Emp toUnwrappedModel(Emp emp) {
        if (emp instanceof EmpImpl) {
            return emp;
        }

        EmpImpl empImpl = new EmpImpl();

        empImpl.setNew(emp.isNew());
        empImpl.setPrimaryKey(emp.getPrimaryKey());

        empImpl.setUserId(emp.getUserId());
        empImpl.setFirstName(emp.getFirstName());
        empImpl.setLastName(emp.getLastName());
        empImpl.setAddress(emp.getAddress());
        empImpl.setPhoneNumber(emp.getPhoneNumber());
        empImpl.setEmail(emp.getEmail());
        empImpl.setCompanyName(emp.getCompanyName());
        empImpl.setDepId(emp.getDepId());
        empImpl.setUserDesc(emp.getUserDesc());
        empImpl.setStatus(emp.getStatus());
        empImpl.setCompanyId(emp.getCompanyId());
        empImpl.setGroupId(emp.getGroupId());

        return empImpl;
    }

    /**
     * Returns the emp with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the emp
     * @return the emp
     * @throws com.liferay.portal.NoSuchModelException if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Emp findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the emp with the primary key or throws a {@link com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException} if it could not be found.
     *
     * @param userId the primary key of the emp
     * @return the emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByPrimaryKey(long userId)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByPrimaryKey(userId);

        if (emp == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + userId);
            }

            throw new NoSuchEmpException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                userId);
        }

        return emp;
    }

    /**
     * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the emp
     * @return the emp, or <code>null</code> if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Emp fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the emp with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param userId the primary key of the emp
     * @return the emp, or <code>null</code> if a emp with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByPrimaryKey(long userId) throws SystemException {
        Emp emp = (Emp) EntityCacheUtil.getResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
                EmpImpl.class, userId);

        if (emp == _nullEmp) {
            return null;
        }

        if (emp == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                emp = (Emp) session.get(EmpImpl.class, Long.valueOf(userId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (emp != null) {
                    cacheResult(emp);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(EmpModelImpl.ENTITY_CACHE_ENABLED,
                        EmpImpl.class, userId, _nullEmp);
                }

                closeSession(session);
            }
        }

        return emp;
    }

    /**
     * Returns all the emps where groupId = &#63; and firstName = &#63;.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByG_FN(long groupId, String firstName)
        throws SystemException {
        return findByG_FN(groupId, firstName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Emp> findByG_FN(long groupId, String firstName, int start,
        int end) throws SystemException {
        return findByG_FN(groupId, firstName, start, end, null);
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
    public List<Emp> findByG_FN(long groupId, String firstName, int start,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((groupId != emp.getGroupId()) ||
                        !Validator.equals(firstName, emp.getFirstName())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

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
                query.append(EmpModelImpl.ORDER_BY_JPQL);
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

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where groupId = &#63; and firstName = &#63;.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByG_FN_First(long groupId, String firstName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_FN_First(groupId, firstName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstName=");
        msg.append(firstName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_FN_First(long groupId, String firstName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByG_FN(groupId, firstName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByG_FN_Last(long groupId, String firstName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_FN_Last(groupId, firstName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", firstName=");
        msg.append(firstName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_FN_Last(long groupId, String firstName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_FN(groupId, firstName);

        List<Emp> list = findByG_FN(groupId, firstName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByG_FN_PrevAndNext(long userId, long groupId,
        String firstName, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByG_FN_PrevAndNext(session, emp, groupId, firstName,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByG_FN_PrevAndNext(session, emp, groupId, firstName,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByG_FN_PrevAndNext(Session session, Emp emp, long groupId,
        String firstName, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where groupId = &#63; and lastName = &#63;.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByG_LN(long groupId, String lastName)
        throws SystemException {
        return findByG_LN(groupId, lastName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Emp> findByG_LN(long groupId, String lastName, int start,
        int end) throws SystemException {
        return findByG_LN(groupId, lastName, start, end, null);
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
    public List<Emp> findByG_LN(long groupId, String lastName, int start,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((groupId != emp.getGroupId()) ||
                        !Validator.equals(lastName, emp.getLastName())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

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
                query.append(EmpModelImpl.ORDER_BY_JPQL);
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

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where groupId = &#63; and lastName = &#63;.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByG_LN_First(long groupId, String lastName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_LN_First(groupId, lastName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_LN_First(long groupId, String lastName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByG_LN(groupId, lastName, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByG_LN_Last(long groupId, String lastName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_LN_Last(groupId, lastName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", lastName=");
        msg.append(lastName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_LN_Last(long groupId, String lastName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_LN(groupId, lastName);

        List<Emp> list = findByG_LN(groupId, lastName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByG_LN_PrevAndNext(long userId, long groupId,
        String lastName, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByG_LN_PrevAndNext(session, emp, groupId, lastName,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByG_LN_PrevAndNext(session, emp, groupId, lastName,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByG_LN_PrevAndNext(Session session, Emp emp, long groupId,
        String lastName, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where groupId = &#63; and companyName = &#63;.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByG_CN(long groupId, String companyName)
        throws SystemException {
        return findByG_CN(groupId, companyName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Emp> findByG_CN(long groupId, String companyName, int start,
        int end) throws SystemException {
        return findByG_CN(groupId, companyName, start, end, null);
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
    public List<Emp> findByG_CN(long groupId, String companyName, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((groupId != emp.getGroupId()) ||
                        !Validator.equals(companyName, emp.getCompanyName())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

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
                query.append(EmpModelImpl.ORDER_BY_JPQL);
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

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where groupId = &#63; and companyName = &#63;.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByG_CN_First(long groupId, String companyName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_CN_First(groupId, companyName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", companyName=");
        msg.append(companyName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_CN_First(long groupId, String companyName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByG_CN(groupId, companyName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByG_CN_Last(long groupId, String companyName,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_CN_Last(groupId, companyName, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", companyName=");
        msg.append(companyName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_CN_Last(long groupId, String companyName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_CN(groupId, companyName);

        List<Emp> list = findByG_CN(groupId, companyName, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByG_CN_PrevAndNext(long userId, long groupId,
        String companyName, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByG_CN_PrevAndNext(session, emp, groupId,
                    companyName, orderByComparator, true);

            array[1] = emp;

            array[2] = getByG_CN_PrevAndNext(session, emp, groupId,
                    companyName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByG_CN_PrevAndNext(Session session, Emp emp, long groupId,
        String companyName, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
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
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByG_PP(long groupId, Boolean status)
        throws SystemException {
        return findByG_PP(groupId, status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Emp> findByG_PP(long groupId, Boolean status, int start, int end)
        throws SystemException {
        return findByG_PP(groupId, status, start, end, null);
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
    public List<Emp> findByG_PP(long groupId, Boolean status, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_PP;
            finderArgs = new Object[] { groupId, status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_PP;
            finderArgs = new Object[] {
                    groupId, status,
                    
                    start, end, orderByComparator
                };
        }

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((groupId != emp.getGroupId()) ||
                        !Validator.equals(status, emp.getStatus())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

            query.append(_FINDER_COLUMN_G_PP_GROUPID_2);

            query.append(_FINDER_COLUMN_G_PP_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmpModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                qPos.add(status.booleanValue());

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByG_PP_First(long groupId, Boolean status,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_PP_First(groupId, status, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_PP_First(long groupId, Boolean status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByG_PP(groupId, status, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByG_PP_Last(long groupId, Boolean status,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByG_PP_Last(groupId, status, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", status=");
        msg.append(status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
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
    public Emp fetchByG_PP_Last(long groupId, Boolean status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_PP(groupId, status);

        List<Emp> list = findByG_PP(groupId, status, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByG_PP_PrevAndNext(long userId, long groupId,
        Boolean status, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByG_PP_PrevAndNext(session, emp, groupId, status,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByG_PP_PrevAndNext(session, emp, groupId, status,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByG_PP_PrevAndNext(Session session, Emp emp, long groupId,
        Boolean status, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

        query.append(_FINDER_COLUMN_G_PP_GROUPID_2);

        query.append(_FINDER_COLUMN_G_PP_STATUS_2);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        qPos.add(status.booleanValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where depId = &#63;.
     *
     * @param depId the dep ID
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByDepId(long depId) throws SystemException {
        return findByDepId(depId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Emp> findByDepId(long depId, int start, int end)
        throws SystemException {
        return findByDepId(depId, start, end, null);
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
    public List<Emp> findByDepId(long depId, int start, int end,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((depId != emp.getDepId())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

            query.append(_FINDER_COLUMN_DEPID_DEPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmpModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(depId);

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where depId = &#63;.
     *
     * @param depId the dep ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByDepId_First(long depId, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByDepId_First(depId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("depId=");
        msg.append(depId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the first emp in the ordered set where depId = &#63;.
     *
     * @param depId the dep ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByDepId_First(long depId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByDepId(depId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByDepId_Last(long depId, OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByDepId_Last(depId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("depId=");
        msg.append(depId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the last emp in the ordered set where depId = &#63;.
     *
     * @param depId the dep ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByDepId_Last(long depId, OrderByComparator orderByComparator)
        throws SystemException {
        int count = countByDepId(depId);

        List<Emp> list = findByDepId(depId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByDepId_PrevAndNext(long userId, long depId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByDepId_PrevAndNext(session, emp, depId,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByDepId_PrevAndNext(session, emp, depId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByDepId_PrevAndNext(Session session, Emp emp, long depId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(depId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Emp> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
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
    public List<Emp> findByGroupId(long groupId, int start, int end,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((groupId != emp.getGroupId())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmpModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByGroupId_First(groupId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the first emp in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByGroupId_Last(groupId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the last emp in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        List<Emp> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByGroupId_PrevAndNext(long userId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, emp, groupId,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByGroupId_PrevAndNext(session, emp, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByGroupId_PrevAndNext(Session session, Emp emp,
        long groupId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findByCompanyId(long companyId) throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    public List<Emp> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
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
    public List<Emp> findByCompanyId(long companyId, int start, int end,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Emp emp : list) {
                if ((companyId != emp.getCompanyId())) {
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

            query.append(_SQL_SELECT_EMP_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(EmpModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<Emp>) QueryUtil.list(q, getDialect(), start, end);
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
     * Returns the first emp in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp
     * @throws com.lftechnology.sbwbtraining.userapplication.NoSuchEmpException if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByCompanyId_First(companyId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the first emp in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Emp> list = findByCompanyId(companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = fetchByCompanyId_Last(companyId, orderByComparator);

        if (emp != null) {
            return emp;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmpException(msg.toString());
    }

    /**
     * Returns the last emp in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching emp, or <code>null</code> if a matching emp could not be found
     * @throws SystemException if a system exception occurred
     */
    public Emp fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        List<Emp> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Emp[] findByCompanyId_PrevAndNext(long userId, long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchEmpException, SystemException {
        Emp emp = findByPrimaryKey(userId);

        Session session = null;

        try {
            session = openSession();

            Emp[] array = new EmpImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, emp, companyId,
                    orderByComparator, true);

            array[1] = emp;

            array[2] = getByCompanyId_PrevAndNext(session, emp, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Emp getByCompanyId_PrevAndNext(Session session, Emp emp,
        long companyId, OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMP_WHERE);

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
            query.append(EmpModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(emp);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Emp> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the emps.
     *
     * @return the emps
     * @throws SystemException if a system exception occurred
     */
    public List<Emp> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Emp> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    public List<Emp> findAll(int start, int end,
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

        List<Emp> list = (List<Emp>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMP);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMP.concat(EmpModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<Emp>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);
                } else {
                    list = (List<Emp>) QueryUtil.list(q, getDialect(), start,
                            end);
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
     * Removes all the emps where groupId = &#63; and firstName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_FN(long groupId, String firstName)
        throws SystemException {
        for (Emp emp : findByG_FN(groupId, firstName)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where groupId = &#63; and lastName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_LN(long groupId, String lastName)
        throws SystemException {
        for (Emp emp : findByG_LN(groupId, lastName)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where groupId = &#63; and companyName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_CN(long groupId, String companyName)
        throws SystemException {
        for (Emp emp : findByG_CN(groupId, companyName)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where groupId = &#63; and status = &#63; from the database.
     *
     * @param groupId the group ID
     * @param status the status
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_PP(long groupId, Boolean status)
        throws SystemException {
        for (Emp emp : findByG_PP(groupId, status)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where depId = &#63; from the database.
     *
     * @param depId the dep ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByDepId(long depId) throws SystemException {
        for (Emp emp : findByDepId(depId)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByGroupId(long groupId) throws SystemException {
        for (Emp emp : findByGroupId(groupId)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyId(long companyId) throws SystemException {
        for (Emp emp : findByCompanyId(companyId)) {
            remove(emp);
        }
    }

    /**
     * Removes all the emps from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (Emp emp : findAll()) {
            remove(emp);
        }
    }

    /**
     * Returns the number of emps where groupId = &#63; and firstName = &#63;.
     *
     * @param groupId the group ID
     * @param firstName the first name
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByG_FN(long groupId, String firstName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, firstName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_FN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps where groupId = &#63; and lastName = &#63;.
     *
     * @param groupId the group ID
     * @param lastName the last name
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByG_LN(long groupId, String lastName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, lastName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_LN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps where groupId = &#63; and companyName = &#63;.
     *
     * @param groupId the group ID
     * @param companyName the company name
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByG_CN(long groupId, String companyName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, companyName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_CN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps where groupId = &#63; and status = &#63;.
     *
     * @param groupId the group ID
     * @param status the status
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByG_PP(long groupId, Boolean status)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, status };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_PP,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_EMP_WHERE);

            query.append(_FINDER_COLUMN_G_PP_GROUPID_2);

            query.append(_FINDER_COLUMN_G_PP_STATUS_2);

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

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_PP,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of emps where depId = &#63;.
     *
     * @param depId the dep ID
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByDepId(long depId) throws SystemException {
        Object[] finderArgs = new Object[] { depId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_DEPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByGroupId(long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching emps
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyId(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMP_WHERE);

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
     * Returns the number of emps.
     *
     * @return the number of emps
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMP);

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
     * Initializes the emp persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lftechnology.sbwbtraining.userapplication.model.Emp")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Emp>> listenersList = new ArrayList<ModelListener<Emp>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<Emp>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmpImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
