package com.test.question;

import java.util.Scanner;

public class Q080 {

	public static void main(String[] args) {
		
		//StringAt이나 Substring 이용
		//요구사항]문장을 입력받아 역순으로 출력하시오.
//		입력..
//		문장 입력 : 가나다 
//
//		출력..
//		역순 결과 : "다나가"
		
//		입력..
//		문장 입력 : 안녕하세요. 홍길동입니다. 
//
//		출력..
//		역순 결과 : ".다니입동길홍 .요세하녕안"
		
		String txt = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문장 입력: ");
		txt = scan.nextLine();
		
		//"가나다" -> 입력
		
	System.out.println(txt.length());
		
		System.out.println("역순 결과: ");
		for (int i=txt.length()-1; i>=0;i--) {//i = 3,2,1 역순서
			//숫자2 출력 >  >숫자 1 출력> ...
			System.out.print(txt.charAt(i)); // 숫자를 문자로 반환해준다
			//숫자로 나온 값을 txt에 맞게 문자열로 반환 >다 > 나 >가
			
		
	

	}
}
