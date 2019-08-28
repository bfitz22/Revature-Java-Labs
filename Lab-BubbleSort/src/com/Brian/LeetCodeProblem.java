package com.Brian;

import java.util.Arrays;

public class LeetCodeProblem {
	public static void main(String[] args) {
		int arr[] = { 2, 6, 7, 5, 9, 3, -5, -7 };
		int n = 6;
		System.out.println(arraySum(arr, n));
	}
	
	static boolean arraySum(int arr[], int num) {
		int l, r;
		Arrays.sort(arr);
		l = 0;
		r = arr.length - 1;
		while (l < r) {
			if (arr[l] + arr[r] == num) {
				return true; 
			} else if (arr[l] + arr[r] < num) {
				l++;
			} else {
				r--;
			}
		}
		return false; 
	}
}