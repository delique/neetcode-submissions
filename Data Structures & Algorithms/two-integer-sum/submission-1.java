class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numLength = nums.length;
        int[] output = {0,1};

        for (int i = 0; i < numLength; i++) {
            for (int j = 0; j < numLength; j++) {
                if (i == j) {
                    continue;
                }
                else {
                    if ((nums[i] + nums[j]) == target) {
                        output[0] = i;
                        output[1] = j;
                        return output;
                    }
                }
            }
        }

        return output;
    }
}
