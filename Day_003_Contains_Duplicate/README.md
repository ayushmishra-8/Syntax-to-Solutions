# Day 003 - Contains Duplicate

## Problem

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

**LeetCode:** #217  
**Difficulty:** Easy

---

## Approach

I initially solved this problem using a brute-force approach with nested loops.

Although the logic was correct, the solution exceeded the time limit on larger test cases because every element was compared with the remaining elements.

After understanding HashSet, I implemented the optimized solution. By storing the elements that had already been seen, I could detect duplicates in a single traversal of the array.

---

## Complexity

### Brute Force

- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

### Optimized (HashSet)

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

---

## What I Learned

A solution can be logically correct and still fail because of performance constraints.

Today reinforced the importance of choosing the right data structure. Learning when to use a HashSet made the difference between a Time Limit Exceeded solution and an accepted one.

---

**Language:** Java