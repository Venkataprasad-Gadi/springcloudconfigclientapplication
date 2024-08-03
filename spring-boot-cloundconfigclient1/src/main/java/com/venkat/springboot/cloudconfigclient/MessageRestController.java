package com.venkat.springboot.cloudconfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	@Autowired
	private Environment environment;

	@Value("${message:Hello Default Message}")
	private String message;

	@RequestMapping("/message")
	public String getMessage() {
		return this.message;
	}

	@RequestMapping("/message2")
	public String getMessage2() {
		String message2 = environment.getProperty("message2");
		return message2;
	}

}
