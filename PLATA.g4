grammar PLATA;
import PlataLexer;
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
if_sentencia: 	IF '('expr ')' bloque 
				(ELSE_IF '('expr ')' bloque)* 
				(ELSE bloque)?;


// while
bucle_while: WHILE '('expr ')' bloque;


// --- EXPRESIONES ---
expr
	: MENOS expr 	#menosExpr
	| NOT expr		#notExpr
	| expr '*' expr	# MultiplicacionExpr // Mayor precedencia
	| expr '/' expr	# DivisionExpr // Mayor precedencia
	| expr '%' expr # ModuloExpr // Mayor precedencia
	| expr '+' expr	# SumaExpr // Menor precedencia que *, / y %
	| expr '-' expr	# RestaExpr // Menor precedencia que *, / y %
	| expr operadorCondicional expr #condicionExpr 
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
