package com.lhw.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

/**
 * @Author LiangHanWu
 * @Date 2021-06-05 15:24
 * @Version 1.0
 */

/**
 * 使用spring核心配置类使用注解，替换xml文件，进行spring容器配置
 */

//标志该类是Spring核心配置类,当创建容器时会从该类上加载注解
@Configuration
//<context:component-scan base-package="com.lhw"></context:component-scan>
//组件扫描 用于指定 Spring 在初始化容器时要扫描的包。
@ComponentScan("com.lhw")
//将数据源相关的类，独立出来，避免太冗余
////<context:property-placeholder location="classpath:jdbc.properties"/>
////加载外部的properties文件 到spring容器
//@PropertySource("classpath:jdbc.properties")

//将数据源相关的类，导入加载过来
@Import(DataSourceConfiguration.class)
public class SpringCofiguration {


    //将其独立移动专门装载数据源相关的类·

//    //使用Value注解注入值,方便接收字符串
//    @Value("${jdbc.driver}")
//    private String driver;
//
//    @Value("${jdbc.url}")
//    private String url;
//
//    @Value("${jdbc.username}")
//    private String username;
//
//    @Value("${jdbc.password}")
//    private String password;
//
//
//    @Bean("dataSource")    //spring会将当前方法的返回值以指定的名称存储到spring容器中
//    public DataSource getDataSource() throws PropertyVetoException {
//        //创建数据源
//        ComboPooledDataSource dataSource = new ComboPooledDataSource();
//        //设置连接参数
//        dataSource.setDriverClass(driver);   //接收定义的value赋予的值
//        //设置数据库地址
//        dataSource.setJdbcUrl(url);         //接收定义的value赋予的值
//        //设置数据源，用户名和密码
//        dataSource.setUser(username);       //接收定义的value赋予的值
//        dataSource.setPassword(password);   //接收定义的value赋予的值
//
//        return dataSource;
//    }
}
