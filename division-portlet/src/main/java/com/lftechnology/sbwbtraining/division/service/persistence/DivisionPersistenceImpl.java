package com.lftechnology.sbwbtraining.division.service.persistence;

import com.lftechnology.sbwbtraining.division.NoSuchDivisionException;
import com.lftechnology.sbwbtraining.division.model.Division;
import com.lftechnology.sbwbtraining.division.model.impl.DivisionImpl;
import com.lftechnology.sbwbtraining.division.model.impl.DivisionModelImpl;
import com.lftechnology.sbwbtraining.division.service.persistence.DivisionPersistence;

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
 * The persistence implementation for the division service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Sanjib Maharjan
 * @see DivisionPersistence
 * @see DivisionUtil
 * @generated
 */
public class DivisionPersistenceImpl extends BasePersistenceImpl<Division>
    implements DivisionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link DivisionUtil} to access the division persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = DivisionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DN = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByG_DN",
            new String[] {
                Long.class.getName(), String.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByG_DN",
            new String[] { Long.class.getName(), String.class.getName() },
            DivisionModelImpl.GROUPID_COLUMN_BITMASK |
            DivisionModelImpl.DIVISIONNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_G_DN = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByG_DN",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_GROUPID = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByGroupId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID =
        new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByGroupId",
            new String[] { Long.class.getName() },
            DivisionModelImpl.GROUPID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_GROUPID = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByGroupId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByCompanyId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID =
        new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByCompanyId",
            new String[] { Long.class.getName() },
            DivisionModelImpl.COMPANYID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_COMPANYID = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByCompanyId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, DivisionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_DIVISION = "SELECT division FROM Division division";
    private static final String _SQL_SELECT_DIVISION_WHERE = "SELECT division FROM Division division WHERE ";
    private static final String _SQL_COUNT_DIVISION = "SELECT COUNT(division) FROM Division division";
    private static final String _SQL_COUNT_DIVISION_WHERE = "SELECT COUNT(division) FROM Division division WHERE ";
    private static final String _FINDER_COLUMN_G_DN_GROUPID_2 = "division.groupId = ? AND ";
    private static final String _FINDER_COLUMN_G_DN_DIVISIONNAME_1 = "division.divisionName IS NULL";
    private static final String _FINDER_COLUMN_G_DN_DIVISIONNAME_2 = "division.divisionName = ?";
    private static final String _FINDER_COLUMN_G_DN_DIVISIONNAME_3 = "(division.divisionName IS NULL OR division.divisionName = ?)";
    private static final String _FINDER_COLUMN_GROUPID_GROUPID_2 = "division.groupId = ?";
    private static final String _FINDER_COLUMN_COMPANYID_COMPANYID_2 = "division.companyId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "division.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Division exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Division exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(DivisionPersistenceImpl.class);
    private static Division _nullDivision = new DivisionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Division> toCacheModel() {
                return _nullDivisionCacheModel;
            }
        };

    private static CacheModel<Division> _nullDivisionCacheModel = new CacheModel<Division>() {
            public Division toEntityModel() {
                return _nullDivision;
            }
        };

    @BeanReference(type = DivisionPersistence.class)
    protected DivisionPersistence divisionPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the division in the entity cache if it is enabled.
     *
     * @param division the division
     */
    public void cacheResult(Division division) {
        EntityCacheUtil.putResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionImpl.class, division.getPrimaryKey(), division);

        division.resetOriginalValues();
    }

    /**
     * Caches the divisions in the entity cache if it is enabled.
     *
     * @param divisions the divisions
     */
    public void cacheResult(List<Division> divisions) {
        for (Division division : divisions) {
            if (EntityCacheUtil.getResult(
                        DivisionModelImpl.ENTITY_CACHE_ENABLED,
                        DivisionImpl.class, division.getPrimaryKey()) == null) {
                cacheResult(division);
            } else {
                division.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all divisions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(DivisionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(DivisionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the division.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Division division) {
        EntityCacheUtil.removeResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionImpl.class, division.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Division> divisions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Division division : divisions) {
            EntityCacheUtil.removeResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
                DivisionImpl.class, division.getPrimaryKey());
        }
    }

    /**
     * Creates a new division with the primary key. Does not add the division to the database.
     *
     * @param divisionId the primary key for the new division
     * @return the new division
     */
    public Division create(long divisionId) {
        Division division = new DivisionImpl();

        division.setNew(true);
        division.setPrimaryKey(divisionId);

        return division;
    }

    /**
     * Removes the division with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param divisionId the primary key of the division
     * @return the division that was removed
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division remove(long divisionId)
        throws NoSuchDivisionException, SystemException {
        return remove(Long.valueOf(divisionId));
    }

    /**
     * Removes the division with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the division
     * @return the division that was removed
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Division remove(Serializable primaryKey)
        throws NoSuchDivisionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Division division = (Division) session.get(DivisionImpl.class,
                    primaryKey);

            if (division == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchDivisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(division);
        } catch (NoSuchDivisionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Division removeImpl(Division division) throws SystemException {
        division = toUnwrappedModel(division);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, division);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(division);

        return division;
    }

    @Override
    public Division updateImpl(
        com.lftechnology.sbwbtraining.division.model.Division division,
        boolean merge) throws SystemException {
        division = toUnwrappedModel(division);

        boolean isNew = division.isNew();

        DivisionModelImpl divisionModelImpl = (DivisionModelImpl) division;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, division, merge);

            division.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !DivisionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((divisionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(divisionModelImpl.getOriginalGroupId()),
                        
                        divisionModelImpl.getOriginalDivisionName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN,
                    args);

                args = new Object[] {
                        Long.valueOf(divisionModelImpl.getGroupId()),
                        
                        divisionModelImpl.getDivisionName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_G_DN, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN,
                    args);
            }

            if ((divisionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(divisionModelImpl.getOriginalGroupId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);

                args = new Object[] { Long.valueOf(divisionModelImpl.getGroupId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_GROUPID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_GROUPID,
                    args);
            }

            if ((divisionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(divisionModelImpl.getOriginalCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);

                args = new Object[] {
                        Long.valueOf(divisionModelImpl.getCompanyId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_COMPANYID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_COMPANYID,
                    args);
            }
        }

        EntityCacheUtil.putResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
            DivisionImpl.class, division.getPrimaryKey(), division);

        return division;
    }

    protected Division toUnwrappedModel(Division division) {
        if (division instanceof DivisionImpl) {
            return division;
        }

        DivisionImpl divisionImpl = new DivisionImpl();

        divisionImpl.setNew(division.isNew());
        divisionImpl.setPrimaryKey(division.getPrimaryKey());

        divisionImpl.setDivisionId(division.getDivisionId());
        divisionImpl.setDivisionName(division.getDivisionName());
        divisionImpl.setCreatedBy(division.getCreatedBy());
        divisionImpl.setCreatedOn(division.getCreatedOn());
        divisionImpl.setCompanyId(division.getCompanyId());
        divisionImpl.setGroupId(division.getGroupId());

        return divisionImpl;
    }

    /**
     * Returns the division with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the division
     * @return the division
     * @throws com.liferay.portal.NoSuchModelException if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Division findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the division with the primary key or throws a {@link com.lftechnology.sbwbtraining.division.NoSuchDivisionException} if it could not be found.
     *
     * @param divisionId the primary key of the division
     * @return the division
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division findByPrimaryKey(long divisionId)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByPrimaryKey(divisionId);

        if (division == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + divisionId);
            }

            throw new NoSuchDivisionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                divisionId);
        }

        return division;
    }

    /**
     * Returns the division with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the division
     * @return the division, or <code>null</code> if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Division fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey(((Long) primaryKey).longValue());
    }

    /**
     * Returns the division with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param divisionId the primary key of the division
     * @return the division, or <code>null</code> if a division with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division fetchByPrimaryKey(long divisionId)
        throws SystemException {
        Division division = (Division) EntityCacheUtil.getResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
                DivisionImpl.class, divisionId);

        if (division == _nullDivision) {
            return null;
        }

        if (division == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                division = (Division) session.get(DivisionImpl.class,
                        Long.valueOf(divisionId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (division != null) {
                    cacheResult(division);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(DivisionModelImpl.ENTITY_CACHE_ENABLED,
                        DivisionImpl.class, divisionId, _nullDivision);
                }

                closeSession(session);
            }
        }

        return division;
    }

    /**
     * Returns all the divisions where groupId = &#63; and divisionName = &#63;.
     *
     * @param groupId the group ID
     * @param divisionName the division name
     * @return the matching divisions
     * @throws SystemException if a system exception occurred
     */
    public List<Division> findByG_DN(long groupId, String divisionName)
        throws SystemException {
        return findByG_DN(groupId, divisionName, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    public List<Division> findByG_DN(long groupId, String divisionName,
        int start, int end) throws SystemException {
        return findByG_DN(groupId, divisionName, start, end, null);
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
    public List<Division> findByG_DN(long groupId, String divisionName,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_G_DN;
            finderArgs = new Object[] { groupId, divisionName };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_G_DN;
            finderArgs = new Object[] {
                    groupId, divisionName,
                    
                    start, end, orderByComparator
                };
        }

        List<Division> list = (List<Division>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Division division : list) {
                if ((groupId != division.getGroupId()) ||
                        !Validator.equals(divisionName,
                            division.getDivisionName())) {
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

            query.append(_SQL_SELECT_DIVISION_WHERE);

            query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

            if (divisionName == null) {
                query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_1);
            } else {
                if (divisionName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_2);
                }
            }

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(DivisionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (divisionName != null) {
                    qPos.add(divisionName);
                }

                list = (List<Division>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first division in the ordered set where groupId = &#63; and divisionName = &#63;.
     *
     * @param groupId the group ID
     * @param divisionName the division name
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching division
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division findByG_DN_First(long groupId, String divisionName,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByG_DN_First(groupId, divisionName,
                orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", divisionName=");
        msg.append(divisionName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
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
    public Division fetchByG_DN_First(long groupId, String divisionName,
        OrderByComparator orderByComparator) throws SystemException {
        List<Division> list = findByG_DN(groupId, divisionName, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division findByG_DN_Last(long groupId, String divisionName,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByG_DN_Last(groupId, divisionName,
                orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(", divisionName=");
        msg.append(divisionName);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
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
    public Division fetchByG_DN_Last(long groupId, String divisionName,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByG_DN(groupId, divisionName);

        List<Division> list = findByG_DN(groupId, divisionName, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division[] findByG_DN_PrevAndNext(long divisionId, long groupId,
        String divisionName, OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = findByPrimaryKey(divisionId);

        Session session = null;

        try {
            session = openSession();

            Division[] array = new DivisionImpl[3];

            array[0] = getByG_DN_PrevAndNext(session, division, groupId,
                    divisionName, orderByComparator, true);

            array[1] = division;

            array[2] = getByG_DN_PrevAndNext(session, division, groupId,
                    divisionName, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Division getByG_DN_PrevAndNext(Session session,
        Division division, long groupId, String divisionName,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DIVISION_WHERE);

        query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

        if (divisionName == null) {
            query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_1);
        } else {
            if (divisionName.equals(StringPool.BLANK)) {
                query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_3);
            } else {
                query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_2);
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
            query.append(DivisionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (divisionName != null) {
            qPos.add(divisionName);
        }

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(division);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Division> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the divisions where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the matching divisions
     * @throws SystemException if a system exception occurred
     */
    public List<Division> findByGroupId(long groupId) throws SystemException {
        return findByGroupId(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Division> findByGroupId(long groupId, int start, int end)
        throws SystemException {
        return findByGroupId(groupId, start, end, null);
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
    public List<Division> findByGroupId(long groupId, int start, int end,
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

        List<Division> list = (List<Division>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Division division : list) {
                if ((groupId != division.getGroupId())) {
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

            query.append(_SQL_SELECT_DIVISION_WHERE);

            query.append(_FINDER_COLUMN_GROUPID_GROUPID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(DivisionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                list = (List<Division>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first division in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching division
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division findByGroupId_First(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByGroupId_First(groupId, orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
    }

    /**
     * Returns the first division in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching division, or <code>null</code> if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division fetchByGroupId_First(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Division> list = findByGroupId(groupId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division findByGroupId_Last(long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByGroupId_Last(groupId, orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("groupId=");
        msg.append(groupId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
    }

    /**
     * Returns the last division in the ordered set where groupId = &#63;.
     *
     * @param groupId the group ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching division, or <code>null</code> if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division fetchByGroupId_Last(long groupId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByGroupId(groupId);

        List<Division> list = findByGroupId(groupId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division[] findByGroupId_PrevAndNext(long divisionId, long groupId,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = findByPrimaryKey(divisionId);

        Session session = null;

        try {
            session = openSession();

            Division[] array = new DivisionImpl[3];

            array[0] = getByGroupId_PrevAndNext(session, division, groupId,
                    orderByComparator, true);

            array[1] = division;

            array[2] = getByGroupId_PrevAndNext(session, division, groupId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Division getByGroupId_PrevAndNext(Session session,
        Division division, long groupId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DIVISION_WHERE);

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
            query.append(DivisionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(groupId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(division);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Division> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the divisions where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the matching divisions
     * @throws SystemException if a system exception occurred
     */
    public List<Division> findByCompanyId(long companyId)
        throws SystemException {
        return findByCompanyId(companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    public List<Division> findByCompanyId(long companyId, int start, int end)
        throws SystemException {
        return findByCompanyId(companyId, start, end, null);
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
    public List<Division> findByCompanyId(long companyId, int start, int end,
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

        List<Division> list = (List<Division>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Division division : list) {
                if ((companyId != division.getCompanyId())) {
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

            query.append(_SQL_SELECT_DIVISION_WHERE);

            query.append(_FINDER_COLUMN_COMPANYID_COMPANYID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(DivisionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(companyId);

                list = (List<Division>) QueryUtil.list(q, getDialect(), start,
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
     * Returns the first division in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching division
     * @throws com.lftechnology.sbwbtraining.division.NoSuchDivisionException if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division findByCompanyId_First(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByCompanyId_First(companyId, orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
    }

    /**
     * Returns the first division in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching division, or <code>null</code> if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division fetchByCompanyId_First(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Division> list = findByCompanyId(companyId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division findByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = fetchByCompanyId_Last(companyId, orderByComparator);

        if (division != null) {
            return division;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("companyId=");
        msg.append(companyId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchDivisionException(msg.toString());
    }

    /**
     * Returns the last division in the ordered set where companyId = &#63;.
     *
     * @param companyId the company ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching division, or <code>null</code> if a matching division could not be found
     * @throws SystemException if a system exception occurred
     */
    public Division fetchByCompanyId_Last(long companyId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByCompanyId(companyId);

        List<Division> list = findByCompanyId(companyId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    public Division[] findByCompanyId_PrevAndNext(long divisionId,
        long companyId, OrderByComparator orderByComparator)
        throws NoSuchDivisionException, SystemException {
        Division division = findByPrimaryKey(divisionId);

        Session session = null;

        try {
            session = openSession();

            Division[] array = new DivisionImpl[3];

            array[0] = getByCompanyId_PrevAndNext(session, division, companyId,
                    orderByComparator, true);

            array[1] = division;

            array[2] = getByCompanyId_PrevAndNext(session, division, companyId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Division getByCompanyId_PrevAndNext(Session session,
        Division division, long companyId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_DIVISION_WHERE);

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
            query.append(DivisionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(companyId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(division);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Division> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the divisions.
     *
     * @return the divisions
     * @throws SystemException if a system exception occurred
     */
    public List<Division> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Division> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    public List<Division> findAll(int start, int end,
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

        List<Division> list = (List<Division>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_DIVISION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_DIVISION.concat(DivisionModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<Division>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<Division>) QueryUtil.list(q, getDialect(),
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
     * Removes all the divisions where groupId = &#63; and divisionName = &#63; from the database.
     *
     * @param groupId the group ID
     * @param divisionName the division name
     * @throws SystemException if a system exception occurred
     */
    public void removeByG_DN(long groupId, String divisionName)
        throws SystemException {
        for (Division division : findByG_DN(groupId, divisionName)) {
            remove(division);
        }
    }

    /**
     * Removes all the divisions where groupId = &#63; from the database.
     *
     * @param groupId the group ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByGroupId(long groupId) throws SystemException {
        for (Division division : findByGroupId(groupId)) {
            remove(division);
        }
    }

    /**
     * Removes all the divisions where companyId = &#63; from the database.
     *
     * @param companyId the company ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCompanyId(long companyId) throws SystemException {
        for (Division division : findByCompanyId(companyId)) {
            remove(division);
        }
    }

    /**
     * Removes all the divisions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (Division division : findAll()) {
            remove(division);
        }
    }

    /**
     * Returns the number of divisions where groupId = &#63; and divisionName = &#63;.
     *
     * @param groupId the group ID
     * @param divisionName the division name
     * @return the number of matching divisions
     * @throws SystemException if a system exception occurred
     */
    public int countByG_DN(long groupId, String divisionName)
        throws SystemException {
        Object[] finderArgs = new Object[] { groupId, divisionName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_G_DN,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_DIVISION_WHERE);

            query.append(_FINDER_COLUMN_G_DN_GROUPID_2);

            if (divisionName == null) {
                query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_1);
            } else {
                if (divisionName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_G_DN_DIVISIONNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(groupId);

                if (divisionName != null) {
                    qPos.add(divisionName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_G_DN,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of divisions where groupId = &#63;.
     *
     * @param groupId the group ID
     * @return the number of matching divisions
     * @throws SystemException if a system exception occurred
     */
    public int countByGroupId(long groupId) throws SystemException {
        Object[] finderArgs = new Object[] { groupId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_GROUPID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DIVISION_WHERE);

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
     * Returns the number of divisions where companyId = &#63;.
     *
     * @param companyId the company ID
     * @return the number of matching divisions
     * @throws SystemException if a system exception occurred
     */
    public int countByCompanyId(long companyId) throws SystemException {
        Object[] finderArgs = new Object[] { companyId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_COMPANYID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_DIVISION_WHERE);

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
     * Returns the number of divisions.
     *
     * @return the number of divisions
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_DIVISION);

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
     * Initializes the division persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.lftechnology.sbwbtraining.division.model.Division")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Division>> listenersList = new ArrayList<ModelListener<Division>>();

                for (String listenerClassName : listenerClassNames) {
                    Class<?> clazz = getClass();

                    listenersList.add((ModelListener<Division>) InstanceFactory.newInstance(
                            clazz.getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(DivisionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
