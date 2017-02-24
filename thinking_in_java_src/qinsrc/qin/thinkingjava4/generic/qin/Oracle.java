package qin.thinkingjava4.generic.qin;

public interface Oracle extends DataBase<Oracle>
{
    //region 重写父类方法

    @Override
    default Class getLogClass()
    {
        return Oracle.class;
    }

    //endregion
}
