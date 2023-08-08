package com.hello.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HomeController { //RestController에서는 jsp파일이나 html파일이 아닌, return한 문자가 그대로 화면에 출력된다.

	@GetMapping("/helloworld")
	public String hello() {
		return"Hello, World!";
	}
	
}