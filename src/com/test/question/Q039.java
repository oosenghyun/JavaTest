package com.test.question;

import java.util.Scanner;

public class Q039 {
	public static void main(String[] args) {
		
	
	
	//Q039.java
	//요구사항] 
	/*요구사항
	아래와 같이 출력하시오.

	입력..
	시작 숫자: 1 

	종료 숫자: 10 

	출력..
	1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
	
	*/
	
	int startNum=0;
	int endNum=0;
	int sum = 0;
	String txt="";
	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("시작 숫자: ");
	startNum=scan.nextInt();
			
	System.out.println("종료 숫자: ");
	endNum=scan.nextInt();
	
	
	for(int i=startNum ; i>=startNum && i <=endNum;i++) {
		
		sum=sum+i;
		txt=txt + i; // ""1 2 3 4 ...
		
		if (i<endNum) {
			txt = txt + "+"; //1+2+3+4....
					
		}
	}
			System.out.println(txt + "=" +sum);
	
	}
}

