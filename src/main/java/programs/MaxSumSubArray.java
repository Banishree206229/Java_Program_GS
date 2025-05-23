package programs;//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 //Output: 6
 //Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class MaxSumSubArray {
    public static int maxSumSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
//(O(n^2) - time complexity && O(1) - space complexity)
//(OR)->

    public static int maxSumSubArray1(int[] num) {
        int sum = 0, maxSum = 0;
        for (int i = 0; i < num.length; i++) {
            if (sum + num[i] >= num[i]) {
                sum += num[i];
            } else {
                sum = num[i];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}