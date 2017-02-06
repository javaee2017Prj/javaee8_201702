package qin.javaee8.core.dao.exceptions;

import org.apache.log4j.Logger;

/**
 * 查询出相同结果异常
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/5
 */
public class SameResultException extends HibernateDAOException
{
    private static final long serialVersionUID = 3508266859811214354L;

    final Logger logger = Logger.getLogger(SameResultException.class);

    public SameResultException()
    {
        logger.warn("正在初始化集合为空异常默认构造函数");
    }

    public SameResultException(String message)
    {
        logger.warn("集合为空异常:" + message);
    }
}