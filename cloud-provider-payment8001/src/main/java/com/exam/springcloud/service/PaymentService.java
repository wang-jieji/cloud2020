package com.exam.springcloud.service;

import com.exam.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/20 1:46
 **/

public interface PaymentService {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取
}

