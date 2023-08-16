package com.test.question;

import java.util.Scanner;

public class Q001 {
 public static void main(String[] args) {
	
	 //Q001.java
	 /*
	  
	  
	  요구사항
	  태어난 년도를 입력받아 나이를 출력하시오
	  
	 
	  */
	Scanner scan = new Scanner(System.in); 
	
	int year = 0;
	int age = 0;
	
	System.out.println("태어난 년도: ");
	year = scan.nextInt();
	
	age = 2023 - year + 1;
	
	System.out.printf("나이 : %d세\n", age);
	
	scan. close();
	
    
	 
	 
	 
	 
	 
	 
	 
	 
}
}
