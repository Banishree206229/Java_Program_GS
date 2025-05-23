package programs;

public class FindMinLength {
    public static int findMinLength(String str, String word1, String word2) {
         str = "the quick the brown quick brown the frog";
         word1 = "quick";
         word2 = "frog";
        String[] arr = str.split(" ");
        int l1 = -1;
        int l2 = -1;
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word1)) {
                l1 = i;
            }
            if (arr[i].equals(word2)) {
                l2 = i;
            }
            if (l1 != -1 && l2 != -1) {
                result = Math.min(result, Math.abs(l2 - l1));
            }
        }
        return result;
    }
}