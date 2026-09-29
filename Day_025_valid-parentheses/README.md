# Day 025 - Valid Parentheses

## Problem

Given a string containing the characters `(`, `)`, `{`, `}`, `[` and `]`, determine if the input string is valid.

A string is valid when:
- Every opening bracket has a matching closing bracket.
- Brackets are closed in the correct order.
- Every closing bracket has a corresponding opening bracket.

## Approach

I used a **Stack** to keep track of opening brackets.

### Steps

1. Traverse the string from left to right.
2. If the character is an opening bracket, push it into the stack.
3. If the character is a closing bracket:
   - Check if the stack is empty.
   - Pop the top opening bracket.
   - Check whether it matches the current closing bracket.
4. If any pair does not match, return `false`.
5. At the end, return `true` only if the stack is empty.

## Example

Input:
`"()[]{}"`

Output:
`true`

Input:
`"(]"`

Output:
`false`

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Language

Java

## Platform

LeetCode

## Key Takeaway

This problem helped me understand the practical use of a Stack.

The most recently opened bracket needs to be matched first, which makes Stack a natural choice for this problem.