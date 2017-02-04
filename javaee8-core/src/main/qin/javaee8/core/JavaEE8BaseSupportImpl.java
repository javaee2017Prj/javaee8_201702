package qin.javaee8.core;

/**
 * JavaEE8最基础实现类
 *
 * @author qinzhengying
 * @since 1.8 2017
 */
public class JavaEE8BaseSupportImpl implements JavaEE8BaseSupport
{
    private static final long serialVersionUID = -1112901935830918033L;

    @Override
    public String getLog4jLocation()
    {
        return defaultPath;
    }

    @Override
    public Class getLogClass()
    {
        return JavaEE8BaseSupportImpl.class;
    }
}