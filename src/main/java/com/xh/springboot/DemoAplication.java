package com.xh.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Title: Spring Boot应用启动类</p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@SpringBootApplication
@MapperScan("com.xh.springboot.dao")
public class DemoAplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAplication.class, args);
	}
}
