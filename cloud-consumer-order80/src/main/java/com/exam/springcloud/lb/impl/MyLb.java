package com.exam.springcloud.lb.impl;

import com.exam.springcloud.lb.MyLoadBalancer;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/5/27 2:43
 **/
@Component
public class MyLb implements MyLoadBalancer {

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private final int getAndIncrement(){
        int current;
        int next;
        do{
            current = this.atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1 ;
        }while (!this.atomicInteger.compareAndSet(current,next));
        System.out.println("*******第几次访问，次数next: "+next);
        return next;
    }

    @Override
    public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
         int index = getAndIncrement() % serviceInstances.size();
        return serviceInstances.get(index);
    }
}
