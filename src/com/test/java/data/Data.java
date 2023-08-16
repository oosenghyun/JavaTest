package com.test.java.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import com.sun.tools.classfile.Annotation.element_value;

public class Data {
	
	public static ArrayList<Student>list;
	
	static {
		Data.list = new ArrayList<Student>();
	}
	
	public static void load() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data\\student.txt"));
			
			String line = null;
			
			while((line=reader.readLine())!=null) {
				
				String[] temp =line.split(",");
				
				Student s = new Student(temp[0],temp[1],temp[2],temp[3],temp[4]);
			}
			
			
		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}
	}
	
	public static void save() {
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter("data\\student.txt"));
			
			for(Stundent s: Data.list) {
				writer.write(String.format("%s,%s,%s,%s,%s,\r\n"
						,s.getNo()
						,s.getName()
						,s.getGradeNo()
						,s.getClassNo()
						,s.get);
				
			}
			
			writer.close();
		} catch (Exception e) {
			System.out.println("at Data.save");
			e.printStackTrace();
		}
	}
		

}
