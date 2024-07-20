class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int row = 0;row<accounts.length;row++){
            int rowSum = 0;
            for(int column = 0;column<accounts[0].length;column++){
                rowSum += accounts[row][column];
            }
            if(rowSum>max){
                max = rowSum;
            }
            
        }
        return max;
    }
}