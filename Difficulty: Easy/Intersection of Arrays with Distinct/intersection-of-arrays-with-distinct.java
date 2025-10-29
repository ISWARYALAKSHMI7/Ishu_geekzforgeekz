class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        HashSet<Integer> arr=new HashSet<>();
        int count=0;
        for(int i:b) arr.add(i);
        
        for(int i:a){
            if(arr.contains(i)){
                count++;
            }
        }
        return count;
    }
}