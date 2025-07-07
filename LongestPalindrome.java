import java.util.HashMap;
import java.util.Map;

class Solution {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c: s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int oneFreqPresent = 0;
        int count = 0;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            
            int freq = entry.getValue();

            if (freq % 2 == 1) {
                oneFreqPresent++;
            } 
            
            count+= (freq/2) * 2;
            
        }

        return oneFreqPresent > 0 ? count + 1: count;
    }
}