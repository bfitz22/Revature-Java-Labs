package com.Brian;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		
		values.add(2);
		values.add(2);
		values.add(1);
		values.add(1);
		values.add(5);
		
		System.out.println(values);
		
		bubbleSort(values);
		
		System.out.println(values);
		
		int[] a = new int[0];
		System.out.println(a[1/0]);
	}
	
	public static void bubbleSort(List<Integer> list) {
		int x = 0;
		int y = 1;
		int temp;
		
		if (list.size() < 2) return;
		
		while (x < list.size() - 1) {
			y = x + 1;
			while (y < list.size()) {
				if (list.get(y) < list.get(x)) {
					temp = list.get(x);
					list.set(x, list.get(y));
					list.set(y, temp);
				}
				y++;
			}
			x++;
		}
	}
}
