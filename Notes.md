##Under The Hood
This program consits of three parts 
*the grammar: ```Intly.g4``` 
*a lex/parser generated via antlr4 
*the runtime: ```intly/runtime/*```.

The lex/parser can be regenerated via ``ant parser``.

When you run: ```intly examples/fib.int 3```. The program reads the text and passes it through the antlr generated lex and parser to create an antlr syntax tree: ```intly/parser/IntlyLexer.java```  and ``intly/parser/IntlyParser.java```.

Then the runtime listener is run against this tree acting like a sax parser. This has the unusual feature of having access to the entire syntax tree from the a point downward. 
The runtime listener generates a tree that is used for executing the script.
