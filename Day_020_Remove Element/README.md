# Day 020 - Remove Element

## Problem

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in-place.

Return the number of elements in `nums` that are not equal to `val`.

The order of the remaining elements should be maintained.

**LeetCode:** #27  
**Difficulty:** Easy

---

## Approach

I used a two-pointer approach.

- `i` is used to traverse the complete array.
- `k` keeps track of the position where the next valid element should be placed.
- If `nums[i]` is not equal to `val`, it is placed at `nums[k]`.
- Then `k` is incremented.
- Finally, `k` represents the number of elements that are not equal to `val`.

### Code

```java
class Solution {
    public int removeElement(int[] nums, int val) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
