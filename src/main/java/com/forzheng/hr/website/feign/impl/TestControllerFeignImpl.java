package com.forzheng.hr.website.feign.impl;

import org.springframework.stereotype.Component;

import com.forzheng.hr.website.feign.TestControllerFeign;

@Component
public class TestControllerFeignImpl implements TestControllerFeign {

	@Override
	public String getHi(String name) {
		return "请求失败";
	}

}
