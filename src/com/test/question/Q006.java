package com.test.question;

import java.util.Scanner;

public class Q006 {
	public static void main(String[] args) {
	 //Q006.java
		
	Scanner scan = new Scanner(System.in);	
	
	int income = 0;
	double tax = 0;
	double afterTaxIncome=0;
	
	System.out.print("한달 수입 금액(원): ");
	income = scan.nextInt();
	
	afterTaxIncome = income * 0.97;
	
	tax = income * 0.033;
	
	System.out.printf("세후 금액(원) : %,.0f원\n" , afterTaxIncome);
	System.out.printf("세금(원) : %,.0f원\n" , tax);
	
	scan.close();
	}

}
