# Day 028 - First Unique Character in a String

**LeetCode #387 - Easy**

## Problem

Given a string `s`, find the first character that appears only once in the string.

If no unique character exists, return `-1`.

## Example

```text
Input:
"loveleetcode"

Output:
2
```

The first unique character is `v`, which is present only once and is at index `2`.

## Approach

I used a frequency array of size `26` to store the count of each lowercase English character.

- First, traverse the string and count the frequency of each character.
- Use `s.charAt(i) - 'a'` to map each character to an index in the frequency array.
- Traverse the string again.
- If the frequency of the current character is `1`, return its index.
- If no unique character is found, return `-1`.

## Java Solution

```java
class Solution {
    public int firstUniqChar(String s) {

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
```

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

The frequency array always has a fixed size of `26`.

## Key Takeaway

This problem helped me understand how frequency counting can be used to efficiently find unique elements in a string. Using a fixed-size frequency array keeps the solution simple and efficient.

**Topic:** Strings, Frequency Counting  
**Language:** Java  
**Platform:** LeetCode