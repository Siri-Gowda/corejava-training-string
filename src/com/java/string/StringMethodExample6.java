package com.java.string;

public class StringMethodExample6 {
	public static void main(String args[]) {
		String candidName = "Shireesha Gowda";
		String candidCourse = "java";
		
		StringMethodExample6 str = new StringMethodExample6();
		str.checkDetails( candidName, candidCourse);
	}
		//creating non static method
		private void checkDetails(String candidName,String candidCourse) {
			System.out.println(candidName.length());
			System.out.println(candidCourse.replace("java", "python"));
			System.out.println(candidName.replaceFirst(candidName,"Anusha"));
			System.out.println(candidName.replaceAll("Veera", "JavaScript"));
			System.out.println(candidName.toLowerCase());
			System.out.println(candidName.toUpperCase());
			
		}
		

}
