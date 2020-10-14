import java.util.Arrays;
import java.util.LinkedList;

public class _0007_PrintAllMinimumCostPaths {
	private static class Node{
		int x;
		int y;
		String psf;
		public Node(int x, int y, String psf) {
			super();
			this.x = x;
			this.y = y;
			this.psf = psf;
		}
		
	}
	public static void main(String[] args) {

		int[][] arr = { { 0, 1, 4, 2, 8, 2 },
						{ 4, 3, 6, 5, 0, 4 },
						{ 1, 2, 4, 1, 4, 6 }, 
						{ 2, 0, 7, 3, 2, 2 },
						{ 3, 1, 5, 9, 2, 4 },
						{ 2, 7, 0, 8, 5, 1 } };

//		int[][] arr = { { 2,6,1,1,3 },
//						{ 9,1,1,0,5 },
//						{ 0,7,5,2,0 },
//						{ 4,3,0,4,7 },
//						{ 2,0,1,4,1 } };

		int[][] dp = new int[arr.length][arr[0].length];
		solve(arr, dp);
		bfs(dp, arr);
		 

	}

	private static void bfs(int[][] dp, int[][] arr) {
	 
		LinkedList<Node> q = new LinkedList<Node>();
		q.add(new Node(0, 0, ""));
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				
				Node curr = q.poll();
				
				int x = curr.x;
				int y = curr.y;
				String psf = curr.psf;
				
				if(x == dp.length - 1 && y == dp[0].length - 1) {
					System.out.println(psf);
				}else if(x == dp.length - 1) {
					q.add(new Node(x, y + 1, psf + "H"));
				}else if(y == dp[0].length - 1) {
					q.add(new Node(x + 1, y, psf + "V"));
				}else {
					
					if(dp[x + 1][y] < dp[x][y + 1]) {
						q.add(new Node(x + 1, y, psf + "V"));
					}else if(dp[x + 1][y] > dp[x][y + 1]) {
						q.add(new Node(x, y + 1, psf + "H"));
					}else {
						q.add(new Node(x, y + 1, psf + "H"));
						q.add(new Node(x + 1, y, psf + "V"));
					}
					
				}
				
				
				
			}
		}
		
	}

	private static void solve(int[][] arr, int[][] dp) {

		for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = dp[0].length - 1; j >= 0; j--) {
				if (i == dp.length - 1 && j == dp[0].length - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == dp.length - 1) {
					dp[i][j] = arr[i][j] + dp[i][j + 1];
				} else if (j == dp[0].length - 1) {
					dp[i][j] = arr[i][j] + dp[i + 1][j];
				} else {

//					if(dp[i + 1][j] > dp[i][j + 1]) {
//						dp[i][j] = arr[i][j] + dp[i][j + 1];
//					}else if(dp[i + 1][j] < dp[i][j + 1]) {
//						dp[i][j] = arr[i][j] + dp[i + 1][j];
//					}
					dp[i][j] = Math.min(dp[i + 1][j], dp[i][j + 1]) + arr[i][j];
				}
			}
		}

		for (int[] d : dp) {
			System.out.println(Arrays.toString(d));
		}

	}
}