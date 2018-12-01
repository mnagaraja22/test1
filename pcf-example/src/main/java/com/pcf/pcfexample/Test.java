package com.pcf.pcfexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@RequestMapping("getdata")
	public String check() {
		return "success";
	}
}
