package com.wanke.test;

import com.wanke.aop.IUserDao;
import com.wanke.aop.UserStaticProxy;

/**
 * Created by administered on 2017/7/27.
 *
 * 测试静态代理
 */
public class TestStaticProxy {


    public static void main(String[] args) {
        IUserDao userdao =  new UserStaticProxy();
        userdao.save();
        userdao.find();

    }

}
