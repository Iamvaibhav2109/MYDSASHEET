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
//end = 0:

//ch = 'a'
//'a' is not in charIndexMap.
//Update charIndexMap to {'a': 0}.
//Update maxLen to max(0, 0 - 0 + 1) = 1.

//end = 3:
//ch = 'a'
//'a' is in charIndexMap, with the last occurrence at index 0.
//Update start to max(0, 0 + 1) = 1.
//Update charIndexMap to {'a': 3, 'b': 1, 'c': 2}.
//Update maxLen to max(3, 3 - 1 + 1) = 3.