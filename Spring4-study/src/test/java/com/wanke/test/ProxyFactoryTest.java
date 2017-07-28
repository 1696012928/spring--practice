package com.wanke.test;

import com.wanke.aop.IUserDao;
import com.wanke.aop.ProxyFactory;
import com.wanke.aop.UserDaoImpl;

/**
 * Created by administered on 2017/7/27.
 */
public class ProxyFactoryTest {

    public static void main(String[] args) {
        //原对象
        IUserDao user = new UserDaoImpl();
        //代理对象
        ProxyFactory factory = new ProxyFactory(user);
        IUserDao proxyInstanceUserDao = (IUserDao)factory.getProxyInstance();
        proxyInstanceUserDao.save();
        proxyInstanceUserDao.find();
    }


}