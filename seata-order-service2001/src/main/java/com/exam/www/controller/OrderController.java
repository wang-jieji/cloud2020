package com.exam.www.controller;

import com.exam.springcloud.entities.CommonResult;
import com.exam.www.domain.Order;
import com.exam.www.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2022/1/1 19:46
 **/
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }

}
