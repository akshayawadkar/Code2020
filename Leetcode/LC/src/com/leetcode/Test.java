package com.leetcode;

import java.util.*;

class Test {

	public static void main(String[] args) {

		int[] arr = { 0, 1, 3, 50, 75 };
		int start = 0, end = 99;

		List<String> result = solve(arr, start, end);
		System.out.println(result);

	}

	private static List<String> solve(int[] arr, int start, int end) {

		List<String> result = new ArrayList<String>();

		int curr = start;

		for (int i = 0; i < arr.length; i++) {
			if (curr + 1 == arr[i]) {
				curr++;
			} else {
				result.add(getString(curr, arr[i] - 1));
				curr = arr[i] + 1;
			}
		}
		
		if(curr <= end) {
			result.add(getString(curr, end));
		}

		return result;
	}

	private static String getString(int n1, int n2) {

		return n1 == n2 ? n1 + "" : n1 + "->" + n2;
	}
}