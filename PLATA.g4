grammar PLATA;

//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- LINEAS A PROCESAR -----------
sentencia: avanza | gira | frena | asignacion | expr;

// ----------- METODOS ------------
avanza: AVANZA '(' expr ',' expr ')';
gira: GIRA '(' expr ')';
frena: FRENA;

// ---------------- ELEMENTOS --------------
asignacion: ID '=' expr;

// --- EXPRESIONES ---
expr
	: <assoc=right> expr '^' expr #Potencia // ^ operador con asociacion a la derech (Mayor, procedencia, se evalua primero)
	| expr '*' expr	# Multiplicacion // Mayor precedencia
	| expr '/' expr	# Division // Mayor precedencia
	| expr '+' expr	# Suma // Menor precedencia que * y /
	| expr '-' expr	# Resta // Menor precedencia que * y /
	| numero	#nnumero  //atomo
	| ID	# VariableExpr //atomo
	| '(' expr ')'	# Parentesis // Precedencia máxima (pero no compite, sino que agrupa)
	;
numero: INT | FLOAT;

// ------------ Palabras reservadas tokes ----------
AVANZA: 'avanza';
GIRA: 'gira';
FRENA: 'frena';

// ----------- LEXER / TOKENS ----------

INT: DIGITO+;
FLOAT: ('-')? (DIGITO)* '.' DIGITO+; ///!Corregir el signo -
fragment DIGITO: [0-9];

ID: [a-zA-Z][a-zA-Z_0-9]*;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.