# Day 017 — First Bad Version

**LeetCode #278 — Easy**

## Problem

You are given `n` versions numbered from `1` to `n`. At some point, a version becomes bad, and all versions after it are also bad.

The goal is to find the **first bad version** using the given `isBadVersion()` API.

## Example

```text
Versions:

1   2   3   4   5
G   G   G   B   B

First Bad Version = 4
```

## Approach

I used Binary Search to find the first bad version efficiently.

I maintained two pointers:

* `left` represents the starting version.
* `right` represents the ending version.
* `firstBad` stores the first bad version found.

For every iteration, I calculate the middle version.

If `isBadVersion(mid)` returns `true`, then `mid` can be the first bad version, so I store it in `firstBad` and move `right` to `mid - 1` to search for an earlier bad version.

If the middle version is not bad, I move `left` to `mid + 1`.

At the end, `firstBad` contains the first bad version.

## Java Solution

```java
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
         
        int left = 1; 
        int right = n; 
        int firstBad = 0; 

        while (left <= right) {
            int mid = left + ((right - left) / 2);

            if (isBadVersion(mid)) {
                right = mid - 1;
                firstBad = mid;
            } else {
                left = mid + 1;
            }
        }

        return firstBad;
    }
}
```

## Complexity

* **Time Complexity:** `O(log n)`
* **Space Complexity:** `O(1)`

## Key Takeaway

Today's main takeaway was understanding how Binary Search can be used to find the first occurrence of a condition, rather than searching for an exact value.

**Topic:** Binary Search
**Language:** Java
**Platform:** LeetCode
