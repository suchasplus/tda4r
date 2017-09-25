grammar Op;


entity      :
            (item
            |operator
            );
operator      : (intersect
               |junction
               |exclude
               );
intersect   : INTERSECT_TOKEN '{' entity (',' entity)+ '}' ;
junction    : JUNCTION_TOKEN '{' entity (',' entity)+'}' ;
exclude     : EXCLUDE_TOKEN '{' entity ',' entity '}' ;
item    : 'item' '(' INT ')';
//DATASET_TOKEN    : [dD][aA][tT][aA][sS][eE][tT] ; // dataset
INTERSECT_TOKEN : [iI][nN][tT][eE][rR][sS][eE][cC][tT]; // intersect
JUNCTION_TOKEN  : [jJ][uU][nN][cC][tT][iI][oO][nN]; // junction
EXCLUDE_TOKEN : [eE][xX][cC][lL][uU][dD][eE] ; // exclude





INT         : [0-9]|[1-9][0-9]+ ;
ALL         : '-1';
WS          : [ \r\t\n]+ -> skip ;