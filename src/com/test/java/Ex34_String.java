package com.test.java;

import java.util.Scanner;

public class Ex34_String {

public static void main(String[] args) {
	
	//Ex34_String
	
	//문자열, String
	//-JDK 제공하는 문자열 조작 기능
	
	//m1();
	//m2();
	//m3();
	//m4();
	//m5();
	//m6();
	//m7();
	//m8();
	//m9();
	//m10();
	//m11();
	//m12();
	m13();
  }

private static void m13() {
	// 문자열 분리
	//-split[] (String delimiter)
	//-구분자를 기준으로 쪼개는 메소드
	//끝날 때 구분자만 있으면 무시한다.
	
	String name = "홍길동,아무개,유재석,강호동,박명수";
	String[] temp =name.split(","); //구분자는 사라진다.
	
	for (int i =0; i < temp.length; i++) {
		System.out.println(i + ":"+ temp[i]);
	}
	
	
	
}

private static void m12() {
	// 문자열 치환(바꾸기)
	//-String replace(String old,String new)
	//문자열의 일부(old)를 다른 문자열(new)로 바꾸는 메소드
	
	String txt="안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
	
	
	int index = txt.indexOf("홍길동");
	
	String temp1 = txt.substring(0,index); //"안녕하세요."
	String temp2 = txt.substring(index+3); //"입니다."
	
	System.out.println(temp1 + "아무개" + temp2);
	
	
	
	System.out.println(txt.replace("홍길동", "아무개"));
	
	txt = "     하나     둘     셋     ";
	System.out.println(txt.trim());
	
	//***replace로 무언가를 삭제하고 싶으면 찾아서 ""로 교체하면 된다.
	System.out.println(txt.replace(" ", ""));
	
}

private static void m11() {

	//문자열 검색
	//-indexOF(), lastIndexOf()
	//-startWith(), endWith()
	
	//boolean contains(String)
	
	String txt = "안녕하세요. 홍길동입니다";
	
	System.out.println(txt.contains("홍길동"));
	System.out.println(txt.contains("아무개"));
	
}

private static void m10() {
	
	//문자열 추출
	//-String substring(int beginIndex,int endIndex)
	//-String substring(int beginIndex)
	//여러 글자를 한번에 추출
	//begintIndex : 포함(inclusive)
	//endintIndex : 미포함(exclusive)
	
	//***자바에서는 범위를 나타낼 때 > 시작(포함) ~ 끝(미포함)
	//-ex) Math.random() > 0~1사이의 난수(1미포함)
	
	String txt="가나다라마바사아자차카타파하";
	
	System.out.println(txt.substring(3,7)); //3번째에서 6번째 글자 추출
	System.out.println(txt.charAt(5)); // '바' > 문자코드값 변환O
	System.out.println(txt.substring(5,6));//"바" > 문자코드값 변환X
	System.out.println(txt.substring(3)); //3번째 부터 끝까지
	System.out.println();
	
	//주민등록번호
	String jumin = "970738-1012345";
	
	//성별?
	System.out.println(jumin.charAt(7)=='1'?"남자":"여자");
	System.out.println(jumin.substring(7,8).equals("1")?"남자":"여자"); //문자열이므로 ==쓰지 않고 equals로
	
	//몇년생?
	System.out.println(""+jumin.charAt(0) + jumin.charAt(1)); //97
	System.out.println(jumin.substring(0,2));
	
	//몇월생>
	System.out.println(jumin.substring(2,4));
	
	//몇일생?
	System.out.println(jumin.substring(4,6));
	System.out.println();
	
	String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
	
	//1. 파일명 추출 > Ex_String.java
	int index = path.lastIndexOf("\\");	
	String filename = path.substring(index + 1);
	System.out.println(filename);

	//2. 확장자 없는 파일명 추출 > Ex34_String
	index=filename.lastIndexOf(".");
	filename.substring(0,index); = filename.substring(0,index);
	System.out.println("filenameWithoutExtension");
	
	//확장자 추출 >".java>"
	
	String extension = filename.substring(index);
	System.out.println(extension);
	
	
	
	//3. 확장자 추출> "java"
 	
	
	
	
	
}

private static void m9() {
	// 패턴 검색
	//-boolean startWith(String)
	//-boolean endWith(String)
	
	String txt = "자바 프로그래밍";
	
	System.out.println(txt.startsWith("자바"));
	System.out.println(txt.startsWith("프로그래밍"));
	
	System.out.println(txt.endsWith("자바"));
	System.out.println(txt.endsWith("프로그래밍"));
	
	String name = "홍길동";
	
	System.out.println(name.startsWith("홍"));
	System.out.println(name.charAt(0) == '홍');
	System.out.println(name.indexOf('홍')==0);
	
	System.out.println(name.endsWith("동"));
	System.out.println(name.charAt(name.length()-1)=='동');
	System.out.println(name.indexOf("동")==name.length()-1);
	System.out.println();
	
	
	//파일 경로
	String path = "C:\\class\\java\\JavaTest\\Ex34_String.java";
	
	//해당 파일이 '자바 소스 파일'입니까? > 확장자 검사 (맨 끝 자바)
	if(path.endsWith(".java")) {
		System.out.println("자바 소스 파일");
	}else {
		System.out.println("다른 파일");
	}
	
	
}

private static void m8() {
	
	//대소문자 변경
	//-String toUpperCase()
	//-String toLowerCase()
	
	String content = "오늘 수업은 Java입니다.";
	String word = "java";
	
	System.out.println(content);
	System.out.println(content.toUpperCase());
	System.out.println(content.toLowerCase());
	
	//대소문자 구분(Case sensitive)
	//-정확도 높음
	//-검색율 낮음
	if(content.indexOf(word) >-1) {
		System.out.println("결과 O");
	}else {
		System.out.println("결과 X");
	}
	
	//대소문자 구분 ,X(Case insensitive)
	//-정확도 낮음
	//-검색율 높음
	if(content.toUpperCase().indexOf(word.toUpperCase()) >-1) { // 모두 대문자로 바꾼 뒤, 대문자 찾기
		System.out.println("결과 O");
	}else {
		System.out.println("결과 X");
	}
	
	
	
	
}

private static void m7() {
	
	//주민등록번호 > '-'기입
	
	String jumin = "970728-2012345";
	
	if(jumin.charAt(6)=='-') { 
		System.out.println("0");
	}else {
		System.out.println("X");
	}
	if(jumin.indexOf("-")==6) { 
		System.out.println("0");
	}else {
		System.out.println("X");
	}
	
	//게시판 글쓰기 > 관리자 > 금기어
	
	
	String word="바보";
	String content = "안녕하세요. 반값습니다~ 바보야!! 자바를 공부하고 있어요.";
	
	if (content.indexOf(word) > -1) {
		System.out.println("금지어 발견!!");
	}else {
		System.out.println("글쓰기 진행~");
	}
	
	
	String[] words = {"바보", "멍청이", "메롱","ㅂㅏㅂㅗ"};
	
	for(int i =0; i <words.length; i++) {
		if (content.indexOf(words[i]) > -1) {
			System.out.println("금지어 발견!!");
			break;
		}
		
	}
	
	
	
}

private static void m6() {
	
	//문자열 조작
	//1.int length()
	//2.char charAt(int) 
	//3.String trim()
	
	
	//문자열 검색
	//-int indexOF() > 내가 원하는 데이터가 몇번째 방에 있는지 찾을 때
	//-int indexOf(char)
	//-int indexOf(String)
	//-int indexOF(char,int)
	//-int indexOf(String,int)
	//-int last indexOf(char)
	//-int last indexOf(String)
	//-int last indexOF(char,int)
	//-int last indexOf(String,int)
	
	
	String txt = "안녕하세요. 홍길동입니다.";
	
	int index = -1;// -1로 초기화하는 이유는 indexOf 첫번 째 값인 0으로 출력되면 안되기 때문에
	              // 없는 값인 -1로 한다.
	
	index = txt.indexOf('하');
	System.out.println(index);
	
	index = txt.indexOf('홍');
	System.out.println(index);
	
	index = txt.indexOf('김');
	System.out.println(index); // 없는 값이므로 -1이 나온다.
	
	
	index = txt.indexOf("홍길동" ,0); //첫번째 문자의 위치를 반환
	System.out.println(index); 
	
	
	txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다";
//	index = txt.indexOf("홍길동"); //7-첫번째 홍길동
//	System.out.println(index);
//		
//	index = txt.indexOf("홍길동",10); //22-10번째 위치에서부터 첫번째 나오는 홍길동
//	System.out.println(index);
//	
//	index = txt.indexOf("홍길동" ,25); //25번째 위치에서부터 첫번째 나오는 홍길동
//	System.out.println(index); 
	
	index = -1;
	
	//for(int i=0; i<3; i++) {
	while(true) {
		index = txt.indexOf("홍길동" ,index);
		
		if(index == -1) {//홍길동을 못찾았니?
			break;		
		}
		System.out.println(index);
		
		index += 3;
	}
	
	txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다";
	
	//검색 방향: 왼쪽 > 오른쪽
	System.out.println(txt.indexOf("홍길동")); //7
	//검색 방향: 오른쪽 > 왼쪽
	System.out.println(txt.lastIndexOf("홍길동")); //22
	System.out.println(txt.lastIndexOf("홍길동",21));
	
	
	
 
	
}

private static void m5() {
	//공백제거
	//-String trim()
	//-문자열내의 공백(Whitespace > 스페이스, 탭, 개행)문자를 제거
	//-문자열의 시작과 끝에 존재하는 공백을 제거한다.(***)
	
	String txt = "    하나     둘     셋    ";
	
	
	//[     하나     둘     셋    ]
    //[하나     둘     셋]

	
	System.out.printf("[%s]\n",txt);
	System.out.printf("[%s]\n",txt.trim());
	
}

private static void m4() {
	
	// 주민등록번호: 970727-1000001
	
	String jumin = "970727-1000001";
	
	System.out.println(jumin.charAt(5));
	
	if(jumin.charAt(5) == '-') {
		System.out.println("올바른 주민번호");
		
		if(jumin.charAt(7)=='1'|| jumin.charAt(7)=='3') {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
	}else {
		System.out.println("올바르지 않은 주민번호");
	}
}

private static void m3() {
	
	Scanner scan = new Scanner(System.in);
	
	//요구사항] 회원 가입 > 아이디 입력> 영어 소문자만 입력
	
	System.out.println("아이디");
	String id=scan.nextLine();
	
	//아이디: hong > 'h', 'o', 'n', 'g'
	
	for(int i =0;i<id.length();i++) {
		char c = id.charAt(i);
		
		//System.out.println(c);
		
		//소문자가 아니냐?
		if (c <'a'|| c>'z') {
			System.out.println("잘못된 문자가 발견되었습니다.");
			break;
		}
	}
	System.out.println("종료");
	
	
}



private static void m2() {
	
	// 문자열 추출
	//-char charAt(int index)
	//-자바: Zero-based Index
	
	//
	
	String txt = "안녕하세요. 홍길동입니다.";
	
	//Returns the char value at the specified index. 
	//An index ranges from 0 to length() - 1. 
	
	char c=txt.charAt(3);
	System.out.println(c);
	
	c=txt.charAt(7);
	System.out.println(c);
	
	c=txt.charAt(13);
	System.out.println(c);
	
//	c=txt.charAt(14);
//	System.out.println(c);
	
	//마지막 문자
	c=txt.charAt(txt.length()-1);
	System.out.println(c);
	
	
	
	
}

private static void m1() {
	
	//문자열(String), 문자(char)
	//문자열 == 문자의 집합
	//String == char[]
	
	//문자열 조작 기능==배열 조작 기능 유사
	
	//문자열 길이
	//-int length()
	//-문자열의 글자수
	
	// 홍길동 입니다.
	char[] clist = {'홍','길','동','입','니','다'};
	System.out.println(clist.length);
	
	String str="홍길동입니다.";
	System.out.println(str.length());
	
	System.out.println("홍길동.".length());
	
	System.out.println("A1가$".length());
	
	//요구사항] 회원가입 > 이름 입력 > 이름을 2자~5자이내로 작성하시오.
	//        -유효성 검사
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("이름");
	
	String name = scan.nextLine();
	
	if(name.length()>=2&&name.length()<=5) {
		System.out.println("올바른 이름~");
	}else {
		System.out.println("이름을 2자~5자 이내로 작성하시오.");
	}
	
	
}
}
