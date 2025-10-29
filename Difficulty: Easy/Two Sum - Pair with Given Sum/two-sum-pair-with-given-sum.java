class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int num:arr){
            int diff=target-num;
            if(freq.containsKey(diff)){
                return true;
            }
            freq.put(num,1);
        }return false;
        
    }
}