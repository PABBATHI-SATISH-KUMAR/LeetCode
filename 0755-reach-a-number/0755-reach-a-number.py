class Solution:
    def reachNumber(self, target: int) -> int:
        target = abs(target)  
        numMoves = 0
        total = 0

        while total < target or (total - target) % 2 != 0:
            numMoves += 1
            total += numMoves
        
        return numMoves
