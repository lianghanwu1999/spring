package test;

import com.lhw.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 19:12
 * @Version 1.0
 */
public class SpringTest {
    @Test
    //测试scope属性
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        //ApplicationContext对象getBean
        UserDao userDao1 = (UserDao) app.getBean("userDao");
//        UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
//        System.out.println(userDao2);

    }
}
