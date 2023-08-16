package com.test.java;

public class Ex05_Variable {
	public static void main(String[] args) {
		
	

	//Ex05_Variable.java
	
	//모든 자료형 (8종류) + 변수 생성하기
	
	// 빨간 밑줄 > 에러 > 컴파일 에러
	//정수 > byte(1), short(2), int(4), long(8)
	
	byte b1;
	b1 = 100;
	System.out.println(b1);
	
	//b1 = 128;
	//b1 = -129;
	
	b1 = Byte.MAX_VALUE;
	System.out.println(b1);
	
	b1 = Byte.MIN_VALUE;
	System.out.println(b1);
	
	short s1;
	s1= 128;
	
	int n1;
	n1 = 1000000;
	System.out.println(n1);
	
	n1 = Integer.MAX_VALUE;
	System.out.println(n1);
	
	
	long l1;
	l1 = 100;
	System.out.println(l1);
	
	l1 = 100000000;
	System.out.println(l1);
	
	//The literal 30000000000 of type is out
	l1 = 3000000000L;
	System.out.println(l1);
			
	
	l1=Long.MAX_VALUE;
	System.out.println(l1);
	
	//1.변수
	//2.상수
	// a. 이름이 있는 상수 > final 변수 > 변수명 > 대문자로만 작성 > Constant
	// b. 이름이 없는 상수 > 순수 데이터 > 리터럴(Literal)
	
	System.out.println(100); //정수형 리터럴
	
	final byte KOR = 100;
	
	//The final local variable kor cannot be assigned. 
	//kor = 90; // 수정 가능
	
	
	//LValue(변수) = RValue(상수,변수)
	//************* LValue는 자료형이 동일해야 한다.
	b1 = 10; // byte
	s1 = 10; // short
	n1 = 10; // int
	l1 = 10; // long
	
	
	int n2;
	n2 = 10;
	
	
	//*** 정수형 상수가 int 일까?
	//-운영 체제 + CPU
	//-운영 체제가 한번에 처리하는 데이터의 양이 int 자료형이 된다.
	
	// 운영 체제 
	//-8bit 운영체제 > int > 1byte
	//-16bit 운영체제 > int > 2byte
	//-32bit 운영체제 > int >3byte
	//-64bit 운영체제 > int > 8byte(x) > 4byte(o)
	
	
	
	//--------------------------------------------------------------------
	//실수
	//-실수형 리터럴은 자료형? double
	
	//단정도형
	float f1; 
	f1 = 3.14F; //Type mismatch: cannot convert from double to float
	System.out.println(f1);
	
	//배정도형
	double d1;
	d1 = 6.28D;
	System.out.println(d1);
	
	
	
	f1 = 123.123456789012345678901234567890F;
	d1 = 123.123456789012345678901234567890D;
	
	System.out.println(f1);
	System.out.println(d1);
	
	f1 = 123456789012345678901234567890F;
    d1 = 123456789012345678901234567890D;
    
    
    System.out.println(f1);
    System.out.println(d1);
    
    
    double d2 = 0.25;
    System.out.println(d2);
    
    double d3 = 0.1;
    System.out.println(d3);
    
    System.out.println(0.1 + 0.2);
    
    
    //정수형 > 4가지 > int(주력), long(가끔)
    //실수형 > 2가지 > double(주력)
    
	
	//---------------------------------------------------------------
    
    //문자형
    char c1;
    c1 = 'A'; //A cannot be resolved to a variable > 문자 리터럴
    System.out.println(c1);
	
	c1 = '가';
	System.out.println(c1);
	c1 = '1';// 숫자 1과 믄지 1은 똑같지 않다.
	System.out.println(c1); // 문자코드값49
	
	int n = 1; // 0000 0000 0000 0000 0000 0000 0000 0001
	
	//invaild character constant
	//c1 = '홍길동'

	char name1 = '홍';
	char name2 = '길';
	char name3 = '동';
	
	
	
	//---------------------------------------------------
	//논리형
	//boolean  flag;
	/*flag ="논리형 상수(리터널)";
      flag = true;
      flag = false;*/
	
	//***********************************************************//

    
    //참조형
    //-String
    //-문자 열 > 문자들이 열을 지어있는 형태 > 문자 집합 > char가 여러 개.
    
    String name;
	
	//name = "홍길동"; 문자형 상수(리터널) 표기법
	
	
	//String nick(" "); 반문자열, Empty String
	
	
	//연산자 일부
	//-대입 연산자
	//-산술 연산자
	
	int a1 = 10;
	int a2 = 20;
	int a3 = a1 + a2; // 산술연산자

			
	System.out.println(a3);
	String t1 = "홍";
	String t2 = "길동";
    String t3 = t1 + t2; // 산술 연산자 (x) > 문자열 연산자 (o) 
    
    //요구사항 숫자 2개를 연산과정과 함께 출력히시오
    
    a1 = 10;
	a2 = 20;
	a3 = a1 + a2;
	
	System.out.println("10+20=30");
	System.out.println(a1+" + " +a2 + "=" +(a1+a2));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
}
