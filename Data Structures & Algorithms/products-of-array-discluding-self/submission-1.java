class Solution {
    public int[] productExceptSelf(int[] nums) {

        int zeroCount = 0;
        int product = 1;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                product *= num;
            }
        }

        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (zeroCount > 1) {
                output[i] = 0;
            }
            else if (zeroCount == 1) {
                output[i] = (nums[i] == 0) ? product : 0;
            }
            else {
                output[i] = product / nums[i];
            }
        }

        return output;
    }
}