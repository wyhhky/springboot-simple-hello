package com.eagle.springboot;

import com.eagle.springboot.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootSimpleHelloApplicationTests {

	@Autowired
	private HelloController helloController;

	@Test
	void contextLoads() {
		String s = helloController.sayHello();
		System.out.println("Testing Class:"+s);
	}

}
