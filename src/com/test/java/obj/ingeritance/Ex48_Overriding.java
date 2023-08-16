package com.test.java.obj.ingeritance;

import java.sql.Date;

public class Ex48_Overriding {
	
	public static void main(String[] args) {
		
		
		// 대중적인 오버라이드
		
		
		Time t1 = new Time (2,30);
		
		
		System.out.println(t1);
		
		//String java.lang.Object.toString()
		System.out.println(t1.toString()); 
		System.out.println(t1.info());
		
		
		Date now = new Date();
		
		System.out.println(now);
		System.out.println(now.toString());
		
	}





	
	private int hour;
	private int minute;
	
	
	public Time(int hour, int minute) {
		this.hour=hour;
		this.minute=minute;
	}
	
	//덤프
	public String info() {
		
		return this.hour + ":" + this.minute;
	}
	
	@Override //어노테이션(Annotation)
	public String toString() {
		return this.hour + ":" + this.minute;
	}
	
	
}










