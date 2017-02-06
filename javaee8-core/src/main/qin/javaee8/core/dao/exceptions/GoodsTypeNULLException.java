package qin.javaee8.core.dao.exceptions;

import org.apache.log4j.Logger;

/**
 * 商品类型为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/5
 */
public class GoodsTypeNULLException extends HibernateDAOException
{
    private static final long serialVersionUID = 3508266859811214354L;

    final Logger logger = Logger.getLogger(GoodsTypeNULLException.class);

    public GoodsTypeNULLException()
    {
        logger.warn("正在初始化商品类型为空异常默认构造函数");
    }

    public GoodsTypeNULLException(String message)
    {
        logger.warn("商品类型为空异常:" + message);
    }
}