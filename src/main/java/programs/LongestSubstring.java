package programs;

public class LongestSubstring {
    public static String longestSubstring(String s) {
        String res = "";
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            int previous = i;
            int next = i;
            while (previous >= 0 && next < s.length() && s.charAt(previous) == s.charAt(next)) {
                int currentLength = next - previous + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    res = s.substring(previous, next + 1);
                }
                previous--;
                next++;
            }

            previous = i;
            next = i + 1;
            while (previous >= 0 && next < s.length() && s.charAt(previous) == s.charAt(next)) {
                int currentLength = next - previous + 1;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    res = s.substring(previous, next + 1);
                }
                previous--;
                next++;
            }
        }
        System.out.println(res);
        return res;
    }
}