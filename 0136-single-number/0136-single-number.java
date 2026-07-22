class Solution {
    public static int singleNumber(int[] nums) {
        int unique_no =  nums[0];

        for (int i = 1; i < nums.length; i++) {
            unique_no ^= nums[i];
        }
        
        return unique_no;
    }
}