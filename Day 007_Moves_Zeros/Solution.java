class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                   
                    nums[i] = nums[j ];
                    nums[j] = temp;
                }
            }
        }
        return;
    }
}