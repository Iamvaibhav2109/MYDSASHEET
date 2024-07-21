import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        int start = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            if (charIndexMap.containsKey(ch)) {
                start = Math.max(start, charIndexMap.get(ch) + 1);
            }
            charIndexMap.put(ch, end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}
