/**
 * Time limit exceeded at 59/65 on leetcode
 * I will optimize this in another file
 **/

class BruteforceOn2 {
    public static int maxArea(int[] height) {

        int maxSoFar = Integer.MIN_VALUE;

        for (int i = 0; i < height.length; i++) {
            int lockedI = height[i];
            for (int j = i; j < height.length; j++) {
                int distance = j - i;

                int minValue = Math.min(lockedI, height[j]);
                maxSoFar = Math.max(maxSoFar, minValue * distance);
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(BruteforceOn2.maxArea(height));
    }
}