package com.mytoshika.auth.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/api/auth")
public class AuthController {

	@GetMapping(value = "/refresh/token") 
	public String getRefreshToken() {

		System.out.println("token api is called....!");
		return "token generated";
	}

}
