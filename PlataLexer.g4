lexer grammar PlataLexer;
// ----------- LEXER / TOKENS ----------

//  Palabras reservadas tokes
AVANZA: [Aa] 'vanza';
GIRA: [Gg] 'ira';
FRENA: [Pp] 'ara';
WHILE: [Mm] 'ientras';
ELSE_IF : 'sinosi';
ELSE    : 'sino';
IF      : 'si';
TRUE: [Vv]'erdadero';
FALSE: [Ff]'also';
NULL: [Nn]'ulo';

//CONDICIONALES
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
MAYOR: '>';
MENOR: '<';
DISTINTO: '!=';
IGUAL_QUE: '==';
NOT: '!';
AND: '&&';
OR: '||';
MENOS: '-';

//Numeros
INT: DIGITO+;
FLOAT: (DIGITO)+ '.' DIGITO+; ///!Corregir el signo -
fragment DIGITO: [0-9];

//String
STRING: '"' (~["\r\n] | '""')* '"';

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.