package com.test.question;

import java.util.Scanner;

public class Q005 {
	public static void main(String[] args) {
		/*
		 
		 요구사항 : 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		 
		
		 */
		
		Scanner scan = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("섭씨 (℃): ");
		celsius = scan.nextDouble();
		
		fahrenheit = celsius * 1.8 + 32;
		
		
		System.out.printf("섭씨 %.1f℃는 화씨%.1f℉입니다",celsius,fahrenheit);
		
		scan.close();
	}

}
