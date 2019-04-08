package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {
    public static String[] getAllPalindromes(String string) {
        Set<String> palindromes = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (isPalindrome(string.substring(i, j))) {
                    palindromes.add(string.substring(i, j));
                }
            }
        }

        String[] arr = palindromes.toArray(new String[palindromes.size()]);
        return arr;
    }

    public static Boolean isPalindrome(String string) {
        if(string.equals(reverseString(string))) {
            return true;
        }
        return false;
    }

    public static String reverseString(String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
