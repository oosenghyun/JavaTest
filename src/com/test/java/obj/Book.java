package com.test.java.obj;

public class Book {
	
	//접근 지정자 > 가이드 라인
	//1. 멤버 변수는 무조건 private을 사용한다.
	//2.Getter/Setter를 구현한다.
	
//	public String title;
//	public String author;
//	public String publisher;
//	public int price;
//	public int page;
	
	private String title;
	private String author;
	private String publisher;
	private int price;
	private int page;
	
	public void aaa( String a) {
		title = a;
	}


	public void bbb(int b) {
		if(b>=0&& b<=100000) {
		price = b;
	   }else{
		System.out.println("올바른 책가격이 아닙니다.");
	}

	}

public int ccc() {
return price;}


//Setter/Getter > 객체 내외부를 연결하는 통로
//				>인터페이스 역할
//				>프로퍼티<property>


//책 제목
//Setter
//1.set멤버변수명
//2.void
public void setTitle(String title ) {
	
	//멤버변수=매개변수
	//title=title;

	//title? > 무조건 누군가를 가리킨다. (이미 정해져있음)
				
				
	//*****영역이 큰 영역이 작은 요소가 충돌하면, 반드시 작은 영역의 요소를 우선한다. >대부분 프로그래밍 환경에서 적용
	
				
    //멤버 변수 > 클래스 전역 > title
	//지역 변수 > 메소드 전역 > title
				
	//대한민국 > 홍길동
	//역삼동 > 홍길동
	
	
	//this 연산자
	//-객체 접근 연산자
	//-'나' > 객체 자기 자신을 가리키는 표현(예약어)
	this.title=title;
}

//Getter
// 1.get 멤버변수명
// 2.return
public String getTitle() {
	
	return this.title;
}


public String getPublisher() {
	return publisher;
}


public String getAuthor() {
	return author;
}


}



}







