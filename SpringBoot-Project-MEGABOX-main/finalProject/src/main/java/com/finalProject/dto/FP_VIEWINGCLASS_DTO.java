package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_VIEWINGCLASS_DTO {

	private int num;
	private String tagName;
	private String hangle;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	
}
