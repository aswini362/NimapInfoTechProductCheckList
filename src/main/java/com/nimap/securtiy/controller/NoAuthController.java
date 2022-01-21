package com.nimap.securtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/noauth/message")
public class NoAuthController {
	@GetMapping("/securtiy/message")
	public String welcomeMsg() {
		return "Welcome to spring security";

	}
}
