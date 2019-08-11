package com.Brian;

public class Palindrome {
	public static void main(String[] args) {
		String phrase = "canoe";
		String palindrome = "kayak";
		String empty = "";
		System.out.println(isPalindrome(phrase));
		System.out.println(isPalindrome(palindrome));
		System.out.println(isPalindrome(empty));
	}
	
	public static boolean isPalindrome(String input) {
		int length = input.length();
		int c = 0;
		if (length < 1) return false;

		
		while (c <= length / 2) {
			if (input.charAt(c) != input.charAt(length - 1 - c)) {
				return false;
			}
			c++;
		}
		return true;
	}
}
