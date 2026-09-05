# Day 007 - Move Zeroes

## Problem

Given an integer array, move all `0`s to the end of the array while maintaining the relative order of the non-zero elements.

The operation should be performed **in-place** without creating another array.

**LeetCode:** #283  
**Difficulty:** Easy

---

## Approach

I used nested loops to traverse the array.

Whenever the current element was `0`, I searched through the elements ahead of it and swapped it with the next available element.

This gradually moves the zeroes towards the end while keeping the non-zero elements in the array.

The solution modifies the original array directly without using an extra array.

---

## Complexity

- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

---

## Code

```java
class Solution {
    public void moveZeroes(int[] nums) {

        int length = nums.length;

        for (int i = 0; i < length; i++) {

            for (int j = i + 1; j < length; j++) {

                if (nums[i] == 0) {

                    int temp = nums[i];

                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return;
    }
}