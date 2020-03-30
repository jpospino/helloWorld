package com.jospino.springboot.app.hello.world.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "Hola mundo";
	}
}
