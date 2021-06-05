package com.lhw.service.Impl;

import com.lhw.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.lhw.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @Author LiangHanWu
 * @Date 2021-06-04 22:14
 * @Version 1.0
 */

//<bean id="userService" class="com.lhw.service.Impl.UserServiceImpl">
/**
 *使用在类上用于实例化Bean
 * @Component("要被spring实例化的id")
 * @Service("userService")   使用在service层类上用于实例化Bean
 */
//@Component("userService")
@Service("userService")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")   //注入普通类型的属性值，相当于赋值,在获取键值对值是，更有意义
    private String driver;
//    <property name="userDao" ref="userDao"></property>
//    @Autowired   //按照数据类型从spring容器中进行匹配
//    @Qualifier("userDao")  //是按照id值从容器中进行匹配，但是主要此处要配合@Autowired一起用
    @Resource(name = "userDao")  //相当于@Autowired+@Qualifier，按照名称进行注入

    private UserDao userDao;
    /**
     * 使用注解方式注入  set方法可以不写，通过注解注入赋值
     */
    //    使用set方法注入依赖
    /*public void setUserDao(UserDao userDao){
        this.userDao =userDao;

    }*/


    public void save() {

        userDao.save();
        System.out.println(driver);
    }

    @PostConstruct  //初始化方法注解
    public void init(){
        System.out.println("Service对象初始化方法");
    }

    @PreDestroy   //销毁方法注解
    public void destory(){
        System.out.println("Service对象销毁方法");
    }
}
