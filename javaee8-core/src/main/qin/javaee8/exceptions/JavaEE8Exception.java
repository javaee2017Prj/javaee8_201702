package qin.javaee8.exceptions;

import org.apache.log4j.Logger;

/**
 * JavaEE8大异常
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
@SuppressWarnings("all")
public class JavaEE8Exception extends Exception
{
    private static final long serialVersionUID = -6641235529233623006L;

    protected final Logger logger = Logger.getLogger(JavaEE8Exception.class);

    public JavaEE8Exception()
    {
        logger.warn("发生了JavaEE8大异常!");
    }

    public JavaEE8Exception(String message)
    {
        logger.warn("发生了JavaEE8大异常:" + message);
    }
}