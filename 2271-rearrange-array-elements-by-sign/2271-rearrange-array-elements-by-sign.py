class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        positive =  []
        negative = []
        for i in nums:
            if i >= 0:
                positive.append(i)
            else:
                negative.append(i)
        for i in range(len(nums)//2):
            nums[2*i] = positive[i]
            nums[2*i+1] = negative[i]
        return nums
