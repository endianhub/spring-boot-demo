package com.xh.springboot.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xh.springboot.DemoAplication;
import com.xh.springboot.model.Student;
import com.xh.springboot.service.IStudentService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月25日
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoAplication.class) // 指定spring-boot的启动类
public class StudentServiceTest {

	@Resource
	private IStudentService studentService;

	@Test
	public void query() {
		List<Student> list = studentService.query();
		System.out.println(list.size());
	}
}
