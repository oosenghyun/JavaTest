package com.test.question;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;


public class Q120 {
	
	public static void main(String[] args) {
		
		/*요구사항
		특정 이름을 찾아 다른 이름으로 변환 후 파일을 다른 이름으로 저장하시오.

		조건..
		'유재석' → '메뚜기'
		저장할 파일명: 이름수정_변환.dat
		리소스..
		파일 > 이름수정.dat
		파일 다운로드
		출력..
		변환 후 다른 이름으로 저장하였습니다.*/
		
	try {
		
		BufferedWriter writer 
		= new BufferedWriter(new FileWriter ("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정_변환.dat"));
		BufferedReader reader 
		= new BufferedReader(new FileReader("C:\\Users\\user\\Downloads\\파일_입출력_문제\\이름수정.dat")); // 텍스트파일 읽는 스트림
		
		String line = null;
		
		while ((line = reader.readLine()) !=null) { 
			line = line.replace("유재석", "메뚜기");
			writer.write(line);
		}
		
		reader.close();
		writer.close();
	  
	
	  }catch(Exception e) {

		e.printStackTrace();	
	}
	System.out.println("변환 후 다른 이름으로 저장하였습니다.");
	}
}

