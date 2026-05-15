## Empirical Results

| Input Size | Pattern | Gnome Sort | Cocktail Shaker Sort | Shell Sort |
|---:|---|---:|---:|---:|
| 100 | Sorted | 0.6084 ms | 0.0136 ms | 0.0399 ms |
| 100 | Random | 0.3399 ms | 0.3492 ms | 0.0580 ms |
| 100 | Reverse | 0.5564 ms | 0.5252 ms | 0.0337 ms |
| 1,000 | Sorted | 0.0432 ms | 0.0420 ms | 0.3461 ms |
| 1,000 | Random | 8.5263 ms | 4.3727 ms | 0.5871 ms |
| 1,000 | Reverse | 4.0895 ms | 7.2742 ms | 0.5236 ms |
| 10,000 | Sorted | 0.0759 ms | 0.0730 ms | 2.6908 ms |
| 10,000 | Random | 110.2926 ms | 193.9540 ms | 2.0738 ms |
| 10,000 | Reverse | 190.9825 ms | 196.5800 ms | 1.3739 ms |

## Complexity Comparison

Gnome Sort and Cocktail Shaker Sort both showed quadratic behavior on random and reverse-sorted inputs. As the input size increased, their running times also increased.

## Performance Analysis

The sorted arrays were the easiest case for Gnome Sort and Cocktail Shaker Sort because the data was already in order, so fewer swaps were needed. Shell Sort was slower with the sorted arrays. For random data, Shell Sort was the fastest algorithm. At 10,000 random elements, Shell Sort completed in 2.0738 ms, while Gnome Sort took 110.2926 ms and Cocktail Shaker Sort took 193.9540 ms. For reverse-sorted data, Gnome Sort and Cocktail Shaker Sort were the slowest because this pattern required many swaps. Shell Sort still performed efficiently. Overall, Shell Sort was the best-performing algorithm. Gnome Sort was simple but inefficient on large unsorted arrays. Cocktail Shaker Sort improved on basic bubble-style sorting by moving in both directions, but it wasn't good for larger datasets.

## Code Generation Effectiveness

The AI was helpful in generating the sorting algorithm implementations from pseudocode. It handled the overall algorithm structure well, including loops, comparisons, and swap logic.However, the AI needed clear instructions to preserve the exact variable names from the pseudocode. This was important because the project rubric required exact variable names. The AI also needed to be told specifically to use generic Comparable syntax such as `<T extends Comparable<T>>` and to compare values using `compareTo()`. Overall, AI was effective.

## Test Generation Effectiveness

AI was useful for generating a strong starting point for unit tests. It suggested important edge cases such as empty arrays, single-element arrays, sorted arrays, reverse-sorted arrays, duplicate values, and arrays containing Strings.The AI-generated tests helped save time, but manual review was still necessary to make sure the tests actually matched the project requirements. Some tests were also adjusted to better verify generic Comparable behavior.

## Learning Unfamiliar Algorithms with AI

Before this project, I had never heard of Gnome Sort and Cocktail Shaker Sort. AI helped make the algorithms easier to understand by converting pseudocode into working Java code.The most helpful part was being able to compare the code, test results, and performance results together. This made it easier to understand how each algorithm behaved with different input patterns.At the same time, relying only on AI would not have been enough. I still had to review the code, run the driver, inspect the output, and understand why the performance results were different. This helped me learn the algorithms instead of just copying the implementation.