class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        
        def backtrack(combination, start, current_sum):
            if current_sum == target:
                result.append(list(combination))
                return
            if current_sum > target:
                return
            for i in range(start, len(candidates)):
                combination.append(candidates[i])
                backtrack(combination, i, current_sum + candidates[i])
                combination.pop()
        
        backtrack([], 0, 0)
        return result
