package com.exam.www.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description TODO
 * @Author WJJ
 * @Date 2022/1/1 22:24
 **/
@Configuration
@MapperScan({"com.exam.www.dao"})
public class MyBatisConfig {
}
