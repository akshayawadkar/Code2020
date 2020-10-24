import java.util.*;

public class _008_CountDistinctSubsequences {

	public static void main(String[] args) {

		String ip = "abcbac";
		int count = solve(ip);
		System.out.println(count);
	}

	private static int solve(String ip) {

		Map<Character, Integer> map = new HashMap<>();
		int n = ip.length();
		int[] dp = new int[n + 1];
		dp[0] = 1;

		for (int i = 1; i < dp.length; i++) {

			if (map.containsKey(ip.charAt(i - 1))) {
				dp[i] = (dp[i - 1] * 2) - dp[map.get(ip.charAt(i - 1)) - 1];
			} else {
				map.put(ip.charAt(i - 1), i);
				dp[i] = dp[i - 1] * 2;
			}
		}

		System.out.println(Arrays.toString(dp));
		return dp[n];
	}

}
