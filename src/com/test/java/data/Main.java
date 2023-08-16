package com.test.java.data;

import java.util.Scanner;

public class Main {
	/*
	 성적관리 프로그램
	 
	 -패키지 > "com.test.java.data"
	 
	 -파일
	 	-"Main.java" > 메인 > 전체 컨트롤
	 	-"Student.java" > 학생 1명 정보  > 상자
	 	-"Data.java" > 데이터 담당 > student.txt 담당(입출력)
	 	-"View.java" > 출력담당
	 	-"Servise.java" > 업무 담당 
	 	
	 	-데이터파일
	 	-JavaTest > data > "student.txt"
	
	 
	 */
	
	Data.load();
	
	Scanner scan = new Scanner(System.in);
	
	boolean loop =true;
	
	while(loop) {
		
		
		String se1=scan.nextLine();
		if(se1.equals("1")) {
			Service.add();
		}else if (se1.equals("2")) {
			Service.list();
		}else if (se1.equals("3")) {
			Service.delete();
		}else {
			loop=false;
		}
	}
	
	System.out.println("프로그램 종료");
	
	Data.save();
	
}//main


}
