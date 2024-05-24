// Generated from /home/miguel/OneDrive/3ºSoftware/Repositorios/DLP/IIS-Diseno-de-Lenguajes-de-Programacion/Python-- exam_practice/src/parser/Pmm.g4 by ANTLR 4.13.1
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, TRASH=40, INT_CONSTANT=41, REAL_CONSTANT=42, BOOLEAN_CONSTANT=43, 
		COMMENT=44, CHAR_CONSTANT=45, ID=46;
	public static final int
		RULE_program = 0, RULE_definition = 1, RULE_main_function = 2, RULE_var_definition = 3, 
		RULE_var_definition_aux = 4, RULE_function_definition = 5, RULE_statement = 6, 
		RULE_assignment = 7, RULE_params_aux = 8, RULE_body_aux = 9, RULE_expression = 10, 
		RULE_type = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "main_function", "var_definition", "var_definition_aux", 
			"function_definition", "statement", "assignment", "params_aux", "body_aux", 
			"expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
			"'return'", "'print'", "'input'", "'if'", "'else'", "'while'", "'for'", 
			"'='", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", 
			"'>'", "'<'", "'<='", "'>='", "'!='", "'=='", "'&&'", "'||'", "'int'", 
			"'double'", "'char'", "'boolean'", "'struct'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "BOOLEAN_CONSTANT", 
			"COMMENT", "CHAR_CONSTANT", "ID"
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
			setState(29);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(24);
					((ProgramContext)_localctx).d = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).d.ast);
					}
					} 
				}
				setState(31);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(32);
			((ProgramContext)_localctx).main = main_function();
			_localctx.definitions.add(((ProgramContext)_localctx).main.ast);
			setState(34);
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
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((DefinitionContext)_localctx).v = var_definition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).v.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
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
			setState(45);
			match(T__0);
			setState(46);
			((Main_functionContext)_localctx).MAIN = match(T__1);
			setState(47);
			match(T__2);
			setState(48);
			match(T__3);
			setState(49);
			match(T__4);
			setState(50);
			match(T__5);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					((Main_functionContext)_localctx).v = var_definition();
					_localctx.vars.addAll(((Main_functionContext)_localctx).v.ast);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285460488L) != 0)) {
				{
				{
				setState(59);
				((Main_functionContext)_localctx).s = statement();
				_localctx.body.addAll(((Main_functionContext)_localctx).s.ast);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
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
			setState(70);
			((Var_definitionContext)_localctx).v = var_definition_aux();
			setState(71);
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
			setState(74);
			((Var_definition_auxContext)_localctx).id1 = match(ID);

			                VariableDef var=new VariableDef(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null),null);
			                if(_localctx.vars.contains(var)){
			                    new ErrorType(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,"Variable repeated: "+(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null));
			                }else{
			                    _localctx.vars.add(var);
			                }
			            
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(76);
				match(T__8);
				setState(77);
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
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__4);
			setState(85);
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
			setState(88);
			match(T__0);
			setState(89);
			((Function_definitionContext)_localctx).ID = match(ID);
			setState(90);
			match(T__2);
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(91);
				((Function_definitionContext)_localctx).v1 = var_definition_aux();
				_localctx.params.addAll(((Function_definitionContext)_localctx).v1.ast);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(93);
					match(T__8);
					{
					setState(94);
					((Function_definitionContext)_localctx).v2 = var_definition_aux();
					_localctx.params.addAll(((Function_definitionContext)_localctx).v2.ast);
					}
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(104);
			match(T__3);
			setState(105);
			match(T__4);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1065152151552L) != 0)) {
				{
				setState(106);
				((Function_definitionContext)_localctx).t1 = type();
				((Function_definitionContext)_localctx).returnType = ((Function_definitionContext)_localctx).t1.ast;
				}
			}

			setState(111);
			match(T__5);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(112);
					((Function_definitionContext)_localctx).v3 = var_definition();
					_localctx.vars.addAll(((Function_definitionContext)_localctx).v3.ast);
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(125);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(120);
					((Function_definitionContext)_localctx).s = statement();
					_localctx.body.addAll(((Function_definitionContext)_localctx).s.ast);
					}
					} 
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(128);
				match(T__9);
				setState(129);
				((Function_definitionContext)_localctx).t2 = type();
				setState(130);
				match(T__7);
				}
			}

			setState(134);
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
		public AssignmentContext assignment;
		public Token IF;
		public ExpressionContext e;
		public Body_auxContext ifBody;
		public Body_auxContext elseBody_aux;
		public Token W;
		public Body_auxContext body;
		public Token F;
		public AssignmentContext init;
		public ExpressionContext cond;
		public AssignmentContext change;
		public Token R;
		public Params_auxContext p;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__10);
				setState(138);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Print(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(140);
					match(T__8);
					setState(141);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Print(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(T__11);
				setState(152);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Input(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(154);
					match(T__8);
					setState(155);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Input(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				((StatementContext)_localctx).assignment = assignment();
				setState(166);
				match(T__7);
				_localctx.ast.add(((StatementContext)_localctx).assignment.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				((StatementContext)_localctx).IF = match(T__12);
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
					match(T__13);
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
				((StatementContext)_localctx).W = match(T__14);
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
				((StatementContext)_localctx).F = match(T__15);
				setState(189);
				match(T__2);
				setState(190);
				((StatementContext)_localctx).init = assignment();
				setState(191);
				match(T__7);
				setState(192);
				((StatementContext)_localctx).cond = expression(0);
				setState(193);
				match(T__7);
				setState(194);
				((StatementContext)_localctx).change = assignment();
				setState(195);
				match(T__3);
				setState(196);
				match(T__4);
				setState(197);
				((StatementContext)_localctx).body = body_aux();
				_localctx.ast.add(new For(((StatementContext)_localctx).F.getLine(),((StatementContext)_localctx).F.getCharPositionInLine()+1,((StatementContext)_localctx).init.ast,((StatementContext)_localctx).cond.ast,((StatementContext)_localctx).change.ast,((StatementContext)_localctx).body.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				((StatementContext)_localctx).R = match(T__9);
				setState(201);
				((StatementContext)_localctx).e = expression(0);
				setState(202);
				match(T__7);
				_localctx.ast.add(new Return(((StatementContext)_localctx).R.getLine(),((StatementContext)_localctx).R.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast));
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(205);
				((StatementContext)_localctx).e1 = expression(0);
				setState(206);
				match(T__2);
				setState(207);
				((StatementContext)_localctx).p = params_aux();
				setState(208);
				match(T__3);
				setState(209);
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
	public static class AssignmentContext extends ParserRuleContext {
		public Statement ast;
		public ExpressionContext e1;
		public Token OP;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((AssignmentContext)_localctx).e1 = expression(0);
			setState(215);
			((AssignmentContext)_localctx).OP = match(T__16);
			setState(216);
			((AssignmentContext)_localctx).e2 = expression(0);
			((AssignmentContext)_localctx).ast = new Asignment(((AssignmentContext)_localctx).OP.getLine(),((AssignmentContext)_localctx).OP.getCharPositionInLine()+1,((AssignmentContext)_localctx).e1.ast,((AssignmentContext)_localctx).e2.ast);
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
		enterRule(_localctx, 16, RULE_params_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285346824L) != 0)) {
				{
				setState(219);
				((Params_auxContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((Params_auxContext)_localctx).e1.ast);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(221);
					match(T__8);
					setState(222);
					((Params_auxContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((Params_auxContext)_localctx).e2.ast);
					}
					}
					setState(229);
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
		enterRule(_localctx, 18, RULE_body_aux);
		int _la;
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(T__5);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285460488L) != 0)) {
					{
					{
					setState(233);
					((Body_auxContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((Body_auxContext)_localctx).s1.ast);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__6);
				}
				break;
			case T__2:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__14:
			case T__15:
			case T__20:
			case T__21:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case BOOLEAN_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(242);
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
		public Token BOOLEAN_CONSTANT;
		public Token ID;
		public TypeContext t;
		public Token OP;
		public ExpressionContext e2;
		public ExpressionContext e3;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode BOOLEAN_CONSTANT() { return getToken(PmmParser.BOOLEAN_CONSTANT, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(248);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast = new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(250);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast = new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(252);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast = new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(254);
				((ExpressionContext)_localctx).BOOLEAN_CONSTANT = match(BOOLEAN_CONSTANT);
				((ExpressionContext)_localctx).ast = new BooleanLiteral(((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getLine(),((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToBoolean((((ExpressionContext)_localctx).BOOLEAN_CONSTANT!=null?((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(256);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast = new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 6:
				{
				setState(258);
				match(T__2);
				setState(259);
				((ExpressionContext)_localctx).e = expression(0);
				setState(260);
				match(T__3);
				((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 7:
				{
				setState(263);
				match(T__2);
				setState(264);
				((ExpressionContext)_localctx).t = type();
				setState(265);
				match(T__3);
				setState(266);
				((ExpressionContext)_localctx).e = expression(7);
				((ExpressionContext)_localctx).ast = new Cast(((ExpressionContext)_localctx).t.ast.getLine(),((ExpressionContext)_localctx).t.ast.getColumn()+1,((ExpressionContext)_localctx).e.ast,((ExpressionContext)_localctx).t.ast);
				}
				break;
			case 8:
				{
				setState(269);
				((ExpressionContext)_localctx).OP = match(T__20);
				setState(270);
				((ExpressionContext)_localctx).e = expression(6);
				((ExpressionContext)_localctx).ast = new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 9:
				{
				setState(273);
				((ExpressionContext)_localctx).OP = match(T__21);
				setState(274);
				((ExpressionContext)_localctx).e = expression(5);
				((ExpressionContext)_localctx).ast = new UnaryNot(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(279);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(280);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(281);
						((ExpressionContext)_localctx).e2 = expression(5);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(285);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==T__25) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(286);
						((ExpressionContext)_localctx).e2 = expression(4);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(289);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(290);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455847936L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(291);
						((ExpressionContext)_localctx).e2 = expression(3);
						((ExpressionContext)_localctx).ast = new Comparator(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(295);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__32 || _la==T__33) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(296);
						((ExpressionContext)_localctx).e2 = expression(2);
						((ExpressionContext)_localctx).ast = new Logical(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(300);
						match(T__2);
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285346824L) != 0)) {
							{
							setState(301);
							((ExpressionContext)_localctx).e2 = expression(0);
							_localctx.params.add(((ExpressionContext)_localctx).e2.ast);
							setState(309);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__8) {
								{
								{
								setState(303);
								match(T__8);
								setState(304);
								((ExpressionContext)_localctx).e3 = expression(0);
								_localctx.params.add(((ExpressionContext)_localctx).e3.ast);
								}
								}
								setState(311);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(314);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, new Variable(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null)), _localctx.params);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(316);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(317);
						match(T__17);
						setState(318);
						((ExpressionContext)_localctx).e2 = expression(0);
						setState(319);
						match(T__18);
						((ExpressionContext)_localctx).ast = new ArrayAccess(((ExpressionContext)_localctx).e2.ast.getLine(),((ExpressionContext)_localctx).e2.ast.getColumn()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(322);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(323);
						match(T__19);
						setState(324);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast = new StructAccess(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(330);
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
		enterRule(_localctx, 22, RULE_type);
		int _la;
		try {
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				match(T__34);
				((TypeContext)_localctx).ast = IntType.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(333);
				match(T__35);
				((TypeContext)_localctx).ast = DoubleType.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(T__36);
				((TypeContext)_localctx).ast = CharType.getInstance();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(T__37);
				((TypeContext)_localctx).ast = BooleanType.getInstance();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(339);
				match(T__17);
				setState(340);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(341);
				match(T__18);
				setState(342);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast = new ArrayType(((TypeContext)_localctx).t.ast.getLine(),((TypeContext)_localctx).t.ast.getColumn()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).t.ast);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(345);
				((TypeContext)_localctx).STRUCT = match(T__38);
				setState(346);
				match(T__5);
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(347);
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
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(355);
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
		case 10:
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
		"\u0004\u0001.\u0168\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000"+
		"\u001f\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"7\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004P\b\u0004"+
		"\n\u0004\f\u0004S\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005b\b\u0005\n\u0005\f\u0005"+
		"e\t\u0005\u0003\u0005g\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005w\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005|\b\u0005\n\u0005\f\u0005\u007f"+
		"\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0085"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0091"+
		"\b\u0006\n\u0006\f\u0006\u0094\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006\u009f\b\u0006\n\u0006\f\u0006\u00a2\t\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00b3\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006\u00d5\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00e2\b"+
		"\b\n\b\f\b\u00e5\t\b\u0003\b\u00e7\b\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0005\t\u00ed\b\t\n\t\f\t\u00f0\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00f6\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0116\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0134"+
		"\b\n\n\n\f\n\u0137\t\n\u0003\n\u0139\b\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u0147\b\n\n\n\f\n\u014a\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u015f\b\u000b\n"+
		"\u000b\f\u000b\u0162\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0166"+
		"\b\u000b\u0001\u000b\u0000\u0001\u0014\f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001\u0000\u0017\u0019\u0002"+
		"\u0000\u0015\u0015\u001a\u001a\u0002\u0000\u0011\u0011\u001b \u0001\u0000"+
		"!\"\u018b\u0000\u001d\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000"+
		"\u0000\u0004-\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\b"+
		"J\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\f\u00d4\u0001\u0000"+
		"\u0000\u0000\u000e\u00d6\u0001\u0000\u0000\u0000\u0010\u00e6\u0001\u0000"+
		"\u0000\u0000\u0012\u00f5\u0001\u0000\u0000\u0000\u0014\u0115\u0001\u0000"+
		"\u0000\u0000\u0016\u0165\u0001\u0000\u0000\u0000\u0018\u0019\u0003\u0002"+
		"\u0001\u0000\u0019\u001a\u0006\u0000\uffff\uffff\u0000\u001a\u001c\u0001"+
		"\u0000\u0000\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001c\u001f\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000"+
		"\u0000\u0000 !\u0003\u0004\u0002\u0000!\"\u0006\u0000\uffff\uffff\u0000"+
		"\"#\u0005\u0000\u0000\u0001#$\u0006\u0000\uffff\uffff\u0000$\u0001\u0001"+
		"\u0000\u0000\u0000%&\u0003\u0006\u0003\u0000&\'\u0006\u0001\uffff\uffff"+
		"\u0000\',\u0001\u0000\u0000\u0000()\u0003\n\u0005\u0000)*\u0006\u0001"+
		"\uffff\uffff\u0000*,\u0001\u0000\u0000\u0000+%\u0001\u0000\u0000\u0000"+
		"+(\u0001\u0000\u0000\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0005\u0002\u0000\u0000/0\u0005\u0003\u0000\u000001\u0005"+
		"\u0004\u0000\u000012\u0005\u0005\u0000\u000028\u0005\u0006\u0000\u0000"+
		"34\u0003\u0006\u0003\u000045\u0006\u0002\uffff\uffff\u000057\u0001\u0000"+
		"\u0000\u000063\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001"+
		"\u0000\u0000\u000089\u0001\u0000\u0000\u00009@\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000;<\u0003\f\u0006\u0000<=\u0006\u0002\uffff\uffff"+
		"\u0000=?\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AC\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CD\u0005\u0007\u0000\u0000"+
		"DE\u0006\u0002\uffff\uffff\u0000E\u0005\u0001\u0000\u0000\u0000FG\u0003"+
		"\b\u0004\u0000GH\u0005\b\u0000\u0000HI\u0006\u0003\uffff\uffff\u0000I"+
		"\u0007\u0001\u0000\u0000\u0000JK\u0005.\u0000\u0000KQ\u0006\u0004\uffff"+
		"\uffff\u0000LM\u0005\t\u0000\u0000MN\u0005.\u0000\u0000NP\u0006\u0004"+
		"\uffff\uffff\u0000OL\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000RT\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u0005\u0000\u0000UV\u0003\u0016"+
		"\u000b\u0000VW\u0006\u0004\uffff\uffff\u0000W\t\u0001\u0000\u0000\u0000"+
		"XY\u0005\u0001\u0000\u0000YZ\u0005.\u0000\u0000Zf\u0005\u0003\u0000\u0000"+
		"[\\\u0003\b\u0004\u0000\\c\u0006\u0005\uffff\uffff\u0000]^\u0005\t\u0000"+
		"\u0000^_\u0003\b\u0004\u0000_`\u0006\u0005\uffff\uffff\u0000`b\u0001\u0000"+
		"\u0000\u0000a]\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000f[\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u0004\u0000\u0000im\u0005\u0005"+
		"\u0000\u0000jk\u0003\u0016\u000b\u0000kl\u0006\u0005\uffff\uffff\u0000"+
		"ln\u0001\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000ou\u0005\u0006\u0000\u0000pq\u0003\u0006"+
		"\u0003\u0000qr\u0006\u0005\uffff\uffff\u0000rt\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v}\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0003\f\u0006\u0000yz\u0006\u0005\uffff\uffff\u0000z|\u0001"+
		"\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0084\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\n"+
		"\u0000\u0000\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0005\b\u0000"+
		"\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084\u0080\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087\u0088\u0006\u0005\uffff"+
		"\uffff\u0000\u0088\u000b\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u000b"+
		"\u0000\u0000\u008a\u008b\u0003\u0014\n\u0000\u008b\u0092\u0006\u0006\uffff"+
		"\uffff\u0000\u008c\u008d\u0005\t\u0000\u0000\u008d\u008e\u0003\u0014\n"+
		"\u0000\u008e\u008f\u0006\u0006\uffff\uffff\u0000\u008f\u0091\u0001\u0000"+
		"\u0000\u0000\u0090\u008c\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\b\u0000\u0000\u0096\u00d5\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0005\f\u0000\u0000\u0098\u0099\u0003\u0014\n\u0000"+
		"\u0099\u00a0\u0006\u0006\uffff\uffff\u0000\u009a\u009b\u0005\t\u0000\u0000"+
		"\u009b\u009c\u0003\u0014\n\u0000\u009c\u009d\u0006\u0006\uffff\uffff\u0000"+
		"\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009a\u0001\u0000\u0000\u0000"+
		"\u009f\u00a2\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\b\u0000\u0000\u00a4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6"+
		"\u00a7\u0005\b\u0000\u0000\u00a7\u00a8\u0006\u0006\uffff\uffff\u0000\u00a8"+
		"\u00d5\u0001\u0000\u0000\u0000\u00a9\u00aa\u0005\r\u0000\u0000\u00aa\u00ab"+
		"\u0003\u0014\n\u0000\u00ab\u00ac\u0005\u0005\u0000\u0000\u00ac\u00b2\u0003"+
		"\u0012\t\u0000\u00ad\u00ae\u0005\u000e\u0000\u0000\u00ae\u00af\u0005\u0005"+
		"\u0000\u0000\u00af\u00b0\u0003\u0012\t\u0000\u00b0\u00b1\u0006\u0006\uffff"+
		"\uffff\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00ad\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0006\u0006\uffff\uffff\u0000\u00b5\u00d5\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0005\u000f\u0000\u0000\u00b7\u00b8\u0003"+
		"\u0014\n\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9\u00ba\u0003\u0012"+
		"\t\u0000\u00ba\u00bb\u0006\u0006\uffff\uffff\u0000\u00bb\u00d5\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0010\u0000\u0000\u00bd\u00be\u0005\u0003"+
		"\u0000\u0000\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0005\b\u0000"+
		"\u0000\u00c0\u00c1\u0003\u0014\n\u0000\u00c1\u00c2\u0005\b\u0000\u0000"+
		"\u00c2\u00c3\u0003\u000e\u0007\u0000\u00c3\u00c4\u0005\u0004\u0000\u0000"+
		"\u00c4\u00c5\u0005\u0005\u0000\u0000\u00c5\u00c6\u0003\u0012\t\u0000\u00c6"+
		"\u00c7\u0006\u0006\uffff\uffff\u0000\u00c7\u00d5\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0005\n\u0000\u0000\u00c9\u00ca\u0003\u0014\n\u0000\u00ca"+
		"\u00cb\u0005\b\u0000\u0000\u00cb\u00cc\u0006\u0006\uffff\uffff\u0000\u00cc"+
		"\u00d5\u0001\u0000\u0000\u0000\u00cd\u00ce\u0003\u0014\n\u0000\u00ce\u00cf"+
		"\u0005\u0003\u0000\u0000\u00cf\u00d0\u0003\u0010\b\u0000\u00d0\u00d1\u0005"+
		"\u0004\u0000\u0000\u00d1\u00d2\u0005\b\u0000\u0000\u00d2\u00d3\u0006\u0006"+
		"\uffff\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u0089\u0001"+
		"\u0000\u0000\u0000\u00d4\u0097\u0001\u0000\u0000\u0000\u00d4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00a9\u0001\u0000\u0000\u0000\u00d4\u00b6\u0001"+
		"\u0000\u0000\u0000\u00d4\u00bc\u0001\u0000\u0000\u0000\u00d4\u00c8\u0001"+
		"\u0000\u0000\u0000\u00d4\u00cd\u0001\u0000\u0000\u0000\u00d5\r\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0003\u0014\n\u0000\u00d7\u00d8\u0005\u0011\u0000"+
		"\u0000\u00d8\u00d9\u0003\u0014\n\u0000\u00d9\u00da\u0006\u0007\uffff\uffff"+
		"\u0000\u00da\u000f\u0001\u0000\u0000\u0000\u00db\u00dc\u0003\u0014\n\u0000"+
		"\u00dc\u00e3\u0006\b\uffff\uffff\u0000\u00dd\u00de\u0005\t\u0000\u0000"+
		"\u00de\u00df\u0003\u0014\n\u0000\u00df\u00e0\u0006\b\uffff\uffff\u0000"+
		"\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00db\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u0011\u0001\u0000\u0000\u0000"+
		"\u00e8\u00ee\u0005\u0006\u0000\u0000\u00e9\u00ea\u0003\f\u0006\u0000\u00ea"+
		"\u00eb\u0006\t\uffff\uffff\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000\u00ee"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f6\u0005\u0007\u0000\u0000\u00f2\u00f3\u0003\f\u0006\u0000\u00f3\u00f4"+
		"\u0006\t\uffff\uffff\u0000\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f6\u0013"+
		"\u0001\u0000\u0000\u0000\u00f7\u00f8\u0006\n\uffff\uffff\u0000\u00f8\u00f9"+
		"\u0005)\u0000\u0000\u00f9\u0116\u0006\n\uffff\uffff\u0000\u00fa\u00fb"+
		"\u0005*\u0000\u0000\u00fb\u0116\u0006\n\uffff\uffff\u0000\u00fc\u00fd"+
		"\u0005-\u0000\u0000\u00fd\u0116\u0006\n\uffff\uffff\u0000\u00fe\u00ff"+
		"\u0005+\u0000\u0000\u00ff\u0116\u0006\n\uffff\uffff\u0000\u0100\u0101"+
		"\u0005.\u0000\u0000\u0101\u0116\u0006\n\uffff\uffff\u0000\u0102\u0103"+
		"\u0005\u0003\u0000\u0000\u0103\u0104\u0003\u0014\n\u0000\u0104\u0105\u0005"+
		"\u0004\u0000\u0000\u0105\u0106\u0006\n\uffff\uffff\u0000\u0106\u0116\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\u0003\u0000\u0000\u0108\u0109\u0003"+
		"\u0016\u000b\u0000\u0109\u010a\u0005\u0004\u0000\u0000\u010a\u010b\u0003"+
		"\u0014\n\u0007\u010b\u010c\u0006\n\uffff\uffff\u0000\u010c\u0116\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0005\u0015\u0000\u0000\u010e\u010f\u0003"+
		"\u0014\n\u0006\u010f\u0110\u0006\n\uffff\uffff\u0000\u0110\u0116\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0005\u0016\u0000\u0000\u0112\u0113\u0003"+
		"\u0014\n\u0005\u0113\u0114\u0006\n\uffff\uffff\u0000\u0114\u0116\u0001"+
		"\u0000\u0000\u0000\u0115\u00f7\u0001\u0000\u0000\u0000\u0115\u00fa\u0001"+
		"\u0000\u0000\u0000\u0115\u00fc\u0001\u0000\u0000\u0000\u0115\u00fe\u0001"+
		"\u0000\u0000\u0000\u0115\u0100\u0001\u0000\u0000\u0000\u0115\u0102\u0001"+
		"\u0000\u0000\u0000\u0115\u0107\u0001\u0000\u0000\u0000\u0115\u010d\u0001"+
		"\u0000\u0000\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116\u0148\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\n\u0004\u0000\u0000\u0118\u0119\u0007\u0000"+
		"\u0000\u0000\u0119\u011a\u0003\u0014\n\u0005\u011a\u011b\u0006\n\uffff"+
		"\uffff\u0000\u011b\u0147\u0001\u0000\u0000\u0000\u011c\u011d\n\u0003\u0000"+
		"\u0000\u011d\u011e\u0007\u0001\u0000\u0000\u011e\u011f\u0003\u0014\n\u0004"+
		"\u011f\u0120\u0006\n\uffff\uffff\u0000\u0120\u0147\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\n\u0002\u0000\u0000\u0122\u0123\u0007\u0002\u0000\u0000\u0123"+
		"\u0124\u0003\u0014\n\u0003\u0124\u0125\u0006\n\uffff\uffff\u0000\u0125"+
		"\u0147\u0001\u0000\u0000\u0000\u0126\u0127\n\u0001\u0000\u0000\u0127\u0128"+
		"\u0007\u0003\u0000\u0000\u0128\u0129\u0003\u0014\n\u0002\u0129\u012a\u0006"+
		"\n\uffff\uffff\u0000\u012a\u0147\u0001\u0000\u0000\u0000\u012b\u012c\n"+
		"\u000b\u0000\u0000\u012c\u0138\u0005\u0003\u0000\u0000\u012d\u012e\u0003"+
		"\u0014\n\u0000\u012e\u0135\u0006\n\uffff\uffff\u0000\u012f\u0130\u0005"+
		"\t\u0000\u0000\u0130\u0131\u0003\u0014\n\u0000\u0131\u0132\u0006\n\uffff"+
		"\uffff\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u012f\u0001\u0000"+
		"\u0000\u0000\u0134\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0136\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u012d\u0001\u0000"+
		"\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b\u0147\u0006\n\uffff"+
		"\uffff\u0000\u013c\u013d\n\t\u0000\u0000\u013d\u013e\u0005\u0012\u0000"+
		"\u0000\u013e\u013f\u0003\u0014\n\u0000\u013f\u0140\u0005\u0013\u0000\u0000"+
		"\u0140\u0141\u0006\n\uffff\uffff\u0000\u0141\u0147\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\n\b\u0000\u0000\u0143\u0144\u0005\u0014\u0000\u0000\u0144"+
		"\u0145\u0005.\u0000\u0000\u0145\u0147\u0006\n\uffff\uffff\u0000\u0146"+
		"\u0117\u0001\u0000\u0000\u0000\u0146\u011c\u0001\u0000\u0000\u0000\u0146"+
		"\u0121\u0001\u0000\u0000\u0000\u0146\u0126\u0001\u0000\u0000\u0000\u0146"+
		"\u012b\u0001\u0000\u0000\u0000\u0146\u013c\u0001\u0000\u0000\u0000\u0146"+
		"\u0142\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000\u0148"+
		"\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149"+
		"\u0015\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0005#\u0000\u0000\u014c\u0166\u0006\u000b\uffff\uffff\u0000\u014d"+
		"\u014e\u0005$\u0000\u0000\u014e\u0166\u0006\u000b\uffff\uffff\u0000\u014f"+
		"\u0150\u0005%\u0000\u0000\u0150\u0166\u0006\u000b\uffff\uffff\u0000\u0151"+
		"\u0152\u0005&\u0000\u0000\u0152\u0166\u0006\u000b\uffff\uffff\u0000\u0153"+
		"\u0154\u0005\u0012\u0000\u0000\u0154\u0155\u0005)\u0000\u0000\u0155\u0156"+
		"\u0005\u0013\u0000\u0000\u0156\u0157\u0003\u0016\u000b\u0000\u0157\u0158"+
		"\u0006\u000b\uffff\uffff\u0000\u0158\u0166\u0001\u0000\u0000\u0000\u0159"+
		"\u015a\u0005\'\u0000\u0000\u015a\u0160\u0005\u0006\u0000\u0000\u015b\u015c"+
		"\u0003\u0006\u0003\u0000\u015c\u015d\u0006\u000b\uffff\uffff\u0000\u015d"+
		"\u015f\u0001\u0000\u0000\u0000\u015e\u015b\u0001\u0000\u0000\u0000\u015f"+
		"\u0162\u0001\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000\u0000\u0162"+
		"\u0160\u0001\u0000\u0000\u0000\u0163\u0164\u0005\u0007\u0000\u0000\u0164"+
		"\u0166\u0006\u000b\uffff\uffff\u0000\u0165\u014b\u0001\u0000\u0000\u0000"+
		"\u0165\u014d\u0001\u0000\u0000\u0000\u0165\u014f\u0001\u0000\u0000\u0000"+
		"\u0165\u0151\u0001\u0000\u0000\u0000\u0165\u0153\u0001\u0000\u0000\u0000"+
		"\u0165\u0159\u0001\u0000\u0000\u0000\u0166\u0017\u0001\u0000\u0000\u0000"+
		"\u001a\u001d+8@Qcfmu}\u0084\u0092\u00a0\u00b2\u00d4\u00e3\u00e6\u00ee"+
		"\u00f5\u0115\u0135\u0138\u0146\u0148\u0160\u0165";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}