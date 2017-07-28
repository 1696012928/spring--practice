package com.wanke.aop;

/**
 * Created by administered on 2017/7/27.
 */
public class UserDaoImpl implements IUserDao {
    public void save() {
        System.out.println("保存");
    }

    public void find() {
        System.out.println("查找");
    }
}
