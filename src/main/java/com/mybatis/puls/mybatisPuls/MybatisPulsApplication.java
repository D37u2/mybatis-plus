package com.mybatis.puls.mybatisPuls;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mybatis.puls.mybatisPuls.mapper")
public class MybatisPulsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPulsApplication.class, args);
	}

}
