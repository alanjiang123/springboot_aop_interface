package com.example.demo.test.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Administrator on 2018/4/8.
 *
 * 定义注入点和增强方法
 * 测试aop自定义注解
 */
@Aspect
@Component
public class AspoctAnnotation {

    //定义一个方法注解的切入点
    @Pointcut("@annotation(com.example.demo.test.interfaceTest.UserInterface)")
    public void pointCutOne(){
        System.out.println("pointCut method");
    }
    //定义一个类注解的切入点
    @Pointcut("@within(com.example.demo.test.interfaceTest.UserInterface)")
    public void pointCutTwo(){
        System.out.println("pointCut class");
    }

    @After("pointCutTwo()")
    public void aroundOne(){
        System.out.println("注解的方法执行："+new Date());
    }

    @After("pointCutOne()")
    public void aroundTwo(){
        System.out.println("注解的类执行："+new Date());
    }
}
