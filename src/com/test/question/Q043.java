package com.test.question;

import java.util.Scanner;


public class Q043 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//System.out.println("숫자 입력:");
		//int num = scan.nextInt();
		
		int sum=0;
		int oddsum=0,evensum=0;
		int num =23567678;
		
		for(;;) {
		
			System.out.println(num%10);
			
			if (num%10%2==0){
				evensum +=num%10;			
			}else {
				oddsum += num%10;
			}
			
			
			sum +=num%10;
			num=num /10;
			
			if (num==0) {
				break;
			}
			
		}
	}
}
