import java.util.Arrays;
import java.util.LinkedList;


public class Test {
	
	private static class Node{
		int index;
		int size;
		long jump;
		String psf;
		public Node(int index, int size, long jump, String psf) {
			super();
			this.index = index;
			this.size = size;
			this.jump = jump;
			this.psf = psf;
		}
		
	}

	public static void main(String[] args) {

		int[] arr = { 3, 3, 0, 2, 1, 2, 4, 2, 0, 0 };
		Long[] dp = new Long[arr.length];
		
		int minJumpsReq = (int) solve(arr, 0, dp);
		System.out.println(minJumpsReq);
		dp[dp.length - 1] = (long) 0;
		System.out.println(Arrays.toString(dp));
		dfs(dp, arr);
	}

	private static void dfs(Long[] dp, int[] arr) {
		
		LinkedList<Node> q = new LinkedList<Test.Node>();
		
		q.add(new Node(0, arr[0], dp[0], "0"));
		
		while(!q.isEmpty()) {
			
			int size = q.size();
			
			for(int i = 0; i < size; i++) {
				Node curr = q.poll();
				
				if(curr.index == arr.length - 1) {
					System.out.println(curr.psf);
				}
				
				
				for(int j = 1; j <= curr.size && curr.index + j < arr.length; j++) {
					 
					if(dp[curr.index + j] != Integer.MAX_VALUE && dp[curr.index + j] == curr.jump - 1) {
						q.add(new Node(curr.index + j, arr[curr.index + j], dp[curr.index + j], curr.psf + (curr.index + j)));
					}
				}
				
			}
			
		}
		
		
	}

	private static long solve(int[] arr, int idx, Long[] dp) {

		if (idx >= arr.length) {
			return Integer.MAX_VALUE;
		}

		if (idx == arr.length - 1) {
			return 0;
		}

		long min = Integer.MAX_VALUE;

		for (int i = 1; i <= arr[idx]; i++) {
			min = Math.min(min, 1 + solve(arr, idx + i, dp));
		}

		return dp[idx] = min;
	}

}