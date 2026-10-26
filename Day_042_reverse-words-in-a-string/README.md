# Day 042 — Reverse Words in a String

- **Problem:** [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/)
- **LeetCode Number:** 151
- **Difficulty:** Medium
- **Language:** Java
- **Topics:** String, StringBuilder, String Manipulation

## Approach

1. Use `trim()` to remove leading and trailing spaces.
2. Split the string into individual words.
3. Traverse the words from right to left.
4. Append each non-empty word to a `StringBuilder`.
5. Remove the trailing space and return the result.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the length of the input string.
- **Space Complexity:** O(n), for storing the words and constructing the result.

## Key Learning

Practised reversing word order using reverse traversal and `StringBuilder`, while handling unnecessary spaces in the input.