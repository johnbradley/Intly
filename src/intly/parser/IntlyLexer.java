// Generated from Intly.g4 by ANTLR 4.1
package intly.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntlyLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Ret=1, LeftParen=2, RightParen=3, LeftBracket=4, RightBracket=5, Colon=6, 
		Comma=7, Semi=8, Assign=9, Eq=10, IfCmd=11, While=12, Mult=13, Div=14, 
		Sub=15, Add=16, Lt=17, Gt=18, Le=19, Ge=20, Name=21, Int=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return'", "'('", "')'", "'{'", "'}'", "':'", "','", "';'", "'='", "'=='", 
		"'if'", "'while'", "'*'", "'/'", "'-'", "'+'", "'<'", "'>'", "'<='", "'>='", 
		"Name", "Int", "WS"
	};
	public static final String[] ruleNames = {
		"Ret", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "Colon", 
		"Comma", "Semi", "Assign", "Eq", "IfCmd", "While", "Mult", "Div", "Sub", 
		"Add", "Lt", "Gt", "Le", "Ge", "Name", "Int", "WS"
	};


	public IntlyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Intly.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 22: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\31y\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\7\26i\n\26\f\26\16\26l\13\26\3\27\5\27o\n\27\3"+
		"\27\6\27r\n\27\r\27\16\27s\3\30\3\30\3\30\3\30\2\31\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17"+
		"\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\2\3"+
		"\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"{\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2"+
		"\2\58\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2"+
		"\21D\3\2\2\2\23F\3\2\2\2\25H\3\2\2\2\27K\3\2\2\2\31N\3\2\2\2\33T\3\2\2"+
		"\2\35V\3\2\2\2\37X\3\2\2\2!Z\3\2\2\2#\\\3\2\2\2%^\3\2\2\2\'`\3\2\2\2)"+
		"c\3\2\2\2+f\3\2\2\2-n\3\2\2\2/u\3\2\2\2\61\62\7t\2\2\62\63\7g\2\2\63\64"+
		"\7v\2\2\64\65\7w\2\2\65\66\7t\2\2\66\67\7p\2\2\67\4\3\2\2\289\7*\2\29"+
		"\6\3\2\2\2:;\7+\2\2;\b\3\2\2\2<=\7}\2\2=\n\3\2\2\2>?\7\177\2\2?\f\3\2"+
		"\2\2@A\7<\2\2A\16\3\2\2\2BC\7.\2\2C\20\3\2\2\2DE\7=\2\2E\22\3\2\2\2FG"+
		"\7?\2\2G\24\3\2\2\2HI\7?\2\2IJ\7?\2\2J\26\3\2\2\2KL\7k\2\2LM\7h\2\2M\30"+
		"\3\2\2\2NO\7y\2\2OP\7j\2\2PQ\7k\2\2QR\7n\2\2RS\7g\2\2S\32\3\2\2\2TU\7"+
		",\2\2U\34\3\2\2\2VW\7\61\2\2W\36\3\2\2\2XY\7/\2\2Y \3\2\2\2Z[\7-\2\2["+
		"\"\3\2\2\2\\]\7>\2\2]$\3\2\2\2^_\7@\2\2_&\3\2\2\2`a\7>\2\2ab\7?\2\2b("+
		"\3\2\2\2cd\7@\2\2de\7?\2\2e*\3\2\2\2fj\t\2\2\2gi\t\3\2\2hg\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2jk\3\2\2\2k,\3\2\2\2lj\3\2\2\2mo\7/\2\2nm\3\2\2\2no\3"+
		"\2\2\2oq\3\2\2\2pr\t\4\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t.\3"+
		"\2\2\2uv\t\5\2\2vw\3\2\2\2wx\b\30\2\2x\60\3\2\2\2\6\2jns";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}