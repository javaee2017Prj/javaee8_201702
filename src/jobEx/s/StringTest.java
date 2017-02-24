package s;

import qin.javaee8.core.JavaEE8BaseSupport;

public class StringTest implements JavaEE8BaseSupport
{
    @Override
    public Class getLogClass()
    {
        return StringTest.class;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("StringTest{");
        sb.append("s='").append(s).append('\'');
        sb.append('}');
        return sb.toString();
    }

    String s = getLogClass().toString();

    @org.junit.Test
    public void string1() throws Exception
    {
        superInfo_logger_normal(s);
        //String常用方法
        //1.返回字符串中指定位置的字符(接收变量为int类型)[获取第2个字符]
        superInfo_logger_normal(charAt(2, s.toCharArray()));
    }

    //region charAt
    public char charAt(int index, char[] value)
    {
        if ((index < 0) || (index >= value.length))
        {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }
    //endregion
}










