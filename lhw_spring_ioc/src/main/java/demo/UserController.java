package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import servlet.UserService;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 23:24
 * @Version 1.0
 */
public class UserController {
    public static void main(String[] args) {
        /**
         * 测试类:调用userService的数据
         */
        // 使用Spring的API获得Bean实例(对象)
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext6.xml");
        //使用ApplicationContext对象getBean
        UserService userService = (UserService) app.getBean("userService");
        //调用userDao 方法，进行实例操作
        userService.save();
    }
}
