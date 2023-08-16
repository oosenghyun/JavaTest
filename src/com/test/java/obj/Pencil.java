package com.test.java.obj;

public class Pencil {
	
	private String hardness; //HB, H, H2,B2
    private String color;
    
	public String getHardness() {
		return hardness;
	}
	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
 punlic String info() {
	 return String.format("Pencil[%s,%s]", this. hardness, this.color);
 }