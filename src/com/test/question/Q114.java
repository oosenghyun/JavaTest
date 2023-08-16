package com.test.question;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class Q114 {
	
	public static void main(String[] args) {
		/*
		 조건..
		새로운 확장자 파일이 추가되도 동작이 가능하게 구현하시오.
		'mouse.bmp' 추가를 하면.. 소스 수정 없이도 *.bmp : 1개 출력이 되게 하시오.
		리소스..
		폴더 > 확장자별 카운트
		파일 다운로드
		출력..
		 	*.gif: 10개 
		 	*.jpg: 5개 
		 	*.png: 3개 
		 */
		
		//목록
		File dir = new File("C:\\Users\\user\\Downloads\\파일_디렉토리_문제\\확장자별 카운트");
		File[]list=dir.listFiles();
		
		
		//int count = 0; //gif
		//int count2= 0; //jpg
		//int count3= 0; //png
		
		
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		
		
		for(File f : list) {
			System.out.println(f.getName());
			String ext = getExtension(f.getName()); // 메서드로 따로 지정
			
			
			if(!count.containsKey(ext)) { //키가 확장자에 존재하는지 여부
			count.put(ext, 1); // ext값을 1로 수정
			}else { 
				count.put(ext, count.get(ext)+1); // count = count +1 누적
			}
			
		}
		
		System.out.println(count);
	}
	
	private static String getExtension(String name) {
		//test.png
		//test.test.png
		System.out.println(name); //마우스01.jpg
		String[] temp = name.split("\\."); 
		//System.out.println(temp.length);
		String ext = temp[temp.length-1].toLowerCase(); //확장자 소문자로 통일
		
		//System.out.println(Arrays.toString(temp));
		System.out.println(ext);
		
		//return ext;
		return name.split("\\.")[temp.length-1].toLowerCase();
	}

}
