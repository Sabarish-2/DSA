class Solution {
    public static void rotate(int[] nums, int k) {
        int i, n = nums.length,  swap = 0;
        for (i = 0; i < n / 2 + 1; i++)
        {
            swap = nums[(i + k + 1) % n];
            nums[(i + k + 1) % n] = nums[i];
            nums[i] = swap;
        }
        // arr[(i + k) % n] = nums[i];
        // for(i = 0; i < n; i++)
        // nums[i] = arr[i];
    }

    public static void main(String[] args) {

        int[] nums1 = { 1,2,3,4,5,6,7 };

        int[] nums2 = { 5, 25, 4, 39, 57, 49, 93, 79, 7, 8, 49, 89, 2, 7, 73, 88, 45, 15, 34, 92, 84, 38, 85, 34, 16, 6,
                99, 0, 2, 36, 68, 52, 73, 50, 77, 44, 61, 48 };

        rotate(nums1, 3);
        System.out.println(nums1);
    }
}