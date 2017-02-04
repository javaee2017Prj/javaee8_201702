package qin.javaee8.core;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 数据库操作封装并实现回调功能
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/1/27
 */
public interface DAOCallBack
{
    //region 增

    default Object doSave(Session session, Transaction transaction)
    {
        return 0;
    }
    //endregion

    //region 删
    default Object doDelete(Session session, Transaction transaction)
    {
        return 0;
    }
    //endregion

    //region 改
    default Object doUpdate(Session session, Transaction transaction)
    {
        return 0;
    }
    //endregion

    //region 查
    default Object doSearch(Session session, Transaction transaction)
    {
        return 0;
    }
    //endregion
}