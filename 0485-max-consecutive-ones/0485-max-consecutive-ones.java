class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1){
                temp = 0;

            }else {
                temp++;
            }
            max = Integer.max(max,temp);
        }

        return max;
    }
}