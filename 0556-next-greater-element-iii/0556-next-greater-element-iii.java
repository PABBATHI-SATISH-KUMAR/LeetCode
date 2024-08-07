class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;

        
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        
        if (i == -1) {
            return -1;
        }

        
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        
        swap(digits, i, j);

       
        reverse(digits, i + 1, len - 1);

       
        try {
            long result = Long.parseLong(new String(digits));
            return (result <= Integer.MAX_VALUE) ? (int) result : -1;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private void swap(char[] digits, int i, int j) {
        char temp = digits[i];
        digits[i] = digits[j];
        digits[j] = temp;
    }

    private void reverse(char[] digits, int start, int end) {
        while (start < end) {
            swap(digits, start, end);
            start++;
            end--;
        }


    
    }
}
