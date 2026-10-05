# Day 029 - Is Subsequence

## Problem

Given two strings `s` and `t`, determine whether `s` is a subsequence of `t`.

A subsequence is formed by deleting some or no characters from the original string without changing the order of the remaining characters.

## Approach

I used two pointers:

- One pointer tracks the current position in `t`.
- The second pointer tracks the current character needed from `s`.
- If both characters match, move the `s` pointer forward.
- Always move the `t` pointer forward.
- At the end, if all characters of `s` have been matched, return `true`.

## Example

Input:

`s = "abc"`  
`t = "ahbgdc"`

Output:

`true`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Language

Java

## Platform

LeetCode

## Key Takeaway

This problem helped me practice the two-pointer technique on strings and understand how character order can be maintained while traversing two strings.