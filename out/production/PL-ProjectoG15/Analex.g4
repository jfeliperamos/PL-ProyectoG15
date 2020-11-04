lexer grammar Analex;

BLANCO		: ' ' ->skip;
TABULADOR	: '\t'->skip;
FIN_LINEA	: '\r'?'\n' ->skip;
COMENTARIO_BLOQUE 	: '/*' .*? '*/' -> skip ;
COMENTARIO_LINEA 	: '//' .*? FIN_LINEA -> skip ;

fragment DIGITO : [0-9];
fragment LETRA  : [a-zA-Z];

VARIABLES       : 'VARIABLES';
SUBPROGRAMAS    : 'SUBPROGRAMAS';
INSTRUCCIONES   : 'INSTRUCCIONES';
FUNCION: 'FUNCION';
FFUNCION: 'FFUNCION';
RETURN: 'dev';
IF:'si';
THEN: 'entonces';
ELSE:'sino';
FSI:'fsi';

ENTERO : 'NUM';
LOGICO : 'LOG';
SECUENCIA_ENTERA : 'SEQ(NUM)';
SECUENCIA_LOGICA : 'SEQ(LOG)';
IDENT : LETRA(LETRA|DIGITO)*;
NUMERO: ('-')?DIGITO+;
TRUE: 'true';
FALSE: 'false';

PARENTESISABIERTO   : '(';
PARENTESISCERRADO   : ')';
CORCHETEABIERTO     : '[';
CORCHETECERRADO     : ']';
DOSPUNTOS   : ':';
PyC     : ';';
COMA    : ',';
ASIG	: '=';
MAYOR	: '>';
MENOR	: '<';
MAS		: '+';
MENOS	: '-';
POR		: '*';
ESIGUAL: '==';
NEGACION: '!';
DISY: '||';
CONJ: '&&';
ESDISTINTO: '!=';
MENORIGUAL: '<=';
MAYORIGUAL: '>=';
