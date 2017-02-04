package qin.javaee8.exceptions;

/**
 * 实体为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class EntityNULLException extends JavaEE8Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    public EntityNULLException()
    {
        logger.warn("发生了实体类为空异常!");
    }

    public EntityNULLException(String message)
    {
        logger.warn("发生了实体类为空异常!" + message);
    }
}