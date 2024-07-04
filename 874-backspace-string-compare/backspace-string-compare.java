class Solution {
    public boolean backspaceCompare(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        for (int i = 0; i < len1; i++) {
            if (s.charAt(i) == '#') {
                if (str1.length() > 0) {
                    str1.deleteCharAt(str1.length() - 1);
                }
            } else {
                str1.append(s.charAt(i));
            }
        }
        for (int i = 0; i < len2; i++) {
            if (t.charAt(i) == '#') {
                if (str2.length() > 0) {
                    str2.deleteCharAt(str2.length() - 1);
                }
            }
            else{
               str2.append(t.charAt(i));
            }
        }
        s = str1.toString();
        t = str2.toString();
        return s.equals(t);
    }
}