class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String output1 = "";
        for (String s : word1) {
            output1 += s;
        }
        String output2 = "";
        for (String s : word2) {
            output2 += s;
        }
        return output1.equals(output2);
    }
}
