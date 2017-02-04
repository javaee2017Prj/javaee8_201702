package qin.javaee8.exceptions;

/**
 * log4j类为空异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class LogClassException extends JavaEE8Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    public LogClassException()
    {
        logger.warn("发生了log4j类为空异常!");
    }

    public LogClassException(String message)
    {
        logger.warn("发生了log4j类为空异常!" + message);
    }
}