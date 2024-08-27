class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int h[] = Arrays.copyOf(heights, n);
        Arrays.sort(h);
        int ans= 0;
        for(int i=0; i<n; i++){
            if(h[i]!=heights[i]){
                ans++;
            }
        } 
        return ans;
    }
}