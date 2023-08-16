package com.test.question;

import java.util.Scanner;

public class Q003 {
	
	public static void main(String[] args) {
		
		//Q003.java
		/*
		 
		 요구사항] 사각형의 넓이 = 너비 * 높이
		         사각형의 둘레 = 너비 * 2  + 높이 * 2
		         
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int width = 0;
		int height = 0;
		int area = 0;
		int circumference = 0;
		
		System.out.print("너비(cm): ");
		width = scan.nextInt();
		
		System.out.print("높이(cm): ");
		height = scan.nextInt();
		
		area = width * height;
		circumference = (width * 2) + (height * 2);
				
				
		System.out.printf("사각형의 넓이는 %,dcm^2입니다." ,area );
		System.out.printf("사각형의 둘레는 %,dcm 입니다.", circumference);
		
		scan.close();
		
		
		
		
	}

}
