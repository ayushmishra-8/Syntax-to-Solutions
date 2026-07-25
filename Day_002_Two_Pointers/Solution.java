package Day_002_Two_Pointers;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;// we already know we have atleast 1 unique element.Here,k counts unique
                  // elements.
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }
        return k;
    }
}