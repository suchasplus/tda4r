grammar LabeledExpr;

prog: stat+ ;

stat: expr NL           # printExpr
	| ID '=' expr NL    # assign
	| NL                # blank
	;
expr: expr op=(MUL|DIV) expr   # MulDiv
	| expr op=(ADD|SUB) expr   # AddSub
	| INT                   #int
	| ID                    #id
	| CLEAR                 #CLEAR
	| '(' expr ')'          #parens
	;

MUL :   '*' ; // assigns token name to '*' used above in grammar
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
CLEAR:  'CLEAR' ;
ID  :   [a-zA-Z]+ ;      // match identifiers
INT :   [0-9]+ ;         // match integers
NL  :'\r'? '\n' ;     // return newlines to parser (is end-statement signal)
WS  :   [ \t]+ -> skip ; // toss out whitespace