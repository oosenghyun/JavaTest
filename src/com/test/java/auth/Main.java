package com.test.java.auth;

import java.util.Scanner;

import com.test.java.auth.auth.Auth;

public class Main {
	
public static void main(String[] args) {
	
	/*
	 
	 
	 콘솔 > 인증처리 > 로그인/로그아웃
	 
	 
	 
	 패키지 > 인증처리
	 
	 
	 
	 
	 파일
	 -"Main.java"
	 -"com.test.java.auth.data >"Member.java"
	 -"Auth.java"
	 -"Data.java"
	 
	 -"Member2.java" > 회원정보, 회원전용
	 -"Admin.java"  > 관리자 전용
	 
	 데이터 파일
	 -Javatest>data>member
	 
	 
	 */
	
	Data.load();
	
	boolean loop = true;
	Scanner scan = new Scanner(System.in);
	
	while(loop) {
		System.out.println("=================");
		System.out.println("     회원관리      ");
		System.out.println("=================");
		
		
		if(Auth.auth==null) {
		System.out.println("1.로그인");
		}else {
		System.out.println("2.로그아웃");
		}
		
		
		
		System.out.println("3.회원정보");
		System.out.println("4.회원전용");
		System.out.println("5.관리자전용");
		System.out.println("6.종료");
		
		String sel = scan.nextLine();
		
		if(sel.equals("1")) {
			Auth.login();
			
		}else if (sel.equals("2")) {
			Auth.logout();
			
		}else if (sel.equals("3")) {
			
		}else if (sel.equals("4")) {
			
		}else if (sel.equals("5")) {
			
		}else {
			loop=false;
		}
		
		
	}
	
	System.out.println("프로그램 종료");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
