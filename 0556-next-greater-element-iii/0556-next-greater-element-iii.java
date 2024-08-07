class Solution {
    public int nextGreaterElement(int n) {
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;

        // Step 1: Find the pivot point
        int i = len - 2;
        while (i >= 0 && digits[i] >= digits[i + 1]) {
            i--;
        }

        // If no pivot is found, return -1
        if (i == -1) {
            return -1;
        }

        // Step 2: Find the swap point
        int j = len - 1;
        while (digits[j] <= digits[i]) {
            j--;
        }

        // Swap the pivot with swap point
        swap(digits, i, j);

        // Step 3: Reverse the suffix
        reverse(digits, i + 1, len - 1);

        // Convert back to integer and check if it fits in a 32-bit signed integer
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
