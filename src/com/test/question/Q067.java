package com.test.question;

import java.util.Arrays;
import java.util.Scanner;

public class Q067 {
	
	public static void main(String[] args) {
		
		//요구사항] 배열에 요소를 삽입하시오.
		
		//배열 삽입 > Right Shift 구현(발생)
		
		Scanner scan = new Scanner(System.in);
		
		int[] nums = new int[] {5,6,1,3,2,0,0,0,0,0};
		
		System.out.println("삽입 위치: ");
		int index = scan.nextInt();
		
		System.out.println("값: ");
		int value = scan.nextInt();
		
		System.out.println(Arrays.toString(nums));
		
		//Right Shift
		for (int i =nums.length-2; i>=index; i--) {
			//오른쪽 방 = 왼쪽 방
			nums[i+1] = nums[i];
		}
		nums[index] = value;
		
		System.out.println(Arrays.toString(nums));
		
		
	}

}
