package com.lhw.dao.impl;

import com.lhw.dao.UserDao;

/**
 * @Author LiangHanWu
 * @Date 2021-06-03 18:32
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    //无参构造
    //用于配置对象交由Spring 来创建。
    //默认情况下它调用的是类中的无参构造函数，如果没有无参构造函数则不能创建成功
     public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建.....");
    }

    //初始化方法
    public void init(){
        System.out.println("初始化方法...");
    }

    //销毁方法
    public void destory(){
        System.out.println("销毁方法方法...");
    }



    //重写实现save方法
    public void save() {
        System.out.println("save running...");

    }
}
