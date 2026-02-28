# Shift Zeros to the End Problem

## Problem

Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

## Thought Process

1. Involves mainitaining a boundary between 2 zones
2. Unidirectional two pointers strategy
3. Fast pointer (Read) to iterate through every element in the array
4. Slow pointer (Write) to keep track of the index where the next non zero number should be placed

## Complexity

- Time: $O(n)$ because each element is processed once.
- Space: $O(1)$ because no extra array is stored in the memory.

## Example

- Input: `[1, 2, 0, 4, 3, 0, 5, 0]`
- Output: `[1, 2, 4, 3, 5, 0, 0, 0]`
