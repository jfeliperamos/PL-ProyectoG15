// Generated from C:/Users/javga/IdeaProjects/PL-ProyectoG15/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Anasint}.
 */
public interface AnasintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void enterVariables(Anasint.VariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 */
	void exitVariables(Anasint.VariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(Anasint.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(Anasint.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void enterDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 */
	void exitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(Anasint.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(Anasint.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#instrucs}.
	 * @param ctx the parse tree
	 */
	void enterInstrucs(Anasint.InstrucsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#instrucs}.
	 * @param ctx the parse tree
	 */
	void exitInstrucs(Anasint.InstrucsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresiones_enteras}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones_enteras(Anasint.Expresiones_enterasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresiones_enteras}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones_enteras(Anasint.Expresiones_enterasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#expresiones_booleanas}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones_booleanas(Anasint.Expresiones_booleanasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#expresiones_booleanas}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones_booleanas(Anasint.Expresiones_booleanasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencias}.
	 * @param ctx the parse tree
	 */
	void enterSecuencias(Anasint.SecuenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencias}.
	 * @param ctx the parse tree
	 */
	void exitSecuencias(Anasint.SecuenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Enter a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
}