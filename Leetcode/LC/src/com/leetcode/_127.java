package com.leetcode;

import java.util.*;

public class _127 {

	private static class Node {
		private String word;
		private int numSteps;

		public Node(String word, int numSteps) {
			this.word = word;
			this.numSteps = numSteps;
		}

	}

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> set = new HashSet<>(wordList);
		LinkedList<Node> q = new LinkedList<>();

		q.add(new Node(beginWord, 1));

		while (!q.isEmpty()) {

			Node currNode = q.poll();
			String currWord = currNode.word;
			int numSteps = currNode.numSteps;

			if (currWord.equals(endWord)) {
				return numSteps;
			}

			char[] currWordArray = currWord.toCharArray();

			for (int i = 0; i < currWord.length(); i++) {

				char currChar = currWordArray[i];

				for (char ch = 'a'; ch <= 'z'; ch++) {

					currWordArray[i] = ch;

					String newWord = new String(currWordArray);

					if (set.contains(newWord)) {
						q.add(new Node(newWord, numSteps + 1));
						set.remove(newWord);

					}

				}

				currWordArray[i] = currChar;
			}

		}

		return 0;
	}
}
