package com.test.java.obj.ingeritance;

public class Ex53_interface {
	
	public static void main(String[] args) {
		
		Mxkeys keyboard = new Mxkeys();
		
		keyboard.powerOn();
		keyboard.keyDown('A');
		System.out.println(keyboard.checkBatter());
		keyboard.powerOff();
		
		
	}

}

//Keyboard는 객체를 생성할 수 없다 > 실체화할 수 없다 >
interface Keyboard{

	//키보드로서 갖추어야할 행동들 정의 선언부(o) ,구현부(x) > 호출 사용법
	 void KeyDown(char c);
	 void powerOn();
	 void powerOff();
	 void checkBatter();	
	 int checkbatter();
	 //static 못붙인다
}

class Mxkeys implements Keyboard{

	@Override
	public void KeyDown(char c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkBatter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int checkbatter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}







