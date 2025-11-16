package MergeStringsAlternatively;

/**
 * This solution is more efficient because
 * use two pointers and reduce the number of operations compared to
 * the @Solution.java
 **/
public class Solution2 {
   public String mergeAlternately(String word1, String word2) {
        StringBuilder answer = new StringBuilder("");
        int i = 0, j = 0;
        int m = word1.length();
        int n = word2.length();

        while (i < m || j < n) {
            if (i < m) {
                answer.append(word1.charAt(i++));
            }

            if (j < n) {
                answer.append(word2.charAt(j++));
            }
        }

        return answer.toString();
    } 
}