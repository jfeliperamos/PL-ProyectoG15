// Generated from C:/Users/javga/IdeaProjects/PL-ProyectoG15/src\Anasint.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Anasint extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, COMENTARIO_BLOQUE=4, COMENTARIO_LINEA=5, 
		VARIABLES=6, SUBPROGRAMAS=7, INSTRUCCIONES=8, FUNCION=9, FFUNCION=10, 
		RETURN=11, IF=12, THEN=13, ELSE=14, FSI=15, ENTERO=16, LOGICO=17, SECUENCIA_ENTERA=18, 
		SECUENCIA_LOGICA=19, IDENT=20, NUMERO=21, TRUE=22, FALSE=23, PARENTESISABIERTO=24, 
		PARENTESISCERRADO=25, CORCHETEABIERTO=26, CORCHETECERRADO=27, DOSPUNTOS=28, 
		PyC=29, COMA=30, ASIG=31, MAYOR=32, MENOR=33, MAS=34, MENOS=35, POR=36, 
		ESIGUAL=37, NEGACION=38, DISY=39, CONJ=40, ESDISTINTO=41, MENORIGUAL=42, 
		MAYORIGUAL=43;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_tipo = 2, RULE_decl_vars = 3, 
		RULE_vars = 4, RULE_subprogramas = 5, RULE_funciones = 6, RULE_instrucciones = 7, 
		RULE_tipo_instrucciones = 8, RULE_estructuras = 9, RULE_condicional = 10, 
		RULE_condicion = 11, RULE_igualdades = 12, RULE_desigualdades = 13, RULE_instruccion_asignacion = 14, 
		RULE_expresion = 15, RULE_expresiones_enteras = 16, RULE_expresiones_booleanas = 17, 
		RULE_secuencias = 18, RULE_secuencia_entera = 19, RULE_secuencia_logica = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "tipo", "decl_vars", "vars", "subprogramas", 
			"funciones", "instrucciones", "tipo_instrucciones", "estructuras", "condicional", 
			"condicion", "igualdades", "desigualdades", "instruccion_asignacion", 
			"expresion", "expresiones_enteras", "expresiones_booleanas", "secuencias", 
			"secuencia_entera", "secuencia_logica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, null, null, "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'FUNCION'", "'FFUNCION'", "'dev'", "'si'", "'entonces'", 
			"'sino'", "'fsi'", "'NUM'", "'LOG'", "'SEQ(NUM)'", "'SEQ(LOG)'", null, 
			null, "'true'", "'false'", "'('", "')'", "'['", "']'", "':'", "';'", 
			"','", "'='", "'>'", "'<'", "'+'", "'-'", "'*'", "'=='", "'!'", "'||'", 
			"'&&'", "'!='", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", 
			"VARIABLES", "SUBPROGRAMAS", "INSTRUCCIONES", "FUNCION", "FFUNCION", 
			"RETURN", "IF", "THEN", "ELSE", "FSI", "ENTERO", "LOGICO", "SECUENCIA_ENTERA", 
			"SECUENCIA_LOGICA", "IDENT", "NUMERO", "TRUE", "FALSE", "PARENTESISABIERTO", 
			"PARENTESISCERRADO", "CORCHETEABIERTO", "CORCHETECERRADO", "DOSPUNTOS", 
			"PyC", "COMA", "ASIG", "MAYOR", "MENOR", "MAS", "MENOS", "POR", "ESIGUAL", 
			"NEGACION", "DISY", "CONJ", "ESDISTINTO", "MENORIGUAL", "MAYORIGUAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Anasint.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Anasint(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public SubprogramasContext subprogramas() {
			return getRuleContext(SubprogramasContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode EOF() { return getToken(Anasint.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			variables();
			setState(43);
			subprogramas();
			setState(44);
			instrucciones();
			setState(45);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariablesContext extends ParserRuleContext {
		public TerminalNode VARIABLES() { return getToken(Anasint.VARIABLES, 0); }
		public List<Decl_varsContext> decl_vars() {
			return getRuleContexts(Decl_varsContext.class);
		}
		public Decl_varsContext decl_vars(int i) {
			return getRuleContext(Decl_varsContext.class,i);
		}
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(VARIABLES);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				decl_vars();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ENTERO() { return getToken(Anasint.ENTERO, 0); }
		public TerminalNode LOGICO() { return getToken(Anasint.LOGICO, 0); }
		public TerminalNode SECUENCIA_ENTERA() { return getToken(Anasint.SECUENCIA_ENTERA, 0); }
		public TerminalNode SECUENCIA_LOGICA() { return getToken(Anasint.SECUENCIA_LOGICA, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << LOGICO) | (1L << SECUENCIA_ENTERA) | (1L << SECUENCIA_LOGICA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_varsContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TerminalNode DOSPUNTOS() { return getToken(Anasint.DOSPUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public Decl_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDecl_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDecl_vars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDecl_vars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_varsContext decl_vars() throws RecognitionException {
		Decl_varsContext _localctx = new Decl_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			vars();
			setState(56);
			match(DOSPUNTOS);
			setState(57);
			tipo();
			setState(58);
			match(PyC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public List<VarsContext> vars() {
			return getRuleContexts(VarsContext.class);
		}
		public VarsContext vars(int i) {
			return getRuleContext(VarsContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(IDENT);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(61);
					match(COMA);
					setState(62);
					vars();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubprogramasContext extends ParserRuleContext {
		public TerminalNode SUBPROGRAMAS() { return getToken(Anasint.SUBPROGRAMAS, 0); }
		public List<FuncionesContext> funciones() {
			return getRuleContexts(FuncionesContext.class);
		}
		public FuncionesContext funciones(int i) {
			return getRuleContext(FuncionesContext.class,i);
		}
		public SubprogramasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogramas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSubprogramas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSubprogramas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSubprogramas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubprogramasContext subprogramas() throws RecognitionException {
		SubprogramasContext _localctx = new SubprogramasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subprogramas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SUBPROGRAMAS);
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69);
				funciones();
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCION );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionesContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(Anasint.FUNCION, 0); }
		public List<TerminalNode> IDENT() { return getTokens(Anasint.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(Anasint.IDENT, i);
		}
		public List<TerminalNode> PARENTESISABIERTO() { return getTokens(Anasint.PARENTESISABIERTO); }
		public TerminalNode PARENTESISABIERTO(int i) {
			return getToken(Anasint.PARENTESISABIERTO, i);
		}
		public List<TerminalNode> PARENTESISCERRADO() { return getTokens(Anasint.PARENTESISCERRADO); }
		public TerminalNode PARENTESISCERRADO(int i) {
			return getToken(Anasint.PARENTESISCERRADO, i);
		}
		public List<TerminalNode> RETURN() { return getTokens(Anasint.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(Anasint.RETURN, i);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public TerminalNode FFUNCION() { return getToken(Anasint.FFUNCION, 0); }
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public List<Expresiones_enterasContext> expresiones_enteras() {
			return getRuleContexts(Expresiones_enterasContext.class);
		}
		public Expresiones_enterasContext expresiones_enteras(int i) {
			return getRuleContext(Expresiones_enterasContext.class,i);
		}
		public List<SecuenciasContext> secuencias() {
			return getRuleContexts(SecuenciasContext.class);
		}
		public SecuenciasContext secuencias(int i) {
			return getRuleContext(SecuenciasContext.class,i);
		}
		public FuncionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterFunciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitFunciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitFunciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionesContext funciones() throws RecognitionException {
		FuncionesContext _localctx = new FuncionesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(FUNCION);
			setState(75);
			match(IDENT);
			setState(76);
			match(PARENTESISABIERTO);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTERO) | (1L << LOGICO) | (1L << SECUENCIA_ENTERA) | (1L << SECUENCIA_LOGICA))) != 0)) {
				{
				{
				setState(77);
				tipo();
				setState(78);
				match(IDENT);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(79);
					match(COMA);
					setState(80);
					tipo();
					setState(81);
					match(IDENT);
					}
					}
					setState(87);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(PARENTESISCERRADO);
			setState(94);
			match(RETURN);
			setState(95);
			match(PARENTESISABIERTO);
			{
			setState(96);
			tipo();
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
			case NUMERO:
				{
				setState(97);
				expresiones_enteras(0);
				}
				break;
			case CORCHETEABIERTO:
				{
				setState(98);
				secuencias();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(101);
				match(COMA);
				setState(102);
				tipo();
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IDENT:
				case NUMERO:
					{
					setState(103);
					expresiones_enteras(0);
					}
					break;
				case CORCHETEABIERTO:
					{
					setState(104);
					secuencias();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(PARENTESISCERRADO);
			setState(113);
			variables();
			setState(114);
			instrucciones();
			setState(115);
			match(RETURN);
			setState(116);
			expresion();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(117);
				match(COMA);
				setState(118);
				expresion();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(PyC);
			setState(125);
			match(FFUNCION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public List<Tipo_instruccionesContext> tipo_instrucciones() {
			return getRuleContexts(Tipo_instruccionesContext.class);
		}
		public Tipo_instruccionesContext tipo_instrucciones(int i) {
			return getRuleContext(Tipo_instruccionesContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(INSTRUCCIONES);
			setState(129); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				tipo_instrucciones();
				}
				}
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IF || _la==IDENT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_instruccionesContext extends ParserRuleContext {
		public Instruccion_asignacionContext instruccion_asignacion() {
			return getRuleContext(Instruccion_asignacionContext.class,0);
		}
		public EstructurasContext estructuras() {
			return getRuleContext(EstructurasContext.class,0);
		}
		public Tipo_instruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterTipo_instrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitTipo_instrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitTipo_instrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_instruccionesContext tipo_instrucciones() throws RecognitionException {
		Tipo_instruccionesContext _localctx = new Tipo_instruccionesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(133);
				instruccion_asignacion();
				}
				break;
			case IF:
				{
				setState(134);
				estructuras();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstructurasContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public EstructurasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estructuras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterEstructuras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitEstructuras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitEstructuras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstructurasContext estructuras() throws RecognitionException {
		EstructurasContext _localctx = new EstructurasContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_estructuras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			condicional();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(Anasint.IF, 0); }
		public TerminalNode PARENTESISABIERTO() { return getToken(Anasint.PARENTESISABIERTO, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode PARENTESISCERRADO() { return getToken(Anasint.PARENTESISCERRADO, 0); }
		public TerminalNode THEN() { return getToken(Anasint.THEN, 0); }
		public TerminalNode FSI() { return getToken(Anasint.FSI, 0); }
		public List<TerminalNode> PyC() { return getTokens(Anasint.PyC); }
		public TerminalNode PyC(int i) {
			return getToken(Anasint.PyC, i);
		}
		public TerminalNode NEGACION() { return getToken(Anasint.NEGACION, 0); }
		public List<Tipo_instruccionesContext> tipo_instrucciones() {
			return getRuleContexts(Tipo_instruccionesContext.class);
		}
		public Tipo_instruccionesContext tipo_instrucciones(int i) {
			return getRuleContext(Tipo_instruccionesContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(Anasint.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(Anasint.RETURN, i);
		}
		public List<Expresiones_booleanasContext> expresiones_booleanas() {
			return getRuleContexts(Expresiones_booleanasContext.class);
		}
		public Expresiones_booleanasContext expresiones_booleanas(int i) {
			return getRuleContext(Expresiones_booleanasContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(Anasint.ELSE, 0); }
		public List<TerminalNode> DISY() { return getTokens(Anasint.DISY); }
		public TerminalNode DISY(int i) {
			return getToken(Anasint.DISY, i);
		}
		public List<TerminalNode> CONJ() { return getTokens(Anasint.CONJ); }
		public TerminalNode CONJ(int i) {
			return getToken(Anasint.CONJ, i);
		}
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(IF);
			setState(140);
			match(PARENTESISABIERTO);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGACION) {
				{
				setState(141);
				match(NEGACION);
				}
			}

			setState(144);
			condicion();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DISY || _la==CONJ) {
				{
				{
				setState(145);
				_la = _input.LA(1);
				if ( !(_la==DISY || _la==CONJ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(146);
				condicion();
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			match(PARENTESISCERRADO);
			setState(153);
			match(THEN);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENT) {
				{
				{
				setState(154);
				tipo_instrucciones();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(160);
				match(RETURN);
				setState(161);
				expresiones_booleanas();
				setState(162);
				match(PyC);
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(166);
				match(ELSE);
				setState(177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
				case FSI:
				case IDENT:
					{
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==IF || _la==IDENT) {
						{
						{
						setState(167);
						tipo_instrucciones();
						}
						}
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RETURN:
					{
					setState(173);
					match(RETURN);
					setState(174);
					expresiones_booleanas();
					setState(175);
					match(PyC);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(181);
			match(FSI);
			setState(182);
			match(PyC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondicionContext extends ParserRuleContext {
		public FuncionesContext funciones() {
			return getRuleContext(FuncionesContext.class,0);
		}
		public IgualdadesContext igualdades() {
			return getRuleContext(IgualdadesContext.class,0);
		}
		public DesigualdadesContext desigualdades() {
			return getRuleContext(DesigualdadesContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(184);
				funciones();
				}
				break;
			case 2:
				{
				setState(185);
				igualdades();
				}
				break;
			case 3:
				{
				setState(186);
				desigualdades();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualdadesContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode ESIGUAL() { return getToken(Anasint.ESIGUAL, 0); }
		public IgualdadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igualdades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterIgualdades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitIgualdades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitIgualdades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IgualdadesContext igualdades() throws RecognitionException {
		IgualdadesContext _localctx = new IgualdadesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_igualdades);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expresion();
			setState(190);
			match(ESIGUAL);
			setState(191);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigualdadesContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode ESDISTINTO() { return getToken(Anasint.ESDISTINTO, 0); }
		public TerminalNode MENOR() { return getToken(Anasint.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(Anasint.MAYOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(Anasint.MENORIGUAL, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(Anasint.MAYORIGUAL, 0); }
		public DesigualdadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigualdades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterDesigualdades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitDesigualdades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitDesigualdades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesigualdadesContext desigualdades() throws RecognitionException {
		DesigualdadesContext _localctx = new DesigualdadesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_desigualdades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			expresion();
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAYOR) | (1L << MENOR) | (1L << ESDISTINTO) | (1L << MENORIGUAL) | (1L << MAYORIGUAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(195);
			expresion();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruccion_asignacionContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode ASIG() { return getToken(Anasint.ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public Instruccion_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstruccion_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstruccion_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstruccion_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_asignacionContext instruccion_asignacion() throws RecognitionException {
		Instruccion_asignacionContext _localctx = new Instruccion_asignacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_instruccion_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IDENT);
			setState(198);
			match(ASIG);
			setState(199);
			expresion();
			setState(200);
			match(PyC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public Expresiones_enterasContext expresiones_enteras() {
			return getRuleContext(Expresiones_enterasContext.class,0);
		}
		public Expresiones_booleanasContext expresiones_booleanas() {
			return getRuleContext(Expresiones_booleanasContext.class,0);
		}
		public SecuenciasContext secuencias() {
			return getRuleContext(SecuenciasContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(202);
				expresiones_enteras(0);
				}
				break;
			case 2:
				{
				setState(203);
				expresiones_booleanas();
				}
				break;
			case 3:
				{
				setState(204);
				secuencias();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expresiones_enterasContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode NUMERO() { return getToken(Anasint.NUMERO, 0); }
		public List<Expresiones_enterasContext> expresiones_enteras() {
			return getRuleContexts(Expresiones_enterasContext.class);
		}
		public Expresiones_enterasContext expresiones_enteras(int i) {
			return getRuleContext(Expresiones_enterasContext.class,i);
		}
		public TerminalNode POR() { return getToken(Anasint.POR, 0); }
		public TerminalNode MAS() { return getToken(Anasint.MAS, 0); }
		public TerminalNode MENOS() { return getToken(Anasint.MENOS, 0); }
		public Expresiones_enterasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones_enteras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresiones_enteras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresiones_enteras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresiones_enteras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresiones_enterasContext expresiones_enteras() throws RecognitionException {
		return expresiones_enteras(0);
	}

	private Expresiones_enterasContext expresiones_enteras(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresiones_enterasContext _localctx = new Expresiones_enterasContext(_ctx, _parentState);
		Expresiones_enterasContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expresiones_enteras, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(208);
				match(IDENT);
				}
				break;
			case NUMERO:
				{
				setState(209);
				match(NUMERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresiones_enterasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresiones_enteras);
					setState(212);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(213);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					expresiones_enteras(2);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expresiones_booleanasContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(Anasint.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(Anasint.FALSE, 0); }
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public Expresiones_booleanasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresiones_booleanas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterExpresiones_booleanas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitExpresiones_booleanas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitExpresiones_booleanas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expresiones_booleanasContext expresiones_booleanas() throws RecognitionException {
		Expresiones_booleanasContext _localctx = new Expresiones_booleanasContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresiones_booleanas);
		int _la;
		try {
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SecuenciasContext extends ParserRuleContext {
		public TerminalNode CORCHETEABIERTO() { return getToken(Anasint.CORCHETEABIERTO, 0); }
		public TerminalNode CORCHETECERRADO() { return getToken(Anasint.CORCHETECERRADO, 0); }
		public Secuencia_enteraContext secuencia_entera() {
			return getRuleContext(Secuencia_enteraContext.class,0);
		}
		public Secuencia_logicaContext secuencia_logica() {
			return getRuleContext(Secuencia_logicaContext.class,0);
		}
		public SecuenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecuenciasContext secuencias() throws RecognitionException {
		SecuenciasContext _localctx = new SecuenciasContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_secuencias);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(CORCHETEABIERTO);
				setState(225);
				match(CORCHETECERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(CORCHETEABIERTO);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(227);
					secuencia_entera();
					}
					break;
				case 2:
					{
					setState(228);
					secuencia_logica();
					}
					break;
				}
				setState(231);
				match(CORCHETECERRADO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secuencia_enteraContext extends ParserRuleContext {
		public List<Expresiones_enterasContext> expresiones_enteras() {
			return getRuleContexts(Expresiones_enterasContext.class);
		}
		public Expresiones_enterasContext expresiones_enteras(int i) {
			return getRuleContext(Expresiones_enterasContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Secuencia_enteraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia_entera; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia_entera(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia_entera(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia_entera(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secuencia_enteraContext secuencia_entera() throws RecognitionException {
		Secuencia_enteraContext _localctx = new Secuencia_enteraContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_secuencia_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			expresiones_enteras(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(236);
				match(COMA);
				setState(237);
				expresiones_enteras(0);
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Secuencia_logicaContext extends ParserRuleContext {
		public List<Expresiones_booleanasContext> expresiones_booleanas() {
			return getRuleContexts(Expresiones_booleanasContext.class);
		}
		public Expresiones_booleanasContext expresiones_booleanas(int i) {
			return getRuleContext(Expresiones_booleanasContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(Anasint.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(Anasint.COMA, i);
		}
		public Secuencia_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuencia_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterSecuencia_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitSecuencia_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitSecuencia_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Secuencia_logicaContext secuencia_logica() throws RecognitionException {
		Secuencia_logicaContext _localctx = new Secuencia_logicaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_secuencia_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			expresiones_booleanas();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(244);
				match(COMA);
				setState(245);
				expresiones_booleanas();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expresiones_enteras_sempred((Expresiones_enterasContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresiones_enteras_sempred(Expresiones_enterasContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6"+
		"\3\64\n\3\r\3\16\3\65\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6B\n\6"+
		"\f\6\16\6E\13\6\3\7\3\7\6\7I\n\7\r\7\16\7J\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\7\bV\n\b\f\b\16\bY\13\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\5\bf\n\b\3\b\3\b\3\b\3\b\5\bl\n\b\7\bn\n\b\f\b\16\bq\13\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bz\n\b\f\b\16\b}\13\b\3\b\3\b\3\b\3\t\3\t"+
		"\6\t\u0084\n\t\r\t\16\t\u0085\3\n\3\n\5\n\u008a\n\n\3\13\3\13\3\f\3\f"+
		"\3\f\5\f\u0091\n\f\3\f\3\f\3\f\7\f\u0096\n\f\f\f\16\f\u0099\13\f\3\f\3"+
		"\f\3\f\7\f\u009e\n\f\f\f\16\f\u00a1\13\f\3\f\3\f\3\f\3\f\5\f\u00a7\n\f"+
		"\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\f\3\f\3\f\3\f\5\f\u00b4\n"+
		"\f\5\f\u00b6\n\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u00be\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21"+
		"\u00d0\n\21\3\22\3\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\22\7\22\u00da\n"+
		"\22\f\22\16\22\u00dd\13\22\3\23\3\23\5\23\u00e1\n\23\3\24\3\24\3\24\3"+
		"\24\3\24\5\24\u00e8\n\24\3\24\3\24\5\24\u00ec\n\24\3\25\3\25\3\25\7\25"+
		"\u00f1\n\25\f\25\16\25\u00f4\13\25\3\26\3\26\3\26\7\26\u00f9\n\26\f\26"+
		"\16\26\u00fc\13\26\3\26\2\3\"\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*\2\7\3\2\22\25\3\2)*\4\2\"#+-\3\2$&\3\2\30\31\2\u0105\2,\3\2\2"+
		"\2\4\61\3\2\2\2\6\67\3\2\2\2\b9\3\2\2\2\n>\3\2\2\2\fF\3\2\2\2\16L\3\2"+
		"\2\2\20\u0081\3\2\2\2\22\u0089\3\2\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2"+
		"\2\30\u00bd\3\2\2\2\32\u00bf\3\2\2\2\34\u00c3\3\2\2\2\36\u00c7\3\2\2\2"+
		" \u00cf\3\2\2\2\"\u00d4\3\2\2\2$\u00e0\3\2\2\2&\u00eb\3\2\2\2(\u00ed\3"+
		"\2\2\2*\u00f5\3\2\2\2,-\5\4\3\2-.\5\f\7\2./\5\20\t\2/\60\7\2\2\3\60\3"+
		"\3\2\2\2\61\63\7\b\2\2\62\64\5\b\5\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\5\3\2\2\2\678\t\2\2\28\7\3\2\2\29:\5\n\6\2:"+
		";\7\36\2\2;<\5\6\4\2<=\7\37\2\2=\t\3\2\2\2>C\7\26\2\2?@\7 \2\2@B\5\n\6"+
		"\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\13\3\2\2\2EC\3\2\2\2FH\7\t"+
		"\2\2GI\5\16\b\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LM\7"+
		"\13\2\2MN\7\26\2\2N\\\7\32\2\2OP\5\6\4\2PW\7\26\2\2QR\7 \2\2RS\5\6\4\2"+
		"ST\7\26\2\2TV\3\2\2\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2"+
		"\2YW\3\2\2\2ZO\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3"+
		"\2\2\2_`\7\33\2\2`a\7\r\2\2ab\7\32\2\2be\5\6\4\2cf\5\"\22\2df\5&\24\2"+
		"ec\3\2\2\2ed\3\2\2\2fo\3\2\2\2gh\7 \2\2hk\5\6\4\2il\5\"\22\2jl\5&\24\2"+
		"ki\3\2\2\2kj\3\2\2\2ln\3\2\2\2mg\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2"+
		"pr\3\2\2\2qo\3\2\2\2rs\7\33\2\2st\5\4\3\2tu\5\20\t\2uv\7\r\2\2v{\5 \21"+
		"\2wx\7 \2\2xz\5 \21\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|~\3\2\2"+
		"\2}{\3\2\2\2~\177\7\37\2\2\177\u0080\7\f\2\2\u0080\17\3\2\2\2\u0081\u0083"+
		"\7\n\2\2\u0082\u0084\5\22\n\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\21\3\2\2\2\u0087\u008a"+
		"\5\36\20\2\u0088\u008a\5\24\13\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2"+
		"\2\u008a\23\3\2\2\2\u008b\u008c\5\26\f\2\u008c\25\3\2\2\2\u008d\u008e"+
		"\7\16\2\2\u008e\u0090\7\32\2\2\u008f\u0091\7(\2\2\u0090\u008f\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0097\5\30\r\2\u0093\u0094"+
		"\t\3\2\2\u0094\u0096\5\30\r\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009b\7\33\2\2\u009b\u009f\7\17\2\2\u009c\u009e\5\22\n"+
		"\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a6\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3"+
		"\u00a4\5$\23\2\u00a4\u00a5\7\37\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00b5\3\2\2\2\u00a8\u00b3\7\20\2\2\u00a9"+
		"\u00ab\5\22\n\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b0\7\r\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\7\37\2\2\u00b2\u00b4\3"+
		"\2\2\2\u00b3\u00ac\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00a8\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7\21"+
		"\2\2\u00b8\u00b9\7\37\2\2\u00b9\27\3\2\2\2\u00ba\u00be\5\16\b\2\u00bb"+
		"\u00be\5\32\16\2\u00bc\u00be\5\34\17\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb"+
		"\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\31\3\2\2\2\u00bf\u00c0\5 \21\2\u00c0"+
		"\u00c1\7\'\2\2\u00c1\u00c2\5 \21\2\u00c2\33\3\2\2\2\u00c3\u00c4\5 \21"+
		"\2\u00c4\u00c5\t\4\2\2\u00c5\u00c6\5 \21\2\u00c6\35\3\2\2\2\u00c7\u00c8"+
		"\7\26\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\5 \21\2\u00ca\u00cb\7\37\2\2"+
		"\u00cb\37\3\2\2\2\u00cc\u00d0\5\"\22\2\u00cd\u00d0\5$\23\2\u00ce\u00d0"+
		"\5&\24\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"!\3\2\2\2\u00d1\u00d2\b\22\1\2\u00d2\u00d5\7\26\2\2\u00d3\u00d5\7\27\2"+
		"\2\u00d4\u00d1\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00db\3\2\2\2\u00d6\u00d7"+
		"\f\3\2\2\u00d7\u00d8\t\5\2\2\u00d8\u00da\5\"\22\4\u00d9\u00d6\3\2\2\2"+
		"\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc#\3"+
		"\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\t\6\2\2\u00df\u00e1\7\26\2\2\u00e0"+
		"\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1%\3\2\2\2\u00e2\u00e3\7\34\2\2"+
		"\u00e3\u00ec\7\35\2\2\u00e4\u00e7\7\34\2\2\u00e5\u00e8\5(\25\2\u00e6\u00e8"+
		"\5*\26\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\7\35\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e4\3"+
		"\2\2\2\u00ec\'\3\2\2\2\u00ed\u00f2\5\"\22\2\u00ee\u00ef\7 \2\2\u00ef\u00f1"+
		"\5\"\22\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3)\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa\5"+
		"$\23\2\u00f6\u00f7\7 \2\2\u00f7\u00f9\5$\23\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb+\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\35\65CJW\\eko{\u0085\u0089\u0090\u0097\u009f\u00a6"+
		"\u00ac\u00b3\u00b5\u00bd\u00cf\u00d4\u00db\u00e0\u00e7\u00eb\u00f2\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}