// Generated from /home/miguel/OneDrive/3ºSoftware/Repositorios/DLP/IIS-Diseno-de-Lenguajes-de-Programacion/Prácticas/Python--/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.expressions.*;
    import ast.types.*;
    import java.util.Map;
    import java.util.HashMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, TRASH=38, 
		INT_CONSTANT=39, REAL_CONSTANT=40, COMMENT=41, CHAR_CONSTANT=42, ID=43;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_main_function = 2, RULE_var_definition = 3, 
		RULE_var_definition_aux = 4, RULE_function_definition = 5, RULE_statement = 6, 
		RULE_params_aux = 7, RULE_body_aux = 8, RULE_expression = 9, RULE_type = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "main_function", "var_definition", "var_definition_aux", 
			"function_definition", "statement", "params_aux", "body_aux", "expression", 
			"type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
			"'return'", "'print'", "'input'", "'='", "'if'", "'else'", "'while'", 
			"'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", 
			"'<'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'int'", "'double'", 
			"'char'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "COMMENT", "CHAR_CONSTANT", 
			"ID"
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
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> definitions = new ArrayList<>();
		public DefinitionContext d;
		public Main_functionContext main;
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public Main_functionContext main_function() {
			return getRuleContext(Main_functionContext.class,0);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(22);
					((ProgramContext)_localctx).d = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).d.ast);
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(30);
			((ProgramContext)_localctx).main = main_function();
			_localctx.definitions.add(((ProgramContext)_localctx).main.ast);
			setState(32);
			match(EOF);
			((ProgramContext)_localctx).ast = new Program(_localctx.definitions);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<>();
		public Var_definitionContext v;
		public Function_definitionContext f;
		public Var_definitionContext var_definition() {
			return getRuleContext(Var_definitionContext.class,0);
		}
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				((DefinitionContext)_localctx).v = var_definition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).v.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				((DefinitionContext)_localctx).f = function_definition();
				_localctx.ast.add(((DefinitionContext)_localctx).f.ast);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Main_functionContext extends ParserRuleContext {
		public FunctionDef ast;
		public List<VariableDef> params = new ArrayList<>();
		public List<Statement> body = new ArrayList<>();
		public Token MAIN;
		public Var_definitionContext v;
		public StatementContext s;
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Main_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMain_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_functionContext main_function() throws RecognitionException {
		Main_functionContext _localctx = new Main_functionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			((Main_functionContext)_localctx).MAIN = match(T__1);
			setState(45);
			match(T__2);
			setState(46);
			match(T__3);
			setState(47);
			match(T__4);
			setState(48);
			match(T__5);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(49);
					((Main_functionContext)_localctx).v = var_definition();
					_localctx.params.addAll(((Main_functionContext)_localctx).v.ast);
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410209800L) != 0)) {
				{
				{
				setState(57);
				((Main_functionContext)_localctx).s = statement(0);
				_localctx.body.add(((Main_functionContext)_localctx).s.ast);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__6);
			((Main_functionContext)_localctx).ast = new FunctionDef(((Main_functionContext)_localctx).MAIN.getLine(),((Main_functionContext)_localctx).MAIN.getCharPositionInLine()+1,(((Main_functionContext)_localctx).MAIN!=null?((Main_functionContext)_localctx).MAIN.getText():null),VoidType.getInstance(),_localctx.params,_localctx.body);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definitionContext extends ParserRuleContext {
		public List<VariableDef> ast;
		public Var_definition_auxContext v;
		public Var_definition_auxContext var_definition_aux() {
			return getRuleContext(Var_definition_auxContext.class,0);
		}
		public Var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definitionContext var_definition() throws RecognitionException {
		Var_definitionContext _localctx = new Var_definitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			((Var_definitionContext)_localctx).v = var_definition_aux();
			setState(69);
			match(T__7);
			((Var_definitionContext)_localctx).ast = ((Var_definitionContext)_localctx).v.ast;
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_definition_auxContext extends ParserRuleContext {
		public List<VariableDef> ast = new ArrayList<VariableDef>();
		public Map<String,Expression> expressions = new HashMap<>();;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public TypeContext t;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_definition_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_definition_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVar_definition_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_definition_auxContext var_definition_aux() throws RecognitionException {
		Var_definition_auxContext _localctx = new Var_definition_auxContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_definition_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			((Var_definition_auxContext)_localctx).e1 = expression(0);
			_localctx.expressions.put((((Var_definition_auxContext)_localctx).e1!=null?_input.getText(((Var_definition_auxContext)_localctx).e1.start,((Var_definition_auxContext)_localctx).e1.stop):null), ((Var_definition_auxContext)_localctx).e1.ast);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(74);
				match(T__8);
				setState(75);
				((Var_definition_auxContext)_localctx).e2 = expression(0);
				_localctx.expressions.put((((Var_definition_auxContext)_localctx).e2!=null?_input.getText(((Var_definition_auxContext)_localctx).e2.start,((Var_definition_auxContext)_localctx).e2.stop):null),((Var_definition_auxContext)_localctx).e2.ast);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__4);
			setState(84);
			((Var_definition_auxContext)_localctx).t = type();

			                for(Map.Entry<String, Expression> entry:_localctx.expressions.entrySet()){
			                    _localctx.ast.add(new VariableDef(entry.getValue().getLine(),entry.getValue().getColumn(),entry.getKey(),((Var_definition_auxContext)_localctx).t.ast));
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_definitionContext extends ParserRuleContext {
		public FunctionDef ast;
		public List<VariableDef> params = new ArrayList<>();
		public List<Statement> body = new ArrayList<>();
		public Type returnType = VoidType.getInstance();
		public Token ID;
		public Var_definition_auxContext v1;
		public Var_definition_auxContext v2;
		public TypeContext t1;
		public Var_definitionContext v3;
		public StatementContext s;
		public TypeContext t2;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<Var_definition_auxContext> var_definition_aux() {
			return getRuleContexts(Var_definition_auxContext.class);
		}
		public Var_definition_auxContext var_definition_aux(int i) {
			return getRuleContext(Var_definition_auxContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			((Function_definitionContext)_localctx).ID = match(ID);
			setState(89);
			match(T__2);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
				{
				setState(90);
				((Function_definitionContext)_localctx).v1 = var_definition_aux();
				_localctx.params.addAll(((Function_definitionContext)_localctx).v1.ast);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(92);
					match(T__8);
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
						{
						{
						setState(93);
						((Function_definitionContext)_localctx).v2 = var_definition_aux();
						_localctx.params.addAll(((Function_definitionContext)_localctx).v2.ast);
						}
						}
						setState(100);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
			}

			setState(105);
			match(T__3);
			setState(106);
			match(T__4);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698168832L) != 0)) {
				{
				setState(107);
				((Function_definitionContext)_localctx).t1 = type();
				((Function_definitionContext)_localctx).returnType = ((Function_definitionContext)_localctx).t1.ast;
				}
			}

			setState(112);
			match(T__5);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					((Function_definitionContext)_localctx).v3 = var_definition();
					_localctx.params.addAll(((Function_definitionContext)_localctx).v3.ast);
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					((Function_definitionContext)_localctx).s = statement(0);
					_localctx.body.add(((Function_definitionContext)_localctx).s.ast);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(129);
				match(T__9);
				setState(130);
				((Function_definitionContext)_localctx).t2 = type();
				setState(131);
				match(T__7);
				}
			}

			setState(135);
			match(T__6);
			((Function_definitionContext)_localctx).ast = new FunctionDef(((Function_definitionContext)_localctx).ID.getLine(),((Function_definitionContext)_localctx).ID.getCharPositionInLine()+1,(((Function_definitionContext)_localctx).ID!=null?((Function_definitionContext)_localctx).ID.getText():null),_localctx.returnType,_localctx.params,_localctx.body);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Statement> elseBody = new ArrayList<Statement>();
		public StatementContext st;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public Token OP;
		public Token IF;
		public ExpressionContext e;
		public Body_auxContext ifBody;
		public Body_auxContext elseBody_aux;
		public Token W;
		public Body_auxContext body;
		public Token R;
		public Params_auxContext p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<Body_auxContext> body_aux() {
			return getRuleContexts(Body_auxContext.class);
		}
		public Body_auxContext body_aux(int i) {
			return getRuleContext(Body_auxContext.class,i);
		}
		public Params_auxContext params_aux() {
			return getRuleContext(Params_auxContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		return statement(0);
	}

	private StatementContext statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatementContext _localctx = new StatementContext(_ctx, _parentState);
		StatementContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_statement, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(139);
				match(T__10);
				setState(140);
				((StatementContext)_localctx).e1 = expression(0);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(141);
					match(T__8);
					setState(142);
					((StatementContext)_localctx).e2 = expression(0);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(T__7);
				}
				break;
			case 2:
				{
				setState(150);
				match(T__11);
				setState(151);
				((StatementContext)_localctx).e1 = expression(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(152);
					match(T__8);
					setState(153);
					((StatementContext)_localctx).e2 = expression(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(T__7);
				}
				break;
			case 3:
				{
				setState(161);
				((StatementContext)_localctx).e1 = expression(0);
				setState(162);
				((StatementContext)_localctx).OP = match(T__12);
				setState(163);
				((StatementContext)_localctx).e2 = expression(0);
				setState(164);
				match(T__7);
				((StatementContext)_localctx).ast = new Asignment(((StatementContext)_localctx).OP.getLine(),((StatementContext)_localctx).OP.getCharPositionInLine()+1,((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).e2.ast);
				}
				break;
			case 4:
				{
				setState(167);
				((StatementContext)_localctx).IF = match(T__13);
				setState(168);
				((StatementContext)_localctx).e = expression(0);
				setState(169);
				match(T__4);
				{
				setState(170);
				((StatementContext)_localctx).ifBody = body_aux();
				}
				setState(176);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(171);
					match(T__14);
					setState(172);
					match(T__4);
					{
					setState(173);
					((StatementContext)_localctx).elseBody_aux = body_aux();
					}
					((StatementContext)_localctx).elseBody = ((StatementContext)_localctx).elseBody_aux.ast;
					}
					break;
				}
				((StatementContext)_localctx).ast = new Conditional(((StatementContext)_localctx).IF.getLine(),((StatementContext)_localctx).IF.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,((StatementContext)_localctx).ifBody.ast,_localctx.elseBody);
				}
				break;
			case 5:
				{
				setState(180);
				((StatementContext)_localctx).W = match(T__15);
				setState(181);
				((StatementContext)_localctx).e = expression(0);
				setState(182);
				match(T__4);
				setState(183);
				((StatementContext)_localctx).body = body_aux();
				((StatementContext)_localctx).ast = new While(((StatementContext)_localctx).W.getLine(),((StatementContext)_localctx).W.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,((StatementContext)_localctx).body.ast);
				}
				break;
			case 6:
				{
				setState(186);
				((StatementContext)_localctx).R = match(T__9);
				setState(187);
				((StatementContext)_localctx).e = expression(0);
				setState(188);
				match(T__7);
				((StatementContext)_localctx).ast = new Return(((StatementContext)_localctx).R.getLine(),((StatementContext)_localctx).R.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast);
				}
				break;
			case 7:
				{
				setState(191);
				((StatementContext)_localctx).e1 = expression(0);
				setState(192);
				match(T__2);
				setState(193);
				((StatementContext)_localctx).p = params_aux();
				setState(194);
				match(T__3);
				setState(195);
				match(T__7);
				((StatementContext)_localctx).ast = new FunctionCall(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn(),(((StatementContext)_localctx).e1!=null?_input.getText(((StatementContext)_localctx).e1.start,((StatementContext)_localctx).e1.stop):null),((StatementContext)_localctx).p.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatementContext(_parentctx, _parentState);
					_localctx.st = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_statement);
					setState(200);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(201);
					match(T__2);
					setState(202);
					match(T__3);
					setState(203);
					match(T__7);
					((StatementContext)_localctx).ast = new FunctionCall(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn(),(((StatementContext)_localctx).e1!=null?_input.getText(((StatementContext)_localctx).e1.start,((StatementContext)_localctx).e1.stop):null),new ArrayList<Expression>());
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Params_auxContext extends ParserRuleContext {
		public List<Expression> ast = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Params_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitParams_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Params_auxContext params_aux() throws RecognitionException {
		Params_auxContext _localctx = new Params_auxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
				{
				setState(210);
				((Params_auxContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((Params_auxContext)_localctx).e1.ast);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(212);
					match(T__8);
					setState(213);
					((Params_auxContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((Params_auxContext)_localctx).e2.ast);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Body_auxContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<>();
		public StatementContext s1;
		public StatementContext s2;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Body_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_auxContext body_aux() throws RecognitionException {
		Body_auxContext _localctx = new Body_auxContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_body_aux);
		int _la;
		try {
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(T__5);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410209800L) != 0)) {
					{
					{
					setState(224);
					((Body_auxContext)_localctx).s1 = statement(0);
					_localctx.ast.add(((Body_auxContext)_localctx).s1.ast);
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__15:
			case T__19:
			case T__20:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((Body_auxContext)_localctx).s2 = statement(0);
				_localctx.ast.add(((Body_auxContext)_localctx).s2.ast);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> params = new ArrayList<>();
		public ExpressionContext e1;
		public ExpressionContext e;
		public Token INT_CONSTANT;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token ID;
		public TypeContext t;
		public Token OP;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(239);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast = new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(241);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast = new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(243);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast = new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(245);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast = new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(247);
				match(T__2);
				setState(248);
				((ExpressionContext)_localctx).e = expression(0);
				setState(249);
				match(T__3);
				((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 6:
				{
				setState(252);
				match(T__2);
				setState(253);
				((ExpressionContext)_localctx).t = type();
				setState(254);
				match(T__3);
				setState(255);
				((ExpressionContext)_localctx).e = expression(7);
				((ExpressionContext)_localctx).ast = new Cast(((ExpressionContext)_localctx).t.ast.getLine(),((ExpressionContext)_localctx).t.ast.getColumn(),((ExpressionContext)_localctx).e.ast,((ExpressionContext)_localctx).t.ast);
				}
				break;
			case 7:
				{
				setState(258);
				((ExpressionContext)_localctx).OP = match(T__19);
				setState(259);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast = new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1);
				}
				break;
			case 8:
				{
				setState(262);
				((ExpressionContext)_localctx).OP = match(T__20);
				setState(263);
				expression(5);
				((ExpressionContext)_localctx).ast = new UnaryNot(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(268);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(269);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 29360128L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(270);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(274);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__24) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(275);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(279);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227866624L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(280);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast = new Comparator(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(283);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(284);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(285);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast = new Logical(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(289);
						match(T__2);
						setState(301);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
							{
							setState(290);
							((ExpressionContext)_localctx).e2 = expression(0);
							_localctx.params.add(((ExpressionContext)_localctx).e2.ast);
							setState(298);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__8) {
								{
								{
								setState(292);
								match(T__8);
								setState(293);
								((ExpressionContext)_localctx).e3 = expression(0);
								_localctx.params.add(((ExpressionContext)_localctx).e3.ast);
								}
								}
								setState(300);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(303);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn(), (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null), _localctx.params);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(305);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(306);
						match(T__16);
						setState(307);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(308);
						match(T__17);
						((ExpressionContext)_localctx).ast = new ArrayAccess(((ExpressionContext)_localctx).e2.ast.getLine(),((ExpressionContext)_localctx).e2.ast.getColumn(),((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(311);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(312);
						match(T__18);
						setState(313);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast = new StructAccess(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public List<RecordField> records = new ArrayList<>();
		public Token INT_CONSTANT;
		public TypeContext t;
		public Token STRUCT;
		public Var_definitionContext v;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<Var_definitionContext> var_definition() {
			return getRuleContexts(Var_definitionContext.class);
		}
		public Var_definitionContext var_definition(int i) {
			return getRuleContext(Var_definitionContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(T__33);
				((TypeContext)_localctx).ast = IntType.getInstance();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(T__34);
				((TypeContext)_localctx).ast = DoubleType.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(T__35);
				((TypeContext)_localctx).ast = CharType.getInstance();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(326);
				match(T__16);
				setState(327);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(328);
				match(T__17);
				setState(329);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast = new ArrayType(((TypeContext)_localctx).t.ast.getLine(),((TypeContext)_localctx).t.ast.getColumn(),LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).t.ast);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(332);
				((TypeContext)_localctx).STRUCT = match(T__36);
				setState(333);
				match(T__5);
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
					{
					{
					setState(334);
					((TypeContext)_localctx).v = var_definition();

					            for(VariableDef vdef:((TypeContext)_localctx).v.ast){
					                _localctx.records.add(new RecordField(vdef.getName(),vdef.getType()));
					            }
					        
					}
					}
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(342);
				match(T__6);
				((TypeContext)_localctx).ast = new StructType(((TypeContext)_localctx).STRUCT.getLine(),((TypeContext)_localctx).STRUCT.getCharPositionInLine(),_localctx.records);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return statement_sempred((StatementContext)_localctx, predIndex);
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean statement_sempred(StatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u015b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001*\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u0002"+
		"8\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002"+
		"\f\u0002@\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004R\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005a\b\u0005\n\u0005\f\u0005d\t\u0005\u0003"+
		"\u0005f\b\u0005\u0003\u0005h\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005o\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005x\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005}\b\u0005\n\u0005\f\u0005"+
		"\u0080\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0086\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0090\b\u0006\n\u0006"+
		"\f\u0006\u0093\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u009b\b\u0006\n\u0006\f\u0006\u009e"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00b1\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00c7\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ce"+
		"\b\u0006\n\u0006\f\u0006\u00d1\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d9\b\u0007\n\u0007"+
		"\f\u0007\u00dc\t\u0007\u0003\u0007\u00de\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00e4\b\b\n\b\f\b\u00e7\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00ed\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010b\b\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0129"+
		"\b\t\n\t\f\t\u012c\t\t\u0003\t\u012e\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u013c\b\t\n\t\f\t\u013f\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0005\n\u0152\b\n\n\n\f\n\u0155\t\n\u0001\n"+
		"\u0001\n\u0003\n\u0159\b\n\u0001\n\u0000\u0002\f\u0012\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0016"+
		"\u0018\u0002\u0000\u0014\u0014\u0019\u0019\u0002\u0000\r\r\u001a\u001f"+
		"\u0001\u0000 !\u017e\u0000\u001b\u0001\u0000\u0000\u0000\u0002)\u0001"+
		"\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000\u0006D\u0001\u0000\u0000"+
		"\u0000\bH\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\f\u00c6\u0001"+
		"\u0000\u0000\u0000\u000e\u00dd\u0001\u0000\u0000\u0000\u0010\u00ec\u0001"+
		"\u0000\u0000\u0000\u0012\u010a\u0001\u0000\u0000\u0000\u0014\u0158\u0001"+
		"\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000\u0017\u0018\u0006"+
		"\u0000\uffff\uffff\u0000\u0018\u001a\u0001\u0000\u0000\u0000\u0019\u0016"+
		"\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0003\u0004\u0002\u0000\u001f \u0006\u0000\uffff\uffff\u0000 !\u0005"+
		"\u0000\u0000\u0001!\"\u0006\u0000\uffff\uffff\u0000\"\u0001\u0001\u0000"+
		"\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0006\u0001\uffff\uffff\u0000"+
		"%*\u0001\u0000\u0000\u0000&\'\u0003\n\u0005\u0000\'(\u0006\u0001\uffff"+
		"\uffff\u0000(*\u0001\u0000\u0000\u0000)#\u0001\u0000\u0000\u0000)&\u0001"+
		"\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+,\u0005\u0001\u0000"+
		"\u0000,-\u0005\u0002\u0000\u0000-.\u0005\u0003\u0000\u0000./\u0005\u0004"+
		"\u0000\u0000/0\u0005\u0005\u0000\u000006\u0005\u0006\u0000\u000012\u0003"+
		"\u0006\u0003\u000023\u0006\u0002\uffff\uffff\u000035\u0001\u0000\u0000"+
		"\u000041\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000067\u0001\u0000\u0000\u00007>\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u00009:\u0003\f\u0006\u0000:;\u0006\u0002\uffff\uffff\u0000"+
		";=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0007\u0000\u0000BC\u0006"+
		"\u0002\uffff\uffff\u0000C\u0005\u0001\u0000\u0000\u0000DE\u0003\b\u0004"+
		"\u0000EF\u0005\b\u0000\u0000FG\u0006\u0003\uffff\uffff\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HI\u0003\u0012\t\u0000IP\u0006\u0004\uffff\uffff\u0000"+
		"JK\u0005\t\u0000\u0000KL\u0003\u0012\t\u0000LM\u0006\u0004\uffff\uffff"+
		"\u0000MO\u0001\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0005\u0000\u0000"+
		"TU\u0003\u0014\n\u0000UV\u0006\u0004\uffff\uffff\u0000V\t\u0001\u0000"+
		"\u0000\u0000WX\u0005\u0001\u0000\u0000XY\u0005+\u0000\u0000Yg\u0005\u0003"+
		"\u0000\u0000Z[\u0003\b\u0004\u0000[e\u0006\u0005\uffff\uffff\u0000\\b"+
		"\u0005\t\u0000\u0000]^\u0003\b\u0004\u0000^_\u0006\u0005\uffff\uffff\u0000"+
		"_a\u0001\u0000\u0000\u0000`]\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cf\u0001\u0000"+
		"\u0000\u0000db\u0001\u0000\u0000\u0000e\\\u0001\u0000\u0000\u0000ef\u0001"+
		"\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000gZ\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005\u0004\u0000"+
		"\u0000jn\u0005\u0005\u0000\u0000kl\u0003\u0014\n\u0000lm\u0006\u0005\uffff"+
		"\uffff\u0000mo\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pv\u0005\u0006\u0000\u0000"+
		"qr\u0003\u0006\u0003\u0000rs\u0006\u0005\uffff\uffff\u0000su\u0001\u0000"+
		"\u0000\u0000tq\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w~\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000yz\u0003\f\u0006\u0000z{\u0006\u0005\uffff\uffff"+
		"\u0000{}\u0001\u0000\u0000\u0000|y\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0085\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\n\u0000\u0000\u0082\u0083\u0003\u0014\n\u0000\u0083"+
		"\u0084\u0005\b\u0000\u0000\u0084\u0086\u0001\u0000\u0000\u0000\u0085\u0081"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u0007\u0000\u0000\u0088\u0089"+
		"\u0006\u0005\uffff\uffff\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0006\u0006\uffff\uffff\u0000\u008b\u008c\u0005\u000b\u0000\u0000"+
		"\u008c\u0091\u0003\u0012\t\u0000\u008d\u008e\u0005\t\u0000\u0000\u008e"+
		"\u0090\u0003\u0012\t\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0093"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0094\u0001\u0000\u0000\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u00c7\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097\u009c\u0003\u0012"+
		"\t\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009b\u0003\u0012\t\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\b\u0000\u0000\u00a0\u00c7\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0003\u0012\t\u0000\u00a2\u00a3\u0005\r\u0000\u0000\u00a3\u00a4"+
		"\u0003\u0012\t\u0000\u00a4\u00a5\u0005\b\u0000\u0000\u00a5\u00a6\u0006"+
		"\u0006\uffff\uffff\u0000\u00a6\u00c7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0005\u000e\u0000\u0000\u00a8\u00a9\u0003\u0012\t\u0000\u00a9\u00aa\u0005"+
		"\u0005\u0000\u0000\u00aa\u00b0\u0003\u0010\b\u0000\u00ab\u00ac\u0005\u000f"+
		"\u0000\u0000\u00ac\u00ad\u0005\u0005\u0000\u0000\u00ad\u00ae\u0003\u0010"+
		"\b\u0000\u00ae\u00af\u0006\u0006\uffff\uffff\u0000\u00af\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b0\u00ab\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0006\u0006"+
		"\uffff\uffff\u0000\u00b3\u00c7\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005"+
		"\u0010\u0000\u0000\u00b5\u00b6\u0003\u0012\t\u0000\u00b6\u00b7\u0005\u0005"+
		"\u0000\u0000\u00b7\u00b8\u0003\u0010\b\u0000\u00b8\u00b9\u0006\u0006\uffff"+
		"\uffff\u0000\u00b9\u00c7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\n\u0000"+
		"\u0000\u00bb\u00bc\u0003\u0012\t\u0000\u00bc\u00bd\u0005\b\u0000\u0000"+
		"\u00bd\u00be\u0006\u0006\uffff\uffff\u0000\u00be\u00c7\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0003\u0012\t\u0000\u00c0\u00c1\u0005\u0003\u0000\u0000"+
		"\u00c1\u00c2\u0003\u000e\u0007\u0000\u00c2\u00c3\u0005\u0004\u0000\u0000"+
		"\u00c3\u00c4\u0005\b\u0000\u0000\u00c4\u00c5\u0006\u0006\uffff\uffff\u0000"+
		"\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u008a\u0001\u0000\u0000\u0000"+
		"\u00c6\u0096\u0001\u0000\u0000\u0000\u00c6\u00a1\u0001\u0000\u0000\u0000"+
		"\u00c6\u00a7\u0001\u0000\u0000\u0000\u00c6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00c6\u00ba\u0001\u0000\u0000\u0000\u00c6\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c7\u00cf\u0001\u0000\u0000\u0000\u00c8\u00c9\n\u0001\u0000\u0000\u00c9"+
		"\u00ca\u0005\u0003\u0000\u0000\u00ca\u00cb\u0005\u0004\u0000\u0000\u00cb"+
		"\u00cc\u0005\b\u0000\u0000\u00cc\u00ce\u0006\u0006\uffff\uffff\u0000\u00cd"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\r\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0003\u0012\t\u0000\u00d3\u00da\u0006\u0007\uffff\uffff\u0000\u00d4\u00d5"+
		"\u0005\t\u0000\u0000\u00d5\u00d6\u0003\u0012\t\u0000\u00d6\u00d7\u0006"+
		"\u0007\uffff\uffff\u0000\u00d7\u00d9\u0001\u0000\u0000\u0000\u00d8\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00de"+
		"\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00d2"+
		"\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u000f"+
		"\u0001\u0000\u0000\u0000\u00df\u00e5\u0005\u0006\u0000\u0000\u00e0\u00e1"+
		"\u0003\f\u0006\u0000\u00e1\u00e2\u0006\b\uffff\uffff\u0000\u00e2\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ed\u0005\u0007\u0000\u0000\u00e9\u00ea"+
		"\u0003\f\u0006\u0000\u00ea\u00eb\u0006\b\uffff\uffff\u0000\u00eb\u00ed"+
		"\u0001\u0000\u0000\u0000\u00ec\u00df\u0001\u0000\u0000\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ed\u0011\u0001\u0000\u0000\u0000\u00ee\u00ef"+
		"\u0006\t\uffff\uffff\u0000\u00ef\u00f0\u0005\'\u0000\u0000\u00f0\u010b"+
		"\u0006\t\uffff\uffff\u0000\u00f1\u00f2\u0005(\u0000\u0000\u00f2\u010b"+
		"\u0006\t\uffff\uffff\u0000\u00f3\u00f4\u0005*\u0000\u0000\u00f4\u010b"+
		"\u0006\t\uffff\uffff\u0000\u00f5\u00f6\u0005+\u0000\u0000\u00f6\u010b"+
		"\u0006\t\uffff\uffff\u0000\u00f7\u00f8\u0005\u0003\u0000\u0000\u00f8\u00f9"+
		"\u0003\u0012\t\u0000\u00f9\u00fa\u0005\u0004\u0000\u0000\u00fa\u00fb\u0006"+
		"\t\uffff\uffff\u0000\u00fb\u010b\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0003\u0000\u0000\u00fd\u00fe\u0003\u0014\n\u0000\u00fe\u00ff\u0005\u0004"+
		"\u0000\u0000\u00ff\u0100\u0003\u0012\t\u0007\u0100\u0101\u0006\t\uffff"+
		"\uffff\u0000\u0101\u010b\u0001\u0000\u0000\u0000\u0102\u0103\u0005\u0014"+
		"\u0000\u0000\u0103\u0104\u0003\u0012\t\u0006\u0104\u0105\u0006\t\uffff"+
		"\uffff\u0000\u0105\u010b\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0015"+
		"\u0000\u0000\u0107\u0108\u0003\u0012\t\u0005\u0108\u0109\u0006\t\uffff"+
		"\uffff\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u00ee\u0001\u0000"+
		"\u0000\u0000\u010a\u00f1\u0001\u0000\u0000\u0000\u010a\u00f3\u0001\u0000"+
		"\u0000\u0000\u010a\u00f5\u0001\u0000\u0000\u0000\u010a\u00f7\u0001\u0000"+
		"\u0000\u0000\u010a\u00fc\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000"+
		"\u0000\u0000\u010a\u0106\u0001\u0000\u0000\u0000\u010b\u013d\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\n\u0004\u0000\u0000\u010d\u010e\u0007\u0000\u0000"+
		"\u0000\u010e\u010f\u0003\u0012\t\u0005\u010f\u0110\u0006\t\uffff\uffff"+
		"\u0000\u0110\u013c\u0001\u0000\u0000\u0000\u0111\u0112\n\u0003\u0000\u0000"+
		"\u0112\u0113\u0007\u0001\u0000\u0000\u0113\u0114\u0003\u0012\t\u0004\u0114"+
		"\u0115\u0006\t\uffff\uffff\u0000\u0115\u013c\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\n\u0002\u0000\u0000\u0117\u0118\u0007\u0002\u0000\u0000\u0118\u0119"+
		"\u0003\u0012\t\u0003\u0119\u011a\u0006\t\uffff\uffff\u0000\u011a\u013c"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\n\u0001\u0000\u0000\u011c\u011d\u0007"+
		"\u0003\u0000\u0000\u011d\u011e\u0003\u0012\t\u0002\u011e\u011f\u0006\t"+
		"\uffff\uffff\u0000\u011f\u013c\u0001\u0000\u0000\u0000\u0120\u0121\n\u000b"+
		"\u0000\u0000\u0121\u012d\u0005\u0003\u0000\u0000\u0122\u0123\u0003\u0012"+
		"\t\u0000\u0123\u012a\u0006\t\uffff\uffff\u0000\u0124\u0125\u0005\t\u0000"+
		"\u0000\u0125\u0126\u0003\u0012\t\u0000\u0126\u0127\u0006\t\uffff\uffff"+
		"\u0000\u0127\u0129\u0001\u0000\u0000\u0000\u0128\u0124\u0001\u0000\u0000"+
		"\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000"+
		"\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012e\u0001\u0000\u0000"+
		"\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u0122\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000"+
		"\u0000\u012f\u0130\u0005\u0004\u0000\u0000\u0130\u013c\u0006\t\uffff\uffff"+
		"\u0000\u0131\u0132\n\t\u0000\u0000\u0132\u0133\u0005\u0011\u0000\u0000"+
		"\u0133\u0134\u0003\u0012\t\u0000\u0134\u0135\u0005\u0012\u0000\u0000\u0135"+
		"\u0136\u0006\t\uffff\uffff\u0000\u0136\u013c\u0001\u0000\u0000\u0000\u0137"+
		"\u0138\n\b\u0000\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a"+
		"\u0005+\u0000\u0000\u013a\u013c\u0006\t\uffff\uffff\u0000\u013b\u010c"+
		"\u0001\u0000\u0000\u0000\u013b\u0111\u0001\u0000\u0000\u0000\u013b\u0116"+
		"\u0001\u0000\u0000\u0000\u013b\u011b\u0001\u0000\u0000\u0000\u013b\u0120"+
		"\u0001\u0000\u0000\u0000\u013b\u0131\u0001\u0000\u0000\u0000\u013b\u0137"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0013"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0005\"\u0000\u0000\u0141\u0159\u0006\n\uffff\uffff\u0000\u0142\u0143"+
		"\u0005#\u0000\u0000\u0143\u0159\u0006\n\uffff\uffff\u0000\u0144\u0145"+
		"\u0005$\u0000\u0000\u0145\u0159\u0006\n\uffff\uffff\u0000\u0146\u0147"+
		"\u0005\u0011\u0000\u0000\u0147\u0148\u0005\'\u0000\u0000\u0148\u0149\u0005"+
		"\u0012\u0000\u0000\u0149\u014a\u0003\u0014\n\u0000\u014a\u014b\u0006\n"+
		"\uffff\uffff\u0000\u014b\u0159\u0001\u0000\u0000\u0000\u014c\u014d\u0005"+
		"%\u0000\u0000\u014d\u0153\u0005\u0006\u0000\u0000\u014e\u014f\u0003\u0006"+
		"\u0003\u0000\u014f\u0150\u0006\n\uffff\uffff\u0000\u0150\u0152\u0001\u0000"+
		"\u0000\u0000\u0151\u014e\u0001\u0000\u0000\u0000\u0152\u0155\u0001\u0000"+
		"\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000"+
		"\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\u0005\u0007\u0000\u0000\u0157\u0159\u0006\n\uffff"+
		"\uffff\u0000\u0158\u0140\u0001\u0000\u0000\u0000\u0158\u0142\u0001\u0000"+
		"\u0000\u0000\u0158\u0144\u0001\u0000\u0000\u0000\u0158\u0146\u0001\u0000"+
		"\u0000\u0000\u0158\u014c\u0001\u0000\u0000\u0000\u0159\u0015\u0001\u0000"+
		"\u0000\u0000\u001c\u001b)6>Pbegnv~\u0085\u0091\u009c\u00b0\u00c6\u00cf"+
		"\u00da\u00dd\u00e5\u00ec\u010a\u012a\u012d\u013b\u013d\u0153\u0158";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}