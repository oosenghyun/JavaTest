package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q061 {
	
	public static void main(String[] args) {
		
		int[] nums = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		// 35241 비교 4번 해야함
		
		System.out.println("숫자: ");
		nums[0]=scan.nextInt();
		
		System.out.println("숫자: ");
		nums[1]=scan.nextInt();
		
		System.out.println("숫자: ");
		nums[2]=scan.nextInt();
		
		System.out.println("숫자: ");
		nums[3]=scan.nextInt();
		
		System.out.println("숫자: ");
		nums[4]=scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		for(int i=0; i<nums.length-1; i++) { 
			
			for(int j=0; j<nums.length-i-1; j++) {//
				
				if(nums[j]<nums[j+1]) {
					
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1]=temp;
					
					System.out.println(Arrays.toString(nums));
					
					
				}
				
			}
			
		
		}
	
		
		
		
		
		
	}

}
