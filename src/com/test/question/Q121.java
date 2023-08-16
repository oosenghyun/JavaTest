package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Q121 {
	
	public static void main(String[] args) {
		
		/*요구사항
		숫자를 한글로 바꾼 뒤 파일을 다른 이름으로 저장하시오.

		조건..
		0 → 영, 1 → 일 ... 9 → 구
		저장할 파일명: 숫자_변환.dat
		리소스..
		파일 > 숫자.dat
		파일 다운로드
		출력..
		변환 후 다른 이름으로 저장하였습니다.*/
		
	
	
	try {
		
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자_변환.dat"));
		BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\user\\Downloads\\파일_입출력_문제\\숫자_변환.dat"));
		
		String line = null;
		
		while((line = reader.readLine()) !=null){
			
			
		}
			
		
	}catch(Exception e) {
		e.printStackTrace();
		

		
	}
	
}
}
