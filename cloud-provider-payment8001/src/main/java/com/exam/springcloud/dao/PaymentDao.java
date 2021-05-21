package com.exam.springcloud.dao;

import com.exam.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/20 1:36
 **/
@Mapper
public interface PaymentDao {

    public int create(Payment paymet);

    public Payment getPaymentById(@Param("id") Long id);

}
