# class Solution:
#     @staticmethod
#     def gcdOfStrings(str1: str, str2: str) -> str:
#         m = min(len(str1), len(str2))

#         for i in range(m, -1, -1):
#             sub = str1[:i]
#             if str1.replace(sub, "") == "" and str2.replace(sub, "") == "":
#                 return str1[:i]
#         return ""

# print(Solution.gcdOfStrings("ABCABC", "ABC"))


# more efficient
class Solution:
    def gcd(self, a, b):
        if b == 0:
            return a
        return self.gcd(b, a % b)

    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""
        
        g = self.gcd(len(str1), len(str2))
        return str1[:g]


solution = Solution()

print(solution.gcdOfStrings("ABCABC", "ABC"))

