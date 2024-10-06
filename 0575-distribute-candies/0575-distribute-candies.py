class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        max_candy = int(len(candyType)/2)
        x = len(set(candyType))
        if x > max_candy:
            return max_candy
        else:
            return x
        
        