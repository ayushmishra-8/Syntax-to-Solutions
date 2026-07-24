# Day 002 - Remove Duplicates from Sorted Array

## Problem

Given a sorted integer array, remove the duplicates in-place such that each unique element appears only once and return the number of unique elements.

**LeetCode:** #26  
**Difficulty:** Easy

---

## Approach

Since the array is already sorted, duplicate elements always appear next to each other.

I used a variable `k` to keep track of the position where the next unique element should be placed.

While traversing the array, I compared the current element with its previous element.

- If both elements were the same, I skipped the current element.
- If they were different, I placed the current element at index `k` and incremented `k`.

This allowed me to solve the problem in-place without using any extra array.

---

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## Code

```java
class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[j - 1]) {
                nums[k] = nums[j];
                k++;
            }
        }

        return k;
    }
}
```

---

## What I Learned

At first, I tried solving this problem using nested loops because that was the most natural approach that came to my mind.

After understanding the property of a sorted array, I realized that comparing each element with its previous one was enough to identify duplicates.

This problem taught me that understanding the input can often simplify the solution more than writing additional code.

---

**Language:** Java