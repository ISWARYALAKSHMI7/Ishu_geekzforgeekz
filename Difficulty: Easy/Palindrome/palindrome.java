class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int temp=n;
        int rev=0;
        while(temp>0){
            int d=temp%10;
            rev=(rev*10)+d;
            temp/=10;
        }return (n==rev);
    }
}