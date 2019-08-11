package com.Brian;

public class SubString {
	public static void main(String[] args) {
		String input = "ban";
		String test = "Azkaban";
		String input2 = "cat";
		String fail = "cartographer";
		String zero = "";
		String whatever = "whatevs";
		System.out.println(isSubString(input, test));
		System.out.println(isSubString(input2, fail));
		System.out.println(isSubString(zero, whatever));
	}
	
	public static boolean isSubString(String input, String test) {
		if (input.length() < 1 || input.length() > test.length()) return false; 
		return test.contains(input);
	}
}
