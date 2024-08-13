class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        l=s.split()
        l1=[]
        i=0
        while i<len(l):
            l1.append(l[i][::-1])
            i+=1
        return ' '.join(l1)