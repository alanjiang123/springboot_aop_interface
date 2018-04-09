package com.example.demo.test.interfaceTest;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2018/3/30.
 * 自定义一个注解
 */
@Target({ElementType.METHOD,ElementType.TYPE})
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface UserInterface {
    String id();
    String value() default "";
}
