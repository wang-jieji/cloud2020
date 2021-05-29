package com.exem.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/29 1:36
 **/
@SpringBootApplication
@EnableEurekaClient
public class PaymentHystrixMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMain8002.class,args);
    }
}
