package programs;

public class FindSmallestMissingNumber {
    public static int findSmallestMissingNumber(int[] arr) { //Binary Search

        //  int[] arr = {0, 1, 2, 3, 4, 6}; // 5
        //  System.out.println(findSmallestMissingNumber(arr));
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
    //Initial: left = 0, right = 5
//mid = 2 → arr[2] = 2 → match → move left = mid + 1 = 3
//mid = 4 → arr[4] = 4 → match → move left = 5
//mid = 5 → arr[5] = 6 → mismatch → move right = 4
//Now: left = 5, right = 4 → loop ends