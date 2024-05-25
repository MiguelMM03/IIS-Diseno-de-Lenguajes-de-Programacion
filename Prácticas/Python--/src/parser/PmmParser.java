// Generated from /home/miguel/OneDrive/3ºSoftware/Repositorios/DLP/IIS-Diseno-de-Lenguajes-de-Programacion/Prácticas/Python--/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;

    import ast.*;
    import ast.definitions.*;
    import ast.statements.*;
    import ast.expressions.*;
    import ast.types.*;
    import errorhandler.ErrorHandler;

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
		public List<VariableDef> vars = new ArrayList<>();
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
					_localctx.vars.addAll(((Main_functionContext)_localctx).v.ast);
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
				((Main_functionContext)_localctx).s = statement();
				_localctx.body.addAll(((Main_functionContext)_localctx).s.ast);
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(T__6);

			            FunctionType ft=new FunctionType(((Main_functionContext)_localctx).MAIN.getLine(),((Main_functionContext)_localctx).MAIN.getCharPositionInLine()+1,VoidType.getInstance(),_localctx.params);
			            ((Main_functionContext)_localctx).ast = new FunctionDef(((Main_functionContext)_localctx).MAIN.getLine(),((Main_functionContext)_localctx).MAIN.getCharPositionInLine()+1,(((Main_functionContext)_localctx).MAIN!=null?((Main_functionContext)_localctx).MAIN.getText():null),ft,_localctx.vars,_localctx.body);
			            
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
		public List<VariableDef> vars = new ArrayList<>();;
		public Token id1;
		public Token id2;
		public TypeContext t;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
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
			((Var_definition_auxContext)_localctx).id1 = match(ID);

			                VariableDef var=new VariableDef(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null),null);
			                if(_localctx.vars.contains(var)){
			                    new ErrorType(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,"Variable repeated: "+(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null));
			                }else{
			                    _localctx.vars.add(var);
			                }
			            
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(74);
				match(T__8);
				setState(75);
				((Var_definition_auxContext)_localctx).id2 = match(ID);

				                var=new VariableDef(((Var_definition_auxContext)_localctx).id2.getLine(),((Var_definition_auxContext)_localctx).id2.getCharPositionInLine()+1,(((Var_definition_auxContext)_localctx).id2!=null?((Var_definition_auxContext)_localctx).id2.getText():null),null);
				                if(_localctx.vars.contains(var)){
				                     new ErrorType(((Var_definition_auxContext)_localctx).id2.getLine(),((Var_definition_auxContext)_localctx).id2.getCharPositionInLine()+1,"Variable repeated: "+(((Var_definition_auxContext)_localctx).id2!=null?((Var_definition_auxContext)_localctx).id2.getText():null));
				                }
				                else{
				                    _localctx.vars.add(var);
				                }
				            
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__4);
			setState(83);
			((Var_definition_auxContext)_localctx).t = type();

			                for(VariableDef v:_localctx.vars){
			                    _localctx.ast.add(new VariableDef(v.getLine(),v.getColumn()+1,v.getName(),((Var_definition_auxContext)_localctx).t.ast));
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
		public List<VariableDef> vars = new ArrayList<>();
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
			setState(86);
			match(T__0);
			setState(87);
			((Function_definitionContext)_localctx).ID = match(ID);
			setState(88);
			match(T__2);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(89);
				((Function_definitionContext)_localctx).v1 = var_definition_aux();
				_localctx.params.addAll(((Function_definitionContext)_localctx).v1.ast);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(91);
					match(T__8);
					{
					setState(92);
					((Function_definitionContext)_localctx).v2 = var_definition_aux();
					_localctx.params.addAll(((Function_definitionContext)_localctx).v2.ast);
					}
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(102);
			match(T__3);
			setState(103);
			match(T__4);
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698168832L) != 0)) {
				{
				setState(104);
				((Function_definitionContext)_localctx).t1 = type();
				((Function_definitionContext)_localctx).returnType = ((Function_definitionContext)_localctx).t1.ast;
				}
			}

			setState(109);
			match(T__5);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					((Function_definitionContext)_localctx).v3 = var_definition();
					_localctx.vars.addAll(((Function_definitionContext)_localctx).v3.ast);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(118);
					((Function_definitionContext)_localctx).s = statement();
					_localctx.body.addAll(((Function_definitionContext)_localctx).s.ast);
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(126);
				match(T__9);
				setState(127);
				((Function_definitionContext)_localctx).t2 = type();
				setState(128);
				match(T__7);
				}
			}

			setState(132);
			match(T__6);

			                FunctionType ft=new FunctionType(((Function_definitionContext)_localctx).ID.getLine(),((Function_definitionContext)_localctx).ID.getCharPositionInLine()+1,_localctx.returnType,_localctx.params);
			                ((Function_definitionContext)_localctx).ast = new FunctionDef(((Function_definitionContext)_localctx).ID.getLine(),((Function_definitionContext)_localctx).ID.getCharPositionInLine()+1,(((Function_definitionContext)_localctx).ID!=null?((Function_definitionContext)_localctx).ID.getText():null),ft,_localctx.vars,_localctx.body);
			            
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
		public List<Statement> ast = new ArrayList<>();;
		public List<Statement> elseBody = new ArrayList<Statement>();
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
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(T__10);
				setState(136);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Print(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(138);
					match(T__8);
					setState(139);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Print(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(T__11);
				setState(150);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Input(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(152);
					match(T__8);
					setState(153);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Input(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				((StatementContext)_localctx).e1 = expression(0);
				setState(164);
				((StatementContext)_localctx).OP = match(T__12);
				setState(165);
				((StatementContext)_localctx).e2 = expression(0);
				setState(166);
				match(T__7);
				_localctx.ast.add(new Asignment(((StatementContext)_localctx).OP.getLine(),((StatementContext)_localctx).OP.getCharPositionInLine()+1,((StatementContext)_localctx).e1.ast,((StatementContext)_localctx).e2.ast));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				((StatementContext)_localctx).IF = match(T__13);
				setState(170);
				((StatementContext)_localctx).e = expression(0);
				setState(171);
				match(T__4);
				{
				setState(172);
				((StatementContext)_localctx).ifBody = body_aux();
				}
				setState(178);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(173);
					match(T__14);
					setState(174);
					match(T__4);
					{
					setState(175);
					((StatementContext)_localctx).elseBody_aux = body_aux();
					}
					((StatementContext)_localctx).elseBody = ((StatementContext)_localctx).elseBody_aux.ast;
					}
					break;
				}
				_localctx.ast.add(new Conditional(((StatementContext)_localctx).IF.getLine(),((StatementContext)_localctx).IF.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,((StatementContext)_localctx).ifBody.ast,_localctx.elseBody));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				((StatementContext)_localctx).W = match(T__15);
				setState(183);
				((StatementContext)_localctx).e = expression(0);
				setState(184);
				match(T__4);
				setState(185);
				((StatementContext)_localctx).body = body_aux();
				_localctx.ast.add(new While(((StatementContext)_localctx).W.getLine(),((StatementContext)_localctx).W.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,((StatementContext)_localctx).body.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(188);
				((StatementContext)_localctx).R = match(T__9);
				setState(189);
				((StatementContext)_localctx).e = expression(0);
				setState(190);
				match(T__7);
				_localctx.ast.add(new Return(((StatementContext)_localctx).R.getLine(),((StatementContext)_localctx).R.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(193);
				((StatementContext)_localctx).e1 = expression(0);
				setState(194);
				match(T__2);
				setState(195);
				((StatementContext)_localctx).p = params_aux();
				setState(196);
				match(T__3);
				setState(197);
				match(T__7);
				_localctx.ast.add(new FunctionCall(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,new Variable(((StatementContext)_localctx).e1.ast.getLine(), ((StatementContext)_localctx).e1.ast.getColumn()+1, (((StatementContext)_localctx).e1!=null?_input.getText(((StatementContext)_localctx).e1.start,((StatementContext)_localctx).e1.stop):null)),((StatementContext)_localctx).p.ast));
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
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
				{
				setState(202);
				((Params_auxContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((Params_auxContext)_localctx).e1.ast);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(204);
					match(T__8);
					setState(205);
					((Params_auxContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((Params_auxContext)_localctx).e2.ast);
					}
					}
					setState(212);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(T__5);
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410209800L) != 0)) {
					{
					{
					setState(216);
					((Body_auxContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((Body_auxContext)_localctx).s1.ast);
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
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
				setState(225);
				((Body_auxContext)_localctx).s2 = statement();
				_localctx.ast.addAll(((Body_auxContext)_localctx).s2.ast);
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
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(231);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast = new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(233);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast = new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(235);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast = new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(237);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast = new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 5:
				{
				setState(239);
				match(T__2);
				setState(240);
				((ExpressionContext)_localctx).e = expression(0);
				setState(241);
				match(T__3);
				((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 6:
				{
				setState(244);
				match(T__2);
				setState(245);
				((ExpressionContext)_localctx).t = type();
				setState(246);
				match(T__3);
				setState(247);
				((ExpressionContext)_localctx).e = expression(7);
				((ExpressionContext)_localctx).ast = new Cast(((ExpressionContext)_localctx).t.ast.getLine(),((ExpressionContext)_localctx).t.ast.getColumn()+1,((ExpressionContext)_localctx).e.ast,((ExpressionContext)_localctx).t.ast);
				}
				break;
			case 7:
				{
				setState(250);
				((ExpressionContext)_localctx).OP = match(T__19);
				setState(251);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast = new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 8:
				{
				setState(254);
				((ExpressionContext)_localctx).OP = match(T__20);
				setState(255);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast = new UnaryNot(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(309);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(307);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(260);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(261);
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
						setState(262);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(265);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(266);
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
						setState(267);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(270);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(271);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4227858432L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(272);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast = new Comparator(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(275);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(276);
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
						setState(277);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast = new Logical(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(281);
						match(T__2);
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14843410120712L) != 0)) {
							{
							setState(282);
							((ExpressionContext)_localctx).e2 = expression(0);
							_localctx.params.add(((ExpressionContext)_localctx).e2.ast);
							setState(290);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__8) {
								{
								{
								setState(284);
								match(T__8);
								setState(285);
								((ExpressionContext)_localctx).e3 = expression(0);
								_localctx.params.add(((ExpressionContext)_localctx).e3.ast);
								}
								}
								setState(292);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(295);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, new Variable(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null)), _localctx.params);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(298);
						match(T__16);
						setState(299);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(300);
						match(T__17);
						((ExpressionContext)_localctx).ast = new ArrayAccess(((ExpressionContext)_localctx).e2.ast.getLine(),((ExpressionContext)_localctx).e2.ast.getColumn()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(303);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(304);
						match(T__18);
						setState(305);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast = new StructAccess(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__33:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				match(T__33);
				((TypeContext)_localctx).ast = IntType.getInstance();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				match(T__34);
				((TypeContext)_localctx).ast = DoubleType.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(T__35);
				((TypeContext)_localctx).ast = CharType.getInstance();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(318);
				match(T__16);
				setState(319);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(320);
				match(T__17);
				setState(321);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast = new ArrayType(((TypeContext)_localctx).t.ast.getLine(),((TypeContext)_localctx).t.ast.getColumn()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).t.ast);
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(324);
				((TypeContext)_localctx).STRUCT = match(T__36);
				setState(325);
				match(T__5);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(326);
					((TypeContext)_localctx).v = var_definition();

					            for(VariableDef vdef:((TypeContext)_localctx).v.ast){
					                RecordField record=new RecordField(vdef.getLine(), vdef.getColumn()+1, vdef.getName(),vdef.getType());
					                if(_localctx.records.contains(record)){
					                    new ErrorType(vdef.getLine(),vdef.getColumn()+1,"Struct field repeated: "+vdef.getName());
					                }
					                else{
					                    _localctx.records.add(record);
					                }
					            }
					        
					}
					}
					setState(333);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
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
		case 9:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u0153\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0005\u0005`\b\u0005\n\u0005\f\u0005c\t\u0005\u0003\u0005e\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"r\b\u0005\n\u0005\f\u0005u\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005z\b\u0005\n\u0005\f\u0005}\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0083\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006\u008f\b\u0006\n\u0006\f\u0006\u0092"+
		"\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009d\b\u0006\n"+
		"\u0006\f\u0006\u00a0\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00c9\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00d1\b\u0007\n\u0007\f\u0007\u00d4\t\u0007"+
		"\u0003\u0007\u00d6\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00dc"+
		"\b\b\n\b\f\b\u00df\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e5\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0103\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0121\b\t\n\t\f\t\u0124\t\t"+
		"\u0003\t\u0126\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0134\b\t\n\t\f\t\u0137"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u014a\b\n\n\n\f\n\u014d\t\n\u0001\n\u0001\n\u0003\n\u0151\b\n\u0001"+
		"\n\u0000\u0001\u0012\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0000\u0004\u0001\u0000\u0016\u0018\u0002\u0000\u0014\u0014\u0019"+
		"\u0019\u0001\u0000\u001a\u001f\u0001\u0000 !\u0174\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0002)\u0001\u0000\u0000\u0000\u0004+\u0001\u0000\u0000\u0000"+
		"\u0006D\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nV\u0001\u0000"+
		"\u0000\u0000\f\u00c8\u0001\u0000\u0000\u0000\u000e\u00d5\u0001\u0000\u0000"+
		"\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u0102\u0001\u0000\u0000"+
		"\u0000\u0014\u0150\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001"+
		"\u0000\u0017\u0018\u0006\u0000\uffff\uffff\u0000\u0018\u001a\u0001\u0000"+
		"\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u001a\u001d\u0001\u0000"+
		"\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000"+
		"\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0006\u0000\uffff"+
		"\uffff\u0000 !\u0005\u0000\u0000\u0001!\"\u0006\u0000\uffff\uffff\u0000"+
		"\"\u0001\u0001\u0000\u0000\u0000#$\u0003\u0006\u0003\u0000$%\u0006\u0001"+
		"\uffff\uffff\u0000%*\u0001\u0000\u0000\u0000&\'\u0003\n\u0005\u0000\'"+
		"(\u0006\u0001\uffff\uffff\u0000(*\u0001\u0000\u0000\u0000)#\u0001\u0000"+
		"\u0000\u0000)&\u0001\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000"+
		"+,\u0005\u0001\u0000\u0000,-\u0005\u0002\u0000\u0000-.\u0005\u0003\u0000"+
		"\u0000./\u0005\u0004\u0000\u0000/0\u0005\u0005\u0000\u000006\u0005\u0006"+
		"\u0000\u000012\u0003\u0006\u0003\u000023\u0006\u0002\uffff\uffff\u0000"+
		"35\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000058\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007>\u0001\u0000"+
		"\u0000\u000086\u0001\u0000\u0000\u00009:\u0003\f\u0006\u0000:;\u0006\u0002"+
		"\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000<9\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?A\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000AB\u0005\u0007"+
		"\u0000\u0000BC\u0006\u0002\uffff\uffff\u0000C\u0005\u0001\u0000\u0000"+
		"\u0000DE\u0003\b\u0004\u0000EF\u0005\b\u0000\u0000FG\u0006\u0003\uffff"+
		"\uffff\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005+\u0000\u0000IO\u0006"+
		"\u0004\uffff\uffff\u0000JK\u0005\t\u0000\u0000KL\u0005+\u0000\u0000LN"+
		"\u0006\u0004\uffff\uffff\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001"+
		"\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0005\u0005\u0000\u0000"+
		"ST\u0003\u0014\n\u0000TU\u0006\u0004\uffff\uffff\u0000U\t\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005+\u0000\u0000Xd\u0005\u0003"+
		"\u0000\u0000YZ\u0003\b\u0004\u0000Za\u0006\u0005\uffff\uffff\u0000[\\"+
		"\u0005\t\u0000\u0000\\]\u0003\b\u0004\u0000]^\u0006\u0005\uffff\uffff"+
		"\u0000^`\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000`c\u0001\u0000"+
		"\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dY\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u0004\u0000"+
		"\u0000gk\u0005\u0005\u0000\u0000hi\u0003\u0014\n\u0000ij\u0006\u0005\uffff"+
		"\uffff\u0000jl\u0001\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000ms\u0005\u0006\u0000\u0000"+
		"no\u0003\u0006\u0003\u0000op\u0006\u0005\uffff\uffff\u0000pr\u0001\u0000"+
		"\u0000\u0000qn\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t{\u0001\u0000\u0000\u0000"+
		"us\u0001\u0000\u0000\u0000vw\u0003\f\u0006\u0000wx\u0006\u0005\uffff\uffff"+
		"\u0000xz\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z}\u0001\u0000"+
		"\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|\u0082"+
		"\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0005\n\u0000"+
		"\u0000\u007f\u0080\u0003\u0014\n\u0000\u0080\u0081\u0005\b\u0000\u0000"+
		"\u0081\u0083\u0001\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u0007\u0000\u0000\u0085\u0086\u0006\u0005\uffff\uffff\u0000"+
		"\u0086\u000b\u0001\u0000\u0000\u0000\u0087\u0088\u0005\u000b\u0000\u0000"+
		"\u0088\u0089\u0003\u0012\t\u0000\u0089\u0090\u0006\u0006\uffff\uffff\u0000"+
		"\u008a\u008b\u0005\t\u0000\u0000\u008b\u008c\u0003\u0012\t\u0000\u008c"+
		"\u008d\u0006\u0006\uffff\uffff\u0000\u008d\u008f\u0001\u0000\u0000\u0000"+
		"\u008e\u008a\u0001\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000"+
		"\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005\b\u0000\u0000\u0094\u00c9\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005\f\u0000\u0000\u0096\u0097\u0003\u0012\t\u0000\u0097\u009e"+
		"\u0006\u0006\uffff\uffff\u0000\u0098\u0099\u0005\t\u0000\u0000\u0099\u009a"+
		"\u0003\u0012\t\u0000\u009a\u009b\u0006\u0006\uffff\uffff\u0000\u009b\u009d"+
		"\u0001\u0000\u0000\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d\u00a0"+
		"\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0001\u0000\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\b\u0000\u0000\u00a2\u00c9\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0003\u0012\t\u0000\u00a4\u00a5\u0005\r"+
		"\u0000\u0000\u00a5\u00a6\u0003\u0012\t\u0000\u00a6\u00a7\u0005\b\u0000"+
		"\u0000\u00a7\u00a8\u0006\u0006\uffff\uffff\u0000\u00a8\u00c9\u0001\u0000"+
		"\u0000\u0000\u00a9\u00aa\u0005\u000e\u0000\u0000\u00aa\u00ab\u0003\u0012"+
		"\t\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u00b2\u0003\u0010\b"+
		"\u0000\u00ad\u00ae\u0005\u000f\u0000\u0000\u00ae\u00af\u0005\u0005\u0000"+
		"\u0000\u00af\u00b0\u0003\u0010\b\u0000\u00b0\u00b1\u0006\u0006\uffff\uffff"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0006\u0006\uffff\uffff\u0000\u00b5\u00c9\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0005\u0010\u0000\u0000\u00b7\u00b8\u0003\u0012"+
		"\t\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u00ba\u0003\u0010\b"+
		"\u0000\u00ba\u00bb\u0006\u0006\uffff\uffff\u0000\u00bb\u00c9\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\n\u0000\u0000\u00bd\u00be\u0003\u0012\t"+
		"\u0000\u00be\u00bf\u0005\b\u0000\u0000\u00bf\u00c0\u0006\u0006\uffff\uffff"+
		"\u0000\u00c0\u00c9\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u0012\t\u0000"+
		"\u00c2\u00c3\u0005\u0003\u0000\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000"+
		"\u00c4\u00c5\u0005\u0004\u0000\u0000\u00c5\u00c6\u0005\b\u0000\u0000\u00c6"+
		"\u00c7\u0006\u0006\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000"+
		"\u00c8\u0087\u0001\u0000\u0000\u0000\u00c8\u0095\u0001\u0000\u0000\u0000"+
		"\u00c8\u00a3\u0001\u0000\u0000\u0000\u00c8\u00a9\u0001\u0000\u0000\u0000"+
		"\u00c8\u00b6\u0001\u0000\u0000\u0000\u00c8\u00bc\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c1\u0001\u0000\u0000\u0000\u00c9\r\u0001\u0000\u0000\u0000\u00ca"+
		"\u00cb\u0003\u0012\t\u0000\u00cb\u00d2\u0006\u0007\uffff\uffff\u0000\u00cc"+
		"\u00cd\u0005\t\u0000\u0000\u00cd\u00ce\u0003\u0012\t\u0000\u00ce\u00cf"+
		"\u0006\u0007\uffff\uffff\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00cc\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5"+
		"\u00ca\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6"+
		"\u000f\u0001\u0000\u0000\u0000\u00d7\u00dd\u0005\u0006\u0000\u0000\u00d8"+
		"\u00d9\u0003\f\u0006\u0000\u00d9\u00da\u0006\b\uffff\uffff\u0000\u00da"+
		"\u00dc\u0001\u0000\u0000\u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e5\u0005\u0007\u0000\u0000\u00e1"+
		"\u00e2\u0003\f\u0006\u0000\u00e2\u00e3\u0006\b\uffff\uffff\u0000\u00e3"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e4\u00d7\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e5\u0011\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0006\t\uffff\uffff\u0000\u00e7\u00e8\u0005\'\u0000\u0000\u00e8"+
		"\u0103\u0006\t\uffff\uffff\u0000\u00e9\u00ea\u0005(\u0000\u0000\u00ea"+
		"\u0103\u0006\t\uffff\uffff\u0000\u00eb\u00ec\u0005*\u0000\u0000\u00ec"+
		"\u0103\u0006\t\uffff\uffff\u0000\u00ed\u00ee\u0005+\u0000\u0000\u00ee"+
		"\u0103\u0006\t\uffff\uffff\u0000\u00ef\u00f0\u0005\u0003\u0000\u0000\u00f0"+
		"\u00f1\u0003\u0012\t\u0000\u00f1\u00f2\u0005\u0004\u0000\u0000\u00f2\u00f3"+
		"\u0006\t\uffff\uffff\u0000\u00f3\u0103\u0001\u0000\u0000\u0000\u00f4\u00f5"+
		"\u0005\u0003\u0000\u0000\u00f5\u00f6\u0003\u0014\n\u0000\u00f6\u00f7\u0005"+
		"\u0004\u0000\u0000\u00f7\u00f8\u0003\u0012\t\u0007\u00f8\u00f9\u0006\t"+
		"\uffff\uffff\u0000\u00f9\u0103\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0014\u0000\u0000\u00fb\u00fc\u0003\u0012\t\u0006\u00fc\u00fd\u0006\t"+
		"\uffff\uffff\u0000\u00fd\u0103\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0015\u0000\u0000\u00ff\u0100\u0003\u0012\t\u0005\u0100\u0101\u0006\t"+
		"\uffff\uffff\u0000\u0101\u0103\u0001\u0000\u0000\u0000\u0102\u00e6\u0001"+
		"\u0000\u0000\u0000\u0102\u00e9\u0001\u0000\u0000\u0000\u0102\u00eb\u0001"+
		"\u0000\u0000\u0000\u0102\u00ed\u0001\u0000\u0000\u0000\u0102\u00ef\u0001"+
		"\u0000\u0000\u0000\u0102\u00f4\u0001\u0000\u0000\u0000\u0102\u00fa\u0001"+
		"\u0000\u0000\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0103\u0135\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\n\u0004\u0000\u0000\u0105\u0106\u0007\u0000"+
		"\u0000\u0000\u0106\u0107\u0003\u0012\t\u0005\u0107\u0108\u0006\t\uffff"+
		"\uffff\u0000\u0108\u0134\u0001\u0000\u0000\u0000\u0109\u010a\n\u0003\u0000"+
		"\u0000\u010a\u010b\u0007\u0001\u0000\u0000\u010b\u010c\u0003\u0012\t\u0004"+
		"\u010c\u010d\u0006\t\uffff\uffff\u0000\u010d\u0134\u0001\u0000\u0000\u0000"+
		"\u010e\u010f\n\u0002\u0000\u0000\u010f\u0110\u0007\u0002\u0000\u0000\u0110"+
		"\u0111\u0003\u0012\t\u0003\u0111\u0112\u0006\t\uffff\uffff\u0000\u0112"+
		"\u0134\u0001\u0000\u0000\u0000\u0113\u0114\n\u0001\u0000\u0000\u0114\u0115"+
		"\u0007\u0003\u0000\u0000\u0115\u0116\u0003\u0012\t\u0002\u0116\u0117\u0006"+
		"\t\uffff\uffff\u0000\u0117\u0134\u0001\u0000\u0000\u0000\u0118\u0119\n"+
		"\u000b\u0000\u0000\u0119\u0125\u0005\u0003\u0000\u0000\u011a\u011b\u0003"+
		"\u0012\t\u0000\u011b\u0122\u0006\t\uffff\uffff\u0000\u011c\u011d\u0005"+
		"\t\u0000\u0000\u011d\u011e\u0003\u0012\t\u0000\u011e\u011f\u0006\t\uffff"+
		"\uffff\u0000\u011f\u0121\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000"+
		"\u0000\u0000\u0121\u0124\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000"+
		"\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0126\u0001\u0000"+
		"\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0125\u011a\u0001\u0000"+
		"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000"+
		"\u0000\u0000\u0127\u0128\u0005\u0004\u0000\u0000\u0128\u0134\u0006\t\uffff"+
		"\uffff\u0000\u0129\u012a\n\t\u0000\u0000\u012a\u012b\u0005\u0011\u0000"+
		"\u0000\u012b\u012c\u0003\u0012\t\u0000\u012c\u012d\u0005\u0012\u0000\u0000"+
		"\u012d\u012e\u0006\t\uffff\uffff\u0000\u012e\u0134\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\n\b\u0000\u0000\u0130\u0131\u0005\u0013\u0000\u0000\u0131"+
		"\u0132\u0005+\u0000\u0000\u0132\u0134\u0006\t\uffff\uffff\u0000\u0133"+
		"\u0104\u0001\u0000\u0000\u0000\u0133\u0109\u0001\u0000\u0000\u0000\u0133"+
		"\u010e\u0001\u0000\u0000\u0000\u0133\u0113\u0001\u0000\u0000\u0000\u0133"+
		"\u0118\u0001\u0000\u0000\u0000\u0133\u0129\u0001\u0000\u0000\u0000\u0133"+
		"\u012f\u0001\u0000\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135"+
		"\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136"+
		"\u0013\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0005\"\u0000\u0000\u0139\u0151\u0006\n\uffff\uffff\u0000\u013a"+
		"\u013b\u0005#\u0000\u0000\u013b\u0151\u0006\n\uffff\uffff\u0000\u013c"+
		"\u013d\u0005$\u0000\u0000\u013d\u0151\u0006\n\uffff\uffff\u0000\u013e"+
		"\u013f\u0005\u0011\u0000\u0000\u013f\u0140\u0005\'\u0000\u0000\u0140\u0141"+
		"\u0005\u0012\u0000\u0000\u0141\u0142\u0003\u0014\n\u0000\u0142\u0143\u0006"+
		"\n\uffff\uffff\u0000\u0143\u0151\u0001\u0000\u0000\u0000\u0144\u0145\u0005"+
		"%\u0000\u0000\u0145\u014b\u0005\u0006\u0000\u0000\u0146\u0147\u0003\u0006"+
		"\u0003\u0000\u0147\u0148\u0006\n\uffff\uffff\u0000\u0148\u014a\u0001\u0000"+
		"\u0000\u0000\u0149\u0146\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000"+
		"\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000"+
		"\u0000\u0000\u014c\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005\u0007\u0000\u0000\u014f\u0151\u0006\n\uffff"+
		"\uffff\u0000\u0150\u0138\u0001\u0000\u0000\u0000\u0150\u013a\u0001\u0000"+
		"\u0000\u0000\u0150\u013c\u0001\u0000\u0000\u0000\u0150\u013e\u0001\u0000"+
		"\u0000\u0000\u0150\u0144\u0001\u0000\u0000\u0000\u0151\u0015\u0001\u0000"+
		"\u0000\u0000\u001a\u001b)6>Oadks{\u0082\u0090\u009e\u00b2\u00c8\u00d2"+
		"\u00d5\u00dd\u00e4\u0102\u0122\u0125\u0133\u0135\u014b\u0150";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}