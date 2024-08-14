class Solution {
    public boolean isNumber(String s) {
        // Regular expression to match a valid number
        String regex = "^[+-]?(\\d+\\.?\\d*|\\.\\d+)([eE][+-]?\\d+)?$";
        return s.matches(regex);
    }
}
