package com.exam.www.service;

import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/29 23:48
 **/
@Component
public class PaymentFallbackHystrixService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackHystrixService fall back-paymentInfo_OK, {{{(>_<)}}}";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackHystrixService fall back-paymentInfo_TimeOut, {{{(>_<)}}}";
    }
}
