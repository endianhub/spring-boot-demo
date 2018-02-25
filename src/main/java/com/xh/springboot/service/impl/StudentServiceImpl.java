package com.xh.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.xh.springboot.dao.IStudentDao;
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
@Transactional(readOnly = true)
@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao stuDao;

	public List<Student> query() {

		return stuDao.query();
	}

	public Student findById(Integer paramId) {

		return stuDao.findById(paramId);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int add(Student stu) {

		return stuDao.add(stu);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int remove(Integer paramId) {

		return stuDao.remove(paramId);
	}

	@Transactional(readOnly = false, propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public int edit(Student stu) {

		return stuDao.edit(stu);
	}
}
