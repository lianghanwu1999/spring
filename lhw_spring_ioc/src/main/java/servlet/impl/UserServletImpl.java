package servlet.impl;

import com.lhw.dao.UserDao;
import com.lhw.dao.impl.UserDaoImpl;
import servlet.UserService;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 22:52
 * @Version 1.0
 */
public class UserServletImpl implements UserService {



    private UserDao userDao;
    //无参构造

    public UserServletImpl() {
    }

    //有参构造
    public UserServletImpl(UserDao userDao) {
        this.userDao = userDao;
    }

//    //set方法注入依赖
//
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
//
    public void save(){
        //直接调用UserDao 的方法
        userDao.save();
    }

    public void setUserDao(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

//    获取spring容器的实例对象注入，进行实例化操作
//    //重写接口的抽象方法
//    public void save() {
//        //获取spring的容器ApplicationContext
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //使用ApplicationContext对象使用getBean方法获取 userDao实例
//        UserDao userService = (UserDao) app.getBean("userDao");
//        //对实例进行操作
//        userService.save();
//
//    }
//}


}