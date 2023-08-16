package com.test.question;

import java.util.Scanner;

public class Q081 {
	
	public static void main(String[] args) {
		
		//요구사항] 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.
		
		/*
		 
		 
		 	입력..
			이메일: hong@gmail.com 

			출력..
			아이디: hong
			도메인: gmail.com
		 
		 
		 */
		
		String email = "";
		String id = "";
		String domain="";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이메일: ");
		email = scan.nextLine(); //이메일 베너 출력
		
		
		String[] temp =email.split("@");
		
		System.out.println("아이디: ");
		
		
		
		System.out.println("도메인: ");
		
		
		
		
		
		
		
		
		
	}

}
