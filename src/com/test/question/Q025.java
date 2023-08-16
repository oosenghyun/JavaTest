package com.test.question;

import java.util.Scanner;

public class Q025 {
	
	public static void main(String[] args) {
		
		//Q029
		//요구사항] 두 숫자가 얼마의 차이를 보이는지 출력하시오
	

	int n1 = 0;
	int n2 = 0;
	int max = 0;
	int min = 0;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("첫번째 숫자: ");
	 n1= scan.nextInt();
	
	System.out.println("두번째 숫자: ");
	 n2= scan.nextInt();
	 
	 
		
	
	if (n1>n2) {
		max = n1;
		min = n2;
		System.out.println(n1-n2);
	}
	else {
		max = n2;
		min = n1;
		System.out.println(n2-n1);
	}
	
	int gap=max-min;
	
	System.out.printf("큰수는%d이고, 작은 수는 %d 입니다. 두 숫자는 %d이(가) 차이납니다.",max, min, gap );
	
	}
	}
