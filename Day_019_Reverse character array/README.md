# Day 019 - Reverse String

## Problem

Write a function that reverses a string.

The input is given as a character array, and the string must be reversed in-place.

**LeetCode:** #344
**Difficulty:** Easy

---

## Approach

I used the two-pointer approach.

- `i` starts from the beginning of the array.
- `j` starts from the end.
- Swap `s[i]` and `s[j]`.
- Move `i` forward and `j` backward.
- Continue until both pointers meet.

### Code

```java
class Solution {
    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            char temp = s[i];

            s[i++] = s[j];
            s[j--] = temp;
        }

        return;
    }
}