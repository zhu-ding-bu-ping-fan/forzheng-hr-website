package com.forzheng.hr.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ForzhengHrWebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ForzhengHrWebsiteApplication.class, args);
		System.out.println("forzheng-hr-website:启动完成");
	}
	
	
}
