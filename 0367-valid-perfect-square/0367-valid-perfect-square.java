class Solution {
    public boolean isPerfectSquare(int num) {
        long temp = num;
        long i = 1;
        if(num==1) return true;
        while(i<num){
            if((i*i)==temp) return true;
            i++;
        }
        return false;

        
    }
}
