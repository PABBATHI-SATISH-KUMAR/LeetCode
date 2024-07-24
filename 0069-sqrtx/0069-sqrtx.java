class Solution {
    public int mySqrt(int x) {
        if (x < 2) {
            return x; 
        }

        int s = 1;
        int e = x / 2; 
        int result = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2; 

           
            long square = (long) mid * mid;

            if (square == x) {
                return mid; 
            } else if (square < x) {
                s = mid + 1;
                result = mid; 
            } else {
                e = mid - 1;
            }
        }

        return result; 
    }
}