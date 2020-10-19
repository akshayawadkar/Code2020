package com.leetcode;

import java.util.*;

public class _243 {

	public static void main(String[] args) {

		String[] words = { "practise", "makes", "perfect", "coding", "makes" };
//		int minDist = solve(words, "makes", "coding");
		int minDist = solve2(words, "coding", "practise");

		System.out.println(minDist);

	}

	private static int solve2(String[] words, String word1, String word2) {
		int m = -1;
		int n = -1;

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(word1)) {
				m = i;

				if (n != -1) {
					min = Math.min(min, m - n);
				}
			}

			if (words[i].equals(word2)) {
				n = i;
				if (m != -1) {
					min = Math.min(min, n - m);
				}
			}

		}

		return min;
	}

	private static int solve(String[] words, String word1, String word2) {

		Map<String, List<Integer>> map = new HashMap<>();

		for (int i = 0; i < words.length; i++) {
			if (map.containsKey(words[i])) {
				map.get(words[i]).add(i);
			} else {
				map.put(words[i], new ArrayList<>());
				map.get(words[i]).add(i);
			}
		}

		int result = Integer.MAX_VALUE;

		for (int i : map.get(word1)) {
			for (int j : map.get(word2)) {
				result = Math.min(result, Math.abs(i - j));
			}
		}

		return result;
	}

}
