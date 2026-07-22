class Solution {
    public static void moveZeroes(int[] nums) {
        if (nums.length < 2){
            return;
        }
        int end = nums.length;
        for (int i = 0; i < end; i++) {
            if (nums[i] == 0 ){
                for (int j = i; j < end-1; j++) {
                    nums[j] = nums[j+1];
                }
                nums[end-1] = 0;
                end--;
                i--;
            }
        }
    }
}