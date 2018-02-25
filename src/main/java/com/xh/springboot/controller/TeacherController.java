package com.xh.springboot.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.xh.springboot.service.ITeacherService;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月25日
 */
@RestController
public class TeacherController {

	
	@Resource
	private ITeacherService teacService;
}
