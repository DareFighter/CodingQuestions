package Sorting;

public class SortString {

    public static String countSort(String arr) {
        // Initialize a count array for all lowercase English letters (26 letters)
        int[] count = new int[26];

        // Count the occurences of each character in the input string
        for (int i = 0; i < arr.length(); i++) {
            count[arr.charAt(i) - 'a']++;
        }

        // Build the sorted string using the count Array
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }

        }

        return sortedString.toString();
    }

}
