package com.test.java.collection;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//private int total; > 필요할 경우 넣을 지 말지 설정 한다.
	//private double avg; >
	
	

}



