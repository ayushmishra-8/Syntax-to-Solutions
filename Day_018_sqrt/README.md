# Day 018 — Sqrt(x)

**LeetCode #69 — Easy**

## Problem

Given a non-negative integer `x`, return the square root of `x` rounded down to the nearest integer.

You cannot use built-in exponent functions or operators such as `pow(x, 0.5)`.

### Example

```text
Input: x = 8
Output: 2

Explanation: The square root of 8 is approximately 2.828,
so the integer square root is 2.
```

## Approach

I used **Binary Search** to find the integer square root.

* If `x` is less than `2`, return `x` directly.
* Set the search range from `1` to `x / 2`.
* Calculate the middle value using Binary Search.
* Instead of checking `mid * mid <= x`, I used `mid <= x / mid` to avoid integer overflow for large values.
* If `mid` is a valid square root, store it in `answer` and search on the right side for a larger valid value.
* Otherwise, search on the left side.

This continues until the correct integer square root is found.

## Java Solution

```java
class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x / 2;
        int answer = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
```

## Complexity

* **Time Complexity:** O(log x)
* **Space Complexity:** O(1)

## Key Takeaway

The key takeaway from this problem was learning how Binary Search can be used to find the maximum value that satisfies a condition. I also learned why using `x / mid` instead of `mid * mid` can help avoid integer overflow.

**Topic:** Binary Search
**Language:** Java
**Platform:** LeetCode
