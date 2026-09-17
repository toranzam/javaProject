package com.spring_boot_mybatis_ex.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring_boot_mybatis_ex.project.dao")
public class SpringBootMybatisExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMybatisExApplication.class, args);
	}

}
