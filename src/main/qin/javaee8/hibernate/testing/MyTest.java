package qin.javaee8.hibernate.testing;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
drop database javaee8_201702; create database javaee8_201702 default charset utf8;
use javaee8_201702;show tables;

##1063
SELECT * FROM tb_goodstype8
WHERE goods_typeName = '科普';

SELECT * FROM tb_goodstype8
WHERE goods_pk = 15;

SELECT * FROM tb_goodstype8
WHERE goods_pk = (
	SELECT goods_pk FROM tb_goodstype8
	WHERE goods_typeName = '钱包'
);




*/
public class MyTest
{

    public
    Session session =
              (
                        (SessionFactory) new
                                  ClassPathXmlApplicationContext("applicationContext.xml")
                                  .getBean("sessionFactory")
              ).openSession();

    /**
     * 开启事务
     */
    public Transaction transaction = session.beginTransaction();

    @org.junit.Test
    public void make()
    {
    }
}