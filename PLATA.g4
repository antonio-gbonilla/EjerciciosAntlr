grammar PLATA;

//------------ REGLA PRINCIPAL ------------
programa: sentencia+ EOF;

//-------------- LINEAS A PROCESAR -----------
sentencia: avanza | gira | frena | asignacion;

// ----------- METODOS ------------
avanza: AVANZA '(' expr ',' expr ')';
gira: GIRA '(' expr ')';
frena: FRENA;

// ---------------- ELEMENTOS --------------
asignacion: ID '=' expr;

// --- EXPRESIONES ---
expr
    : expr '+' expr	# Suma
	| expr '-' expr	# Resta
	| expr '*' expr	# Multiplicacion
	| expr '/' expr	# Division
	| '(' expr ')'	# Parentesis
	| numero		# NNumeroExprum
	| ID			# VariableExpr;
numero: INT | FLOAT;

// ------------ Palabras reservadas tokes ----------
AVANZA: 'avanza';
GIRA: 'gira';
FRENA: 'frena';

// ----------- LEXER / TOKENS ----------

INT: DIGITO+;
FLOAT: (DIGITO)+ '.' DIGITO+;
fragment DIGITO: [0-9];

ID: [a-zA-Z][a-zA-Z_0-9]*;

WS:
	[ \t\n\r]+ -> skip; //DESCARTA LOS ESPACIOS, SALTOS DE LINEA Y TAB.