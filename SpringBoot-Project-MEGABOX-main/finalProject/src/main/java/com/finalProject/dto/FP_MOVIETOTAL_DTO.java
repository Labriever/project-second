package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_MOVIETOTAL_DTO {
	
	private int num;
	private int movieNum;
	private int pkNum;
	private int regionNum;
	private int rdNum;
	private int theaterNum;
	private String strDate;
	private String startHour;
	private String startMinute;
	private String endHour;
	private String endMinute;
	private int remainSeat;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getMovieNum() {
		return movieNum;
	}
	public void setMovieNum(int movieNum) {
		this.movieNum = movieNum;
	}
	public int getPkNum() {
		return pkNum;
	}
	public void setPkNum(int pkNum) {
		this.pkNum = pkNum;
	}
	public int getRegionNum() {
		return regionNum;
	}
	public void setRegionNum(int regionNum) {
		this.regionNum = regionNum;
	}
	public int getRdNum() {
		return rdNum;
	}
	public void setRdNum(int rdNum) {
		this.rdNum = rdNum;
	}
	public int getTheaterNum() {
		return theaterNum;
	}
	public void setTheaterNum(int theaterNum) {
		this.theaterNum = theaterNum;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStartHour() {
		return startHour;
	}
	public void setStartHour(String startHour) {
		this.startHour = startHour;
	}
	public String getStartMinute() {
		return startMinute;
	}
	public void setStartMinute(String startMinute) {
		this.startMinute = startMinute;
	}
	public String getEndHour() {
		return endHour;
	}
	public void setEndHour(String endHour) {
		this.endHour = endHour;
	}
	public String getEndMinute() {
		return endMinute;
	}
	public void setEndMinute(String endMinute) {
		this.endMinute = endMinute;
	}
	public int getRemainSeat() {
		return remainSeat;
	}
	public void setRemainSeat(int remainSeat) {
		this.remainSeat = remainSeat;
	}
	
	
}
