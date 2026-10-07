# Day 030 - Intersection of Two Arrays II

## Problem

Given two integer arrays `nums1` and `nums2`, return their intersection.

Each element in the result should appear as many times as it appears in both arrays.

## Approach

I used a sorting and two-pointer approach.

### Steps

1. Sort both arrays.
2. Use one pointer for each array.
3. Compare the elements at both pointers.
4. If they are equal:
   - Add the element to the result.
   - Move both pointers forward.
5. If the element in `nums1` is smaller, move the `nums1` pointer.
6. Otherwise, move the `nums2` pointer.
7. Return only the portion of the result array that contains valid elements.

## Example

Input:

`nums1 = [1,2,2,1]`

`nums2 = [2,2]`

Output:

`[2,2]`

## Complexity

- Time Complexity: O(n log n + m log m)
- Space Complexity: O(min(n, m)) for the result array

## Language

Java

## Platform

LeetCode

## Key Takeaway

Sorting both arrays made it possible to use two pointers and efficiently find the common elements while correctly handling duplicates.