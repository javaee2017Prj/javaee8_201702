package qin.javaee8.core.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;
import qin.javaee8.core.DAOCallBack;
import qin.javaee8.core.SuperEntity8;
import qin.javaee8.core.dao.DAOSupport8;
import qin.javaee8.exceptions.EntityNULLException;
import qin.javaee8.exceptions.IdNULLException;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

@Repository
@SuppressWarnings("all")
public class DAOSupport8Impl<T extends SuperEntity8, ID extends Serializable> implements DAOSupport8<T, ID>
{
    private static final long serialVersionUID = 1075898199725303536L;

    //region 构造函数
    public DAOSupport8Impl()
    {
        try
        {
            superInfo_logger_normal("正在初始化最父级的数据访问层");
        }
        catch (LogException e)
        {
            e.printStackTrace();
        }
        catch (LogClassException e)
        {
            e.printStackTrace();
        }
    }
    //endregion

    //region 新增实体类

    /**
     * 新增实体类
     *
     * @param entity 需要新增的实体类
     * @return 回调新增结果
     */
    @Override
    public Serializable saveEntity(T entity)
    {
        return doExecute(new DAOCallBack()
        {
            @Override
            public Object doSave(Session session, Transaction transaction)
            {
                Object result = 0;

                try
                {
                    session = sessionFactory.openSession();
                    transaction = session.beginTransaction();
                    superInfo_logger_normal("保存的实体为:" + entity);
                    session.save(entity);
                    transaction.commit();
                    result = 1;
                }
                catch (Exception ex)
                {
                    result = 0;
                    superInfo_logger_expection("保存失败信息:" + ex);
                }
                finally
                {
                    //运行成功返回1不成功返回0
                    return result;
                }
            }
        });
    }
    //endregion

    //region 根据实体类删除记录

    /**
     * 根据实体类删除记录
     *
     * @param entity 需要删除的记录
     * @return
     * @throws IdNULLException     主键为空异常
     * @throws EntityNULLException 实体为空异常
     */
    @Override
    public Serializable deleteEntity(T entity) throws IdNULLException, EntityNULLException
    {
        return doExecute(new DAOCallBack()
        {
            @Override
            public Object doSave(Session session, Transaction transaction)
            {
                Object result = 0;

                try
                {
                    session = sessionFactory.openSession();
                    transaction = session.beginTransaction();
                    superInfo_logger_normal("删除的实体为:" + entity);

                    if (entity.getId() == null)
                    {
                        result = 0;
                        throw new IdNULLException("主键为空, 此实体删除失败!");
                    }

                    session.delete(entity);
                    transaction.commit();
                    result = 1;
                }
                catch (Exception ex)
                {
                    result = 0;
                    superInfo_logger_expection("删除失败信息:" + ex);
                }
                finally
                {
                    //运行成功返回1不成功返回0
                    return result;
                }
            }
        });
    }
    //endregion

    //region 根据主键删除记录

    /**
     * 根据主键删除记录
     *
     * @param id
     * @return
     * @throws IdNULLException 主键为空异常
     */
    @Override
    public Serializable deleteEntity(ID id) throws IdNULLException
    {
        return doExecute(new DAOCallBack()
        {
            @Override
            public Object doSave(Session session, Transaction transaction)
            {
                Object result = 0;

                try
                {
                    session = sessionFactory.openSession();
                    transaction = session.beginTransaction();

                    Class<T> tClass = getEntityClass();
                    if (id == null)
                    {
                        result = 0;
                        throw new IdNULLException("主键为空, 此实体删除失败!");
                    }
                    T t = (T) session.get(tClass.getClass(), id);
                    session.delete(t);

                    transaction.commit();
                    result = 1;
                }
                catch (Exception ex)
                {
                    result = 0;
                    superInfo_logger_expection("删除失败信息:" + ex);
                }
                finally
                {
                    //运行成功返回1不成功返回0
                    return result;
                }
            }
        });
    }
    //endregion

    //region 根据实体类更新

    /**
     * 根据实体类更新
     *
     * @param entity
     * @return
     * @throws IdNULLException     如果需要更新的类主键为空则抛出异常
     * @throws EntityNULLException 实体类为空异常
     */
    @Override
    public Serializable updateEntity(T entity) throws IdNULLException, EntityNULLException
    {
        return doExecute(new DAOCallBack()
        {
            @Override
            public Object doSave(Session session, Transaction transaction)
            {
                Object result = 0;

                try
                {
                    session = sessionFactory.openSession();
                    transaction = session.beginTransaction();

                    superInfo_logger_normal("更新实体类为:" + entity);
                    session.update(entity);

                    transaction.commit();
                    result = 1;
                }
                catch (Exception ex)
                {
                    result = 0;
                    superInfo_logger_expection("更新失败信息:" + ex);
                }
                finally
                {
                    //运行成功返回1不成功返回0
                    return result;
                }
            }
        });
    }
    //endregion

    //region 更新实体类

    /**
     * 根据主键查找到实体类再进行到更新
     *
     * @param id
     * @return
     * @throws IdNULLException 主键为空异常
     */
    @Deprecated
    @Override
    public Serializable updateEntity(ID id) throws IdNULLException
    {
        return 0;
    }
    //endregion

    //region 查询所有结果

    /**
     * 查询所有结果
     *
     * @return
     */
    @Override
    public List<T> findAll()
    {
        List<T> result = sessionFactory
                  .openSession()
                  .createQuery("from " + getEntityClass().getCanonicalName())
                  .list();

        return result;
    }
    //endregion

    //region 获取实体类 类 类型

    /**
     * 获取实体类 类 类型
     *
     * @return
     */
    @Override
    public Class<T> getEntityClass()
    {
        return (Class<T>) SuperEntity8.class;
    }
    //endregion

    //region 获取日志类

    /**
     * 获取类
     */
    @Override
    public Class getLogClass()
    {
        return DAOSupport8Impl.class;
    }
    //endregion

    //region 回调

    //region 注入Session工厂
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }

    @Resource
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }
    //endregion

    /**
     * 回调模式
     *
     * @param callBack
     * @return
     */
    @Override
    public Serializable doExecute(DAOCallBack callBack)
    {
        if (sessionFactory == null)
        {
            return (SessionFactory) new
                      ClassPathXmlApplicationContext("applicationContext.xml")
                      .getBean("sessionFactory");
        }
        return sessionFactory;
    }

    //endregion
}