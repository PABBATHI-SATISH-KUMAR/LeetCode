class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        n = len(s)
        cost = [abs(ord(s[i]) - ord(t[i])) for i in range(n)]
        left, right = 0, 0
        current_cost = 0
        max_length = 0

        while right < n:
            current_cost += cost[right]

            while current_cost > maxCost:
                current_cost -= cost[left]
                left += 1

            max_length = max(max_length, right - left + 1)
            right += 1

        return max_length