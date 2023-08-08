package com.hello.web.practice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	@Autowired
	private HelloMapping dao;
	
	public List<HelloVO> getList() throws Exception{
		return dao.SameNamegetLists();
	}
	
}
