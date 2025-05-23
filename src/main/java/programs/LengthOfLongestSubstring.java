package programs;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
    public static String lengthOfLongestSubstring(String s) {
        //String input = "abcabcbb";
        //3, Longest substring length: abc
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int startIndex = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                if (right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                    startIndex = left;
                }
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxLength);
        //return s.substring(startIndex, maxLength); // It will return abc
        return s.substring(startIndex, startIndex + maxLength);
    }
}