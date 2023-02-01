package com.java.string;

public class StringMethodExample1 {
	
	public static void main(String args[]) { 
		
		//static method calling
		String str = "Shireesha";
		System.out.println(str);
		
		//using concat method 
		String str1 = str.concat("Gowda");
		System.out.println(str1);
		
		//non static method calling
		
		StringMethodExample1 s = new StringMethodExample1();
		s.show(str);
	}
	//using contain method 
	
	private void show(String str) {
		if(str.contains("Shireesha")) {
			System.out.println(" Yes Shireesha name is available...");
		}else {
			System.out.println("Yes Shireesha name is not available...");
		}
	}
	
	
		
}

	
	


