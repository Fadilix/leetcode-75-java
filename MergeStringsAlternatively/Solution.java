package leetcode75.MergeStringsAlternatively;

public class Solution {
   public String mergeAlternately(String word1, String word2) {
        int maxLength = Math.max(word1.length(), word2.length());
        int minLength = Math.min(word1.length(), word2.length());

       StringBuilder answer = new StringBuilder("");

        for (int i = 0; i < maxLength; i++) {
            if (i >= minLength) {
                if (word1.length() == minLength) {
                    answer.append(word2.substring(i));
                    break;
                } else {
                    answer.append(word1.substring(i));
                    break;
                }
            } else {
                answer.append(word1.substring(i, i+1) + word2.substring(i, i +1));
            }
        }
        return answer.toString();
    } 
}