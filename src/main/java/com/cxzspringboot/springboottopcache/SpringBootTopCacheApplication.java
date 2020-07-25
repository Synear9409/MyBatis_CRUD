package com.cxzspringboot.springboottopcache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * MapperScan：为Dao包下的所有接口 生成相应的接口实现类
 */
@MapperScan("com.cxzspringboot.springboottopcache.Dao")
@SpringBootApplication
@EnableCaching
public class SpringBootTopCacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootTopCacheApplication.class, args);
    }

}
