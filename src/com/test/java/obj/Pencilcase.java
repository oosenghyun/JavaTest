package com.test.java.obj;

public class Pencilcase {
	
	private String color;
	private Pencil[] pencil = new Pencil[5];//***
	private int index = 0;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Pencil[] getPencil() {
		return pencil;
	}
	public void setPencil(Pencil[] pencil) {
		this.pencil = pencil;
	

	//[index] " 인덱서" 표깁버
		pcase.getPenil()[i] = p1;
	
		
		//for i (int i-0, i<5 i++) {
			
		//	System.err.println(pcase.getPencil()[1] = p1);
		}
		
		//연필을 필통안에넣기
		
		public void aad(Pencil p) {
			
			if(this.index < this.pencil.length) {
			this.pencil[this.index]=p;
			this.index++;
			
			}else {
				System.out.println("필통안에 연필이 꽉 찼습니다");
			}
			
			for (int i=0; i<5; i++ ) {
				Pencil p =new Pencil();
				p.setHardness("B");
				p.setColor("파란색");}
				
			
				
				//필통에서 연필을 꺼내기
			public Pencil get(int index) {
				
				Pencil p = this.pencil[index];
				
				//Left Shift
				for (int i=index; i<this.pencil.length-1,i++) {
					this.pencil[i] = this pencil[i+1];
					
					this.pencil[this.pencil.length-1] = null;
							
							this.index--;
						
							return p;
				}
				
				public String info() {
					return Arrays.toString(this.pencil);
				}
				
			}
			
	}
	

}
