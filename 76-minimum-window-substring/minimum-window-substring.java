import java.util.HashMap;
import java.util.Map;

class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() < t.length()) {
            return "";
        }

        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        int start = 0, end = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        int required = tMap.size();  // Number of distinct characters in t
        int formed = 0;  // Number of distinct characters in the current window that match the required frequency

        while (end < s.length()) {
            char c = s.charAt(end);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);

            if (tMap.containsKey(c) && windowMap.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            while (start <= end && formed == required) {
                // Update minimum length and starting index
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                // Try to reduce the size of the window
                char startChar = s.charAt(start);
                windowMap.put(startChar, windowMap.get(startChar) - 1);

                if (tMap.containsKey(startChar) && windowMap.get(startChar).intValue() < tMap.get(startChar).intValue()) {
                    formed--;
                }

                start++;
            }

            end++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
