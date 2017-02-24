package qin.thinkingjava4.generic.qin;

import qin.javaee8.core.JavaEE8BaseSupport;

@SuppressWarnings("all")
public interface DataBase<D> extends JavaEE8BaseSupport
{
    /**
     * 获取不同数据库的数据源
     *
     * @return
     */
    D getDriverManager() throws Exception;
}
