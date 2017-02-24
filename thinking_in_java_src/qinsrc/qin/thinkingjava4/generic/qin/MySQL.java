package qin.thinkingjava4.generic.qin;

/**
 * MySQL数据库
 */
public interface MySQL extends DataBase<MySQL>
{
    //region 重写父类方法

    @Override
    default Class getLogClass()
    {
        return MySQL.class;
    }

    //endregion
}
