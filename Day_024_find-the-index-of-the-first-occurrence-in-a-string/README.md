# Day 024 — Find the Index of the First Occurrence in a String

**LeetCode #28 — Easy**

## Problem

Given two strings `haystack` and `needle`, return the index of the first occurrence of `needle` in `haystack`.

If `needle` is not part of `haystack`, return `-1`.

## Example

```text
Input:
haystack = "sadbutsad"
needle = "sad"

Output:
0
```

The first occurrence of `"sad"` starts at index `0`.

## Approach

I used a simple manual string matching approach without using built-in methods like `indexOf()`.

* Start from every possible position in `haystack`.
* Compare the characters of `needle` with the characters of `haystack` starting from that position.
* If all characters of `needle` match, return the current starting index.
* If no complete match is found, return `-1`.

The loop only checks positions where the complete `needle` can fit inside `haystack`.

## Java Solution

```java
class Solution {
    public int strStr(String haystack, String needle) {

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            int j = 0;

            while (j < needle.length()
                    && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i;
            }
        }

        return -1;
    }
}
```

## Complexity

* **Time Complexity:** O(n × m)
* **Space Complexity:** O(1)

Where `n` is the length of `haystack` and `m` is the length of `needle`.

## Key Takeaway

The key takeaway from this problem was understanding how string matching works by comparing characters manually. It also helped me practice nested loops and index handling without relying on built-in string search methods.

**Topic:** Strings, String Matching
**Language:** Java
**Platform:** LeetCode
