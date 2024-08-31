class Solution:
    def canAliceWin(self, nums: List[int]) -> bool:
        oneDigit = sum(filter(lambda x: x < 10, nums))
        sm = sum(nums)
        return sm %2 != 0 or oneDigit != sm//2