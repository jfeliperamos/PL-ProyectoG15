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
		VARIABLES=6, SUBPROGRAMAS=7, INSTRUCCIONES=8, ENTERO=9, LOGICO=10, SECUENCIA_ENTERA=11, 
		SECUENCIA_LOGICA=12, IDENT=13, NUMERO=14, TRUE=15, FALSE=16, PARENTESISABIERTO=17, 
		PARENTESISCERRADO=18, CORCHETEABIERTO=19, CORCHETECERRADO=20, DOSPUNTOS=21, 
		PyC=22, COMA=23, ASIG=24, MAYOR=25, MENOR=26, MAS=27, MENOS=28, POR=29;
	public static final int
		RULE_programa = 0, RULE_variables = 1, RULE_tipo = 2, RULE_decl_vars = 3, 
		RULE_vars = 4, RULE_instrucciones = 5, RULE_instrucs = 6, RULE_expresion = 7, 
		RULE_expresiones_enteras = 8, RULE_expresiones_booleanas = 9, RULE_secuencias = 10, 
		RULE_secuencia_entera = 11, RULE_secuencia_logica = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "variables", "tipo", "decl_vars", "vars", "instrucciones", 
			"instrucs", "expresion", "expresiones_enteras", "expresiones_booleanas", 
			"secuencias", "secuencia_entera", "secuencia_logica"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, null, null, "'VARIABLES'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'NUM'", "'LOG'", "'SEQ(NUM)'", "'SEQ(LOG)'", null, 
			null, "'true'", "'false'", "'('", "')'", "'['", "']'", "':'", "';'", 
			"','", "'='", "'>'", "'<'", "'+'", "'-'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", 
			"VARIABLES", "SUBPROGRAMAS", "INSTRUCCIONES", "ENTERO", "LOGICO", "SECUENCIA_ENTERA", 
			"SECUENCIA_LOGICA", "IDENT", "NUMERO", "TRUE", "FALSE", "PARENTESISABIERTO", 
			"PARENTESISCERRADO", "CORCHETEABIERTO", "CORCHETECERRADO", "DOSPUNTOS", 
			"PyC", "COMA", "ASIG", "MAYOR", "MENOR", "MAS", "MENOS", "POR"
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
			setState(26);
			variables();
			setState(27);
			instrucciones();
			setState(28);
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
			setState(30);
			match(VARIABLES);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				decl_vars();
				}
				}
				setState(34); 
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
			setState(36);
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
			setState(38);
			vars();
			setState(39);
			match(DOSPUNTOS);
			setState(40);
			tipo();
			setState(41);
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
			setState(43);
			match(IDENT);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(44);
					match(COMA);
					setState(45);
					vars();
					}
					} 
				}
				setState(50);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public TerminalNode INSTRUCCIONES() { return getToken(Anasint.INSTRUCCIONES, 0); }
		public List<InstrucsContext> instrucs() {
			return getRuleContexts(InstrucsContext.class);
		}
		public InstrucsContext instrucs(int i) {
			return getRuleContext(InstrucsContext.class,i);
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
		enterRule(_localctx, 10, RULE_instrucciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(INSTRUCCIONES);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				instrucs();
				}
				}
				setState(55); 
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

	public static class InstrucsContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(Anasint.IDENT, 0); }
		public TerminalNode ASIG() { return getToken(Anasint.ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PyC() { return getToken(Anasint.PyC, 0); }
		public InstrucsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).enterInstrucs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AnasintListener ) ((AnasintListener)listener).exitInstrucs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AnasintVisitor ) return ((AnasintVisitor<? extends T>)visitor).visitInstrucs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucsContext instrucs() throws RecognitionException {
		InstrucsContext _localctx = new InstrucsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instrucs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(IDENT);
			setState(58);
			match(ASIG);
			setState(59);
			expresion();
			setState(60);
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
		enterRule(_localctx, 14, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(62);
				expresiones_enteras(0);
				}
				break;
			case 2:
				{
				setState(63);
				expresiones_booleanas();
				}
				break;
			case 3:
				{
				setState(64);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresiones_enteras, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(68);
				match(IDENT);
				}
				break;
			case NUMERO:
				{
				setState(69);
				match(NUMERO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Expresiones_enterasContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresiones_enteras);
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAS) | (1L << MENOS) | (1L << POR))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(74);
					expresiones_enteras(2);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		enterRule(_localctx, 18, RULE_expresiones_booleanas);
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
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
				setState(81);
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
		enterRule(_localctx, 20, RULE_secuencias);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(CORCHETEABIERTO);
				setState(85);
				match(CORCHETECERRADO);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(CORCHETEABIERTO);
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(87);
					secuencia_entera();
					}
					break;
				case 2:
					{
					setState(88);
					secuencia_logica();
					}
					break;
				}
				setState(91);
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
		enterRule(_localctx, 22, RULE_secuencia_entera);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			expresiones_enteras(0);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(96);
				match(COMA);
				setState(97);
				expresiones_enteras(0);
				}
				}
				setState(102);
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
		enterRule(_localctx, 24, RULE_secuencia_logica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expresiones_booleanas();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(104);
				match(COMA);
				setState(105);
				expresiones_booleanas();
				}
				}
				setState(110);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37r\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\3\3\3\6\3#\n\3\r\3\16\3$\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6\61\n\6\f\6\16\6\64\13\6\3\7"+
		"\3\7\6\78\n\7\r\7\16\79\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\tD\n\t\3\n\3"+
		"\n\3\n\5\nI\n\n\3\n\3\n\3\n\7\nN\n\n\f\n\16\nQ\13\n\3\13\3\13\5\13U\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\5\f\\\n\f\3\f\3\f\5\f`\n\f\3\r\3\r\3\r\7\re\n"+
		"\r\f\r\16\rh\13\r\3\16\3\16\3\16\7\16m\n\16\f\16\16\16p\13\16\3\16\2\3"+
		"\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\5\3\2\13\16\3\2\35\37\3\2\21"+
		"\22\2p\2\34\3\2\2\2\4 \3\2\2\2\6&\3\2\2\2\b(\3\2\2\2\n-\3\2\2\2\f\65\3"+
		"\2\2\2\16;\3\2\2\2\20C\3\2\2\2\22H\3\2\2\2\24T\3\2\2\2\26_\3\2\2\2\30"+
		"a\3\2\2\2\32i\3\2\2\2\34\35\5\4\3\2\35\36\5\f\7\2\36\37\7\2\2\3\37\3\3"+
		"\2\2\2 \"\7\b\2\2!#\5\b\5\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2"+
		"%\5\3\2\2\2&\'\t\2\2\2\'\7\3\2\2\2()\5\n\6\2)*\7\27\2\2*+\5\6\4\2+,\7"+
		"\30\2\2,\t\3\2\2\2-\62\7\17\2\2./\7\31\2\2/\61\5\n\6\2\60.\3\2\2\2\61"+
		"\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\13\3\2\2\2\64\62\3\2\2\2\65"+
		"\67\7\n\2\2\668\5\16\b\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2"+
		":\r\3\2\2\2;<\7\17\2\2<=\7\32\2\2=>\5\20\t\2>?\7\30\2\2?\17\3\2\2\2@D"+
		"\5\22\n\2AD\5\24\13\2BD\5\26\f\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2D\21\3\2"+
		"\2\2EF\b\n\1\2FI\7\17\2\2GI\7\20\2\2HE\3\2\2\2HG\3\2\2\2IO\3\2\2\2JK\f"+
		"\3\2\2KL\t\3\2\2LN\5\22\n\4MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\23"+
		"\3\2\2\2QO\3\2\2\2RU\t\4\2\2SU\7\17\2\2TR\3\2\2\2TS\3\2\2\2U\25\3\2\2"+
		"\2VW\7\25\2\2W`\7\26\2\2X[\7\25\2\2Y\\\5\30\r\2Z\\\5\32\16\2[Y\3\2\2\2"+
		"[Z\3\2\2\2\\]\3\2\2\2]^\7\26\2\2^`\3\2\2\2_V\3\2\2\2_X\3\2\2\2`\27\3\2"+
		"\2\2af\5\22\n\2bc\7\31\2\2ce\5\22\n\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg"+
		"\3\2\2\2g\31\3\2\2\2hf\3\2\2\2in\5\24\13\2jk\7\31\2\2km\5\24\13\2lj\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\33\3\2\2\2pn\3\2\2\2\r$\629CHOT"+
		"[_fn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}