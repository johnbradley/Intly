Intly
=====

Integer oriented programming language :)

Toy interpreted language created to play with antlr4.

Features:
* Data types: Integer
* Functions - that all return, you guessed it Integer
* Math operations: * / + -
* Statement types: if, while, return, and assignment

Example Fibonacci number calculator:
```
main(target) {
   if target < 1 {
      return -1; 
   }
   result = fib(target);
   return result;
}

fib(target) {
   if target == 1 {
      return 0; 
   }

   prev = 0;
   cur = 1;
   target = target - 2;
   while target {
      tmp = cur;
      cur = cur + prev;
      prev = tmp;
      target = target - 1;
   }
   return cur;
}
```
