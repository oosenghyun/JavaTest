package com.test.java.obj;

public class Perseon {
	
	private String name; 
	private int age;
	private String gender;
	
	private Person father;
	private Person mother;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String info() {
		
		String temp="";
		
		temp += "아빠: " +this.father.getName()+ "\n";
		temp += "엄마: " +this.mother.getName()+ "\n";
		temp += "본인: " +this.name.getName()+ "\n";
		
		
	}
}
