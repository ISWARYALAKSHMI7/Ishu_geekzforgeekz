# Subset Sum Problem

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of positive integers  **arr[]**  and a value  **sum**, find if there is a subset of arr[] with sum equal to given sum. 

 **Examples:** 

```
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 9
Output: true 
Explanation: Here there exists a subset with target sum = 9, 4+3+2 = 9.

```

```
Input: arr[] = [3, 34, 4, 12, 5, 2], sum = 30
Output: false
Explanation: There is no subset with target sum 30.
```

```
Input: arr[] = [1, 2, 3], sum = 6
Output: true
Explanation: The entire array can be taken as a subset, giving 1 + 2 + 3 = 6.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T08:17:57.996Z  

```java
class Solution {
    static boolean isSubsetSum(int arr[], int sum) {
        
        int n = arr.length;
        boolean[] dp = new boolean[sum+1];

        dp[0] = true;
        if(arr[0] <= sum){
            dp[arr[0]] = true;
        }

    for(int i = 1;i < arr.length; i++){
        for(int cap =sum;cap >=arr[i]; cap--){

        boolean not = dp[cap];
        
        boolean take = false;

        if (cap >= arr[i]) {
            take=dp[cap - arr[i]];
        }

        dp[cap]=take || not;
    }
}
return dp[sum];
}}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1)