package com.github.rafaritter44.cloud_native.jenkins.hello.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.context.ApplicationContext;

import com.github.rafaritter44.cloud_native.jenkins.hello.context.AppContextSingleton;
import com.github.rafaritter44.cloud_native.jenkins.hello.service.HelloService;

@Path("/hello")
public class HelloController {
	
	private ApplicationContext context = AppContextSingleton.getInstance();
	
	@GET
	@Path("/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloTo(@PathParam("name") String name) {
		return context.getBean(HelloService.class).sayHelloTo(name);
	}
	
}
