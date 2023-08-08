package com.hello.web.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	 private TestMapping testMapping;

	    public TestVO test() throws Exception {
	        return testMapping.test();
	    }
}
