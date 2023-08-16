package com.test.java.data;

public class Student {
	
	private String no;
	private String name;
	private String gradeNo;
	private String classN0;
	private String studentNo;
	
	
	public Student(String no, String name, String gradeNo, String classN0, String studentNo) {
		super();
		this.no = no;
		this.name = name;
		this.gradeNo = gradeNo;
		this.classN0 = classN0;
		this.studentNo = studentNo;
	}
	
	
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGradeNo() {
		return gradeNo;
	}
	public void setGradeNo(String gradeNo) {
		this.gradeNo = gradeNo;
	}
	public String getClassN0() {
		return classN0;
	}
	public void setClassN0(String classN0) {
		this.classN0 = classN0;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", gradeNo=" + gradeNo + ", classN0=" + classN0 + ", studentNo="
				+ studentNo + "]";
	}
	
	
	
	
	
	
	
	

}
