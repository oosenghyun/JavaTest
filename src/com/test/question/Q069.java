package com.test.question;

import java.util.Arrays;
import java.util.Scanner;
public class Q069 {
	
	public static void main(String[] args) {
		
		//요구사항] 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		
		
		/*조건..
		원본 배열 길이: 사용자 입력
		원본 배열 요소: 난수(1~9)
		결과 배열 길이: 사용자 입력 / 2
		입력..
		배열 길이: 10 

		출력..
		원본: [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ] // [1] + [2] / [3] +[4]/ [4]+[5] 
		결과: [ 6, 9, 9, 10, 11 ]*/
		
		
		int [] list = null;
		int [] copy = null;
		int length = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열길이: ");
		length = scan.nextInt();
		
		list=new int[length];
		copy=new int[(int)Math.ceil(length/2.0)]; //전달받은 length 반의 값을 반올림하여 나오게

		for(int i=0; i<list.length; i++) {
			list[i] = ((int)(Math.random()*10)+1);
		} //list 0 = a, list b= c ... 1+10까지 중 하나의 숫자 지정
		
		System.out.print("원본: ");
			
		System.out.println(Arrays.toString(list));
	    
		
		for (int i=0; i<(list.length/2)-1;i++) {
			for(int j=0;j<i;j++) {
			copy[i] = list[i]+list[i+1];
			 System.out.print(copy[i]+",");
			 
			}
			}
				//copy[0] = list
		
			System.out.println("결과: ");
			
			System.out.println(Arrays.toString(copy));
			
		
		
	}

}
