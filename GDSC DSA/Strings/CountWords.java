java.util.*;
public class CountWords {
    public static void main(String[] args) {
        s = "ab\toy\t";

    }

    int countwords(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count += 1;
            }
            if (s.charAt(i) == '\t') {
                count += 1;
            }
            if (s.charAt(i) == '\n') {
                count += 1;
            }
        }
        return count;
    }
}