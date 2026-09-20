# Day 016 - Search Insert Position

## Problem

Given a sorted array of distinct integers and a target value, return the index if the target is found.

If the target is not found, return the index where it should be inserted to maintain the sorted order.

**LeetCode:** #35
**Difficulty:** Easy

---

## Approach

I used Binary Search to find the target efficiently.

- If `nums[mid]` equals the target, return `mid`.
- If `nums[mid]` is greater than the target, search the left half.
- If `nums[mid]` is smaller than the target, search the right half.
- If the target is not found, `left` points to the correct insertion position.

### Code

```java
class Solution {
    public int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }
}