//GFG Anagram
class Solution {
        public static boolean areAnagrams(String s1, String s2) {
        // If lengths don't match
        if (s1.length() != s2.length()) return false;
                            
        int[] freq = new int[26]; 
                                    
        // Increase frequency for s1, decrease for s2
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
                                                    
        // If all frequencies are 0, they're anagrams
        for (int count : freq) {
            if (count != 0) return false;
        }
        return true;
        }
}
