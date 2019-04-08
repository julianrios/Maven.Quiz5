package rocks.zipcode.io.quiz4.fundamentals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> noDupes = new HashSet<>();

        for(int i = 0; i < string.length(); i++) {
            for(int j = i + 1; j <= string.length(); j++) {
                noDupes.add(string.substring(i, j));
            }
        }
        String[] arr = noDupes.toArray(new String[noDupes.size()]);
        return arr;
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        Set<String> commonElements = new HashSet<>();
        String[] arr1 = getAllSubstrings(string1);
        String [] arr2 = getAllSubstrings(string2);

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    commonElements.add(arr1[i]);
                }
            }
        }
        String[] arr = commonElements.toArray(new String[commonElements.size()]);
        return arr;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] arr = getCommonSubstrings(string1, string2);
        System.out.println(Arrays.toString(arr));
        String largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (largest.length() < arr[i].length()) {
                largest = arr[i];
            }
        }
        return  largest;
    }
}
