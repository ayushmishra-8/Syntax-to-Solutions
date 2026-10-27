# Day 043 — Ransom Note

- **Problem:** [Ransom Note](https://leetcode.com/problems/ransom-note/)
- **LeetCode Number:** 383
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Array, Frequency Counting

## Approach

1. Compare the lengths of `ransomNote` and `magazine`. If `magazine` is shorter, return `false`.
2. Create an integer array of size 26 to store character frequencies.
3. Traverse `magazine` and count each character using `c - 'a'` as the index.
4. Traverse `ransomNote` and check whether each required character is available.
5. Return `false` if a character's frequency is zero; otherwise, decrement its frequency.
6. Return `true` if all characters can be constructed.

## Complexity Analysis

- **Time Complexity:** O(n + m), where `n` is the length of `magazine` and `m` is the length of `ransomNote`.
- **Auxiliary Space Complexity:** O(1), because the frequency array always contains 26 elements.

## Key Learning

Initially considered a HashMap, then used a fixed-size frequency array after analysing the input constraints. This reinforced the importance of selecting an appropriate data structure for a problem.