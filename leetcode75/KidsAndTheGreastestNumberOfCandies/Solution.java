package KidsAndTheGreastestNumberOfCandies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> bools = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max) {
                bools.add(true);
            } else {
                bools.add(false);
            }
        }

        return bools;
    }

}