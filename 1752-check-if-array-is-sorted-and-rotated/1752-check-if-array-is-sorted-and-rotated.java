class Solution {
    public static boolean check(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums = rotate(nums);
            if (sorted(nums)){
                return true;
            }

        }
        return false;
    }

    public static int[] rotate(int[] nums){
        int[] temp = new int[nums.length];

        temp[0] = nums[nums.length -1];

        for (int i = 0; i < nums.length-1; i++) {
            temp[i+1] = nums[i];
        }
        return temp;
    }
    public static boolean sorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}