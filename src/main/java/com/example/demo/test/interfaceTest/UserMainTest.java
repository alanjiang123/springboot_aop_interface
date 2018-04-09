package com.example.demo.test.interfaceTest;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/3/30.
 */
public class UserMainTest {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 5, 6, 13, 8, 12);
        test(list, InterfaceTestService.class);
    }

    //查询出一组id，哪些是没在自定义注解中出现的
    public static void test(List<Integer> list,Class<?> clazz){
        for (Method method:clazz.getMethods()){
            UserInterface annotation = method.getAnnotation(UserInterface.class);
            if(annotation!=null){
                Integer aId = Integer.parseInt(annotation.id());
                for (Integer val:list){
                    if(val.equals(aId)){
                        list.remove(val);
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(list.toArray()));
    }
}
