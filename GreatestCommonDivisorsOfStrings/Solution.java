package GreatestCommonDivisorsOfStrings;

class Solution {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();

        if (!((str1 + str2).equals(str2 + str1))) {
            return "";
        }

        return str1.substring(0, gcd(len1, len2));
    }

    public static void main(String[] args) {
        System.out.println(Bruteforce.gcdOfStrings("LEET", "CODE"));
    }
}
