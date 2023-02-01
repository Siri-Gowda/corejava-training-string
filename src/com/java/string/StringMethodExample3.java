package com.java.string;

public class StringMethodExample3 {
	public static void main(String args[]) {
		String str1 = "Hello,";
		String str2 = "java";
		String str3 = " Reader ";
		//concatenating strings
		String str4 = str1.concat(str2).concat(str3);
		System.out.println(str4);
		//special characters
		String str5 = str1.concat("!!!");
		System.out.println(str5);
		String str6 = str1.concat("@").concat(str2);
		System.out.println(str6);
		
		//non static method calling
		StringMethodExample3 s = new StringMethodExample3();
		s.showLogical(str5);	
	}
	private void showLogical(String str5) {
		if(str5.contains(str5));
		System.out.println("yes its true");
	}
	

}
