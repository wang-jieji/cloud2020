package com.exam.www.service;

import com.exam.springcloud.entities.CommonResult;
import com.exam.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/12/30 21:26
 **/
@Component
public class PaymentFallbackService implements PaymentService {

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
