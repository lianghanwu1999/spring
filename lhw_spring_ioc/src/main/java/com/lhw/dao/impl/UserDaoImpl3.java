package com.lhw.dao.impl;

import com.lhw.dao.UserDao;
import domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 18:32
 * @Version 1.0
 */
public class UserDaoImpl3 implements UserDao {

    /**
     * 演示容器中注入集合数据类型
     * 这个类提供对象和方法
     */

    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;


    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



    //重写实现save方法
    public void save() {
        //打印username和age值，代表注入成功
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");

    }
}
