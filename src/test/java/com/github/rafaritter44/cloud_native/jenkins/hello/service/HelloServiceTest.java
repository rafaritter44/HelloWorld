package com.github.rafaritter44.cloud_native.jenkins.hello.service;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloServiceTest {

	private HelloService helloService;
	
	@Before
	public void setUp() {
		helloService = new HelloService();
	}
	
	@Test
	public void sayHelloTo() {
		assertEquals(helloService.sayHelloTo("Tester"), "Hello, Tester!");
	}

}
