package com.test.java.auth;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.test.java.auth.data.Memeber;




public class Data {
	
	public static ArrayList <Member> list;
	
	static {
		list = new ArrayList <Member>();
	}
	
	public static void load();{
		
	try {
			
			BufferedReader reader = new BufferedReader(new FileReader("data\\member.txt"));
			
			String line = null;
			
			while((line=reader.readLine())!=null) {
				String temp = line.split(",");
				
				Member m = new Memeber(temp[0], temp[1] ,temp[2], temp[3] );
				
				Data.list
			
			}
			
			reader.close();
			
			
		} catch (Exception e) {
			System.out.println("at Data.load");
			e.printStackTrace();
		}
		
	}
	
	public static void save() {
		
	}

}
