package com.test.java.obj.cast;

public class Ex56_Casting {
	
	public static void main(String[] args) {
		
		
		//프린터 기기
		//-LG500
		//-HP600
		
		LG500 lg = new LG500();
		
		HP600 hp = new HP600();
		
//		lg.on();
//		hp.powerOn();
//		
//		lg.print();
//		hp.printing();
//		
//		lg.off();
//		hp.powerOff();
//		
		
		
	}//main

}


interface Printer {
	
	void print();
	void powerOn();
	void powerOff();
	
}




class LG500 implements Printer{
	
	private String type;
	private int price;
	
	public void print() {
		System.out.printf("%s 방식으로 출력합니다.\n" ,this.type);
	
	}
	public void selfTest() {
		System.out.println("자가 점검을 합니다");
	}
	@Override
	public void powerOn() {
		System.out.println("전원을 켭니다");
		
	}
	@Override
	public void powerOff() {
		System.out.println("전원을 끕니다");
		
	}
	
}


class HP600 implements Printer{
	
	private String color;
	private int price;
	
	public void print() {
		System.out.println("출력합니다");
	}
	
	public void powerOn() {
		System.out.println("전원 켜짐");
	}
	public void powerOff(){
		System.out.println("전원 꺼짐");
	}
	public void clean() {
		System.out.println("헤더를 청소합니다.");
	}

	
	
}










