class Solution {
    public int numberOfPath(int[][] mat, int k) {
        int n = mat.length, m = mat[0].length;
        int[][][] dp = new int[n][m][k + 1];

        if (mat[0][0] <= k)
            dp[0][0][mat[0][0]] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int sum = 0; sum <= k; sum++) {
                    if (i == 0 && j == 0) continue;
                    int val = mat[i][j];
                    if (sum - val >= 0) {
                        if (i > 0) dp[i][j][sum] += dp[i - 1][j][sum - val];
                        if (j > 0) dp[i][j][sum] += dp[i][j - 1][sum - val];
                    }
                }
            }
        }

        return dp[n - 1][m - 1][k];
    }
}
