package com.test.question;

import java.util.Scanner;

public class Q026 {
	
	public static void main(String[] args) {
		
		// Q030.java
		//요구사항] 학생의 국어 점수를 입력받아 성적을 출력하시오.
		

		
		String result = "";
		Scanner scan = new Scanner(System.in);
				
		
		System.out.println("점수: ");
		int score = scan.nextInt();
		
		
		
		if (90<=score && score <=100 ) {
			result ="A";
		}else if (80<=score && score<=89) {
			result ="B";
		}else if(score >=70 && score <=79) {
			result ="C";
		}else if(score >=60 && score <=69) {
			result ="D";
		}else if (score>=0 && score <=59) {
			result ="F";
		}else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}
			
			
			
		
		System.out.printf("입력한 %d점은 성적 %s 입니다." ,score,result);
		
		
		
		
		
		
	}

}
