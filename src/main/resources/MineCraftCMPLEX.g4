grammar MineCraftCMPLEX;

prog    : result ;

result  : 'Result' LBRACE (datasetType|intersectOp|junctionOp|excludeOp) RBRACE
		;

datasetLogical
	: (datasetType|intersectOp|junctionOp|excludeOp)
	;

intersectOp
	: INTERSECT_TOKEN LBRACE datasetLogical (',' datasetLogical)* RBRACE
	;

junctionOp
	: JUNCTION_TOKEN LBRACE datasetLogical (',' datasetLogical)* RBRACE
	;

excludeOp
	: EXCLUDE_TOKEN LBRACE datasetLogical ',' datasetLogical RBRACE
	;

uploadType
	// upload { id : 123 }
	: ENTITY_UPLOAD_TOKEN LBRACE 'id' COLON entityId RBRACE # uploadPkg
	;
campaignType
    // campaign { id : 234 , type : ALL | ENGAGEMENT | VIEW | CLICK | RETWEET | COMMENT | LIKE | RETWEET ,
	//                      timespan : start_timestamp | end_timestamp, freq : 1 | null }
    : ENTITY_CAMPAIGN_TOKEN LBRACE 'id' COLON entityId RBRACE # campaignInfo
    ;

adType
    : ENTITY_AD_TOKEN LBRACE 'id' COLON entityId RBRACE # adInfo
    ;

creativeType
    : ENTITY_CREATIVE_TOKEN LBRACE 'id' COLON entityId RBRACE # creativeInfo
    ;

datasetValidContent
    : (uploadType | campaignType | adType | creativeType)
    ;
datasetType
	: DATASET_TOKEN LBRACE datasetValidContent (',' datasetValidContent)* RBRACE
	;

entityId : EntityId;
EntityId: [1-9][0-9]+ ;
Integer : [0-9]|[1-9][0-9]+ ;
WS      : [ \r\t\n]+ -> skip ;

// Logic
DATASET_TOKEN    : [dD][aA][tT][aA][sS][eE][tT] ; // dataset
INTERSECT_TOKEN : [iI][nN][tT][eE][rR][sS][eE][cC][tT]; // intersect
JUNCTION_TOKEN  : [jJ][uU][nN][cC][tT][iI][oO][nN]; // junction
EXCLUDE_TOKEN : [eE][xX][cC][lL][uU][dD][eE] ; // exclude

ENTITY_UPLOAD_TOKEN        : [uU][pP][lL][oO][aA][dD] ;
ENTITY_CAMPAIGN_TOKEN   : [cC][aA][mM][pP][aA][iI][gG][nN] ;
ENTITY_AD_TOKEN         : [aA][dD] ;
ENTITY_CREATIVE_TOKEN   : [cC][rR][eE][aA][tT][iI][vV][eE] ;



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