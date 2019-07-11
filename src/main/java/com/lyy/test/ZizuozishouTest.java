package com.lyy.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @autohor liuyouyun
 * @date 2019/7/11 - 22:57
 */
public class ZizuozishouTest {
    public static void main(String[] args) throws SQLException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource ds = (ComboPooledDataSource) ctx.getBean("dataSource");
        System.out.println(ds);
        Connection connection = ds.getConnection();
        System.out.println(connection);

    }
}
