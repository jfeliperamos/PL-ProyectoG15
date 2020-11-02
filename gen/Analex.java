// Generated from C:/Users/javga/IdeaProjects/PL-ProyectoG15/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA", 
			"DIGITO", "LETRA", "VARIABLES", "SUBPROGRAMAS", "INSTRUCCIONES", "FUNCION", 
			"FFUNCION", "RETURN", "IF", "THEN", "ELSE", "FSI", "ENTERO", "LOGICO", 
			"SECUENCIA_ENTERA", "SECUENCIA_LOGICA", "IDENT", "NUMERO", "TRUE", "FALSE", 
			"PARENTESISABIERTO", "PARENTESISCERRADO", "CORCHETEABIERTO", "CORCHETECERRADO", 
			"DOSPUNTOS", "PyC", "COMA", "ASIG", "MAYOR", "MENOR", "MAS", "MENOS", 
			"POR", "ESIGUAL", "NEGACION", "DISY", "CONJ", "ESDISTINTO", "MENORIGUAL", 
			"MAYORIGUAL"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u013d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4g\n\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\7\5q\n\5\f\5\16\5t\13\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6\177\n\6\f\6\16\6\u0082\13\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\7\27\u00f8\n\27\f\27\16\27\u00fb\13\27\3\30\5\30\u00fe"+
		"\n\30\3\30\6\30\u0101\n\30\r\30\16\30\u0102\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3("+
		"\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\4r\u0080\2/\3\3\5"+
		"\4\7\5\t\6\13\7\r\2\17\2\21\b\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\339\34;\35=\36?\37"+
		"A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-\3\2\4\3\2\62;\4\2C\\c|\2\u0141\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\3]\3\2\2\2\5a\3\2\2\2\7f\3\2\2\2\tl\3\2\2\2\13z\3\2\2\2\r\u0087"+
		"\3\2\2\2\17\u0089\3\2\2\2\21\u008b\3\2\2\2\23\u0095\3\2\2\2\25\u00a2\3"+
		"\2\2\2\27\u00b0\3\2\2\2\31\u00b8\3\2\2\2\33\u00c1\3\2\2\2\35\u00c5\3\2"+
		"\2\2\37\u00c8\3\2\2\2!\u00d1\3\2\2\2#\u00d6\3\2\2\2%\u00da\3\2\2\2\'\u00de"+
		"\3\2\2\2)\u00e2\3\2\2\2+\u00eb\3\2\2\2-\u00f4\3\2\2\2/\u00fd\3\2\2\2\61"+
		"\u0104\3\2\2\2\63\u0109\3\2\2\2\65\u010f\3\2\2\2\67\u0111\3\2\2\29\u0113"+
		"\3\2\2\2;\u0115\3\2\2\2=\u0117\3\2\2\2?\u0119\3\2\2\2A\u011b\3\2\2\2C"+
		"\u011d\3\2\2\2E\u011f\3\2\2\2G\u0121\3\2\2\2I\u0123\3\2\2\2K\u0125\3\2"+
		"\2\2M\u0127\3\2\2\2O\u0129\3\2\2\2Q\u012c\3\2\2\2S\u012e\3\2\2\2U\u0131"+
		"\3\2\2\2W\u0134\3\2\2\2Y\u0137\3\2\2\2[\u013a\3\2\2\2]^\7\"\2\2^_\3\2"+
		"\2\2_`\b\2\2\2`\4\3\2\2\2ab\7\13\2\2bc\3\2\2\2cd\b\3\2\2d\6\3\2\2\2eg"+
		"\7\17\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\f\2\2ij\3\2\2\2jk\b\4\2\2"+
		"k\b\3\2\2\2lm\7\61\2\2mn\7,\2\2nr\3\2\2\2oq\13\2\2\2po\3\2\2\2qt\3\2\2"+
		"\2rs\3\2\2\2rp\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7,\2\2vw\7\61\2\2wx\3\2\2"+
		"\2xy\b\5\2\2y\n\3\2\2\2z{\7\61\2\2{|\7\61\2\2|\u0080\3\2\2\2}\177\13\2"+
		"\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080\u0081\3\2\2\2\u0080~\3\2\2\2\u0081"+
		"\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\5\7\4\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0086\b\6\2\2\u0086\f\3\2\2\2\u0087\u0088\t\2\2\2\u0088\16"+
		"\3\2\2\2\u0089\u008a\t\3\2\2\u008a\20\3\2\2\2\u008b\u008c\7X\2\2\u008c"+
		"\u008d\7C\2\2\u008d\u008e\7T\2\2\u008e\u008f\7K\2\2\u008f\u0090\7C\2\2"+
		"\u0090\u0091\7D\2\2\u0091\u0092\7N\2\2\u0092\u0093\7G\2\2\u0093\u0094"+
		"\7U\2\2\u0094\22\3\2\2\2\u0095\u0096\7U\2\2\u0096\u0097\7W\2\2\u0097\u0098"+
		"\7D\2\2\u0098\u0099\7R\2\2\u0099\u009a\7T\2\2\u009a\u009b\7Q\2\2\u009b"+
		"\u009c\7I\2\2\u009c\u009d\7T\2\2\u009d\u009e\7C\2\2\u009e\u009f\7O\2\2"+
		"\u009f\u00a0\7C\2\2\u00a0\u00a1\7U\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7"+
		"K\2\2\u00a3\u00a4\7P\2\2\u00a4\u00a5\7U\2\2\u00a5\u00a6\7V\2\2\u00a6\u00a7"+
		"\7T\2\2\u00a7\u00a8\7W\2\2\u00a8\u00a9\7E\2\2\u00a9\u00aa\7E\2\2\u00aa"+
		"\u00ab\7K\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7P\2\2\u00ad\u00ae\7G\2\2"+
		"\u00ae\u00af\7U\2\2\u00af\26\3\2\2\2\u00b0\u00b1\7H\2\2\u00b1\u00b2\7"+
		"W\2\2\u00b2\u00b3\7P\2\2\u00b3\u00b4\7E\2\2\u00b4\u00b5\7K\2\2\u00b5\u00b6"+
		"\7Q\2\2\u00b6\u00b7\7P\2\2\u00b7\30\3\2\2\2\u00b8\u00b9\7H\2\2\u00b9\u00ba"+
		"\7H\2\2\u00ba\u00bb\7W\2\2\u00bb\u00bc\7P\2\2\u00bc\u00bd\7E\2\2\u00bd"+
		"\u00be\7K\2\2\u00be\u00bf\7Q\2\2\u00bf\u00c0\7P\2\2\u00c0\32\3\2\2\2\u00c1"+
		"\u00c2\7f\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7x\2\2\u00c4\34\3\2\2\2\u00c5"+
		"\u00c6\7u\2\2\u00c6\u00c7\7k\2\2\u00c7\36\3\2\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7p\2\2\u00ca\u00cb\7v\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7p\2\2"+
		"\u00cd\u00ce\7e\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7u\2\2\u00d0 \3\2\2"+
		"\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5"+
		"\7q\2\2\u00d5\"\3\2\2\2\u00d6\u00d7\7h\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9"+
		"\7k\2\2\u00d9$\3\2\2\2\u00da\u00db\7P\2\2\u00db\u00dc\7W\2\2\u00dc\u00dd"+
		"\7O\2\2\u00dd&\3\2\2\2\u00de\u00df\7N\2\2\u00df\u00e0\7Q\2\2\u00e0\u00e1"+
		"\7I\2\2\u00e1(\3\2\2\2\u00e2\u00e3\7U\2\2\u00e3\u00e4\7G\2\2\u00e4\u00e5"+
		"\7S\2\2\u00e5\u00e6\7*\2\2\u00e6\u00e7\7P\2\2\u00e7\u00e8\7W\2\2\u00e8"+
		"\u00e9\7O\2\2\u00e9\u00ea\7+\2\2\u00ea*\3\2\2\2\u00eb\u00ec\7U\2\2\u00ec"+
		"\u00ed\7G\2\2\u00ed\u00ee\7S\2\2\u00ee\u00ef\7*\2\2\u00ef\u00f0\7N\2\2"+
		"\u00f0\u00f1\7Q\2\2\u00f1\u00f2\7I\2\2\u00f2\u00f3\7+\2\2\u00f3,\3\2\2"+
		"\2\u00f4\u00f9\5\17\b\2\u00f5\u00f8\5\17\b\2\u00f6\u00f8\5\r\7\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa.\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe"+
		"\7/\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u0101\5\r\7\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0100\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\60\3\2\2\2\u0104\u0105\7v\2\2\u0105\u0106"+
		"\7t\2\2\u0106\u0107\7w\2\2\u0107\u0108\7g\2\2\u0108\62\3\2\2\2\u0109\u010a"+
		"\7h\2\2\u010a\u010b\7c\2\2\u010b\u010c\7n\2\2\u010c\u010d\7u\2\2\u010d"+
		"\u010e\7g\2\2\u010e\64\3\2\2\2\u010f\u0110\7*\2\2\u0110\66\3\2\2\2\u0111"+
		"\u0112\7+\2\2\u01128\3\2\2\2\u0113\u0114\7]\2\2\u0114:\3\2\2\2\u0115\u0116"+
		"\7_\2\2\u0116<\3\2\2\2\u0117\u0118\7<\2\2\u0118>\3\2\2\2\u0119\u011a\7"+
		"=\2\2\u011a@\3\2\2\2\u011b\u011c\7.\2\2\u011cB\3\2\2\2\u011d\u011e\7?"+
		"\2\2\u011eD\3\2\2\2\u011f\u0120\7@\2\2\u0120F\3\2\2\2\u0121\u0122\7>\2"+
		"\2\u0122H\3\2\2\2\u0123\u0124\7-\2\2\u0124J\3\2\2\2\u0125\u0126\7/\2\2"+
		"\u0126L\3\2\2\2\u0127\u0128\7,\2\2\u0128N\3\2\2\2\u0129\u012a\7?\2\2\u012a"+
		"\u012b\7?\2\2\u012bP\3\2\2\2\u012c\u012d\7#\2\2\u012dR\3\2\2\2\u012e\u012f"+
		"\7~\2\2\u012f\u0130\7~\2\2\u0130T\3\2\2\2\u0131\u0132\7(\2\2\u0132\u0133"+
		"\7(\2\2\u0133V\3\2\2\2\u0134\u0135\7#\2\2\u0135\u0136\7?\2\2\u0136X\3"+
		"\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7?\2\2\u0139Z\3\2\2\2\u013a\u013b"+
		"\7@\2\2\u013b\u013c\7?\2\2\u013c\\\3\2\2\2\n\2fr\u0080\u00f7\u00f9\u00fd"+
		"\u0102\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}