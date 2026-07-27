# Day 005 - Valid Anagram

## Problem

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, otherwise return `false`.

**LeetCode:** #242  
**Difficulty:** Easy

---

## Approach

I converted both strings into character arrays using `toCharArray()`.

Then, I sorted both arrays using `Arrays.sort()`.

Since anagrams contain the same characters with the same frequency, both sorted arrays become identical. Finally, I compared them using `Arrays.equals()`.

---

## Complexity

- **Time Complexity:** O(n log n)
- **Space Complexity:** O(n)

---

## Code

```java
import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();

        Arrays.sort(arrS);
        Arrays.sort(arrT);

        return Arrays.equals(arrS, arrT);
    }
}
```

---

## What I Learned

This problem taught me that comparing two strings isn't always the best approach.

Sometimes, converting the data into a form that's easier to compare leads to a much cleaner solution.

I also learned how to use `toCharArray()`, `Arrays.sort()`, and `Arrays.equals()` together to solve string-based problems.

---

**Language:** Java