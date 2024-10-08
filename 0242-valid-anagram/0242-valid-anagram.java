class Solution {
    public boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        
        int[] freq = new int[26];  
        
        for (int i = 0; i < str1.length(); i++) {
           
            freq[Character.toLowerCase(str1.charAt(i)) - 'a']++;
            freq[Character.toLowerCase(str2.charAt(i)) - 'a']--;
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0)
                return false;
        }
        
        return true;
    }
}
