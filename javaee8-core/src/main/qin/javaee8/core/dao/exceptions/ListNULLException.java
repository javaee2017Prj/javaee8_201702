package qin.javaee8.core.dao.exceptions;

import org.apache.log4j.Logger;

/**
 * 查询结果集合为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/5
 */
public class ListNULLException extends HibernateDAOException
{
    private static final long serialVersionUID = 3508266859811214354L;

    final Logger logger = Logger.getLogger(ListNULLException.class);

    public ListNULLException()
    {
        logger.warn("正在初始化集合为空异常默认构造函数");
    }

    public ListNULLException(String message)
    {
        logger.warn("集合为空异常:" + message);
    }
}