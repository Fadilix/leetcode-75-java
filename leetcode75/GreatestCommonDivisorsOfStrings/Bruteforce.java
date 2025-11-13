package GreatestCommonDivisorsOfStrings;

/**
 * Bruteforce approach
 * It is actually working
 **/
class Bruteforce {

    public static boolean valid(String str1, String str2, int k) {
        int len1 = str1.length(), len2 = str2.length();

        if (len1 % k > 0 || len2 % k > 0) {
            return false;
        } else {
            String base = str1.substring(0, k);
            return str1.replace(base, "").isEmpty() && str2.replace(base, "").isEmpty();
        }
    }

    public static String gcdOfStrings(String str1, String str2) {

        for (int i = Math.min(str1.length(), str2.length()); i > 0; --i) {
            if (valid(str1, str2, i)) {
                return str1.substring(0, i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(Bruteforce.gcdOfStrings("LEET", "CODE"));
    }
}
