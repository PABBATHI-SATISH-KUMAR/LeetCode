class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = piles[0];
        for(int i=1;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int low = 1;
        int high = max;
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            int hrs = 0;
            for(int i=0;i<piles.length;i++){
                hrs += Math.ceil((double)piles[i]/mid);
            }
            if(hrs<=h){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}