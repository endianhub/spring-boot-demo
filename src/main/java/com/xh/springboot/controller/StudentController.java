package com.xh.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xh.springboot.model.Student;
import com.xh.springboot.service.IStudentService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@RestController
public class StudentController {

	@Resource
	private IStudentService stuService;

	@RequestMapping("/query")
	@ResponseBody
	public List<Student> query() {
		List<Student> list = stuService.query();
		return list;
	}

	@RequestMapping("/findById")
	@ResponseBody
	public Student findById(Integer paramId) {
		Student stu = stuService.findById(paramId);
		return stu;
	}

	@RequestMapping("/add")
	public int add() {
		Student stu = new Student();
		stu.setName("张三");
		stu.setAge(12);

		int keyId = stuService.add(stu);
		return keyId;
	}

}
