# Day 008 - Merge Sorted Array

## Problem

You are given two sorted integer arrays, `nums1` and `nums2`.

The first `m` elements of `nums1` contain valid values, while the remaining `n` positions are empty and represented by `0`.

Merge `nums2` into `nums1` so that the final array is sorted.

The result must be stored directly inside `nums1`.

**LeetCode:** #88  
**Difficulty:** Easy

---

## Approach

I used a straightforward approach to solve the problem.

First, I placed all the elements of `nums2` into the empty positions available at the end of `nums1`.

After that, I used `Arrays.sort()` to sort the complete `nums1` array.

This approach directly modifies `nums1` and does not require creating another array.

---

## Complexity

- **Time Complexity:** O((m + n) log(m + n))
- **Space Complexity:** O(1) auxiliary space

---

## Code

```java
import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
    }
}