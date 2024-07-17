class Solution {
    public int diagonalSum(int[][] a) {
     int mainDiagonalSum = 0;
     int antiDiagonalSum = 0;
     int middle=0;
     for (int i = 0; i < a.length; i++) {
        mainDiagonalSum += a[i][i];
        antiDiagonalSum += a[i][a.length - 1 - i];
        if (a.length % 2 != 0 && i == a.length / 2) {
            middle = a[i][i];
        }
    }
    int sum = mainDiagonalSum + antiDiagonalSum - middle;
    return sum;   
    }
}