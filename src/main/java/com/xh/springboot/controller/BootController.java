package com.xh.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xh.springboot.model.Student;

/**
 * <p>Title: Spring Boot HelloWorld案例</p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@RestController
public class BootController {

	@RequestMapping("/getuser")
	public Student getUser() {
		Student stu = new Student();
		stu.setName("test");
		return stu;
	}
}
