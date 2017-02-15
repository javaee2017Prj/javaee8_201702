package qin.javaee8.exceptions;

import org.apache.log4j.Logger;
import qin.javaee8.core.dao.exceptions.HibernateDAOException;

/**
 * 上级商品类型为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017 2017/2/12
 */
public class GoodsTypeParentNULLException extends HibernateDAOException
{
    private static final long serialVersionUID = 202308390140862478L;

    Logger logger = Logger.getLogger(GoodsTypeParentNULLException.class);

    public GoodsTypeParentNULLException()
    {
        logger.warn("发生了商品上级类型为空异常!");
    }

    public GoodsTypeParentNULLException(String message)
    {
        logger.warn("发生了商品上级类型异常:" + message + "!");
    }
}