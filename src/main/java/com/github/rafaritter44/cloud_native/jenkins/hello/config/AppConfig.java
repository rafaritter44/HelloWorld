package com.github.rafaritter44.cloud_native.jenkins.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.github.rafaritter44.cloud_native.jenkins.hello.service.HelloService;

@Configuration
@ComponentScan(basePackages = "com.github.rafaritter44.cloud_native.jenkins.hello.service")
public class AppConfig {
	
	@Bean
	public HelloService helloService() {
		return new HelloService();
	}
	
}
