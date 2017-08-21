grammar LibExpr;  //rename to distinguish from original
import CommonLexerRules; //include all rules from CommonLexerRules.g4

/* The start rule, begin parsing here */

prog    : stat+ ;
stat    : expr NL
        | ID '=' expr NL
        | NL
        ;
expr    : expr ('*'|'/') expr
        | expr ('+'|'-') expr
        | INT
        | ID
        | '(' expr ')'
        ;
