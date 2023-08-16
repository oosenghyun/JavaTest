package com.test.question;

import java.io.File;

public class Q115 {
	
	public static void main(String[] args) {
		
		
		
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\파일 제거");
		
		File[] list = dir.listFiles();
		int count = 0;
		
		for(File file : list) {
			if(file.length()==0) { // file의 크기가 0일때 파일 삭제
				file.delete();
				count++;
				
			}
		}
		
		System.out.println("총" + count +"개의 파일을 삭제했씁니다");
	}

}
