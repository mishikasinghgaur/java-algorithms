# java-algorithms

Major Algorithms covered:

1. Backtracking
Backtracking is an algorithmic technique for solving problems incrementally by trying out all possible solutions and abandoning paths that fail to satisfy the problem constraints. It's commonly used in problems like puzzles, where you explore all possibilities until a solution is found.

Example: Solving a Sudoku puzzle involves filling the grid by trying all possible numbers in each empty cell and backtracking when a number doesn't lead to a valid solution.

2. Binary Search
Binary search is a fast search algorithm that works on sorted arrays. It repeatedly divides the search interval in half, comparing the target value to the middle element, and then reduces the search space to the half where the target could be.

Example: To find the position of number 5 in a sorted array [1, 3, 5, 7, 9], binary search would start with the middle element (5), find that it matches the target, and return the index.

3. Dynamic Programming
Dynamic programming (DP) is an optimization technique that solves complex problems by breaking them down into simpler subproblems and storing the results of subproblems to avoid redundant computations.

Example: The Fibonacci sequence can be efficiently calculated using DP by storing the results of previous computations. Instead of recalculating F(n-1) and F(n-2) multiple times, DP stores these values and reuses them.

4. Math
Mathematical algorithms involve applying mathematical formulas and principles to solve problems. These can range from basic arithmetic operations to more complex algorithms like those for finding prime numbers or solving equations.

Example: The Euclidean algorithm is a mathematical method to find the greatest common divisor (GCD) of two numbers by repeatedly applying the division process.

5. Recursion
Recursion is an algorithmic technique where a function calls itself in order to solve a problem. Recursive solutions often break a problem into smaller instances of the same problem.

Example: The classic example of recursion is calculating the factorial of a number n, where n! = n * (n-1)!, with the base case 1! = 1.

6. Sliding Window
The sliding window technique is used to optimize the process of finding a subrange (window) in a data set that satisfies certain conditions. It involves maintaining a window of elements and sliding it across the data set to find the optimal solution.

Example: In the problem of finding the maximum sum of a subarray of size k in an array, the sliding window technique can be used to keep track of the sum of the current window and slide it across the array efficiently.

7. Two-Pointer
The two-pointer technique involves using two pointers to iterate through an array or list to solve problems involving pairs or subarrays. The pointers are often moved towards each other based on certain conditions.

Example: In the problem of finding two numbers in a sorted array that sum up to a target value, two pointers can be used: one starting from the beginning and the other from the end. The pointers are moved inward based on the sum of the values they point to.