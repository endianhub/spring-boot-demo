package com.xh.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xh.springboot.dao.IUserDao;
import com.xh.springboot.model.User;
import com.xh.springboot.service.IUserService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	public List<User> query() {

		return userDao.query();
	}

	public User findById(Integer paramId) {

		return userDao.findById(paramId);
	}

	public int add(User user) {

		return userDao.add(user);
	}

	public int remove(Integer paramId) {

		return userDao.remove(paramId);
	}

	public int edit(User user) {

		return userDao.edit(user);
	}
}
