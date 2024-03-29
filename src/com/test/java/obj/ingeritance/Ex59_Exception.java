package com.test.java.obj.ingeritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex59_Exception {

	
	public static void main(String[] args) {
		
		/*
		 
		 예외, Exception
		 -런타임 오류
		 -컴파일 발견(x) > 실행 중 발견(o)
		 -개발자 미리 예측(o) or 예측(x)
		 
		 예외처리, Exception Handling
		 1. 전통적인 방식
		 	-제어문 사용(조건문)
		 
		 
		 
		 2. 전용 방식
		 	-try catch finally문 사용

		 */
		
		//m1();
		//m2();
		//m3();
		//m4();

//		try {
//			m5();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		m6();
		
		try {
			int num = 0;
			System.out.println(100/num);
		}catch (Exception e) {
			System.out.println("꼭 채워넣기");
		}
		 
	
		
		
	}//main
	
	private static void m6() { 
		
		//예외 던지기
		
		//요구사항] 숫자 입력 > 처리
		//조건 ] 반드시 짝수만 입력
		//			 홀수 입력 > 에러 처리
		
		int num =5;
		
		if (num %2 ==0) {
			System.out.println("업무 진행");
		}else {
			System.out.println("예외 처리");
		}
		
		//try 구현
		
		try {
			if(num%2 ==1) {
				
				throw new Exception("홀수 입력"); //강제로 에러 발생
				
			}
			
			System.out.println("업무 진행");
		}catch(Exception e ) {
			System.out.println("예외 처리");
		    System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

	private static void m5() throws Exception {
		//예외미루기
		

		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in));
		
		//Unhandled exception type IOException
		
//		try {
//		String input = reader.readLine();
//		}catch (Exception e) {
//		
//	}
		
		String input = reader.readLine();
	}
	
	
	
	private static void m4() {
		
			//0으로 나누기 >ArithmeticException
			try {
			int num =10;
			System.out.println(100/num); //throw new ArithmeticException 
			}catch(Exception e) {
				System.out.println("0으로 나누기");
			}
			
			//배열 첨자 > ArrayIndexOutOfBoundsExcepion
			try {
			int[] nums = new int[3];
			nums[5] = 10;
			}catch(Exception e) {
				System.out.println("배열 첨자");
			}
			
			//널 참조 > NullPointerException
			try{Scanner scan = null;
			scan.nextLine();
			}
			
			catch(ArithmeticException e) {
				System.out.println("0으로 나누기");
				
			}
			catch(ArrayIndexOutOfBoundsExcetion e ) {
				System.out.println("배열 첨자");
				
			}catch(NullPointerException e) {
				
			}catch (Exception e) {
					System.out.println("널 참조");
				
			}
		}
		
	
	private static void m3() {
		
		//0으로 나누기 >ArithmeticException
		try {
			int num =0;
			System.out.println(100/num);
			
			//배열 첨자 > ArrayIndexOutOfBoundsExcepion
			int[] nums = new int[3];
			nums[0] = 10;
			
			//널 참조 > NullPointerException
			Scanner scan = null;
			scan.nextLine();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void m2() {
		int num = 10;
		
		try {
			
			//test.txt 파일열기
			//비즈니스 영역
			
			System.out.println(100/num);
			
			
		}catch(Exception e) {
			//예외처리 영역
		System.out.println("예외 처리");
		
		
		}finally {
			//?마무리 영역 > 무조건 실행되는 블럭 > 뒷수습
			//예외와 상관없이 항상 실행해야 하는 코드
			System.out.println("마지막");
			
			//test.txt파일 닫기
		}
	}
	
	
	
	
	private static void m1() {
		//요구사항] 숫자를 입력받아 연산을 하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자");
		
		int num = scan.nextInt();
		
		
		
		//예외처리 > 전통적인 방식
		
		
		/*
		 
		 if(조건) {
		 	참 > 실행
		 } else {
		 	거짓 > 실행
		 }
		 
		 
		 */
		
		
		
		if (num != 0) {
			//비즈니스 코드(=업무 코드) > 원래 목적
		
			System.out.printf("100/%d = %d\n",num,100/num);
		}else {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다");
		}
		
		
		//비권장 > 가독성
		if (num==0) {
			//예외 처리 코드
			System.out.println("0을 입력하면 안됩니다");
			System.out.printf("100/%d = %d\n",num,100/num);
		}else {//비즈니스 코드(=업무 코드) > 원래 목적
			System.out.printf("100/%d = %d\n",num,100/num);
			
		}
		
		//if문 vs try문
		//if문: 사전에 미리 검사를 해서 사고가 안나게 처리
		//try문: 일단 실행 > 감시 > 사고가 터지면 그때 뒷처리 > 권장
		
		
		
		
		//try 영역 > 감시(CCTV) > 예외가 발생하는 지 감시
		try {
			System.out.println(1);
			System.out.printf("100/%d = %d\n",num,100/num);
			System.out.println(2);
		}catch (Exception e) {
			System.out.println("0을 입력하면 안됩니다");
			
			//Exception e
			//-예외 객체
			//예외의 상황을 전달
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("종료");
	
	} 
}//class
