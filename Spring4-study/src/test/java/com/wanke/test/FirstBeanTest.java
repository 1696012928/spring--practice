package com.wanke.test;


import com.wnake.entity.FirstBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class FirstBeanTest {

    @Test
    public void testFirstBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean.getMessage());
    }

}
















