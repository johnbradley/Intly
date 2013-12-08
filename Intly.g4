grammar Intly;

program
 : fdecl+
 ;

fdecl 
 : Name '(' fparams? ')' '{' statement+ '}'
 ;

fparams 
 : Name (',' Name)*
 ;

statement 
 : Name '=' expr ';'               #assignment
 | 'return' expr ';'               #return
 | 'if' expr '{' statement+ '}'    #if
 | 'while' expr '{' statement+ '}' #while  
 ;

expr
 : (var | integer)      #valueExpr
 | expr '*' expr        #multExpr
 | expr '/' expr        #divExpr
 | expr '+' expr        #addExpr
 | expr '-' expr        #subExpr
 | expr '<' expr        #ltExpr
 | expr '<=' expr       #leExpr
 | expr '>' expr        #gtExpr
 | expr '>=' expr       #geExpr
 | expr '==' expr       #eqExpr
 | Name '(' params ')'  #funcExpr
 ;

params : (var_or_int) (',' (var_or_int))*;

var_or_int : var | integer;

var : Name;
integer : Int;

Ret : 'return';
LeftParen : '(';
RightParen : ')';
LeftBracket : '{';
RightBracket : '}';
Colon : ':';
Comma : ',';
Semi : ';';
Assign : '=';
Eq : '==';
IfCmd : 'if';
While : 'while';
Mult : '*';
Div : '/';
Sub : '-';
Add : '+';
Lt : '<';
Gt : '>';
Le : '<=';
Ge : '>=';
Name : [A-Za-z_][A-Za-z_0-9]*;
Int : '-'?[0-9]+;
WS : [ \n\r\t] -> skip;
