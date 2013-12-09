##Under The Hood
The source consists of three parts:

+ the grammar: [Intly.g4] [1]
+ a lex/parser [intly/parser/*] [4] generated via [antlr4] [2] 
+ the runtime: [intly/runtime/*] [3].

The lex/parser can be regenerated via `ant parser`.

##### What happens when you run: `intly examples/fib.int 3`?

+ The program reads [examples/fib.int] [5] and passes it to the lex/parser which builds an antlr4 syntax tree.
+ The [src/intly/ProgramBuilder.java] [6] class is used to walk the syntax tree creating a runtime tree. 
+ The arguments are then passed to the "main" method in the runtime tree which will call children methods until it errors or returns the resulting value. ProgramBuilder.java acts like something between a SAX and DOM parser. Events are fired for each element but the entire tree downward is available at every step.

[1]: https://github.com/johnbradley/Intly/blob/master/Intly.g4            "Language Grammar"
[2]: https://github.com/antlr/antlr4                                      "ANTLR4"
[3]: https://github.com/johnbradley/Intly/tree/master/src/intly/runtime   "Runtime Source"
[4]: https://github.com/johnbradley/Intly/tree/master/src/intly/parser    "Lex/Parser Source"
[5]: https://github.com/johnbradley/Intly/tree/master/fib.int             "Fibonacci calculator intly source"
[6]: https://github.com/johnbradley/Intly/blob/master/src/intly/ProgramBuilder.java  "Program builder source"
