# Did the AI correctly implement the pseudocode on first attempt?
The AI implemented most of the pseudocode correctly on the first attempt. The overall structure, loop logic, and swap operations were accurate for both Gnome Sort and Cocktail Shaker Sort. However, some corrections were needed involving generic syntax, loop boundaries, and method declarations.

# Did AI preserve the exact variable names from pseudocode?
Most of the time, yes, but only when explicitly instructed. If the prompt was too vague, the AI occasionally renamed variables to follow standard Java naming conventions. Stating “Do not rename variables from the pseudocode” was necessary to preserve exact naming.

# How well did AI handle the generic Comparable implementation?
The AI handled generics fairly well. It correctly used bounded generic syntax such as:

```java
>
```
and used `compareTo()` properly for comparisons. This allowed the sorting algorithms to work with multiple data types like `Integer` and `String`.

# What corrections or clarifications were needed?
The main corrections included:
- Fixing generic syntax
- Adjusting loop conditions
- Preserving exact pseudocode variable names
- Correcting swap placement logic
- Clarifying use of `compareTo()` instead of relational operators

# Had you heard of Gnome Sort or Cocktail Shaker Sort before this project?
No. Before this project, I was much more familiar with common algorithms like Bubble Sort and Selection Sort. Gnome Sort and Cocktail Shaker Sort were mostly new to me.

# How did using AI help (or hinder) learning these new algorithms?
AI helped by quickly translating pseudocode into working Java code. Seeing the algorithms execute made the logic easier to understand. However, relying too much on generated code could reduce understanding if the code was accepted without reviewing it carefully.

# Did relying on AI affect your understanding of how these algorithms work?
At first, yes. It was easy to focus on getting working code instead of understanding the logic. However, reviewing and debugging the generated code improved my understanding significantly.

# Could you explain the algorithm logic without referring to the code?
Yes.
- Gnome Sort works by comparing adjacent elements and swapping them when they are out of order, moving backward after swaps until order is restored.
- Cocktail Shaker Sort works similarly to Bubble Sort but moves in both forward and backward directions through the array during each pass.

# Was the AI-generated code readable and well-structured?
Yes. The generated code was generally clean, readable, and properly indented. The methods were logically organized and easy to follow.

# Did it include appropriate comments?
Sometimes. Some generated versions included useful comments explaining loop behavior and comparisons, while others had very minimal comments or overly obvious comments.

# How did AI handle the generic type constraints for Comparable
The AI handled generic constraints correctly by using `Comparable` and `compareTo()` consistently. This ensured compatibility with multiple object types.

# Were there any efficiency issues or unnecessary complexity?
There were minor cases of unnecessary complexity, such as redundant helper methods, extra temporary variables, and overly defensive conditions. These issues were not major but required cleanup.

# What prompt strategies worked best for algorithm generation?
The best prompts included:
- Exact pseudocode
- Required method signatures
- Explicit generic syntax requirements
- Variable naming restrictions
- Clear implementation constraints
Specific prompts produced much better results than broad or vague requests.

# How did you ensure AI would use exact variable names?
I explicitly instructed AT not to rename any variables from the pseudocode.

# How specific did you need to be about generic types and Comparable?
I needed to be very specific. The prompt needed to clearly state that the implementation must use:
```java
>
```
and use `compareTo()` for all comparisons.

# What would you do differently next time?
Next time, I would:
- Provide expected input/output examples
- Include testing requirements earlier
- Specify comment expectations
- Define formatting and style requirements more clearly

# Did AI identify all important edge cases?
AI identified many important edge cases, including:
- Empty arrays
- Single-element arrays
- Already sorted arrays
- Reverse sorted arrays
- Duplicate values
However, some additional edge cases still needed to be added manually.

# Did AI suggest testing with different Comparable types (Integer, String)?
Yes. AI suggested testing with both `Integer` and `String` arrays, which helped verify the generic implementation.

# Were there gaps in test coverage you had to fill?
Yes. Additional tests were needed for:
- Large randomized arrays
- Arrays with many duplicates
- Boundary index conditions
- Additional generic behavior checks

# How comprehensive were AI-generated test assertions?
The assertions were generally strong and correctly validated sorted output. Most tests compared expected and actual arrays accurately.

# Were the tests actually validating correct behavior?
Yes. The tests correctly verified sorting behavior and validated outputs across multiple scenarios.

# Did AI generate any unnecessary or redundant tests?
Yes. Some tests repeated similar scenarios and did not add much additional value.

# How did AI-generated tests compare to tests you would write manually?
AI-generated tests were faster to produce and covered standard cases efficiently. However, manually written tests tended to focus more on subtle edge cases and specific logic failures.

# Did tests properly verify generic type behavior?
Yes. The tests verified that the sorting algorithms worked correctly with multiple `Comparable` types such as `Integer` and `String`.

# How much time did AI assistance save in test development?
AI saved a significant amount of time, especially when generating boilerplate test structures, assertions, and multiple test scenarios.

# What aspects of testing still required manual effort?
- Debugging
- Identifying missing edge cases
- Verifying correctness
- Ensuring alignment with assignment requirements

# When was AI most/least helpful in the testing process?
AI was most helpful during initial test generation and brainstorming edge cases. It was least helpful during debugging.

# Did AI help you think of test cases you wouldn't have considered?
Yes. AI suggested several useful edge cases, especially involving generic type behavior and unusual array configurations that I would not have considered immediately.
