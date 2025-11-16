class Solution:
    @staticmethod
    def mergeAlternately(word1: str, word2: str) -> str:
        len1, len2 = len(word1), len(word2)
        i, j = 0, 0

        ans = ""
        while i < len1 or j < len2:
            if i < len1:
                ans += word1[i]
            
            if j < len2:
                ans += word2[i]
            i+= 1
            j+= 1
        return ans

print(Solution.mergeAlternately("abc", "pqr"))