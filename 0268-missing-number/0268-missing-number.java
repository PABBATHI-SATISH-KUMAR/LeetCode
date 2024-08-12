class Solution {
    public int missingNumber(int[] a) {
        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < a.length; i++) {
            xor1 = xor1 ^ (i + 1); 
            xor2 = xor2 ^ a[i];    
        }
        return xor1 ^ xor2;


        // int sum=0;
        // int n=a.length;
        // for(int i=0;i<n;i++) sum=sum+a[i];
        // int diff=n*(n+1)/2;
        // return (diff-sum);

    }
}
