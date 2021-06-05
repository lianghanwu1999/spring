package com.lhw.config;

/**
 * @Author LiangHanWu
 * @Date 2021-06-05 15:58
 * @Version 1.0
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
//将数据源相关的类，独立出来，避免太冗余
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * 负责数据源相关配置的类
 */
//<context:property-placeholder location="classpath:jdbc.properties"/>
//加载外部的properties文件 到spring容器
@PropertySource("classpath:jdbc.properties")
public class DataSourceConfiguration {

    //使用Value注解注入值,方便接收字符串
    @Value("${jdbc.driver}")
    private String driver;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


    @Bean("dataSource")    //spring会将当前方法的返回值以指定的名称存储到spring容器中
    public DataSource getDataSource() throws PropertyVetoException {
        //创建数据源
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        //设置连接参数
        dataSource.setDriverClass(driver);   //接收定义的value赋予的值
        //设置数据库地址
        dataSource.setJdbcUrl(url);         //接收定义的value赋予的值
        //设置数据源，用户名和密码
        dataSource.setUser(username);       //接收定义的value赋予的值
        dataSource.setPassword(password);   //接收定义的value赋予的值

        return dataSource;
    }
}
