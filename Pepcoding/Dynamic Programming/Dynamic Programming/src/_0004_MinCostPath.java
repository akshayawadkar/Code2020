
public class _0004_MinCostPath {

    Integer[][] dp;
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        dp = new Integer[m + 1][n + 1];
        return solve(grid, m - 1, n - 1);
    }
    
    private int solve(int[][] grid, int m, int n){
        
        if(m < 0 || n < 0){
            return Integer.MAX_VALUE;
        }
        
        if(m == 0 && n == 0){
            return grid[m][n];
        }
        
        if(dp[m][n] != null){
            return dp[m][n];
        }
        
        return dp[m][n] = Math.min(solve(grid, m - 1, n), 
                        solve(grid, m, n -1)) + grid[m][n];
    }
}
