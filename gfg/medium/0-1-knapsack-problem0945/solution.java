class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        int n = val.length;
        
        int[][] dp = new int[n][W+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        
        return solve(W, val, wt, n-1, dp);
    }
    
    public static int solve(int w, int[] val, int[] wt, int index,int[][] dp){
        
        if(0 == index){
            if(wt[0] <= w){
                return val[0];
            }
            return 0;
        }
        
        if(dp[index][w] != -1){
            return dp[index][w];
        }
        
        int take = 0;
        if(wt[index] <= w){
            take = val[index] + solve(w - wt[index], val, wt, index - 1, dp);
        }
        int nottake = solve(w, val, wt, index - 1, dp);
        
        dp[index][w] = Math.max(take, nottake);
        
        return dp[index][w];
    }
}
