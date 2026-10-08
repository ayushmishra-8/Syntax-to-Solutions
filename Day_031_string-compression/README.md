# Day 031 - String Compression

## Problem

Given an array of characters, compress it using the following rules:

- Consecutive repeating characters should be replaced by the character followed by its count.
- If a character appears only once, its count is not written.
- The compression must be done in-place.

Return the new length of the compressed array.

## Approach

I used two pointers.

- `i` is used to traverse the original character groups.
- `index` is used to write the compressed result.
- For each character, count how many consecutive times it appears.
- Write the character at the current `index`.
- If the count is greater than `1`, convert the count to a string and write each digit into the array.

### Example

Input:

`['a','a','b','b','c','c','c']`

Compressed:

`['a','2','b','2','c','3']`

Output length:

`6`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n) in the worst case for converting the count to a string

## Language

Java

## Platform

LeetCode

## Key Takeaway

This problem helped me practice modifying an array in-place while also handling consecutive groups and multi-digit counts.