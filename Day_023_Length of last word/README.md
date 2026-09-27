# Day 023 - Length of Last Word

## Problem
Given a string `s` consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters.

## Approach

- Start from the end of the string.
- Skip any trailing spaces.
- Count characters until a space or the beginning of the string is reached.
- Return the count.

## Example

Input:
`"Hello World"`

Output:
`5`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

## Language
Java

## Platform
LeetCode

## Key Takeaway

Instead of using `split()` or creating extra arrays, the string can be processed directly from the end using two simple loops.