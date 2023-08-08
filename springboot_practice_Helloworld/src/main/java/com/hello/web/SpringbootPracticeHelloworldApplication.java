package com.hello.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.hello.web.practice"})
@ComponentScan(basePackages = {"com.hello.web.practice"})
public class SpringbootPracticeHelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPracticeHelloworldApplication.class, args);
	}

}
