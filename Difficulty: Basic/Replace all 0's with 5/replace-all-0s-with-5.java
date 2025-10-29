/*Complete the function below*/
class Solution {
    public static int convertFive(int n) {
        // add code here.
        int res=Integer.parseInt(String.valueOf(n).replace('0','5'));
        return res;
    }
}