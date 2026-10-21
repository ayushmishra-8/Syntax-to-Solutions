# Day 039 — Greatest Common Divisor of Strings

- **Platform:** LeetCode
- **Problem:** [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)
- **Problem Number:** 1071
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** Strings, Math, GCD

## Approach

1. Concatenate the two strings in both possible orders.
2. If `str1 + str2` differs from `str2 + str1`, return an empty string because no common repeating base string exists.
3. Calculate the GCD of the two string lengths using the Euclidean algorithm.
4. Return the prefix of `str1` whose length equals the calculated GCD.

## Complexity Analysis

Let `m` and `n` be the lengths of `str1` and `str2`.

- **Time Complexity:** O(m + n)
- **Auxiliary Space:** O(m + n) due to string concatenation.

## Key Learning

The GCD of string lengths identifies the length of the largest common repeating base string, provided both strings follow the same repeating pattern.