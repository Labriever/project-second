package com.finalProject.dto;

import lombok.Data;

// lombok 사용해서 getter/setter 생략 ->pom.xml에 작성(lib추가)
@Data
public class MovieListDTO {
	
	private int num;
	private String name;
	private String S_F_N;
	private String O_F_N;
	private String director;
	private String actress;
	private String vcnum;
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
	public String getS_F_N() {
		return S_F_N;
	}
	public void setS_F_N(String s_F_N) {
		S_F_N = s_F_N;
	}
	public String getO_F_N() {
		return O_F_N;
	}
	public void setO_F_N(String o_F_N) {
		O_F_N = o_F_N;
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
	public String getVcnum() {
		return vcnum;
	}
	public void setVcnum(String vcnum) {
		this.vcnum = vcnum;
	}
	
}