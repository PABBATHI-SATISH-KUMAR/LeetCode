class Solution {
    public boolean isPalindrome(int n) {
        boolean isPalo = false;
        int rem,temp,rev;
        temp = n;
        rev=0;
        if(n<0) return false;
        while(n>0){
                rem = n%10;
                rev = rev*10+rem;
                n = n/10;
        }
        if(temp==rev) return true;
        else return false;
    }
}