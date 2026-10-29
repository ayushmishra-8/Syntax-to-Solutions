class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);
        
        int maxStreak = 1;
        int currentStreak = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            int currEle = nums[i];
            int rightEle = nums[i + 1];

            if (rightEle == currEle + 1) {
                currentStreak++;
            } else if (rightEle != currEle) {
                maxStreak = Math.max(maxStreak, currentStreak);
                currentStreak = 1; 
            }
        }

        return Math.max(maxStreak, currentStreak);
    }
}