package com.forzheng.hr.website.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.forzheng.hr.website.feign.impl.TestControllerFeignImpl;

@FeignClient(value = "${service.hr.name}", path = "/test", fallback = TestControllerFeignImpl.class)
public interface TestControllerFeign {
	
	@RequestMapping(value = "/getHi",method = RequestMethod.GET)
	public String getHi(@RequestParam("name") String name);
	
}
