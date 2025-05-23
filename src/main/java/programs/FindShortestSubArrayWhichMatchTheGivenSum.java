package programs;

public class FindShortestSubArrayWhichMatchTheGivenSum {
    public static int findShortestSubArrayWhichMatchTheGivenSum(int[] arr, int k) {
        //int[] arr = {2, 4, 6, 10, 2, 1};
        //int k = 12;
        int sum = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            while (sum >= k) {
                if (sum == k) {
                    length = Math.min(length, (i - start) + 1);
                }
                sum -= arr[start++];
            }
        }
        return length;
    }
}