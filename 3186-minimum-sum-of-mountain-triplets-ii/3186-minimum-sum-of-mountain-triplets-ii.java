class Solution {
    public int minimumSum(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int n=nums.length;
        if(n ==  0 ) return -1;
         int prev=nums[0];
        for(int i=0;i<n-1;i++)
        {
            prev=Math.min(prev,nums[i]);
            pre[i]=prev;
        }
        prev=nums[n-1];
        for(int i=n-1;i>=0;i--)
        {
            prev=Math.min(prev,nums[i]);
            suf[i]=prev;
        }
        int c=Integer.MAX_VALUE;
        for(int i=1;i<n-1;i++)
        {
            if(pre[i-1] < nums[i] )
            {
                if(suf[i+1] < nums[i])
                {
                    c = Math.min(c,pre[i]+suf[i]+nums[i]);
                }
            }
        }
        if (c == Integer.MAX_VALUE) return -1;
        return c;
    }
}