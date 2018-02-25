package com.xh.springboot.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.xh.springboot.DemoAplication;
import com.xh.springboot.model.Teacher;
import com.xh.springboot.service.ITeacherService;

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
public class TeacherServiceTest {

	@Resource
	private ITeacherService teacherService;

	@Test
	public void query() {
		List<Teacher> list = teacherService.query();
		System.out.println(list.size());
	}

}
