package com.java.string;

public class StringMethodExample2 {
	public static void main(String args[]) {
		
		String str = "Hello";
		String str1 = "Java";
		String str2 = "Developer";
		//concatenating one string
		
		String str3 = str.concat(str1);
		System.out.println(str3);
		
		//concatenating multiple strings 
		
		String str4 = str.concat(str3).concat(str2);
		System.out.println(str4);
		
		//non static method calling
		StringMethodExample2 s = new StringMethodExample2();
		s.show(str);
	}		
	//using contains method

	private void show(String str) {
		if(str.contains(str));
		System.out.println("yes Hello is available...");
		}
		
	
	


}

