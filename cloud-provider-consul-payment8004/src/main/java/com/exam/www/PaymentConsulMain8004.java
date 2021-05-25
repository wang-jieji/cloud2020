package com.exam.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/26 1:54
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentConsulMain8004 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMain8004.class,args);
    }
}
