package com.leetcode;

import java.util.*;

public class _126 {

	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

		Set<String> set = new HashSet<>(wordList);

		if (!set.contains(endWord)) {
			return new ArrayList<>();
		}

		Map<String, List<String>> map = new HashMap<>();
		Set<String> starterSet = new HashSet<>();
		starterSet.add(beginWord);
		buildGrpah(set, map, starterSet, endWord);
		System.out.println(map);
		List<String> subList = new ArrayList<>();
		List<List<String>> result = new ArrayList<>();
		subList.add(beginWord);
		dfs(subList, result, beginWord, endWord, map);
		return result;
	}

	private void dfs(List<String> subList, List<List<String>> result, String beginWord, String endWord,
			Map<String, List<String>> map) {

		if (beginWord.equals(endWord)) {
			result.add(new ArrayList<>(subList));
			return;
		}

		if (!map.containsKey(beginWord)) {
			return;
		}

		for (String s : map.get(beginWord)) {
			subList.add(s);
			dfs(subList, result, s, endWord, map);
			subList.remove(subList.size() - 1);
		}

	}

	private void buildGrpah(Set<String> set, Map<String, List<String>> map, Set<String> starterSet, String endWord) {

		if (starterSet.isEmpty()) {
			return;
		}

		boolean flag = false;
		Set<String> newStarterSet = new HashSet<>();
		set.removeAll(starterSet);

		for (String word : starterSet) {
			char[] currWordArray = word.toCharArray();
			for (int i = 0; i < currWordArray.length; i++) {
				char currChar = currWordArray[i];
				for (char ch = 'a'; ch <= 'z'; ch++) {
					currWordArray[i] = ch;
					String newWord = new String(currWordArray);
					if (set.contains(newWord)) {

						if (newWord.equals(endWord)) {
							flag = true;
						} else {
							newStarterSet.add(newWord);
						}

						if (!map.containsKey(word)) {
							map.put(word, new ArrayList<>());
						}

						map.get(word).add(newWord);
					}
				}
				currWordArray[i] = currChar;
			}
		}

		if (!flag) {
			buildGrpah(set, map, newStarterSet, endWord);
		}
	}

}
