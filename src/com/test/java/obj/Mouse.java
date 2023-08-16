package com.test.java.obj;

import java.util.Calendar;

public class Mouse {
	
	
	private String model="M310";
	private int price=30000;
	private String color="white";
	private Calendar date;//마우스 제조 날짜
	
	
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}

	
	
	//계산된 프로퍼티 > getter와 setter은 기본적으로 private 멤버 변수를 조작하지만 ,그게 필수는 아니다.
	//> 멤버 변수와 무관한 getter와 setter를 만들기도 한다.
	public String getState() {
		
		if(this.date.get(Calendar.YEAR)<=2021) {
			return "구형";
		}else {
			return "신형";
		}
	}
	
	public void setDate(int year, int mouth, int date) {
		
		
		Calendar c= Calendar.getInstance();
		c.set(year, mouth-1,date);
		this.date=c;
	}
	
	public String getDate() {
		//System.out.printf("%tF",this.date); //출력 > 자바 콘솔 수업
		
		return String.format("%tF",this.date); // 반환 > 모든 분야 사용
	}
	

}
