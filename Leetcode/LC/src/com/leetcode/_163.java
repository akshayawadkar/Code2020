package com.leetcode;

import java.util.*;

public class _163 {

	public static void main(String[] args) {

		int[] nums = { 0, 1, 3, 50, 75 };
		List<String> result = solve(nums, 0, 99);
		// [2, 4->49, 51->74, 76->99]

		System.out.println(result);
	}

	private static List<String> solve(int[] nums, int lower, int upper) {

		List<String> result = new ArrayList<>();

		int start = lower;

		for (int i = 0; i < nums.length; i++) {

			if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
				continue;
			}

			if (nums[i] == start) {
				start++;
			} else {

				result.add(getRange(start, nums[i] - 1));

				if (nums[i] == Integer.MAX_VALUE) {
					return result;
				}

				start = nums[i] + 1;
			}

		}

		if (start <= upper) {
			result.add(getRange(start, upper));
		}

		return result;

	}

	private static String getRange(int n1, int n2) {

		return n1 == n2 ? n1 + "" : n1 + "->" + n2;
	}
}
