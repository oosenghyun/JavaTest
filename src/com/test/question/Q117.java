package com.test.question;

import java.io.File;

public class Q117 {
	
	public static void main(String[] args) {
		
	

	/*요구사항
	내용물이 있는 'delete' 폴더를 삭제하시오.

	조건..
	재귀 메소드 사용
	삭제된 파일과 자식 폴더 개수를 출력하시오.
	리소스..
	폴더 > 폴더 삭제
	파일 다운로드
	출력..
	폴더를 삭제했습니다. 
	삭제된 폴더는 3개이고, 파일은 6개입니다.*/
		
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\폴더 삭제");
	
		//탐색
		delete(dir);
		
		System.out.println("종료");
	
	}

	private static void delete(File dir) {
		
		File[] list = dir.listFiles();
		
		for(File f : list) {
			if(f.isFile()) {
				f.delete(); //모든 파일 지움
				
			}
		}
		
		for(File d:list) {
			if(d.isDirectory()) {
				delete(d);
			}
		}
		
		dir.delete();
	}
	
}
