// Generated from C:/Users/javga/IdeaProjects/PL-ProyectoG15/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Anasint}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AnasintVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Anasint#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(Anasint.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(Anasint.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(Anasint.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#decl_vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_vars(Anasint.Decl_varsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(Anasint.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucs(Anasint.InstrucsContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(Anasint.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresiones_enteras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones_enteras(Anasint.Expresiones_enterasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#expresiones_booleanas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones_booleanas(Anasint.Expresiones_booleanasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencias(Anasint.SecuenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia_entera}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia_entera(Anasint.Secuencia_enteraContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#secuencia_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia_logica(Anasint.Secuencia_logicaContext ctx);
}