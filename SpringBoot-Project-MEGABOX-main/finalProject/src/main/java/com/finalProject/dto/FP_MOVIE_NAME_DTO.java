package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_MOVIE_NAME_DTO {

	private int num;
	private String name;
	private String tagName;
	private String hangle;
	private String s_f_n;
	private String o_f_n;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getHangle() {
		return hangle;
	}
	public void setHangle(String hangle) {
		this.hangle = hangle;
	}
	public String getS_f_n() {
		return s_f_n;
	}
	public void setS_f_n(String s_f_n) {
		this.s_f_n = s_f_n;
	}
	public String getO_f_n() {
		return o_f_n;
	}
	public void setO_f_n(String o_f_n) {
		this.o_f_n = o_f_n;
	}
	
}
