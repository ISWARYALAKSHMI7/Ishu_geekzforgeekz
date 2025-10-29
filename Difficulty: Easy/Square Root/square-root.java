class Solution {
    int floorSqrt(int n) {
        // code here
        if((n==0)||(n==1)) return n;
        
        int start=1;
        int end=n/2;
        int approx=0;
        
        while(start<=end){
            
            long mid=(start+end)/2;
            long m=(long)mid*mid;
            
            if(m==n){
                return (int)mid;
            }
            else if(m<n){
                start=(int)mid+1;
                approx=(int)mid;
            }
            else{
                end=(int)mid-1;
            }
        }return approx;
    }
}