package com.test.question;

import java.util.Scanner;

public class Q036 {
	
	public static void main(String[] args) {
		
		//Q035.java
		//요구사항]시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
	
	
	int num1 =0;
	int num2=0;
	int increase= 0;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("시작 숫자: ");
	num1=scan.nextInt();
	
	System.out.println("종료 숫자: ");
    num2=scan.nextInt();
    
    System.out.println("증감치: ");
    increase=scan.nextInt();
    
    for (int i=num1; i <= num2; i = i + increase) {
    	System.out.println(i);
    	
    }
    		
    
    
	}	

}
