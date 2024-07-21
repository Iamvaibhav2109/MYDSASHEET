class Solution {
    public int characterReplacement(String s, int k) {
        int maxLength=0;
        int maxCount=0;
        int start=0;
        int[] frequencyMap = new int[26]; 

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            frequencyMap[endChar-'A']++;
            //Storin maxFrequency of a character
            maxCount = Math.max(maxCount,frequencyMap[endChar-'A']);
            
            // Current window size is end - start + 1
            // If the number of characters we need to replace (current window size - max count of a single character)
            // is greater than k, we shrink the window from the start
            if (end - start + 1 - maxCount > k) {
                char startChar = s.charAt(start);
                frequencyMap[startChar - 'A']--;
                start++;
            }
            
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }   
}