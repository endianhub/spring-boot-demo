package com.xh.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping("/query")
	@ResponseBody
	public List<User> query() {
		List<User> list = userService.query();
		return list;
	}

	@RequestMapping("/findById")
	@ResponseBody
	public User findById(Integer paramId) {
		User user = userService.findById(paramId);
		return user;
	}

	@RequestMapping("/add")
	public int add() {
		User user = new User();
		user.setName("张三");
		user.setAge(12);

		int keyId = userService.add(user);
		return keyId;
	}

}
