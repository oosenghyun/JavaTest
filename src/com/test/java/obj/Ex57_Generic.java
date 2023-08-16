package com.test.java.obj;

public class Ex57_Generic {
	
	public static void main(String[] args) {
		
		//클래스 
		//1.클래스
		//2.인터페이스
		//3.추상클래스
		//4.enum
		//5.제네릭 클래스
		
		//요구사항] 클래스 설계
		//1.멤버 변수 선언 > int
		//2.멤버 변수를 중심으로 여러가지 행동을 하는 메소드 선언
		
		//추가사항] String 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사하] boolean 중심으로 하는 클래스 설계 + 나머지 업무는 동일
		//추가사항] +...
		
		//위의 문제점 > 해결방안
		//1. object 클래스 > 오래된 방식 ~ 현재 방식
		//2. 제네릭 클래스 > 최신 방식(2014) ~ 현재 방식
		
		
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1.toString());
		System.out.println(n1.getDate()*2);
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1.toString());
		System.out.println(s1.getData().length());
		System.out.println();
		
		
		WrapperBoolean b1  = new WrapperBoolean(true);
		System.out.println(b1.toString());
		System.out.println(b1.getData( ? "참" : "거짓"));
		System.out.println();
		
		//***절대 > 값형과 참조형간에 형변환 불가능!
		
		//Object 변수 == 만능 주머니 (모든 자료형을 담을 수 있는 변수)
		Object o1 = new Object();
		Object o2 = new Hong(); // 업캐스팅
		Object o3 = new Scanner(System.in);
		Object o4 = new WrapperInt(100);
		Object o5 = "홍길동";
		//---------------------------
		 //박싱 (Boxing) > 오토박싱
		Object o6 =10; // = new Integer(10); 값형을 참조형으로 바꾼다.
		Object o7 = "true";
		
		
		System.out.println(o6*2); 
		System.out.println((Integer)o6 * 2 ); // 언박싱(UnBoxing)
		System.out.println((int)o6); 
		
		Integer num = new Ingteger(num);
		System.out.println(num+100);
		
		
		((Scanner)o3).nextLine();
		
		((Scanner)o4).nextLine();
		
		
		
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3.toString());
		System.out.println();
		System.out.println();
		
		 
		Wrapper<String> s3 = new Wrapper<String>("이순신");
		System.out.println(s3.toString());
		System.out.println(s3.getData());
		
		
	}//main

}

class WrapperInt{
	
	private int data; //1.클래스의 중심
	
	//2.data 중심 > 행동
	public WrapperInt(int data) {
		this.date=date;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public String toString() {
		
	}
}



class WrapperString{
	
	private int date; //1.클래스의 중심
	
	//2.data 중심 > 행동
	public WrapperString (String data) {
		this.date=date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}
	
	public String toString() {
		return "[data=" + data + "]"
	}
}
class WrapperBoolean{
	
	private int data; //1.클래스의 중심
	
	//2.data 중심 > 행동
	public WrapperBoolean(int data) {
		this.data=data;
	}

	public boolean getDate() {
		return data;
	}

	public void setDate(boolean date) {
		this.data = data;
	}
	
	public String toString() {
		
	}
}


class WrapperObject{
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	

}

class Wrapper <T>{
	
	private T data;
	
	public Wrapper(T a) {
		this.data=data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Wrapper [data=").append(data).append("]");
		return builder.toString();
	}
	
}











