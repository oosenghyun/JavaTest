package com.test.question;

import java.util.Scanner;

public class Q002 {
	public static void main(String[] args) {
		
		//Q002.java
		
		
		//요구사항
		//-출력 숫자에 천단위 표기 하시오
		//-결과값은 소수 이하 1자리까지 표기 하시오.
		
		
		Scanner scan = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		double result4 = 0;
		int result5 = 0;
		
		
		
		System.out.print("첫번째 숫자: ");
		n1 = scan.nextInt();
		
		System.out.print("두번째 숫자: ");
		n2 = scan.nextInt();
		
		result1 = n1 + n2;
		result2 = n1 - n2;
		result3 = n1 * n2;
		result4 = (double) n1 / n2;
		result5 = n2 % n2;
		
		System.out.printf("%d + %d = %d\n" , n1, n2, result1);
		System.out.printf("%d - %d = %d\n", n1, n2, result2);		
		System.out.printf("%d - %d = %d\n", n1, n2, result2);		
		System.out.printf("%d - %d = %d\n", n1, n2, result2);
		System.out.printf("%d - %d = %d\n", n1, n2, result2);
		
		scan.close();
	}

}
