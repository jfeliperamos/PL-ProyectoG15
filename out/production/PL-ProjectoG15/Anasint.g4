parser grammar Anasint;
options{
 tokenVocab=Analex;
}

// Aquí empieza la sintaxis de declaracion de variables

programa: variables subprogramas instrucciones  EOF;

variables: VARIABLES (decl_vars)+ ;

tipo: ENTERO | LOGICO | SECUENCIA_ENTERA | SECUENCIA_LOGICA ;
decl_vars: vars DOSPUNTOS tipo PyC ; //vars

vars: IDENT (COMA vars)* ;

// Subprogramas

//Funciones:

subprogramas: SUBPROGRAMAS (funciones /*| procedimientos*/)+;
/*
funciones_predicado:
    FUNCION IDENT PARENTESISABIERTO (tipo IDENT (COMA tipo IDENT)*)* PARENTESISCERRADO // Datos entrada, pueden estar vacíos.
    RETURN PARENTESISABIERTO LOGICO expresiones_booleanas PARENTESISCERRADO                 // Datos salida, en este caso solo puede ser valor lógico.
    variables instrucciones
    RETURN expresiones_booleanas PyC
    FFUNCION
;
*/
funciones:
 FUNCION IDENT PARENTESISABIERTO (tipo IDENT (COMA tipo IDENT)*)* PARENTESISCERRADO // Parámetros de entrada, pueden estar vacios.
 RETURN PARENTESISABIERTO (tipo (expresiones_enteras | secuencias))(COMA tipo (expresiones_enteras | secuencias))* PARENTESISCERRADO            // Parámetros de salida (obligatorio) Tipo,Expresion
 variables instrucciones
 RETURN expresion(COMA expresion)* PyC
 FFUNCION
 ;

// Aquí empiezan las instrucciones, asignaciones a variables y eso

instrucciones: INSTRUCCIONES (tipo_instrucciones)+ ;

tipo_instrucciones: (instruccion_asignacion | estructuras);

estructuras: (condicional /*|bucle*/);

condicional: IF PARENTESISABIERTO (NEGACION)?condicion((DISY|CONJ)condicion)* PARENTESISCERRADO THEN (tipo_instrucciones)* (RETURN expresiones_booleanas PyC)? (ELSE ((tipo_instrucciones)*|RETURN expresiones_booleanas PyC))? FSI PyC; ////// --->

condicion: (funciones | igualdades | desigualdades);
igualdades: expresion ESIGUAL expresion;
desigualdades: expresion (ESDISTINTO | MENOR | MAYOR | MENORIGUAL | MAYORIGUAL) expresion;

instruccion_asignacion: IDENT ASIG expresion PyC;

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














