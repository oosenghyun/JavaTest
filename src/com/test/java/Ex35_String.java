package com.test.java;

public class Ex35_String {
	
	public static void main(String[] args) {
		/*
		 
		 문자열 
		 -물리적으로는 참조형이지만, 약간의 값형의 성질을 가진다.
		 -박쥐 
		 
		 1. 메모리의 공간은 한번 할당되면 더 이상 늘리거나 줄일 수 없다.
		 2. 문자열은 불변(Immutable)이다. > 한번 만들어진 문자열은 절대 수장할 수 없다 (면접)
		 3. 문자열은 참조형이다
		 
		 
		 
		 */
		
		//m1();
		//m2();
		m3();
		
		
		
		
		
		
	}

	private static void m3() {
		//String vs StringBuilder
		//-문자열 클래스
		
		String s1 = "홍길동"; // 문자 리터럴 사용
		String s2 = new String ("홍길동");
		
		//StringBuilder s3 = "홍길동";
		StringBuilder s3 = new StringBuilder("홍길동");
		
		System.out.println(s1);
		System.out.println(s3);
		
		System.out.println(s1.length());
		System.out.println(s3.length());
		
		//StringBuilder > 수정 작업에 강하다.
		
		long begin = System.nanoTime();
		
		//작업 > String
		String txt1 = "홍길동";
		
		for (int i =0; i<100000; i++) {
			txt1 = txt1+"."; // 수정작업
		}
		
		long end = System.nanoTime();
		System.out.println(txt1.length());
		System.out.println(end - begin +"ns"); //2.4초
		
		
		 begin = System.nanoTime();
		StringBuilder txt2 = new StringBuilder("홍길동");
		
		for (int i =0; i<100000; i++ ) {
			txt2.append("."); //txt2 + "."
		}
		
		 end = System.nanoTime();
		System.out.println(end - begin +"ns"); 
		
		
		
	}

	private static void m2() {
		
		
		//문자열은 불변이다 > 되도록 하지 말아야하는 행동
		//1.문자열의 잦은 수정 > 메모리 차지를 불필요하게 많이 하게 된다.
		//2.커다란 문자열의 수정
		
		String txt1 = "홍길동";
		
		for(int i = 0; i< 100; i++) {
			txt1=txt1 + "님"; // 수정
		}
		
		
		System.out.println(txt1);
		
		
		txt1 = "홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.홍길동입니다.";
		
		txt1=txt1 + "!";
		
		
		
		
	}

	private static void m1() {
		
		//모든 값형은 어떤 데이터를 넣더라도 공간의 크기가 불변이다.
		int n1 =10;			//4byte
		int n2 =2000000000; //4byte
		
		//하나의 메소드안에서 선언된 상수는 같이 사용된다.
		String s1 = "홍길동";
		String s2 = "안녕하세요. 홍길동입니다.";
		String s3 = "홍길동";
		String s4 = "홍";
		s4 = s4 + "길동";
		
		//문자열을 재사용 할 수 있는 경우는 리터럴이 같을 때
		System.out.println(s1 == s3); // 절대 사용 금지! , 주소값이 같다 
		System.out.println(s1 == s4); //false
		
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1.equals(s4)); //true
		
		s1 = s1 +"님"; //홍길동 > 홍길동님
		System.out.println(s1);
		System.out.println(s3); //원래 s1이 바꿔지만 s3도 바꿔지지만 문자열은 그렇지 않다.
		                        //메모리에 "홍길동님" 을 새로 만든다.
		
		
		// = 같은 연산말고 , equals로 문자열을 비교한다.
		//문자열이 많으면 곧이곧대로 메모리 공간을 많이 차지한다. 그러므로 메모리를 아끼려고 같은 값이면 재사용 한다.
		
	}

}
