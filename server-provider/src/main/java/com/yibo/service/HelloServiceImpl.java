package com.yibo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author: huangyibo
 * @Date: 2019/7/21 20:10
 * @Description:
 */

@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String msg) {

        return "Hello,Version1.0："+msg;
    }
}
