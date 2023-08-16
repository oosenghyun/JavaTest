package com.test.question;

import java.util.Arrays;

public class Q068 {
	
	public static void main(String[] args) {
		
		//Q068
		//배열의 요소를 삭제하시오.
		
		//배열 요소 삭제 > Left Shift 발생
		
		int[] nums = {5,6,1,3,2,0,0,0,0,0};
		
		int index = 2;
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = index; i<nums.length-1 ; i++) { //index2~index8까지{
		
			//왼쪽방=오른쪽방
			nums [i] = nums[i+1];
			
			
		}
		nums[nums.length-1] = 0;
		
		System.out.println(Arrays.toString(nums));	
		
			
       }
	}
