lexer grammar CommonLexerRules;

ID  : [a-zA-Z]+ ;       //match identifiers
INT : [0-9]+ ;          //match integers
NL  : '\r' ? '\n' ;     //return newlines to parser (end-statement signal)
WS  : [ \t]+ ->skip ;   //discard | toss out whitespace
