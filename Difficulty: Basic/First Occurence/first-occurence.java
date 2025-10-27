class Solution {
    int firstOccurence(String txt, String pat) {
        // code here
        int l,flag=0,index=-1;
        for(int i=0;i<txt.length();i++){
            l=i;
            if(txt.charAt(i)==pat.charAt(0)){
                for(int j=0;j<pat.length();j++){
                    if(pat.charAt(j)==txt.charAt(l)){
                        l++;
                        flag=1;
                    }else{
                        flag=0;
                        break;
                    }
                }if(flag==1){
                    index=i;
                    return index;
                }
            }
        }return index;
    }
}