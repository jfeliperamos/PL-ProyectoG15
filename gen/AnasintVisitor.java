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
	 * Visit a parse tree produced by {@link Anasint#subprogramas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubprogramas(Anasint.SubprogramasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#funciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunciones(Anasint.FuncionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(Anasint.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#tipo_instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_instrucciones(Anasint.Tipo_instruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#estructuras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstructuras(Anasint.EstructurasContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(Anasint.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(Anasint.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#igualdades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgualdades(Anasint.IgualdadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#desigualdades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesigualdades(Anasint.DesigualdadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Anasint#instruccion_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_asignacion(Anasint.Instruccion_asignacionContext ctx);
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