package qin.javaee8.core;

import java.io.Serializable;

public interface SuperEntity8<T extends Serializable>
{
    /**
     * 获取主键
     */
    T getId();

    /**
     * 设置主键
     */
    void setId(T id);
}