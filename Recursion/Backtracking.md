# Backtracking

Backtracking is an algorithmic technique used to solve problems incrementally by trying out various solutions and abandoning them if they fail to satisfy the problem constraints. It is used for optimization problems, where multiple potential solutions exist, and the best one needs to be found.
> for example let's say we are sorting an array of 3 elements by finding all the possible arrangements which  will lead to n! combinations.  While on the other hand using backtracking we can decrease the number of combinations   by backtracking from the result which will lead to incorrect result based on predefined condition. 

## Key Concepts
1. **Decision Tree**: The process of backtracking can be visualized as a tree of decisions, where each node represents a decision, and branches represent the possible outcomes of that decision.
2. **Base Case**: When a solution is found, or no further decisions can be made, the algorithm backtracks to previous decisions to try other possibilities.
3. **Backtracking Step**: When a certain path is deemed non-viable, the algorithm returns (backtracks) to a previous decision point to explore other options.

## Steps in Backtracking
1. **Choose**: Choose an option from available choices.
2. **Explore**: Recursively explore all subsequent options.
3. **Unchoose (Backtrack)**: If the current choice doesn’t lead to a valid solution, undo it and try another.


## Algorithm
1. Build the solution step by step using recursion.
2. State space tree is used to find all the solutions.
3. Explore the solutions and check if constraints are satisfied.
    - If constraints are satisfied keep looking for solution.
    - Else algorithm returns to previous level.

## Example Problems
### 1. N-Queens Problem
### 2. Subset permutations