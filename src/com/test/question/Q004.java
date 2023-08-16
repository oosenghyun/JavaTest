package com.test.question;

import java.util.Scanner;

public class Q004 {
	public static void main(String[] args) {
		
	 //Q004.java
		
	/*
	 
	 요구사항]
	 -기어비 1:1->페달 1회전 == 자전거 바퀴 1회전
	 -모든 출력 숫자는 천단위 표기하시오
	 
	 */
		
		Scanner scan = new Scanner(System.in);
		
		int turn = 0;
		double circumference = 0;
		double distance = 0;
		
		System.out.println("사용자가 페달을 밟은 횟수: ");
		turn=scan.nextInt();
		
		circumference = 26 * 3.14 * 0.0254;
		
		distance = circumference * turn;
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %.3fm를 달렸습니다\n",turn,distance);
				
		
		
		
	
	}

}
