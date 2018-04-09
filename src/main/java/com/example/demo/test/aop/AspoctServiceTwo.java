package com.example.demo.test.aop;

import com.example.demo.test.interfaceTest.UserInterface;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/9.
 */
@Service
@UserInterface(id = "33")
public class AspoctServiceTwo {
    public void a(){
        System.out.println(strSubString("a"));
    }
    public void b(){
        System.out.println(strSubString("b"));
    }
    public void c(){
        System.out.println(strSubString("c"));
    }

    public static String strSubString(String str){
        return "类的方法" + str + "执行";
    }
}
