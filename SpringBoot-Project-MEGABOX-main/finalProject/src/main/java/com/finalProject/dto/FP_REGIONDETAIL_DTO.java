package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_REGIONDETAIL_DTO {
	
	private int num;
	private String name;
	private int regionNum;
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
	public int getRegionNum() {
		return regionNum;
	}
	public void setRegionNum(int regionNum) {
		this.regionNum = regionNum;
	}
	
}
