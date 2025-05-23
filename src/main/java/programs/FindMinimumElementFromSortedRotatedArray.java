package programs;

public class FindMinimumElementFromSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; //1
        System.out.println(findMinimumElementFromSortedRotatedArray(arr));
    }

    public static int findMinimumElementFromSortedRotatedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }
}
	    //1,2,3,4,5,6
        //
        //3,4,5,6,1,2
        //
        //6 - mid
        //6 > 2{
        //left = mid+1 -> left = arr[4] i.e -> 1
        //1,2