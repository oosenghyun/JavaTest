package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q110 {
	
	public static void main(String[] args) {
		
		//요구사항]파일의 경로를 입력받아 파일 정보를 출력하시오.
		//조건..
//		파일 크기 단위 변환 출력(소수이하 1자리까지) : B, KB, MB, GB, TB 1024배 차이
//		입력..
//		파일 경로 : D:\class\java\file\test.txt 
		
//		입력..
//		파일 경로 : D:\class\java\file\test.txt 
//
//		출력..
//		파일명 : test.txt 
//		종류 : txt 파일 
//		파일 크기 : 45B 
//		
		String fileName="";
		String kindOfFile="";
		String length="";
		
		File file = new File ("D:\\class\\java\\file\\test.txt"); //객체 생성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("파일경로: " );
		fileName=scan.nextLine();
		System.out.println();
		System.out.println();
		
		
		
		System.out.println("파일명: " + "파일 ");
		System.out.println(file.getName());
		
		
		System.out.print("종류: "); // 파일명의 맨 마지막 글자~.까지 출력
		System.out.println(); 
		
		if(file.length()>0&&file.length()<=1024) {
			length=file.length()+"B";	
		}else if(file.length()>1025 && file.length()<=2048){
			length=file.length()+"KB";
		}else if(file.length()>2048 && file.length()<=4096) {
			length=file.length() + "MB";
		}else if(file.length()>4096 && file.length()<=8192) {
			length=file.length() + "GB";
		}else (file.length()>8192 && file.length()<=16834){
			length=file.length() + "TB";
		
		
		System.out.print("파일 크기: " + length );
		
		
		
		
		
		
		
		
		
	}
	
	}
	
	
	

}
