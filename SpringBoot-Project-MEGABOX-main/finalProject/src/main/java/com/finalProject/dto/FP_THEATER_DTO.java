package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_THEATER_DTO {
	
	private int num;
	private String name;
	private int regionDetailNum;
	private int totalSeat;
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
	public int getRegionDetailNum() {
		return regionDetailNum;
	}
	public void setRegionDetailNum(int regionDetailNum) {
		this.regionDetailNum = regionDetailNum;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	
}
