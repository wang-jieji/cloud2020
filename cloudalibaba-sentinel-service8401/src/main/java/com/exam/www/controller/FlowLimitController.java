package com.exam.www.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.exam.www.service.IOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/12/12 17:54
 **/
@RestController
public class FlowLimitController {

    @Resource
    public IOrderService iOrderService;

    @GetMapping("/testA")
    public String testA() {
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        }catch (Exception e){
           e.printStackTrace();
        }
        System.out.println("-------------testA");

        return iOrderService.getUser();
    }

    @GetMapping("/testB")
    public String testB() {
        System.out.println("----------------------testB");
        return iOrderService.getUser();
    }

    @GetMapping("/testC")
    public String testC() {
        int age = 10/0;
        try {
            TimeUnit.SECONDS.sleep(1);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("----------------------testC");
        return"----------------------testC";
    }

}
