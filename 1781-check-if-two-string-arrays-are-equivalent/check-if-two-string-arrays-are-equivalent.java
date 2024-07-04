class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n1=word1.length;
        int n2=word2.length;
        String str1="";
        String str2="";
        for(int i=0;i<n1;i++){
            str1+=word1[i];
        }
        for(int j=0;j<n2;j++){
            str2+=word2[j];
        }
            return str1.equals(str2);
    }
}