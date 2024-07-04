import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int len1=g.length;
        int len2=s.length;
        int output=0;
        int j=0;
        int i=0;
        while (i<len1 && j<len2) {
            if (s[j] >= g[i]) {
                output++;
                i++;
            }
            j++;
        }
        return output;
    }
}
