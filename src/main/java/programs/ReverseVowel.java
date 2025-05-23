package programs;

import java.util.Arrays;
import java.util.List;

public class ReverseVowel {
    public static char[] reverseVowel(String st) {
        int start = 0;
        int end = st.length() - 1;
        char[] stArr = new char[st.length()];
        while (start < end) {
            while (!isVowel(st.charAt(start))) {
                stArr[start] = st.charAt(start);
                start++;
            }
            while (!isVowel(st.charAt(end))) {
                stArr[end] = st.charAt(end);
                end--;
            }
            while (isVowel(st.charAt(start)) && (isVowel(st.charAt(end)))) {
                char c1 = st.charAt(start);
                char c2 = st.charAt(end);
                char temp = c1;
                c1 = c2;
                c2 = temp;
                stArr[start] = c1;
                stArr[start] = c2;
            }
        }
        return stArr;
    }

    public static boolean isVowel(char c) {
        List<Character> li = Arrays.asList('a', 'e', 'i', 'o', 'u');
        if (li.contains(c)) {
            return true;
        } else {
            return false;
        }
    }
}