package com.yibo.service;

/**
 * @author: huangyibo
 * @Date: 2019/7/22 17:02
 * @Description:
 */


public class HelloServiceMock implements HelloService {

    @Override
    public String sayHello(String msg) {

        /**
         * 在远程调用异常时，服务端根据自定义mock业务处理类进行返回
         * 在远程调用异常时进行一些兜底的处理
         */

        return "系统繁忙："+msg;
    }
}
