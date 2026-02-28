# Trapping Rain Water Problem

## Problem

Given an array arr[] of size n consisting of non-negative integers, where each element represents the height of a bar in an elevation map and the width of each bar is 1, determine the total amount of water that can be trapped between the bars after it rains.

## Thought Process

1. Left pointer to the first element, right pointer to the last element of the array
2. 2 pointers moving towards the middle, traversing each element, thus the time complexity - O(n)
3. Always consider the side (left, right) of the pointer with the smallest height (value)
4. Whatever height in the middle, it will be the constraint for that particular side of the array
5. leftMax and rightMax to hold maximum heights for each side
6. If the value of the current element is greater than the maximum of the side, update the maximum
7. Else amount of water trapped in a particular index is the difference between the maximum height of the considered side and the current height

## Complexity

- Time: $O(n)$ because each element is processed once.
- Space: $O(1)$ because no extra array is stored in the memory, just a constant number of integer variables

## Example

- Input: `[3, 0, 1, 0, 4, 0, 2]`
- Output: `10`
