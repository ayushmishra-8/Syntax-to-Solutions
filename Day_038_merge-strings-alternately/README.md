# Day 038 - Merge Strings Alternately

## Problem

Given two strings `word1` and `word2`, merge them by adding their characters alternately, starting with `word1`.

If one string is longer than the other, append its remaining characters to the end of the merged string.

## Approach

I used a `StringBuilder` to build the result efficiently.

### Steps

1. Store the lengths of both strings in `len1` and `len2`.
2. Iterate from index `0` up to the length of the longer string.
3. If the current index exists in `word1`, append its character.
4. If the current index exists in `word2`, append its character.
5. Convert the `StringBuilder` into a string and return it.

## Java Solution

```java
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder result = new StringBuilder("");
        int i;

        for (i = 0; i < Math.max(len1, len2); i++) {
            if (len1 > i) {
                result.append(word1.charAt(i));
            }
            if (len2 > i) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
```

## Example

**Input:**

`word1 = "abc"`

`word2 = "pqr"`

**Output:**

`"apbqcr"`

## Complexity Analysis

- **Time Complexity:** O(n + m), where n and m are the lengths of the two strings.
- **Auxiliary Space:** O(n + m) for the resulting string.

## Key Takeaway

This problem helped me practice alternating string traversal and understand how `StringBuilder` and index boundary checks can handle strings of different lengths.

## Language

Java

## Platform

LeetCode