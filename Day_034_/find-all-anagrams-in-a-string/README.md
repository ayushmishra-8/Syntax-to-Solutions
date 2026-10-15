# Day 034 — Find All Anagrams in a String

- **Platform:** LeetCode
- **Problem:** [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
- **Problem Number:** 438
- **Difficulty:** Medium
- **Language:** Java
- **Topics:** Strings, Sliding Window, Frequency Counting

## Approach

1. Create two frequency arrays of size 26 to store character counts for `p` and the initial window of `s`.
2. Compare the frequency arrays to check whether the first window is an anagram.
3. Slide the window one character at a time.
4. Increment the count of the incoming character and decrement the count of the outgoing character.
5. Whenever both frequency arrays match, add the window's starting index to the result.

## Complexity Analysis

- **Time Complexity:** O(n × 26), which simplifies to O(n) because the alphabet size is fixed.
- **Auxiliary Space:** O(1) for the two frequency arrays, excluding the result list.

Here, `n` is the length of `s`.

## Key Learning

A fixed-size sliding window avoids recounting every character from scratch. Updating frequencies as the window moves makes anagram detection efficient.