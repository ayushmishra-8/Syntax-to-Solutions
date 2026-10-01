# Day 027 — Reverse Words in a String III

**LeetCode #557 — Easy**

## Problem

Given a string `s`, reverse each word individually while keeping the order of the words unchanged.

A word is separated by a single space.

## Example

```text
Input:
"Let's take LeetCode contest"

Output:
"s'teL ekat edoCteeL tsetnoc"
```

The words remain in the same order, but the characters inside each word are reversed.

## Approach

I converted the string into a character array so that the characters could be modified directly.

- Traverse the string from left to right.
- Keep track of the starting index of each word using `start`.
- When a space is found, the current word is complete.
- Use two pointers, `left` and `right`, to reverse that word.
- Move `start` to the beginning of the next word.
- Handle the last word when the loop reaches the end of the array.

## Java Solution

```java
class Solution {
    public String reverseWords(String s) {

        char[] arr = s.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            if (i == arr.length || arr[i] == ' ') {

                int left = start;
                int right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }

                start = i + 1;
            }
        }

        return new String(arr);
    }
}
```

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Key Takeaway

The key takeaway from this problem was learning how to identify individual words while traversing a string and reverse each word using two pointers without changing the order of the words.

**Topic:** Strings, Two Pointers  
**Language:** Java  
**Platform:** LeetCode