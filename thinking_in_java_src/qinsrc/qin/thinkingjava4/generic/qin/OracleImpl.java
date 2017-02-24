package qin.thinkingjava4.generic.qin;

import qin.javaee8.exceptions.JavaEE8Exception;

public class OracleImpl implements Oracle
{
    private static final long serialVersionUID = 4657089709872652949L;

    //region 数据库用户名和密码
    private String username;

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    private String password;

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    //endregion

    //region 构造函数

    public OracleImpl() throws JavaEE8Exception
    {
        superInfo_logger_normal("正在初始化Oracle数据库");
    }

    public OracleImpl(String username, String password)
              throws JavaEE8Exception
    {
        superInfo_logger_normal
                  (
                            new StringBuilder()
                                      .append("sqlplus -u")
                                      .append(username)
                                      .append(" -p")
                                      .append(password).toString()
                  );

        this.username = username;
        this.password = password;
    }
    //endregion

    //region 获取不同数据库的数据源

    /**
     * 获取不同数据库的数据源
     *
     * @return
     */
    @Override
    public Oracle getDriverManager() throws Exception
    {
        return new OracleImpl(username, password);
    }
    //endregion
}