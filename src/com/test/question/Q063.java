package com.test.question;

import java.util.Arrays;

public class Q063 {
	
	public static void main(String[] args) {
		
		//조건 String dump(int[] list)
		
//		int[] list = new int[4];

//		list[0] = 10;
//		list[1] = 20;
//		list[2] = 30;
//		list[3] = 40;
//
//		String result = dump(list);
//		System.out.printf("nums = %s\n", result);
		
		int[] list = new int[4];
		
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		System.out.printf("nums = %s\n", result);
		
	}
	
	private static String dump( int[] list) {
		System.out.println(Arrays.toString(list));
		
		
	}

}
