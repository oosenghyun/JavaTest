package com.test.java;

import java.util.Scanner;

public class Ex30_for {

	public static void main(String[] args) {
		
		//Ex30_for.java
		
		//m1();
		
		//m2();
		
		//m3();
		
		//m4();
		
		m5();
		
		//다중 반복문 > 단일 반복문
		
		//Q39();
		
		
	}
	
	private static void m5() {
	
		//별찍기(5x5)
		
		int n=1;
		
		for(int i =0; i<5; i++) {//행만들기
			for(int j=0;j<5; j++) {
				
				System.out.print("*");
				
				//System.out.printf("%3d",n);
				//n++;
			}
			System.out.println();
		}
		System.out.println();
	
	
	for(int i =0; i<5; i++) {//행만들기
		for(int j=i ;j<5; j++) {
			//0으로 시작> 0~5: 별 5개
			//1로 시작 > 1~4: 별 4개
			
			System.out.print("*");
			
			//System.out.printf("%3d",n);
			//n++;
		}
		System.out.println();
	}
	System.out.println();
	
	
	for(int i =0; i<5; i++) {//행만들기
		for(int j=0; j<=i; j++) { //0~0 > 0~2 >0~3
			
			System.out.print("*");
			
			//System.out.printf("%3d",n);
			//n++;
		}
		System.out.println();
	}
	System.out.println();
}


	private static void Q39() {
		
		Scanner scan = new Scanner(System.in);
		int sum =0; //누적변수
		
		int begin=0, end=0;
		
		System.out.println("시작 숫자: ");
		begin = scan.nextInt();
		
		System.out.println("종료 숫자: ");
		end = scan.nextInt();
		
		for (int i=begin; i<=end; i++) {
			
			sum+=i;
			
			//System.out.printf("%d +",i);
			
			if(i!=end) {
				System.out.printf("%d +",i);
			}else {
				System.out.print(i);
			}
			
		}
		
		
		
		
	}

	private static void m4() {
		
		//루프 > 분기문 개입(break, continue)
		for (int i =0; i<10; i++) {
			
			for(int j=0; j<10; j++) {
				
				//if(i==5){
				//if(j==5) {
				if(i==5&&j==5){
				//if(i==5||j==5)	{
					break; //자신이 포함된 제어문을 탈출한다.(j루프 탈출)
				}
				
				System.out.printf("i: %d, j:%d\n",i,j);

			}
		
		}
		
	}

	private static void m3() {
		
		//쌍용 교육 센터
		//-강의실(1강의실 ~ 6강의실)
		//-학생들(30명)
		
		for(int i=1;i<=6; i++) {//강의실
			
			for(int j=1; j<=30; j++) {//학생
				
				System.out.printf("%d강의실 %d번 학생\n",i,j);
				
			}
			
			
		}
		
	}

	private static void m2() {
		
		//구구단(2단~9단)
		
		
		for(int j =2; j<10 ; j++) {
			
			System.out.println("================");
			System.out.printf("%d단\n",j);
			System.out.println("================");
		
			for(int i =1;i<9; i++) {
				
				System.out.printf("%d x %d = %2d\n",j,i,j*i);
				
			}
		}
	}

	//K&R >이클립스/IntelliJ 기본스타일
	public static void test() {
		
	}
	
	//Allman
	public static void test2() 
	{
		
	}

	private static void m1() {
		
		//모든 제어문끼리는 중첩이 가능하다.
		
		//중첩된 반복문
		//2중 for문
		
		//루프 변수 > i
		
		
		
		//Ctrl+Shift+F(format)

	/*	for( int i =0;i<10;i++) {
	
			for(int j =0; j<10; j++) {
				
				
				//System.out.println("실행문"); // 10회 실행
				System.out.printf("i:%d , j:%d\n",i,j);
			}
			
		}*/
		
		
		//3중 for문
		for (int i=0; i<24; i++) {//대회전(시침)
			
			for(int j=0; j<60; j++) {//중회전(분침)
				
				for(int k=0; k<60; k++) {//소회전(시침)
					
					//System.out.println("실행문");
					
					System.out.printf("i: %d, j: %d, k: %d\n",i,j,k);
					
					
				}
				
			}
			
		}
		
	}
	
}
