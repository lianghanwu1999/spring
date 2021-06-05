package com.lhw.dao.impl;

import com.lhw.dao.UserDao;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 18:32
 * @Version 1.0
 */
public class UserDaoImpl2 implements UserDao {

    /**
     * 注入普通数据类型
     */
    private String username;
    private int age;

    //设置set方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }






    //重写实现save方法
    public void save() {
        //打印username和age值，代表注入成功
        System.out.println(username+"======"+age);
        System.out.println("save running...");

    }
}
