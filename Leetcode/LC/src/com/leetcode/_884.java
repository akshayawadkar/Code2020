package com.leetcode;

public class _884 {

	public boolean backspaceCompare(String S, String T) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < S.length()) {

			if (sb.length() != 0 && S.charAt(i) == '#') {
				sb.deleteCharAt(sb.length() - 1);
			} else if (S.charAt(i) != '#') {
				sb.append(S.charAt(i));
			}
			i++;
		}

		System.out.println(sb);
		String r1 = sb.toString();
		sb = new StringBuilder();

		i = 0;
		while (i < T.length()) {

			if (sb.length() != 0 && T.charAt(i) == '#') {
				sb.deleteCharAt(sb.length() - 1);
			} else if (T.charAt(i) != '#') {
				sb.append(T.charAt(i));
			}
			i++;
		}

		System.out.println(sb);
		String r2 = sb.toString();
		return r1.equals(r2);
	}

}
