class Solution {
    public int reverse(int x) {
        int rem, rev = 0;
        while (x != 0) {
            rem = x % 10;
            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }
            rev = (rev * 10) + rem;
            x = x / 10;
        }
        return rev;
    }
}