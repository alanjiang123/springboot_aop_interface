package com.example.demo.test.aop.two.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainAop {
	public static void main(String as[]){  
        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext2.xml");  
        IUser user = (IUser) factory.getBean("user");  
        user.findAll();  
          
//        User u = new User();  
//      u.setUsername("Tom");  
      user.findUser("Tom");  
          
//        /*u.setUsername("haha"); 
        user.addUser("hahah");
    }  
}
