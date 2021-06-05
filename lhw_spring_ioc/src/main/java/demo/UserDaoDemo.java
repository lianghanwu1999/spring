package demo;

import com.lhw.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 18:40
 * @Version 1.0
 */
public class UserDaoDemo {
    /**
     * 测试:使用Spring的API获得Bean实例
     */

    public static void main(String[] args) {
        // 使用Spring的API获得Bean实例(对象)
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //使用ApplicationContext对象getBean
        UserDao userDao = (UserDao) app.getBean("userDao");
        //调用userDao 方法，进行实例操作
        userDao.save();
    }
}
