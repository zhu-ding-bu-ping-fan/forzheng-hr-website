package com.forzheng.hr.website.controller.frame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.forzheng.hr.website.controller.BaseController;

@Controller
@RequestMapping("/main")
public class MainController extends BaseController{
	
	@RequestMapping("/")
	public String home(){
		return "frame/main";
	}
}
