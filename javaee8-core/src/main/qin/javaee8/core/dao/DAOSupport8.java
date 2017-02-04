package qin.javaee8.core.dao;

import qin.javaee8.core.DAOCallBack;
import qin.javaee8.core.JavaEE8BaseSupport;
import qin.javaee8.core.SuperEntity8;
import qin.javaee8.exceptions.EntityNULLException;
import qin.javaee8.exceptions.IdNULLException;

import java.io.Serializable;
import java.util.List;

/**
 * JavaEE8最基础数据访问层接口<br>
 * 在二月份新版中在这里定义很多自定义方法尽量的模仿HibernateTemplate中的方法
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public interface DAOSupport8<T extends SuperEntity8, ID extends Serializable>
          extends JavaEE8BaseSupport
{
    //region 增

    /**
     * 新增实体类
     *
     * @param entity 需要新增的实体类
     * @return 回调新增结果
     */
    Serializable saveEntity(T entity);
    //endregion

    //region 删

    /**
     * 根据实体类删除记录
     *
     * @param entity 需要删除的记录
     * @return
     * @throws IdNULLException     主键为空异常
     * @throws EntityNULLException 实体为空异常
     */
    Serializable deleteEntity(T entity) throws IdNULLException, EntityNULLException;

    /**
     * 根据主键删除记录
     *
     * @param id
     * @return
     * @throws IdNULLException 主键为空异常
     */
    Serializable deleteEntity(ID id) throws IdNULLException;
    //endregion

    //region 改

    /**
     * 根据实体类更新
     *
     * @param entity
     * @return
     * @throws IdNULLException     如果需要更新的类主键为空则抛出异常
     * @throws EntityNULLException 实体类为空异常
     */
    Serializable updateEntity(T entity) throws IdNULLException, EntityNULLException;

    /**
     * 根据主键查找到实体类再进行到更新
     *
     * @param id
     * @return
     * @throws IdNULLException 主键为空异常
     */
    @Deprecated
    Serializable updateEntity(ID id) throws IdNULLException;
    //endregion

    //region 查

    /**
     * 查询所有结果
     *
     * @return
     */
    List<T> findAll();
    //endregion

    //region 获取实体类

    /**
     * 获取实体类 类 类型
     *
     * @return
     */
    Class<T> getEntityClass();
    //endregion

    //region 回调
    Serializable doExecute(DAOCallBack callBack);
    //endregion
}

/*
class CallBackTest {
    public <T> T executeWithNativeSession(HibernateCallback<T> action) {
        return doExecute(action, true);
    }

    private <T> T doExecute(HibernateCallback<T> action, boolean b)
    {
        return null;
    }

    public Serializable save(final Object entity) throws DataAccessException
    {
        return executeWithNativeSession(new HibernateCallback<Serializable>() {
            @Override
            public Serializable doInHibernate(Session session) throws HibernateException
            {
                checkWriteOperationAllowed(session);
                return session.save(entity);
            }

            private void checkWriteOperationAllowed(Session session)
            {

            }
        });
    }
}
*/