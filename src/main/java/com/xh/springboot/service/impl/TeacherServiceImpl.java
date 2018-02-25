package com.xh.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xh.springboot.dao.ITeacherDao;
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
@Transactional(readOnly = true)
@Service
public class TeacherServiceImpl implements ITeacherService {

	@Resource
	private ITeacherDao teacDao;

	public List<Teacher> query() {
		
		return teacDao.query();
	}

	public Teacher findById(Integer paramId) {
		
		return teacDao.findById(paramId);
	}

	public int add(Teacher teac) {
		
		return teacDao.add(teac);
	}

	public int remove(Integer paramId) {
		
		return teacDao.remove(paramId);
	}

	public int edit(Teacher teac) {
		
		return teacDao.edit(teac);
	}

}
