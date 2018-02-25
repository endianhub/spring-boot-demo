package com.xh.springboot.service;

import java.util.List;

import com.xh.springboot.model.Student;

/**
* <p>Title: </p>
* <p>Description: </p>
* 
* @author H.Yang
* @QQ 1033542070
* @date 2018年2月24日
*/
public abstract interface IStudentService {

	abstract List<Student> query();

	abstract Student findById(Integer paramId);

	abstract int add(Student stu);

	abstract int remove(Integer paramId);

	abstract int edit(Student stu);

}