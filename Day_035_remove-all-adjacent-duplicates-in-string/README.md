
# Day 035 — Remove All Adjacent Duplicates In String

- **Platform:** LeetCode
- **Problem:** [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
- **Problem Number:** 1047
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Strings, Stack

## Approach

1. Traverse the string character by character.
2. If the stack is empty or its top character differs from the current character, push the current character.
3. If both characters match, pop the top element to remove the adjacent pair.
4. Build and return the final string using the remaining stack characters.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Auxiliary Space:** O(n)

Here, `n` is the length of the input string.

## Key Learning

A stack helps remove adjacent duplicates in one pass. Removing a pair can expose another duplicate pair, which the stack handles naturally as the next characters are processed.