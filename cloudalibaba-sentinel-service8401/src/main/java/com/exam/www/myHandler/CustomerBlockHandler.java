package com.exam.www.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.exam.springcloud.entities.CommonResult;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2021/12/30 18:39
 **/
public class CustomerBlockHandler {

    public static CommonResult handleException1(BlockException exception) {
        return new CommonResult(444,  " 根据资源名 客户自定义限流处理逻辑 ---------1");
    }

    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(444,  "根据Url 客户自定义限流处理逻辑 ---------2");
    }
}
