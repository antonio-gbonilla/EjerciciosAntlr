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
	| expr op=(MULTIPLICACION | DIVISION | MODULO) expr	# MultiplicacionExpr // Mayor precedencia
	| expr op=(SUMA | MENOS) expr	# SumaExpr 
	| expr op=(MAYOR_IGUAL | MENOR_IGUAL | MENOR | MAYOR) expr # RelacionesExpr 
	| expr op=(IGUAL_QUE | DISTINTO) expr #IgualdadesExpr
	| expr AND expr	# AndExpr 
	| expr OR expr	# ORExpr // Menor precedencia 
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

