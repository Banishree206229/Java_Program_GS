package programs;

import java.util.Arrays;

public class AbsoluteDifference {
    public static void main(String[] args) {
        int[] arr = {10,4,3,8}; //o/p - [15, 1, 6, 17]
        System.out.println(Arrays.toString(absoluteDifference(arr)));
    }
    public static int[] absoluteDifference(int[] arr){
        int[] result = new int[arr.length];
        int sum = 0;
        for(int num:arr){
            sum += num;
        }
        int leftSum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum - arr[i];
            result[i] = Math.abs(leftSum - sum);
            leftSum += arr[i];
        }
        return result;
    }
}
