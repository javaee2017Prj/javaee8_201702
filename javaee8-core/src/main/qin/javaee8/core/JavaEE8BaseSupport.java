package qin.javaee8.core;

import org.apache.log4j.Logger;
import qin.javaee8.exceptions.LogClassException;
import qin.javaee8.exceptions.LogException;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

import static qin.javaee8.core.JavaEE8BaseSupport.InfoWays.LOGGER;
import static qin.javaee8.core.JavaEE8BaseSupport.InfoWays.NORMAL;
import static qin.javaee8.core.JavaEE8BaseSupport.PrintWays.P_EXCEPTION;
import static qin.javaee8.core.JavaEE8BaseSupport.PrintWays.P_NORMAL;

/**
 * JavaEE8最基础接口(所有类都要事先此接口)<br>
 * 由于Map只能接收两个对象, 如果Map接收三个或三个以上遍历则会比较麻烦<br>
 * 所以在超父接口里用三个引用类型来代替, 如果三个以上可自己定义接口然后实现此接口即可<br>
 * 这是2月份新版功能
 *
 * @param <ObjA> 任意对象
 * @param <ObjB> 任意对象
 * @param <ObjC> 任意对象
 * @author qinzhengying
 * @since 1.8 2017 2017/1/26
 */
@SuppressWarnings("all")
public interface JavaEE8BaseSupport<ObjA extends Serializable, ObjB extends Serializable, ObjC extends Serializable>
          extends Serializable, RandomAccess, Runnable,
          Comparable, Comparator
{
    //region 重写方法

    @Override
    default int compareTo(Object o)
    {
        return 0;
    }

    @Override
    default void run()
    {

    }

    @Override
    default int compare(Object o1, Object o2)
    {
        return 0;
    }

    //endregion

    //region 获取类示例
    default ObjA getObjA()
    {
        return null;
    }

    default ObjB getObjB()
    {
        return null;
    }

    default ObjC getObjC()
    {
        return null;
    }

    default void setObjA(ObjA objA)
    {
    }

    default void setObjB(ObjB objB)
    {
    }

    default void setObjC(ObjC objC)
    {
    }
    //endregion

    //region 定义常用变量

    //region html
    /**
     * 换行符
     */
    String STR_BR = "<br>";

    /**
     * 空格符
     */
    String STR_NBSP = "&nbsp;";
    //endregion

    /**
     * 程序成功运行标识符
     */
    String STR_SUCCESS = "success";

    /**
     * 程序失败运行标识符
     */
    String STR_FAILED = "failed";

    /**
     * 空集合
     */
    List emptyList = Collections.emptyList();

    //endregion

    //region 输出方法

    //region 定义日志输出方式

    /**
     * 日志输出方式
     *
     * @since 2017
     */
    enum PrintWays
    {
        /**
         * 正常
         */
        P_NORMAL,

        /**
         * 错误
         */
        P_EXCEPTION
    }
    //endregion

    //region 信息输出方式
    enum InfoWays
    {
        /**
         * 普通方式输出
         */
        NORMAL,

        /**
         * 日志方式输出
         */
        LOGGER
    }
    //endregion

    /**
     * 超级输出方法, 能输出任意信息
     *
     * @param log4jLocation log4j配置文件路径
     * @param tClass        需要输出的类
     * @param printWays     日志输出方式(如果是异常信息则使用日志异常功能对其进行输出)
     * @param infoWays      信息输出方式(是要使用日志工具输出还是要普通输出)
     * @param messages      任意需要输出的信息
     */
    default void superInfo(String log4jLocation, Class tClass, PrintWays printWays, InfoWays infoWays,
                           Object... messages)
    {
        //1.判断配置文件是否存在
        File file = new File(log4jLocation);

        //使用日志方式输出
        if (infoWays == LOGGER)
        {
            if (file.exists())
            {
                //2.文件存在就输出
                //根据输出方式输出
                Logger logger = Logger.getLogger(tClass);
                if (printWays == P_NORMAL)
                {
                    for (int i = 0; i < messages.length; i++)
                    {
                        logger.info(messages[i] + "==========\n");
                    }
                }
                if (printWays == P_EXCEPTION)
                {
                    for (int i = 0; i < messages.length; i++)
                    {
                        logger.error(messages[i] + "==========\n");
                    }
                } // end if (printWays == P_EXCEPTION)
            } // end if (file.exists())
            else
            {
                System.out.println("配置文件不存在!就以正常方式输出信息!\n");

                for (int i = 0; i < messages.length; i++)
                {
                    System.out.println(messages[i] + "=============\n");
                }
            } // end else
        } //end if (infoWays == LOGGER)

        //使用普通方式输出
        if (infoWays == NORMAL)
        {
            for (int i = 0; i < messages.length; i++)
            {
                System.out.println(messages[i] + "=============\n");
            }
        }
    }

    //endregion

    //region 定义一个简洁的输出方法

    /*
            这里是利用重载新写的方法
            在之前的工具类中是没有的
            在这里引入新特性
            从二月份版本开始引入异常抛出
            如果配置文件不存在或类为空抛出异常
            不要在控制台收到别的空指针异常了
            当配置文件不存在或类为空时直接提示异常
     */
    String defaultPath = "D:\\idea2016WK\\github2017\\javaee8_201702\\src\\resources\\log4j.properties";

    /**
     * 获取日志路径(默认路径)
     */
    default String getLog4jLocation()
    {
        return defaultPath;
    }

    /**
     * 获取类
     */
    default Class getLogClass()
    {
        return null;
    }

    //region 使用日志正常信息输出

    /**
     * 使用日志正常信息输出
     */
    default void superInfo_logger_normal(Object... messages)
              throws LogException, LogClassException
    {
        boolean infoFlag = false;

        try
        {
            if (getLog4jLocation().length() == 0)
            {
                infoFlag = false;
                throw new LogException("log4j.properties文件路径为空!");
            }
            if (getClass() == null)
            {
                infoFlag = false;
                throw new LogClassException("需要输出的类为空!");
            }
            else
            {
                infoFlag = true;
            }
        }
        finally
        {
            if (infoFlag)
            {
                superInfo(getLog4jLocation(), getLogClass(), P_NORMAL, LOGGER, messages);
            }
            else
            {
                superInfo_Syso(messages);
            }
        }
    }
    //endregion

    //region 使用日志异常信息输出

    /**
     * 使用日志异常信息输出
     */
    default void superInfo_logger_expection(Object... messages)
              throws LogException, LogClassException
    {
        //superInfo(getLog4jLocation(), getLogClass(), P_EXCEPTION, LOGGER, messages);

        boolean infoFlag = false;

        try
        {
            if (getLog4jLocation().length() == 0)
            {
                infoFlag = false;
                throw new LogException("log4j.properties文件路径为空!");
            }
            if (getClass() == null)
            {
                infoFlag = false;
                throw new LogClassException("需要输出的类为空!");
            }
            else
            {
                infoFlag = true;
            }
        }
        finally
        {
            if (infoFlag)
            {
                superInfo(getLog4jLocation(), getLogClass(), P_EXCEPTION, LOGGER, messages);
            }
            else
            {
                superInfo_Syso(messages);
            }
        }
    }
    //endregion

    //region 使用正常信息输出

    /**
     * 使用正常信息输出
     */
    default void superInfo_Syso(Object... messages)
    {
        superInfo("", null, null, NORMAL, messages);
    }
    //endregion

    //endregion

    //region 向ajax传递信息

    /**
     * 向ajax传递信息
     */
    default void returnJson(Object baseStr, HttpServletResponse response) throws IOException
    {
        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = null;
        out = response.getWriter();
        out.print(baseStr);
        out.flush();
    }
    //endregion
}

//region 模板类
/*
class JavaEE8BaseSupportImpl<ObjA, ObjB, ObjC>
          implements JavaEE8BaseSupport<ObjA, ObjB, ObjC> {
    ObjA objA; ObjB objB; ObjC objC;

    public ObjA getObjA()
    {
        return objA;
    }

    public void setObjA(ObjA objA)
    {
        this.objA = objA;
    }

    public ObjB getObjB()
    {
        return objB;
    }

    public void setObjB(ObjB objB)
    {
        this.objB = objB;
    }

    public ObjC getObjC()
    {
        return objC;
    }

    public void setObjC(ObjC objC)
    {
        this.objC = objC;
    }
}
*/
//endregion
