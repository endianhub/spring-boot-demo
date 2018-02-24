package com.xh.springboot.dao;

import java.util.List;

import com.xh.springboot.model.User;

/**
* <p>Title: </p>
* <p>Description: </p>
* 
* @author H.Yang
* @QQ 1033542070
* @date 2018年2月24日
*/
public abstract interface IUserDao {

	abstract List<User> query();

	abstract User findById(Integer paramId);

	abstract int add(User user);

	abstract int remove(Integer paramId);

	abstract int edit(User user);
}
