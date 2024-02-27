package org.example.Exo1;

public class Palidrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j++;   /* i et j sont inverse !!!! ---->  i++ et j--*/
            j--;
        }
        return true;
    }
}
