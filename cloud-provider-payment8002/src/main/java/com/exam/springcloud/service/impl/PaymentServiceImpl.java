package com.exam.springcloud.service.impl;

import com.exam.springcloud.dao.PaymentDao;
import com.exam.springcloud.entities.Payment;
import com.exam.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/20 1:47
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }
}
