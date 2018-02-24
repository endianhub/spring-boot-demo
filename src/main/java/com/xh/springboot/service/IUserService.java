package com.xh.springboot.service;

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
public interface IUserService {

	List<User> query();

	User findById(Integer paramId);

	int add(User user);

	int remove(Integer paramId);

	int edit(User user);

}