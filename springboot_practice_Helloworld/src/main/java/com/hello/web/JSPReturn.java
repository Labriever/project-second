package com.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSPReturn {
	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	@RequestMapping("jsontext")
	public String json() {
		return "json";
	}
	@RequestMapping("HelloJSON")
	public String dbjson() {
		return "helloJSON";
	}
}
