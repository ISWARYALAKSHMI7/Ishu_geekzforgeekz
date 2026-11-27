class Solution {
  public int knapsack(int w,int val[], int wt[]) {
    // code here
    int n = val.length;

    int[] dp = new int[w + 1];
    
    for (int cap=wt[0];cap<= w; cap++) {
        if (wt[0] <= cap) {
            dp[cap] = val[0];
        }
    }

    for (int i = 1; i < n; i++) {
      for (int cap = w; cap>=wt[i];cap--){
          

        int take = val[i]+ dp[cap-wt[i]];
    
        int nottake = dp[cap];
          
        dp[cap]=Math.max(take, nottake);
        
        }
    }

    return dp[w];

  }
}
