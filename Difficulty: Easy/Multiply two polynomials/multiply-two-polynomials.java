// User function Template for Java
class Solution {
    public int[] multiply(int[] A, int[] B) {
        // code here
        int[] res=new int[(A.length+B.length)-1];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                res[i+j]+=A[i]*B[j];
            }
        }return res;
    }
}