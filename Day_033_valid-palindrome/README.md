# Day 033 — Valid Palindrome II

- **Platform:** LeetCode
- **Problem:** [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/)
- **Problem Number:** 680
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Strings, Two Pointers

## Approach

1. Initialize two pointers at the beginning and end of the string.
2. If both characters match, move the pointers inward.
3. If they don't match, check two possibilities:
   - Skip the left character.
   - Skip the right character.
4. Use a helper method to verify whether either remaining substring is a palindrome.
5. Return `true` if either possibility works.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## Key Learning

When a mismatch occurs, checking both possible single-character deletions helps solve the problem without creating new strings.