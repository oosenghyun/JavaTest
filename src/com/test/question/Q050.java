package com.test.question;

import java.util.Scanner;

public class Q050 {
	
	public static void main(String[] args) {
		
	
	
	//Q050.java
	
	//요구사항] 행의 갯수를 입력받으시오
//	    *  // "" 6 1 > 7 2  1 7
//	   **
//	  ***
//	 ****
//	*****
	
		Scanner scan = new Scanner(System.in);
		
		int line = 0;
		System.out.println("행: ");
		line = scan.nextInt();
		
		for(int i=0; i < line; i++) {
			for(int j=line-1 ; j>0; j++) {
					System.out.print(" ");					
			}
					System.out.println();
				for(int k=i; k<line; k++) {
						System.out.print ("*");
				}
			
		
				
	}
	}
}
