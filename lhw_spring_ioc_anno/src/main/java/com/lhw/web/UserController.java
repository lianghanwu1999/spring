package com.lhw.web;

import com.lhw.config.SpringCofiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lhw.service.UserService;

/**
 * @Author LiangHanWu
 * @Date 2021-06-04 23:08
 * @Version 1.0
 */

/**
 * 控制函数，相对于控制台
 */
public class UserController {

    public static void main(String[] args) {
        // 通过xml文件,获取spring容器
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext3.xml");
        //通过核心配置类，获取spring容器，核心配置类
        ApplicationContext app =new AnnotationConfigApplicationContext(SpringCofiguration.class);
        // 使用Spring的API获得Bean实例(对象)
        // 当参数的数据类型是Class类型时，表示根据类型从容器中匹配Bean实例
        UserService userService = app.getBean(UserService.class);
//        使用实例对象
        userService.save();
    }
}
