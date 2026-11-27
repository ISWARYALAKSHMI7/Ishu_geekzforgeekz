# 0 - 1 Knapsack Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two arrays,  **val[]**  and  **wt[]**, where each element represents the value and weight of an item respectively, and an integer  **W**  representing the maximum capacity of the knapsack (the total weight it can hold).

Put the items into the knapsack such that the total value obtained is maximum without exceeding the capacity W.

 **Note:** You can either include an item completely or exclude it entirely — fractional selection of items is not allowed. Each item is available only once.

 **Examples :** 

```
Input: W = 4, val[] = [1, 2, 3], wt[] = [4, 5, 1]
Output: 3
Explanation: Choose the last item, which weighs 1 unit and has a value of 3.
```

```
Input: W = 3, val[] = [1, 2, 3], wt[] = [4, 5, 6] 
Output: 0
Explanation: Every item has a weight exceeding the knapsack's capacity (3).
```

```
Input: W = 5, val[] = [10, 40, 30, 50], wt[] = [5, 4, 2, 3] 
Output: 80
Explanation: Choose the third item (value 30, weight 2) and the last item (value 50, weight 3) for a total value of 80.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T06:41:58.806Z  

```java
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

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1)