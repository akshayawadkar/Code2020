package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class _228 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 2, 4, 5, 7 };
		List<String> result = solve(nums);

		System.out.println(result);
	}

	private static List<String> solve(int[] nums) {

		List<String> result = new ArrayList<>();
		if (nums.length == 0 || nums == null) {
			return result;
		}

		int first = nums[0];
		int prev = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (prev + 1 == nums[i]) {
				if (i == nums.length - 1) {
					result.add(first + "->" + prev);
				}
			} else {

				if (first == prev) {
					result.add(first+"");
				} else {
					result.add(first + "->" + prev);
				}
				
				if(prev == nums.length - 1) {
					result.add(nums[i]+"");
				}

				first = nums[i];
			}

			prev = nums[i];
		}

		return result;
	}

}
