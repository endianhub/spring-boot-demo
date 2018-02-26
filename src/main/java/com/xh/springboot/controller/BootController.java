package com.xh.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Title: Spring Boot HelloWorld案例</p>
 * <p>Description: </p>
 * 
 * @author H.Yang
 * @QQ 1033542070
 * @date 2018年2月24日
 */
@Controller
public class BootController {

	@RequestMapping("/hello")
	public String hello() {
		
		return "hello";
	}
}
