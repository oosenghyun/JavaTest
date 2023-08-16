package com.test.question;

import java.util.Arrays;

public class Q066 {
	
	public static void main(String[] args) {
		
		//요구사항]중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		int[]lotto=new int[6];
		
		for(int i =0; i<lotto.length; i++) {
			
			int n =(int)(Math.random()*45)+1;
			
			if(isDuplicate(lotto,n)) {
				i--; // 중복 값이 있으면 한번 더 돌려야지만 빈 값(0)이 나오지 않는다.
				
			}else {
				lotto[i] =n;
				
			}
			
		
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}

	private static boolean isDuplicate(int[] lotto, int n) {
		
		for(int i=0; i<lotto.length; i++) {
			
			if(lotto[i] ==n) {
				return true;
			}
		}
		
		return false; // 중복된 것이 없다는 의미
	}

}
