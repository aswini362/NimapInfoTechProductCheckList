package com.nimap.securtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AcessDeniedController {
	@GetMapping("/403")
	public String accessDenied() {
		String msg = "AcessDenied 403";
		return msg;
	}
}
