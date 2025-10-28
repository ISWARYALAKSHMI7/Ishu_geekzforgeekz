// User function Template for Java

class Solution {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> k=new ArrayList<>();
        int mk=matrix.length;
        for(int i=0;i<mk;i++){
            if(i%2==0){
                for(int j=0;j<mk;j++){
                    k.add(matrix[i][j]);
                }
            }else{
                for(int j=mk-1;j>=0;j--){
                    k.add((matrix[i][j]));
                }
            }
        }return k;
    }
}