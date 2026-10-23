# Day 040 — Maximum Number of Vowels in a Substring of Given Length

- **Platform:** LeetCode
- **Problem:** [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)
- **Problem Number:** 1456
- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Strings, Sliding Window

## Approach

1. Count the vowels in the first window of length `k`.
2. Store this count as the initial maximum.
3. Slide the window one character at a time.
4. Add one if the incoming character is a vowel.
5. Subtract one if the outgoing character is a vowel.
6. Update the maximum vowel count after each move.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(1)

Here, `n` is the length of the input string.

## Key Learning

A fixed-size sliding window allows us to maintain a running count by updating only the characters entering and leaving the window, avoiding repeated calculations.