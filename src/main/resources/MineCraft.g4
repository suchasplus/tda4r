grammar MineCraft;


//operationToken : (INTERSECT_TOKEN | JUNCTION_TOKEN | EXCLUDE_TOKEN) ;

//junction : JUNCTION_TOKEN '{' dataset ( ',' dataset ) ? '}' ;

exclude : EXCLUDE_TOKEN '{' dataset ',' dataset '}' ;

dataset     : pkgtype '{'  pkg ';'  userbhv ';' timespan ';' frequency '}' ;

pkg         : 'ids' COLON pkgids ;
frequency   : ENTITY_PARAM_FREQ COLON op = (INT | ALL ) ;
timespan    : ENTITY_PARAM_TS COLON INT ARROW INT ;
userbhv     : 'bhv' ':' entity_ubhv ( '|' entity_ubhv )* ; //entity_ubhv
pkgtype     : ( ENTITY_CAMPAIGN_TOKEN
| ENTITY_AD_TOKEN
| ENTITY_CREATIVE_TOKEN
);
pkgids      : INT ( ',' INT)* ;

INT         : [0-9]|[1-9][0-9]+ ;
ALL         : '-1';
WS          : [ \r\t\n]+ -> skip ;

// Logic
//DATASET_TOKEN    : [dD][aA][tT][aA][sS][eE][tT] ; // dataset
INTERSECT_TOKEN : [iI][nN][tT][eE][rR][sS][eE][cC][tT]; // intersect
JUNCTION_TOKEN  : [jJ][uU][nN][cC][tT][iI][oO][nN]; // junction
EXCLUDE_TOKEN : [eE][xX][cC][lL][uU][dD][eE] ; // exclude

ENTITY_UPLOAD_TOKEN     : [uU][pP][lL][oO][aA][dD] ;
ENTITY_CAMPAIGN_TOKEN   : [cC][aA][mM][pP][aA][iI][gG][nN] ;
ENTITY_AD_TOKEN         : [aA][dD] ;
ENTITY_CREATIVE_TOKEN   : [cC][rR][eE][aA][tT][iI][vV][eE] ;

ENTITY_PARAM_FREQ   : [fF][rR][eE][qQ][uU][eE][nN][cC][yY] ; //frequency
ENTITY_PARAM_TS     : [tT][iI][mM][eE][sS][pP][aA][nN]  ; //timespan
entity_ubhv         :
( ENTITY_UBHV_VIEW
| ENTITY_UBHV_CLICK
| ENTITY_UBHV_COMMENT
| ENTITY_UBHV_REPOST
| ENTITY_UBHV_LIKE
);
ENTITY_UBHV_VIEW    : 'VIEW' ;
ENTITY_UBHV_CLICK   : 'CLICK' ;
ENTITY_UBHV_COMMENT : 'COMMENT' ;
ENTITY_UBHV_REPOST  : 'REPOST' ;
ENTITY_UBHV_LIKE    : 'LIKE' ;

StringLiteral
	:	'"' StringCharacters? '"'
	;
fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
	|   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;
fragment
OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;
// This is not in the spec but prevents having to preprocess the input
fragment
UnicodeEscape
	:   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
	;
fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;
fragment
HexDigit
	:	[0-9a-fA-F]
	;

// Separators
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// Operators
ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';