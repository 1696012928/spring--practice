package com.wanke.aop;

/**
 * Created by administered on 2017/7/27.
 *
 * 静态代理
 *
 */
public class UserStaticProxy   implements IUserDao{

 private  IUserDao userdao =  new UserDaoImpl();


    public void save() {
        System.out.println("开启事务");
        userdao.save();
        System.out.println("提交事务");
    }

    public void find() {
       userdao.find();
    }
}
