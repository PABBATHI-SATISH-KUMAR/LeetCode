class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        
        // Add elements from nums1 to the set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Check if elements in nums2 are in set1 and add to intersectionSet
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }
        int[] ans = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            ans[index++] = num;
        }
        
        return ans;
    }
}