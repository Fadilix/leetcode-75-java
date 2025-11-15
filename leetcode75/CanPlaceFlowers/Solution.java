package CanPlaceFlowers;

public class Solution {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {

                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return n <= count;
    }

    public static void main(String[] args) {
        // int[] flowerbed = { 1, 0, 0, 0, 1 };
        // int[] flowerbed = { 1, 0, 0, 0, 0, 1 };
        int[] flowerbed = { 0, 0, 1, 0, 1 };
        int n = 1;
        System.out.println(Solution.canPlaceFlowers(flowerbed, n));
    }
}
