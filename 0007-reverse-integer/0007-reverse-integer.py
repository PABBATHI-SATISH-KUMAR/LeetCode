class Solution:
    def reverse(self, x: int) -> int:
        sign = -1 if x < 0 else 1
        x = abs(x)
        rev = 0
        while x != 0:
            rem = x % 10
            if rev > 2**31 // 10 or (rev == 2**31 // 10 and rem > 7):
                return 0
            if rev < -2**31 // 10 or (rev == -2**31 // 10 and rem < -8):
                return 0
            rev = (rev * 10) + rem
            x = x // 10
        return sign * rev