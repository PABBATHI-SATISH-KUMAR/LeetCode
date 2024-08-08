class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer> result = new ArrayList<>();
        if (a == null || a.length == 0) return result;

        int top = 0;
        int left = 0;
        int right = a[0].length - 1;
        int bottom = a.length - 1;

        while (left <= right && top <= bottom) {
            
            for (int i = left; i <= right; i++) {
                result.add(a[top][i]);
            }
            top++;

            
            for (int i = top; i <= bottom; i++) {
                result.add(a[i][right]);
            }
            right--;

            
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(a[bottom][i]);
                }
                bottom--;
            }

            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(a[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }
}