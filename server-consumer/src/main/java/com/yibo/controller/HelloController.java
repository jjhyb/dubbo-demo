package com.yibo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yibo.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: huangyibo
 * @Date: 2019/7/21 20:36
 * @Description:
 */

@RestController
public class HelloController {

    @Reference(timeout = 1)
    private HelloService helloService;

    /*@Reference(timeout = 1)
    private HelloService helloService2;*/

    @GetMapping("/hello1")
    public String sayHello(String msg){

        return helloService.sayHello(msg);
    }

    /*@GetMapping("/hello2")
    public String sayHello2(String msg){

        return helloService2.sayHello(msg);
    }*/
}
