# Day 012 - Reshape the Matrix

## Problem

Given a matrix, reshape it into a new matrix with `r` rows and `c` columns while keeping all elements in the same order.

If the total number of elements in the original matrix does not match the required `r × c` size, return the original matrix.

**LeetCode:** #566
**Difficulty:** Easy

---

## Approach

First, I calculated the number of rows and columns in the original matrix.

If the total number of elements in the original matrix is not equal to `r × c`, I return the original matrix.

Otherwise, I create a new `r × c` matrix.

I use two variables, `row` and `col`, to track the current position in the new matrix. While traversing the original matrix, each element is placed sequentially into the new matrix.

When a row of the new matrix is filled, `col` is reset to `0` and `row` is increased.

---

## Complexity

- **Time Complexity:** O(rows × cols)
- **Space Complexity:** O(r × c)

---

## Code

```java
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) {
            return mat;
        }

        int[][] output = new int[r][c];

        int col = 0;
        int row = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[row][col] = mat[i][j];

                col++;

                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return output;
    }
}