# Day 010 - Transpose Matrix

## Problem

Given a matrix, return its transpose.

The transpose of a matrix is obtained by converting its rows into columns.

**LeetCode:** #867  
**Difficulty:** Easy

---

## Approach

I created a new matrix with reversed dimensions.

If the original matrix has `rows × cols` dimensions, the result matrix will have `cols × rows` dimensions.

Using nested loops, I placed each element from:

`matrix[i][j]`

into:

`result[j][i]`

This converts the rows of the original matrix into columns of the result matrix.

---

## Complexity

- **Time Complexity:** O(rows × cols)
- **Space Complexity:** O(rows × cols)

---

## Code

```java
class Solution {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}