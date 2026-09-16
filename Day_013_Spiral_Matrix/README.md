# Day 013 - Spiral Matrix

## Problem

Given a matrix, return all its elements in spiral order.

The elements should be traversed from the outer layer toward the center.

**LeetCode:** #54
**Difficulty:** Medium

---

## Approach

I used four boundaries to keep track of the current portion of the matrix:

- `top` - top row
- `bottom` - bottom row
- `left` - left column
- `right` - right column

For each layer, I traversed the matrix in four directions:

1. Left to Right across the top row
2. Top to Bottom along the right column
3. Right to Left across the bottom row
4. Bottom to Top along the left column

After each traversal, the corresponding boundary is moved inward.

Additional boundary checks are used to avoid processing the same elements again when the remaining portion becomes a single row or column.

---

## Complexity

- **Time Complexity:** O(rows × cols)
- **Space Complexity:** O(rows × cols)

The space is used for storing the returned list of elements.

---

## Code

```java
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}