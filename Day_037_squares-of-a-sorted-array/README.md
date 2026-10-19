# Day 037 — Squares of a Sorted Array

- **Platform:** LeetCode
- **Problem:** [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/)
- **Problem Number:** 977
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Arrays, Two Pointers

## Approach

1. Initialize one pointer at the beginning and another at the end of the sorted array.
2. Compare the squares of the values at both pointers.
3. Place the larger square at the current last position in the result array.
4. Move the corresponding pointer inward and move the result index backward.
5. Repeat until all elements have been processed.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n) for the result array.

Here, `n` is the length of the input array.

## Key Learning

Negative numbers can produce large squares, so comparing both ends helps identify the largest remaining square. Filling the result array from right to left avoids an additional sorting step.