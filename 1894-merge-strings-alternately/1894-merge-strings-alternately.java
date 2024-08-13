class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                output += word1.charAt(i);
                i += 1;
            }
            if (j < word2.length()) {
                output += word2.charAt(j);
                j += 1; 
            }
        }
        return output;  
    }
}