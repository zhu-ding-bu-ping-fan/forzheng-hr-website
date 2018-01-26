package com.forzheng.hr.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.forzheng.hr.website.feign.TestControllerFeign;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	TestControllerFeign testControllerFeign;
	
	@RequestMapping(value = "/getHi")
	@ResponseBody
	public String getHi(String name){
		return testControllerFeign.getHi(name);
	}
}
