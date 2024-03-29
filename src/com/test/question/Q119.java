package com.test.question;

import java.io.File;

public class Q119 {
	
	public static void main(String[] args) {
		
		/*요구사항
		아래의 조건에 따라 파일을 폴더별로 분류/이동하시오.

		조건..
		1차: 직원 이름으로 폴더 생성
		2차: 년도별로 폴더 생성
		3차: 각 파일을 직원 > 년도 폴더에 이동
		리소스..
		폴더 > 직원
		파일 다운로드
		출력..
		분류가 완료되었습니다.*/
		
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\직원");
		
		File[] list = dir.listFiles();
		
		for(File f : list) {
			//아무게_2014__17.txt
			//아무게_2016_71.txt
			
			String[]temp = f.getName().split("_");
			
			String name = temp[0];
			String year = temp[1];
			
			File nameDir = new File(dir.getAbsolutePath()+"\\" + name);
			nameDir.mkdir();
			
			File yearDir = new File(dir.getAbsolutePath()+"\\" + name + "\\" + year);
			
			yearDir.mkdir();
			
			File dest = new File(dir.getAbsolutePath()+"\\" + name + "\\" + year + "\\"+f.getName());
			
			f.renameTo(dest);
		}
		
		
	}

}
