package com.test.java.io;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class Ex64_File {
	
	
//누적 변수
	private static int count = 0; // 파일 개수
	private static int dcount = 0; //폴더 개수
	private static long length = 0; //폴더 크기
	
	public static void main(String[] args) {
		
		/*
		 
		 1.파일/디렉토리 조작
		 	-윈도우 탐색기로 하는 모든 행동 > 자바로 구현
		 	-파일 > 정보 확인, 새로 만들기, 이름 바꾸기 , 이동하기 ,삭제하기
		 	-폴더 > 정보 확인, 새로 만들기, 이름 바꾸기 , 이동하기 ,삭제하기
		 
		 2.파일 입출력
		 	-파일 > 읽기/쓰기
		 	-메모장 기능
		 	
			 
		 */
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		
		//******
		//m14();
		m15();
		
		
	}private static void m15() {
	
		//특정 폴더 > 파일 개수 세기
		File dir = new File ("C:\\class\\dev\\eclipse");
		
		if(dir.exists()) {
			
			//1.목록 가져오기
			File[]list = dir.listFiles();
			
			//2.파일 개수
			for (File subfile : list) {
				if(subfile.isFile()) {
					count++;
					
					length += subfile.length(); // 파일 크기를 누적
				}
			}
			
			
			//3. 자식 폴더를 대상으로 1~2번을 반복
			
			for (File subdir : list) {
				if(subdir.isDirectory()) {
					
					dcount++;
					//1~2번 실행 > 3번 > 손자 폴더
				}
			}
		}
		
	}

	//main

	private static void m14() {
	
		
		//특정 폴더 > 파일 개수 세기
		
		File dir = new File ("C:\\class\\dev\\eclipse");
		
		int count = 0; // 누적 변수
		
		if (dir.exists()) {
			File [] list = dir.listFiles();
			
			for(File subfile:list) {
				if (subfile.isFile()) {
					count++;
				}
			}
			
			for(File subdir : list) {
				if (subdir.isDirectory()) {
					
					//자식 폴더 > 내용
					File[]sublist = subdir.listFiles();
					
					for(File subsubfile : sublist) {
						if(subsubfile.isFile()) {
							count++;
						}
						
						for(File subsubdir : sublist) {
							if(subsubdir.isDirectory()) {
								//손자 폴더 > 내용
								File[] subsublist = subsubdir.listFiles();
								
								for(File subsubsubfile : subsublist) {
							  if(subsubsubfile.isFile()) {
								count++;
							}
						}
					}
				}
			}
					
				
			System.out.printf("총 파일 개수 : %d개 \n" , count);
		//if
				
	

	private static void m13() {
	
		//폴더의 내용 보기 (자식 폴더, 파일)
		
		String path = "C:\\class\\dev\\eclipse";
		File dir = new File(path);
		
		if(dir.exists()) {
//			
//			//dir.list();
//			//dir.listFiles();
//			
//			String[] list = dir.list();
//			
//			for(String f : list) {
//				System.out.println(f);
//				
//				File file = new File(path + "\\" + f);
//				System.out.println(f+">" + (file.isFile() ? "파일" : "폴더"));
//				
//			}
//		
//		File[] list = dir.listFiles();
//		for(File f :list) {
//			System.out.printf("%s - %s\n"
//								,f.getName()
//								,f.isDirectory() ? "폴더" : "파일");}
		
		
		//탐색기 느낌
		File[]list = dir.listFiles();
		
		for(File d : list) {
			
			if(d.isDirectory()) {
				System.out.printf("[%s\n]" , d.getName());
			}
			
		}for(File f : list) {
			if(f.isFile()) {
				System.out.println(f.getName());
			}
		}
		
		
			
		}//if
		
	}
	

	private static void m12() {
		//폴더 > 삭제하기
		//-빈폴더일때만 가능하다
		//-내용물(파일,자식폴더)이 있으면 삭제가 불가능하다.
		//-직접 구현
		File dir = new File("C:\\class\\code\\java\\move\\할일");
		
		if(dir.exists()) {
			System.out.println(dir.delete());
		}
		
	}

	private static void m11() {
		
		//폴더 > 이동하기
		File dir = new File("C:\\class\\code\\java\\file\\할일");
		File dir2 = new File("C:\\class\\code\\java\\file\\move");
		
		
	}

	private static void m10() {
		// 폴더 > 이름 바꾸기
		File dir = new File("C:\\class\\code\\java\\file\\날짜");
		File dir2 = new File("C:\\class\\code\\java\\file\\할일");
		
		if(dir.exists()) {
			System.out.println(dir.renameTo(dir2));
		}
		
		
	}

	private static void m9() {
		// 요구사항]날짜별 폴더 > 2020-01-01 ~ 2023-12-31
		
		Calendar c = Calendar.getInstance();
		c.set(2023,0,1);
		
		
		//System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR)); //c가 속한 연도에 가장 큰 값 > 365일
		int max = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		for(int i =0;i<max; i++) {
			
		String name = String.format("%tF",c);
		System.out.println(name);
		
		File dir = new File("C:\\class\\code\\java\\file\\날짜\\"+name);
		dir.mkdirs();
		
		
		c.add(Calendar.DATE, 1);
			
		}
	}

	private static void m8() {
		// 요구사항] 회원 > 회원명으로 개인 폴더 생성
		
		String[] member = {"홍길동" , "아무개", "이순신", "권율","유관순"};
		for (int i=0; i<member.length;i++) {
			String path = String.format("C:\\class\\code\\java\\file\\[개인폴더]%s님", member[i]);
			
			File dir = new File(path);
			System.out.println(dir.mkdir());
		}
	}

	private static void m7() {
		
	//폴더 > 만들기
	//File dir = new File("C:\\class\\code\\java\\aaa");
		File dir = new File("C:\\class\\code\\java\\bbb\\ccc");
			
	if(!dir.exists()) {
		//System.out.println(dir.mkdir()); //폴더 1개
		System.out.println(dir.mkdirs()); // 연관된 폴더 모두 함께
	}
	
	
		
	}

	private static void m6() {
		// 파일 > 삭제하기
		File file = new File("C:\\class\\code\\java\\move\\데이터.txt");
		
		if(file.exists()) {
			
			//파일이동 > 휴지통(o)
			//파일삭제 > 휴지통(x)
			System.out.println(file.delete()); //살리지 못함
		}
	}

	private static void m5() {
		// 파일 > 이동하기
		//-C:\\class\\code\\java\\file\\data.txt
		//-C:\\class\\code\\java\\move\\data.txt
		
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\class\\code\\java\\move\\데이터.txt");
		
		if(file.exists()) {
			
			System.out.println(file.renameTo(file2));
		}
		
	}

	private static void m4() {
		
		//파일 > 파일명 바꾸기
		File file = new File("C:\\class\\code\\java\\file\\data.txt");
		File file2 = new File("C:\\class\\code\\java\\file\\데이터.txt");
		
		if (file.exists()) {
			file.renameTo(file2); //false
		}
	}

	private static void m3() {
		// 파일> 생성하기
		File file = new File("C:\\class\\code\\java\\file\\hello.txt");
		if(!file.exists()) {
			try {
				System.out.println(file.createNewFile());
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}else {
			System.out.println("이미 동일한 파일이 존재합니다.");
		}
		
	}

	private static void m2() {
		
		//폴더 > 정보
		//-폴더(Folder), 디렉토리(Directory), 
		
		//-C:\class\code\java\file
		
		//폴더 참조 객체
		//-폴더는 파일이다.
		
		File dir = new File("C:\\class\\code\\java\\file");
		
		if(dir.exists()) {
			System.out.println("폴더가 있습니다.");
			
			//업무
			System.out.println(dir.getName()); //file
			System.out.println(dir.isFile()); //false
			System.out.println(dir.isDirectory()); //true 
			System.out.println(dir.length()); //0
			System.out.println(dir.getAbsolutePath()); // 경로
			
			System.out.println(dir.lastModified()); //수정한 날짜
			System.out.println(dir.isHidden());//false
			
			
			System.out.println(dir.getParent());
		}else {
			System.out.println("폴더가 없습니다.");
		}
		
	}

	private static void m1() {
		
		//파일 > 정보
		//-C:\class\code\java\file > 폴더생성
		//-C:\class\code\java\file\data.txt>텍스트파일 생성
		
		//자바 프로그램에서 외부의 파일을 접근
		//1.외부 파일을 참조하는 참조 객체 생성 > 대리자. 위임자
		//2.참조 객체 조작 > 행동 > 외부 파일에 적용
		
		//파일 참조 클래스 > 객체 > java.io.File(파일 클래스)
		
		File file = new File("C:\\class\\code\\java\\data.txt");
		
		System.out.println(file.exists()); // 파일이 존재하는지 사전에 체크
		
		if(file.exists()) {
			System.out.println("파일이 있습니다.");
			
			//업무
			System.out.println(file.getName()); //data.txt
			System.out.println(file.isFile()); //true 파일인지 폴더인지
			System.out.println(file.isDirectory()); //false 
			System.out.println(file.length()); //36 > 파일 크기 (byte)
			System.out.println(file.getAbsolutePath()); // 경로
			
			System.out.println(file.lastModified()); //수정한 날짜
			System.out.println(file.isHidden());//false
			
			//tick >년월일시분초
			Calendar c1=Calendar.getInstance();
			System.out.println(c1.getTimeInMillis()); 
			c1.setTimeInMillis(file.lastModified());
			
			System.out.printf("%tF %tT\n" , c1,c1);
			
			
		}else {
			System.out.println("파일이 없습니다.");
		}
		
		
		
	}//m1


}
