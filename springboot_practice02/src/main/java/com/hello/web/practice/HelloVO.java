package com.hello.web.practice;

import lombok.Data;

@Data
public class HelloVO {
	private String NAME;
	private String COMMENTDATE;
	private String CONTENT;
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getCOMMENTDATE() {
		return COMMENTDATE;
	}
	public void setCOMMENTDATE(String cOMMENTDATE) {
		COMMENTDATE = cOMMENTDATE;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	
	/*
SQL에서 DATE로 저장된 형식을 Java의 Value Object (VO)에서 Date로 가져오는 것과 String으로 가져오는 것의 차이점은 다음과 같습니다:

Date로 가져오는 경우:

Java의 Date 객체는 날짜와 시간 정보를 포함합니다.
SQL의 DATE 형식과 일치하는 값을 가져와서 Date 객체로 변환합니다.
Date 객체는 날짜 및 시간 연산을 수행할 수 있습니다.
예를 들어, 날짜 비교, 포맷 변경, 시간 계산 등을 수행할 수 있습니다.


String으로 가져오는 경우:

SQL의 DATE 형식을 문자열로 가져옵니다.
Java에서 문자열로 받은 데이터는 String 객체로 저장됩니다.
문자열 형태로 데이터를 다룰 수 있으며, 필요에 따라 다른 형식으로 변환할 수 있습니다.
예를 들어, SimpleDateFormat 클래스를 사용하여 문자열을 원하는 날짜 형식으로 변환할 수 있습니다.


두 가지 방식 모두 장단점이 있습니다. Date 객체를 사용하면 날짜 및 시간 연산이 쉽고 편리하지만,
복잡한 형식 변환을 필요로 할 수 있습니다.

반면, String으로 가져오면 변환 작업이 필요하지 않으며,
문자열로 다양한 처리를 수행할 수 있지만,
날짜 및 시간 연산을 수행하기 위해서는 추가적인 작업이 필요할 수 있습니다.

어떤 방식을 선택할지는 사용자의 요구사항과 데이터 처리의 특성에 따라 다를 수 있습니다.
Date 객체는 Java의 Date 및 Time API를 사용하여 다양한 날짜 및 시간 연산을 수행할 수 있으며,
String은 유연한 문자열 처리를 제공합니다.

따라서 데이터 처리 및 연산에 맞는 형식을 선택하는 것이 중요합니다.
	 */
}
