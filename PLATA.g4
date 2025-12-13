grammar PLATA;

//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- LINEAS A PROCESAR -----------
sentencia: avanza | gira | frena | asignacion | if_sentencia | bucle_while | expr; //!verbos

// ----------- METODOS ------------
avanza: AVANZA '(' expr ',' expr ')';
gira: GIRA '(' expr ')';
frena: FRENA;

// ---------------- SENTENCIAS ESPECIALES --------------
//asignacion
asignacion: ID '=' expr;

// if
if_sentencia: 	IF '('condicion ')' bloque 
				(ELSE_IF '('condicion ')' bloque)* 
				(ELSE bloque)?;

// while
bucle_while: WHILE '('condicion ')' bloque;


// --- EXPRESIONES ---
expr
	: NOT expr		#notExpr
	| expr '*' expr	# MultiplicacionExpr // Mayor precedencia
	| expr '/' expr	# DivisionExpr // Mayor precedencia
	| expr '+' expr	# SumaExpr // Menor precedencia que * y /
	| expr '-' expr	# RestaExpr // Menor precedencia que * y /
	| atomico		#atomicoExpr  //atomo
	| '(' expr ')'	# ParentesisExpr // Precedencia máxima (pero no compite, sino que agrupa)
	;

atomico
	: (INT | FLOAT) #numeroAtomico 
	| (TRUE | FALSE)	#booleanAtomico
	| ID	# idAtomico //atomo
	| STRING	#stringAtomico
	;

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
	| AND
	| OR
	;


// ----------- LEXER / TOKENS ----------

//  Palabras reservadas tokes
AVANZA: [Aa] 'vanza';
GIRA: [Gg] 'ira';
FRENA: [Pp] 'ara';
WHILE: [Mm] 'ientras';
IF: [Ss] 'i';
ELSE_IF: [Ss]'iNo';
ELSE: [Ss]'iNoSi';
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

//Numeros
INT: DIGITO+;
FLOAT: ('-')? (DIGITO)+ '.' DIGITO+; ///!Corregir el signo -
fragment DIGITO: [0-9];

//String
STRING: '"' (~["\r\n] | '""')* '"';

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.