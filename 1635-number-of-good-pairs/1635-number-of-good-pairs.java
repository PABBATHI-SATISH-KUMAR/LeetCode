// class Solution {
//     public int numIdenticalPairs(int[] nums) {
//         int pc = 0;
//         for(int i = 0; i<nums.length;i++){
//             for(int j = i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]) pc++;
//             }
//         }
//         return pc;
//     }
// }


import java.util.HashMap;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pc = 0;
        
        for (int num : nums) {
            if (map.containsKey(num)) {
                pc += map.get(num); // Add the current count of this number to the pair count
            }
            map.put(num, map.getOrDefault(num, 0) + 1); // Update the frequency
        }
        
        return pc;
    }
}
