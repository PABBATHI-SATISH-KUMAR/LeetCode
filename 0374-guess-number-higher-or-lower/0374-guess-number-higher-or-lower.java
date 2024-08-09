/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;  // Calculate mid point to avoid overflow
            int result = guess(mid);  // Call the guess API
            
            if (result == 0) {
                return mid;  // The guessed number is correct
            } else if (result < 0) {
                right = mid - 1;  // The picked number is lower
            } else {
                left = mid + 1;  // The picked number is higher
            }
        }
        
        return -1;  // This should never be reached if input constraints are valid
    }
}
