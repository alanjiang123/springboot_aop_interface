package com.example.demo.test.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/4/9.
 */
@RestController
public class AspoctTest {
    @Autowired
    AspoctService aspoctService;
    @Autowired
    AspoctServiceTwo aspoctServiceTwo;

    @RequestMapping("/methodTestOne")
    public String test() {
        aspoctService.testOne();
        aspoctService.testTwo();
        return "success";
    }

    @RequestMapping("/classTestOne")
    public String test2() {
        aspoctServiceTwo.a();
        aspoctServiceTwo.b();
        aspoctServiceTwo.c();
        return "success";
    }
}
