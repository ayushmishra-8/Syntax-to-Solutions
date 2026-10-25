# Day 041 — Reverse Vowels of a String

- **Problem:** [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/)
- **LeetCode Number:** 345
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, Two Pointers

## Approach

1. Convert the input string into a character array.
2. Initialize two pointers at the beginning and end of the array.
3. Move the left pointer until it finds a vowel.
4. Move the right pointer until it finds a vowel.
5. Swap the vowels and move both pointers inward.
6. Convert the character array back into a string and return it.

## Complexity Analysis

- **Time Complexity:** O(n) — Each pointer traverses the string at most once.
- **Space Complexity:** O(n) — The character array stores the string's characters.

## Key Learning

Practised the two-pointer technique to reverse only the vowels while keeping all other characters in their original positions.