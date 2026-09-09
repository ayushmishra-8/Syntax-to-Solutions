# Day 009 - Matrix Diagonal Sum

## Problem

Given a square matrix, calculate the sum of the elements present on both the primary and secondary diagonals.

If the matrix has an odd size, the middle element belongs to both diagonals and should only be counted once.

**LeetCode:** #1572  
**Difficulty:** Easy

---

## Approach

I used a single loop to traverse the matrix.

For each row:

- `mat[i][i]` gives the element from the primary diagonal.
- `mat[i][n - 1 - i]` gives the element from the secondary diagonal.

For an odd-sized matrix, the center element is included in both diagonals. I subtract it once to make sure it is counted only once.

---

## Complexity

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

---

## Code

```java
class Solution {
    public int diagonalSum(int[][] mat) {

        int n = mat.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            sum += mat[i][n - 1 - i];
        }

        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}