parser grammar Anasint;
options{
	tokenVocab=Analex;
}

programa : variables EOF ;
variables : VARIABLES (decl_vars)+ ;
decl_vars : vars DOSPUNTOS tipo PyC ;
tipo : ENTERO | LOGICO | SECUENCIA_ENTERA | SECUENCIA_LOGICA ;
vars : IDENT (COMA vars)* ;