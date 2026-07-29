# Day 006 - Valid Palindrome

## Problem

Given a string `s`, return `true` if it is a palindrome after converting all uppercase letters into lowercase and removing all non-alphanumeric characters. Otherwise, return `false`.

**LeetCode:** #125 - Valid Palindrome

## Approach

* Use two pointers, one starting from the beginning and the other from the end.
* Skip all non-alphanumeric characters.
* Convert both characters to lowercase before comparing them.
* If any pair of characters does not match, return `false`.
* If all characters match, return `true`.

## Time Complexity

**O(n)**

## Space Complexity

**O(1)**

## What I Learned

Today I learned that not every character in a string is always important for comparison.

By ignoring non-alphanumeric characters and comparing the remaining characters in lowercase, the problem becomes much simpler.

This problem also helped me strengthen my understanding of the Two Pointers technique and how it can solve string problems efficiently without using extra space.
