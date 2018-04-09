package com.example.demo.test.interfaceTest;

/**
 * Created by Administrator on 2018/3/30.
 *
 * 测试使用自定义的注解
 */
public class InterfaceTestService {


    @UserInterface(id = "12",value = "12的value")
    public boolean getTrue(){
        return true;
    }

    @UserInterface(id="13")
    public boolean getFalse(){
        return false;
    }
}
