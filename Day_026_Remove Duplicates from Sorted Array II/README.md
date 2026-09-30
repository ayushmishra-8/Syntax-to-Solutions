# Day 026 - Remove Duplicates from Sorted Array II

## Problem

Given a sorted integer array `nums`, remove some duplicates in-place such that each unique element appears at most twice.

Return the number of elements `k` after removing the extra duplicates.

The first `k` elements of `nums` should contain the final result.

## Approach

Since the array is already sorted, duplicate elements are next to each other.

I used a two-pointer approach:

- `i` traverses the original array.
- `k` keeps track of the position where the next valid element should be placed.
- The first two occurrences of any element are always allowed.
- If `nums[i]` is equal to `nums[k - 2]`, that element has already appeared twice, so it is skipped.
- Otherwise, it is placed at `nums[k]`.

## Example

Input:

`[1,1,1,2,2,3]`

Output:

`5`

Modified array:

`[1,1,2,2,3]`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Language

Java

## Platform

LeetCode

## Key Takeaway

The sorted nature of an array can simplify duplicate-related problems.

Instead of swapping or creating another array, valid elements can be placed directly into the same array using two pointers.