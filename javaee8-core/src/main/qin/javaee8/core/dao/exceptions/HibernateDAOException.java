package qin.javaee8.core.dao.exceptions;

import qin.javaee8.exceptions.JavaEE8Exception;

/**
 * 数据访问层异常
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/5
 */
public class HibernateDAOException extends JavaEE8Exception
{
    public HibernateDAOException()
    {
    }

    public HibernateDAOException(String message)
    {
        super(message);
    }
}