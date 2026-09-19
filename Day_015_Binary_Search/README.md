# Day 015 — Binary Search

## Problem

**LeetCode #704 — Binary Search**

Given a sorted array of integers `nums` and an integer `target`, return the index of `target` if it exists in the array. Otherwise, return `-1`.

## Approach

I used the **Binary Search** algorithm.

The array is sorted, so instead of checking every element one by one, I repeatedly check the middle element:

* If `nums[mid] == target`, return `mid`.
* If `nums[mid] < target`, search in the right half.
* If `nums[mid] > target`, search in the left half.
* If the target is not found, return `-1`.

With every iteration, the search space is reduced by approximately half.

## Example

```text
Input:
nums = [-1, 0, 3, 5, 9, 12]
target = 9

Output:
4
```

## Complexity

* **Time Complexity:** `O(log n)`
* **Space Complexity:** `O(1)`

## Key Takeaway

The main thing I learned from this problem is that a sorted array allows us to eliminate half of the search space after every comparison, making Binary Search much faster than a simple linear search.
ig