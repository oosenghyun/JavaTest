package com.test.question;

import java.util.Scanner;

public class Q049 {
	public static void main(String[] args) {
		
	
	
	//별찍기
//	*****
//	 ****
//	  ***
//	   **
//	    *
        int line = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("행: ");
		line=scan.nextInt();
		
		for(int i=0; i<line; i++) {
			for(int k=0; k<i; k++) {//0,1,2,3,...
				System.out.print(" ");
			}
			for(int j=i; j<line; j++) {//
				System.out.print("*");
			}
			System.out.println();
			
	
		}
	}
	
}

