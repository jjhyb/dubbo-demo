package com.yibo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {
    public static void main( String[] args ) {

        SpringApplication.run(ProviderApplication.class,args);
    }
}
