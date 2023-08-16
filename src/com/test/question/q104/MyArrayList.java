package com.test.question.q104;

public class MyArrayList {
	
	
	private String [] list;
	private int index;//******

	public MyArrayList() {
		this.index=0;
	}
	
	public boolean add(String value) {
		
		
		try {
		if(this.index ==0) {
			this.list = new String[4];
		}
		
		//배열의 방이 남아 있는지? > 있으면..
		//                    >없으면...> 두배로 늘리기!
		
		this.list[this.index]=value;
		this.index++;
		
		return true;
		
		}catch(Exception e) {
			return false;
		}
		
		public String get (int index) {
			
			return this.list[index];
		}
		
		public int size() {
			//return this.list.length
			return this.index;
		}
	}
}
	

