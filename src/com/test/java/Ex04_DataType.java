package com.test.java;

public class Ex04_DataType {
	
	public static void main(String[] args) {
		
		
		//Ex04_DataType.java
		
		//변수 생성 방법, 주의할 점
		byte kor; //변수 선언
		kor = 100;
		System.out.println(kor);
		
		
		//문장(statement)> 1개 이상의 표현식
		//문장 종결자 > ;
		
		
		byte eng;
		eng = 90;
		System.out.println(eng);
		
		byte math;
		math = 80;
		System.out.println(math);
		
		//Duplicate local variable kor
		//-같이 이름의 변수명을 2개 이상 선언 불가능
		//-변수명은 유일해야 한다.
		
		// 폴더 > 한글 사용(x)
		
		
		//변수명을 만들 때 규칙 > 모든 것의 식별자를 만들 때 규칙
		//1. 영문자 + 숫자 + '-' 만 사용한다. > 관습 + 물리
		//2. 숫자로 시작 불가능 > 물리
		//3. 예약어(키워드) 사용 불가능 ex)byte
		//4. 의미있게(*****) > 풀네임(***)
		//5. 대소문자 구분
		
		
		
		//age
		byte age;
		byte Age;
		
		
		
		byte kor1;
		byte kor_1;
		byte kor$;
		byte 국어;
		국어 = 100;
		
		//byte 1kor;
		
		//byte kor();
		
		//byte kor+;
		
		
		
		byte b1;
		
		//초기화
		
		b1 = 100;
		
		System.out.println(b1);
		
		//수정,치환
		b1 = 50; // 기존값 100을 가지고 있는 변수 b1에 새롭게 50을 대입
		
		System.out.println(b1);
		
		
		//변수(변하는 데이터) vs 상수(변하지 않는 데이터)
		// - 표현은 동일한데, 그 값이 변하는지? 안변하는지?
		//프로그래밍의 상수 > 데이터
		
		System.out.println(100); // 점수 100점 >100
		System.out.println(100); // 100
		System.out.println(100); // 100
		
		
		
		byte score;
		score = 100;
		System.out.println(score); //100
		System.out.println(score); //100>90
		System.out.println(score); //100 >80
		
		//국어 점수(100) > 화면에 출력
		kor = 100;
		System.out.println(kor);//국어 점수 출력 > 가독성 높음 > 변수명=의미
		
		System.out.println(100);//국어 점수 출력 > 가독성 낮음 > 의미(X)
		
		//프로그래밍 발전 방향 > 코드 재사용
		
		//변수 생성하기
		byte b2;
		b2 = 100;
		
		//선언 + 초기화
		byte b3 = 100;
		
		byte b4;
		byte b5;
		
		byte b6,b7 ;
		
	    byte b8,b9, b10, b11;
	    
	    byte b12 =100;
	    
	    byte x1; //현재 x좌표
	    byte y1; //현재 y좌표
	    byte y2;
	    
	    byte x3;
	    
	    
	    
	    //변수 명명법 패턴
	    //1.헝가리언 표기법
	    //2.파스칼 표기법
	    //3. 캐멀 표기법
	    //4. 스네이크 표기법
	    //5. 케밥 표기법
	    
	    //1.헝카리언 표기법
	    //식별자를 만들 때 식별자의 접두어로 자료형을 표시하는 방법
	    //-자바에서 많이 사용 안함
	    //-가끔 사용 > 인터페이스명
	    
	    byte weight; 
	    
	    byte byte_weight;
	    
	    byte byteWeight;
	    
	    byte bweight;
	    
	    byte b_weight;
	    
	    weight = 100;
	    
	    // 2. 파스칼 표기법
	    //-식별자 단어의 첫문자를 대문자 표기 + 나머지 문자는 소문자로 표기
	    //=두 개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자로 표기
	    
	    byte height;
	    byte Height; // 파스칼 표기법
	    
	   byte englishscore; // 가독성 낮음
	   
	   byte EnglishScore; // 파스칼
	   
	   
	   // 3. 캐멀 표기법
	   //-식별자 단어의 첫문자를 대문자 표기 + 나머지 문자는 소문자로 표기
	  //=두 개 이상 단어로 만든 합성어 > 모든 단어 붙임 > 각 단어의 첫문자를 대문자로 표기
	   
	 byte mathscore;
	 byte MathScore; // 파스칼
	 byte maPositionalLatitude;
	 
	
	   
	 
	//4.스네이크 표기법
	 //-전부 소문자 표기
	 //-합성어 >각 단어를 '-'로 연결
	 
	 byte english;
	 
	 //5.케밥 표시법
	 // - 전부 소문자 표기
	 // - 합성어 > 각 단어를 '-'로 연결
	 // 자바에서는 불가능 > minus연산자로 인식해서
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
