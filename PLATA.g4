grammar PLATA;

//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- LINEAS A PROCESAR -----------
sentencia: avanza | gira | frena | asignacion | if_sentencia | bucle_while | expr;

// ----------- METODOS ------------
avanza: AVANZA '(' expr ',' expr ')';
gira: GIRA '(' expr ')';
frena: FRENA;

// ---------------- SENTENCIAS ESPECIALES --------------
//asignacion
asignacion: ID '=' expr;

// if
if_sentencia: IF '('condicion ')' bloque (ELSE_IF '('condicion ')' bloque)* (ELSE '('condicion ')' bloque)?;

// while
bucle_while: WHILE '('condicion ')' bloque;


// --- EXPRESIONES ---
expr
	: expr '*' expr	# Multiplicacion // Mayor precedencia
	| expr '/' expr	# Division // Mayor precedencia
	| expr '+' expr	# Suma // Menor precedencia que * y /
	| expr '-' expr	# Resta // Menor precedencia que * y /
	| numero	#nnumero  //atomo
	| ID	# VariableExpr //atomo
	| '(' expr ')'	# Parentesis // Precedencia máxima (pero no compite, sino que agrupa)
	;
numero: INT | FLOAT;

// Bloque 
bloque: '{' sentencia+ '}';

//Condiciones
condicion: expr operadorCondicional expr;

operadorCondicional
	: MAYOR
	| MENOR
	| MAYOR_IGUAL
	| MENOR_IGUAL
	| DISTINTO
	| IGUAL_QUE
	;


// ----------- LEXER / TOKENS ----------

//  Palabras reservadas tokes
AVANZA: [Aa] 'vanza';
GIRA: [Gg] 'ira';
FRENA: [Ff] 'rena';
WHILE: [Mm] 'ientras';
IF: [Ss] 'i';
ELSE_IF: [Dd]'eLoContrarioSi';
ELSE: [Dd]'eLoContrario';
TRUE: [Vv]'erdad';
False: [Mm]'entira';
NULL: 'null';

//CONDICIONALES
MAYOR: '>';
MENOR: '<';
MAYOR_IGUAL: '>=';
MENOR_IGUAL: '<=';
DISTINTO: '!';
IGUAL_QUE: '==';

//Numeros
INT: DIGITO+;
FLOAT: ('-')? (DIGITO)* '.' DIGITO+; ///!Corregir el signo -
fragment DIGITO: [0-9];

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.