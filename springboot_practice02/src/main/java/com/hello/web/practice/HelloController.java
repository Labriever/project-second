package com.hello.web.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@Autowired
	HelloService sv;
	/*
	 Spring Boot는 자동 구성을 제공하므로, 클래스 경로에서 컴포넌트 스캔을 자동으로 수행하여 빈을 등록합니다.
	 따라서 일반적인 경우에는 추가적인 구성이 필요하지 않습니다.
	 
	 그러나 HelloService가 다른 패키지에 있거나 컴포넌트 스캔이 다른 패키지에서 이루어지는 경우,
	 @ComponentScan 어노테이션을 사용하여 해당 패키지를 스캔하도록 지정해야 할 수도 있습니다.
	 
	 아래는 예시 코드입니다.
	
	@SpringBootApplication
	@ComponentScan(basePackages = "com.hello.web.practice") <<
	public class YourApplicationClass {
    	// ...
	}

	 
	 */
	
	@RequestMapping("hellospring")
	public String controller(Model model) throws Exception{
		model.addAttribute("hello", sv.getList());
		return "index";
	}
	
}
