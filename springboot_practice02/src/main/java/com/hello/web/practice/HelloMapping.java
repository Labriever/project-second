package com.hello.web.practice;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HelloMapping {
	List<HelloVO> SameNamegetLists() throws Exception;
}
