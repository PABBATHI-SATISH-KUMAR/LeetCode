class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        # positive =  []
        # negative = []
        # for i in nums:
        #     if i >= 0:
        #         positive.append(i)
        #     else:
        #         negative.append(i)
        # for i in range(len(nums)//2):
        #     nums[2*i] = positive[i]
        #     nums[2*i+1] = negative[i]
        # return nums


        ans = [0]*len(nums)
        pos = 0 
        neg = 1
        for i in range(len(nums)):
            if nums[i]<0:
                ans[neg] = nums[i]
                neg+=2
            else:
                ans[pos] = nums[i]
                pos+=2
        return ans

