# Two Sum - Pair with given Sum

## Problem

Given an array arr[] of n integers and a target value, check if there exists a pair whose sum equals the target.

## Thought Process

1. Unsorted array
2. Associated with finding a pair
3. Two Pointers pattern if sorted, Hash map/set otherwise
4. Iterate once while storing seen numbers in a hash map.
5. For each number, check whether the complement (target minus current value) exists in the map.
6. If it does, a valid pair exists; otherwise, add the current number to the map.

## Complexity

- Time: $O(n)$ because each element is processed once.
- Space: $O(n)$ for the hash map storing elements.

## Example

- Input: `[0, -1, 2, -3, 1]`, target `-2`
- Available pair: `(1, -3)`
- Output: `true`
