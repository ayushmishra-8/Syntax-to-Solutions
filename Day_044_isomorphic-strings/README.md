# Day 044 — Isomorphic Strings

- **Problem:** [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)
- **LeetCode Number:** 205
- **Difficulty:** Easy
- **Language:** Java
- **Topics:** String, HashMap, Character Mapping

## Approach

1. Check whether both strings have the same length.
2. Use a HashMap to store the mapping between characters in the two strings.
3. For each character in the first string, identify its corresponding character in the second string.
4. If the character has no existing mapping, check whether the target character is already mapped to another character.
5. Store valid mappings in the HashMap.
6. Reconstruct the first string using the mappings and compare it with the second string.

## Complexity Analysis

Let `n` be the length of the strings.

- **Time Complexity:** O(n²) in the worst case, due to `containsValue()` and repeated string concatenation.
- **Auxiliary Space Complexity:** O(n), due to the HashMap and constructed string.

## Key Learning

Learned how to establish consistent character mappings using a HashMap and why reverse mapping conflicts must be prevented. Also identified opportunities to improve time complexity using more efficient mapping checks and string construction.