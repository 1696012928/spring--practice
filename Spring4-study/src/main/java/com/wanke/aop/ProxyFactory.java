package com.wanke.aop;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by administered on 2017/7/27.
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //实现代理的
        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke ;
                String name = method.getName();
                if ("find".equals(name)) {
                    invoke = method.invoke(target, args);
                } else {
                    System.out.println("开启事务");
                    invoke = method.invoke(target, args);
                    System.out.println("提交事务");
                }
                return invoke;
            }
        };

        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
        return proxy;
    }


}
