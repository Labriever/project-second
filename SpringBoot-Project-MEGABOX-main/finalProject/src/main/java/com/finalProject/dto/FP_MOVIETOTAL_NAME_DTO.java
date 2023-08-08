package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_MOVIETOTAL_NAME_DTO {
	
	private int num;
	private String movie;
	private String movieImg;
	private String playKind;
	private String region;
	private String regionDetail;
	private String theater;
	private String strDate;	
	private String startHour;
	private String startMinute;
	private String endHour;
	private String endMinute;
	private int remainSeat;
	private int totalSeat;
	private String tagName;
	private String hangle;
	private String dayOfWeek;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	public String getMovieImg() {
		return movieImg;
	}
	public void setMovieImg(String movieImg) {
		this.movieImg = movieImg;
	}
	public String getPlayKind() {
		return playKind;
	}
	public void setPlayKind(String playKind) {
		this.playKind = playKind;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getRegionDetail() {
		return regionDetail;
	}
	public void setRegionDetail(String regionDetail) {
		this.regionDetail = regionDetail;
	}
	public String getTheater() {
		return theater;
	}
	public void setTheater(String theater) {
		this.theater = theater;
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
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
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
	public String getDayOfWeek() {
		return dayOfWeek;
	}
	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}
	
	
}
