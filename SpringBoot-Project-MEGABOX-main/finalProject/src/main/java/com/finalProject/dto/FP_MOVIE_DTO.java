package com.finalProject.dto;

import lombok.Data;

@Data
public class FP_MOVIE_DTO {

	private int num;
	private String name;
	private int vcNum;
	private String s_f_n;
	private String o_f_n;
	private String director;
	private String actress;
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
	public int getVcNum() {
		return vcNum;
	}
	public void setVcNum(int vcNum) {
		this.vcNum = vcNum;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	
}
