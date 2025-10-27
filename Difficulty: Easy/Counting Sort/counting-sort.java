class Solution {
    public static String countSort(String s) {
        // code here
        int []count=new int[26];
        for(int i=0;i<s.length();i++){
            int temp=(int)(s.charAt(i))-97;
            count[temp]++;
        }
        StringBuilder sb=new StringBuilder(s.length());
        for(int i=0;i<26;i++){
            for(int j=0;j<count[i];j++){
                sb.append((char)(i+97));
            }
        }return sb.toString();
    }
}