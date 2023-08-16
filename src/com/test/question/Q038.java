package com.test.question;

import java.util.Scanner;

public class Q038 {
	
	public static void main(String[] args) {
		
		//Q038.java
		//요구사항]입력 횟수(N)와 숫자 N개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.
		int input=0;
		int num=0;
		int even=0;
		int odd=0;
		int evenSum=0;
		int oddSum=0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력횟수: ");
		input = scan.nextInt();
	
		
		for(int i=0;i<input;i++ ) {
			
		System.out.println("숫자: ");
		num=scan.nextInt();
		
		if (num %2 ==0) { 
			even++; // 짝수가 몇 개 있는지 확인 하는 
			evenSum=evenSum+input;
		}else {
			odd++;//?
			oddSum=oddSum+input;
		}
		
	}
		
		
		System.out.printf("짝수 %d개의 합:%d\n",even,evenSum);
		System.out.printf("홀수 %d개의 합:%d",odd,oddSum);
	}
	

}
