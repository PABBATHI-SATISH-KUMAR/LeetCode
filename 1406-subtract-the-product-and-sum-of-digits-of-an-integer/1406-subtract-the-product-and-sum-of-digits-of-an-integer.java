class Solution {
    public int subtractProductAndSum(int n) {
        int rem = 0;
        int sum = 0;
        int product = 1;
        while(n>0){
            rem = n%10;
            n/=10;
            sum += rem;
            product *= rem;
        }
        return (product-sum);
        
    }
}