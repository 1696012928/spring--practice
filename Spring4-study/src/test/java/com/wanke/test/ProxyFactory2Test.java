package com.wanke.test;

import com.wanke.aop.IUserDao;
import com.wanke.aop.ProxyFactory2;
import com.wanke.aop.UserDaoImpl;

import java.lang.reflect.Proxy;


/**
 * Created by administered on 2017/7/27.
 */
public class ProxyFactory2Test {


    public static void main(String[] args) {
        IUserDao user = new UserDaoImpl();
        ProxyFactory2 pro = new ProxyFactory2(user);
        IUserDao userPro = (IUserDao) Proxy.newProxyInstance(user.getClass().getClassLoader(), user.getClass().getInterfaces(), pro);
        userPro.save();
        userPro.find();
    }

}