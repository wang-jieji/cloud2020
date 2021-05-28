package com.exam.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/27 2:38
 **/
public interface MyLoadBalancer {

    //收集服务器总共有多少台能够提供服务的机器，并放到list里面
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
