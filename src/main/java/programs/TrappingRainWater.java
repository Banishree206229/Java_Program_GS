package programs;

public class TrappingRainWater {
    public static int trappingRainWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int unitsOfWater = 0;
        while (left <= right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    unitsOfWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    unitsOfWater += maxRight - height[right];
                }
                right--;
            }
        }
        return unitsOfWater;
    }
}