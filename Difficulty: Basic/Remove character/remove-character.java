// User function Template for Java
class Solution {
    static String removeChars(String str1, String str2) {
        // code here
        String res=str1.replaceAll("["+str2+"]","");
        return res;
    }
}