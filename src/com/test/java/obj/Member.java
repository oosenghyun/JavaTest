package com.test.java.obj;

public class Member {
	
	private String id;
	private String pw;
	private String name;
	private int iv;
	
	//생성자 vs Setter
	//1.생성자 > 초기화역할
	//2.Setter > 초기화 이후 수정하는 역할
	
	public Member(String id, String pw, String name, int iv) {
		this.id=id;
		this.pw=pw;
		this.name=name;
		this.iv=iv;
		
		 
		
		
	}
	public String info() {
		return String.format("아이디(%s),암호(%s),이름(%s),등급(%d)", 
								this,id,
								this.pw,
								this.name,
								this.iv);
	}

}
