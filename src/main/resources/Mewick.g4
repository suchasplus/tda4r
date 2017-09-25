grammar Mewick;

entity : (item | intersect | junction | exclude) ;

item : 'item' '(' INT ')' ;

intersect : 'intersect' '{' entity (',' entity)+ '}' ;
junction : 'junction' '{' entity (',' entity)+ '}' ;
exclude : 'exclude' '{' entity (',' entity)+ '}' ;

INT : [0-9]+ ;
WS  :   [ \r\n\t]+ -> skip ;
