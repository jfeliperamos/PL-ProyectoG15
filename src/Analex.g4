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
ENTERO : 'NUM';
LOGICO : 'LOG';
SECUENCIA_ENTERA : 'SEQ(NUM)';
SECUENCIA_LOGICA : 'SEQ(LOG)';
IDENT : LETRA(LETRA|DIGITO)*;

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

FPROCEDIMIENTO  : 'FPROCEDIMIENTO';