class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = {}
        for i, num in enumerate(nums):
            partner = target - num
            if partner in seen:
                return [seen[partner], i]
            seen[num] = i