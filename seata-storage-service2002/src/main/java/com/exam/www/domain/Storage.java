package com.exam.www.domain;

import lombok.Data;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2022/1/2 17:34
 **/
@Data
public class Storage {
    private Long id;

    // 产品id
    private Long productId;

    //总库存
    private Integer total;


    //已用库存
    private Integer used;


    //剩余库存
    private Integer residue;

}
