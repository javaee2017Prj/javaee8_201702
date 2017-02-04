package qin.javaee8.exceptions;

/**
 * log4j配置文件异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class LogException extends JavaEE8Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    public LogException()
    {
        logger.warn("发生了log4j配置文件为空异常!");
    }

    public LogException(String message)
    {
        logger.warn("发生了log4j配置文件为空异常!" + message);
    }
}