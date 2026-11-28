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