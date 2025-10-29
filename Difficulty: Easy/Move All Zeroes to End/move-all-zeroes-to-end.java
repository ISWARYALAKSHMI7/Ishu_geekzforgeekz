class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[ind];
                arr[ind]=temp;
                ind++;
            }
        }
    }
}