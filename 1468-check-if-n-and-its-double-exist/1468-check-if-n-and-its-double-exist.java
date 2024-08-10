class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr.length;j++)
        //     {
        //         if(arr[i]==(2*arr[j]) && i!=j)
        //         return true;
        //     }
        // }

        // return false;

        Arrays.sort(arr);
        int start, end;
        
        for (int i = 0; i < arr.length; i++) {
            int product = arr[i] * 2;
            start = 0;
            end = arr.length - 1;
            
            while (start <= end) {
                int mid = start + (end - start) / 2;
                
                if (arr[mid] == product && mid != i) {
                    return true;
                } else if (arr[mid] < product) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        
        return false;
    }
}