package com.exam.www.service;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2022/1/2 17:35
 **/
public interface StorageService {
    // 扣减库存
    void decrease(Long productId, Integer count);

}
