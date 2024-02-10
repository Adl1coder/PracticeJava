package oop_task.odev3;

public class Solution {
    public int maxWaterContainer(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int currentWater = minHeight * width;
            maxWater = Math.max(maxWater, currentWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Max water container: " + solution.maxWaterContainer(heights)); // Beklenen çıktı: 49
    }
}
