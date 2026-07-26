# Day 004 - Best Time to Buy and Sell Stock

## Problem

You are given an array where each element represents the price of a stock on a given day.

Find the maximum profit that can be achieved by buying the stock on one day and selling it on a later day.

LeetCode:#121  
Difficulty: Easy

---

## Approach

My initial solution used two nested loops to compare every possible buying and selling day.

Although the logic was correct, it exceeded the time limit for larger test cases.

I then optimized the solution by maintaining the minimum stock price seen so far.

For every new price:
- Update the minimum price if a lower price is found.
- Otherwise, calculate the profit by selling on the current day.
- Update the maximum profit whenever a better profit is found.

This allows the entire array to be processed in a single traversal.

---

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

---

## Code

```java
class Solution {
    public int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {

                int profit = prices[i] - minPrice;

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
```

---

## What I Learned

A correct solution is only the first step.

Today taught me that reducing unnecessary work is often the key to writing efficient algorithms.

Instead of comparing every possible pair, maintaining the minimum value seen so far was enough to solve the problem in linear time.

---

Language: Java