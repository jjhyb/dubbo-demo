package com.yibo.service;

import org.springframework.stereotype.Component;

/**
 * @author: huangyibo
 * @Date: 2019/7/21 20:10
 * @Description:
 */

@Component
//@Service
public class HelloServiceImpl2 implements HelloService {

    @Override
    public String sayHello(String msg) {

        return "Hello,Version2.0："+msg;
    }
}
