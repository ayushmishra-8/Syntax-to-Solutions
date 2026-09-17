# Day 014 — Search a 2D Matrix

**LeetCode #74 — Medium**

## Problem

You are given an `m x n` integer matrix with the following properties:

* Each row is sorted in ascending order.
* The first integer of each row is greater than the last integer of the previous row.

Given a target integer, return `true` if it exists in the matrix, otherwise return `false`.

## Example

```text
Matrix:

1   3   5   7
10  11  16  20
23  30  34  60

Target = 3

Output: true
```

Another example:

```text
Target = 13

Output: false
```

## Approach

The matrix is sorted in a way that allows us to treat it like a single sorted 1D array.

Instead of searching each row separately, I used one Binary Search across the entire matrix.

For each `mid` index, I converted it into a matrix position:

```java
int row = mid / cols;
int col = mid % cols;
```

Then I compared `matrix[row][col]` with the target and adjusted the search range accordingly.

## Java Solution

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true;
            }

            if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
```

## Complexity

* **Time Complexity:** `O(log(m * n))`
* **Space Complexity:** `O(1)`

## Key Takeaway

Today's main takeaway was learning how a sorted 2D matrix can be treated like a sorted 1D array and searched using a single Binary Search.

The important part was converting the 1D index into a matrix row and column using division and modulo.

**Topic:** 2D Arrays, Matrix, Binary Search
**Language:** Java
**Platform:** LeetCode
