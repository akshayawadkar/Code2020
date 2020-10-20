package com.leetcode;

import java.util.*;

public class _347 {

	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
			return map.get(b) - map.get(a);
		});
		pq.addAll(map.keySet());

		int[] result = new int[k];
		int index = 0;

		while (index < result.length) {
			result[index++] = pq.poll();
		}

		return result;
	}

}
