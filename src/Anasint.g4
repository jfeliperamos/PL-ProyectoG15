parser grammar Anasint;
options{
 tokenVocab=Analex;
}

// Aquí empieza la sintaxis de declaracion de variables

programa: variables instrucciones EOF;

variables: VARIABLES (decl_vars)+ ;

tipo: ENTERO | LOGICO | SECUENCIA_ENTERA | SECUENCIA_LOGICA ;
decl_vars: vars DOSPUNTOS tipo PyC ; //vars

vars: IDENT (COMA vars)* ;

// Aquí empiezan las instrucciones, asignaciones a variables y eso

instrucciones: INSTRUCCIONES (instrucs)+ ;

instrucs: IDENT ASIG expresion PyC;

expresion: (expresiones_enteras | expresiones_booleanas | secuencias) ;

expresiones_enteras: IDENT
    | NUMERO
    | expresiones_enteras (POR | MAS | MENOS) expresiones_enteras
    ;

expresiones_booleanas: (TRUE | FALSE)
    | IDENT;


secuencias: CORCHETEABIERTO CORCHETECERRADO
    | CORCHETEABIERTO (secuencia_entera | secuencia_logica) CORCHETECERRADO;

secuencia_entera: expresiones_enteras (COMA expresiones_enteras)*;

secuencia_logica: expresiones_booleanas (COMA expresiones_booleanas)*;












