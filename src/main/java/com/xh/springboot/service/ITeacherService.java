package com.xh.springboot.service;

import java.util.List;

import com.xh.springboot.model.Teacher;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月25日
 */
public abstract interface ITeacherService {

	abstract List<Teacher> query();

	abstract Teacher findById(Integer paramId);

	abstract int add(Teacher teac);

	abstract int remove(Integer paramId);

	abstract int edit(Teacher teac);
}
