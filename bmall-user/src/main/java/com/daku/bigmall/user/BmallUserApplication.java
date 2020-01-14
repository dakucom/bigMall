package com.daku.bigmall.user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan(basePackages = "com.daku.bigmall.user.mapper")
public class BmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmallUserApplication.class, args);
    }

}
