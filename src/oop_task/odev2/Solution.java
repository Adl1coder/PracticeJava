package oop_task.odev2;
//missimg number
public class Solution {
    public int eksikSayi(int[] nums) {
        int n = nums.length;
        int toplamBeklenen = n * (n + 1) / 2;
        int toplamVarOlan = 0;

        for (int num : nums) {
            toplamVarOlan += num;
        }

        return toplamBeklenen - toplamVarOlan;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test verileri
        int[] nums1 = {3, 0, 1};
        int[] nums2 = {0, 1};
        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        // Test
        System.out.println("Example 1: " + solution.eksikSayi(nums1)); // 2
        System.out.println("Example 2: " + solution.eksikSayi(nums2)); // 2
        System.out.println("Example 3: " + solution.eksikSayi(nums3)); // 8
    }
}
