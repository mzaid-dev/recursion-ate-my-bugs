class Solution {
    public static int[] rearrangeArray(int[] nums) {
        int[] pos = new int[nums.length/2];
        int[] neg = new int[nums.length/2];

        int i = 0;
        int j = 0;
        for (int num : nums){
            if (num > 0){
              pos[i++] = num;
            }else {
                neg[j++] = num;
            }
        }

        int ii = 0;
        int jj = 0;

        for (int k = 0; k < nums.length; k++) {
            nums[k++] = pos[ii++];
            nums[k] = neg[jj++];

        }

        return  nums;
    }
}