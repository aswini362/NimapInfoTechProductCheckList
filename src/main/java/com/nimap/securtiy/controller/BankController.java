package com.nimap.securtiy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BankController {
	@GetMapping("/home")
	public String home(String msg) {
		msg = "Welcome to SBI Bank";
		return msg;
	}

	@GetMapping("/contact")
	public String contact() {
		String msg = "Thank for contact us ";
		return msg;
	}

	@GetMapping("/balance")
	public String getBalance() {
		String balance = "Your account balance 5432";
		return balance;

	}

	@GetMapping("/statment")
	public String getStatment() {
		String statment = "your update statment send it from email id";
		return statment;
	}

	@GetMapping("/loan")
	public String myLoan() {
		String msg = "Your loan is approaved by bank";
		return msg;
	}
}
