package com.exam.www.service.Impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.exam.www.service.IOrderService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/12/12 20:52
 **/
@Service
public class IOrderServiceImpl implements IOrderService {
    @Override
    @SentinelResource(value = "getUser")
    public String getUser() {
        return "查询用户";
    }
}
