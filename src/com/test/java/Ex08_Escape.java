package com.test.java;

public class Ex08_Escape {
	
	public static void main(String[] args) {
		
		// Ex08_Escape.java
		
		// 특수 문자 > Escape Sequence
		// -컴파일러가 번역을 할 때, 소스상에 있는 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		// 1.\n
		// -new line, line feed
		// -개행 문자(엔터)
		
		char c1 = '\n'; //표현은 두글자이지만 자바는 한글자로 인식
		String s1 = "\n";
		 
		// 요구사항] "안녕하세요. 홍길동입니다." 출력해주세요.
		// 수정사항] "안녀하세요." 와 "홍길동입니다." 각각 다른 줄에 출력
		
		System.out.println("안녕하세요 홍길동입니다.");
		
		String msg= "안녕하세요.\n 홍길동입니다.";
		System.out.println(msg);
		
		// 2. \r
		// -carriage return
		// -캐럿의 위치를 현재 라인의 맨 앞으로 이동
		// -키보드 > Home 키 역할
		// -이클립스에서는 정상 동장 (x) 
		
		msg ="안녕하세요.\r홍길동님.";
	    System.out.println(msg);
	    
	    
	    // 운영체제의 엔터
	    // 1. 윈도우 : \r\n
	    // 2. 맥OS : \r
	    // 3. 리눅스 : \n
	    
	    System.out.println("하나\r\n둘");
	    System.out.println("하나\n둘");
		
	    // 3. \t
	    // -tap, 탭문자
	    // -탭 > 행동 (x) > 약속된 표시 (o)
	    // - 서식 작업(열맞추기)
	    
	    msg = "하나\t둘\t셋";
	    System.out.println(msg);
	    
	    msg = "하나 둘 셋"; // 권장 (x)
	    System.out.println(msg);
	    
	    // 4. \b
	    // backspace
	    // -이클립스 콘솔에서는 동작 안함
	    msg = "홍길동\b입니다.";
	    System.out.println(msg); 
	    
	    
	    // 5. \", \', \\
	    // -(",',\) 이미 역할을 가지고 있는 문자 > 출력하기 위해 의미없게 만드는 이스케이프 문자
	    
	    
	    // 요구사항] 홍길동: "안녕하세요"
	    msg = "홍길동: \"안녕하세요\"";
	    System.out.println(msg);
	    
	    // 요구사항] 수업 폴더의 경로를 출력하세요.
	    // C:\class\code\java
	    
	    
	    //invalid escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
	    System.out.println("수업폴더>C:\\class\\code\\java");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
