package com.example.demo.test.aop;

import com.example.demo.test.interfaceTest.UserInterface;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/9.
 */
@Service
public class AspoctService {
    @UserInterface(id = "21")
    public void testOne(){
        System.out.println(strSubString("testOne"));
    }

    @UserInterface(id = "22")
    public void testTwo(){
        System.out.println(strSubString("testTwo"));
    }

    public static String strSubString(String str){
        return "方法注解的" + str + "方法执行";
    }
}


