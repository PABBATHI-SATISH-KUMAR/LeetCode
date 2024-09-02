

class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        def find_first(nums, target):
            start, end = 0, len(nums) - 1
            first_pos = -1
            while start <= end:
                mid = (start + end) // 2
                if nums[mid] == target:
                    first_pos = mid
                    end = mid - 1  # Move left to find the first occurrence
                elif nums[mid] < target:
                    start = mid + 1
                else:
                    end = mid - 1
            return first_pos

        def find_last(nums, target):
            start, end = 0, len(nums) - 1
            last_pos = -1
            while start <= end:
                mid = (start + end) // 2
                if nums[mid] == target:
                    last_pos = mid
                    start = mid + 1  # Move right to find the last occurrence
                elif nums[mid] < target:
                    start = mid + 1
                else:
                    end = mid - 1
            return last_pos

        first = find_first(nums, target)
        last = find_last(nums, target)
        return [first, last]

