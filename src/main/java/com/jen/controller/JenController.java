package com.jen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenController {
	
	@GetMapping(value = "/getMessage")
	public String getMessage() {
		return "Helloooo";
	}

}
