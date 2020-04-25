package com.atguigu.gmall.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.gmall.user.mapper")
@EnableDubbo
public class GmallUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallUserServiceApplication.class, args);
	}

}