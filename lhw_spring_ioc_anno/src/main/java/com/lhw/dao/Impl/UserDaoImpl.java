package com.lhw.dao.Impl;

import com.lhw.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author LiangHanWu
 * @Date 2021-06-04 22:11
 * @Version 1.0
 */
//<bean id="userDao" class="com.lhw.dao.Impl.UserDaoImpl"></bean>
/**
 *使用在类上用于实例化Bean
 * @Component("要被spring实例化的id")
 * @Repository("userDao")  @Repository 在使用在dao层类上用于实例化Bean
 */

//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    public void save() {
        System.out.println("save running....");
    }
}
