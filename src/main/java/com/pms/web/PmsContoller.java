package com.pms.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PmsContoller {

	
	@RequestMapping(value = "/createProject.do")
	public String userList() {
		return"abc";
	}
}
