# Day 045 — Longest Consecutive Sequence

- **Problem:** [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)
- **LeetCode Number:** 128
- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Array, Sorting

## Approach

1. Return `0` if the input array is empty.
2. Sort the array in ascending order.
3. Initialize `currentStreak` and `maxStreak` to `1`.
4. Traverse the array and compare each element with the next one.
5. If the next element is consecutive, increment `currentStreak`.
6. If the elements are different but not consecutive, update `maxStreak` and reset `currentStreak`.
7. Ignore duplicate elements so they do not interrupt the current streak.
8. Return the maximum of `maxStreak` and `currentStreak`.

## Complexity Analysis

- **Time Complexity:** O(n log n), due to sorting the array.
- **Auxiliary Space Complexity:** O(log n) for the sorting implementation's recursion stack in the typical case.

## Key Learning

Practised sorting, handling duplicate elements, and tracking consecutive sequences using a current streak and a maximum streak. Also identified the opportunity to optimize the solution using a HashSet.