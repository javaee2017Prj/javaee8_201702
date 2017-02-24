package qin.thinkingjava4.generic.qin;

import qin.javaee8.exceptions.JavaEE8Exception;

@SuppressWarnings("all")
public class MySQLImpl implements MySQL
{
    private static final long serialVersionUID = 3072872467111156088L;

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
    public MySQLImpl() throws JavaEE8Exception
    {
        superInfo_logger_normal("正在初始化MySQL数据库");
    }

    public MySQLImpl(String username, String password)
              throws JavaEE8Exception
    {
        superInfo_logger_normal
                  (
                            new StringBuilder()
                                      .append("mysql -u")
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
    public MySQL getDriverManager() throws Exception
    {
        return new MySQLImpl(username, password);
    }
    //endregion

    //region toString()
    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("MySQL4{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
    //endregion
}