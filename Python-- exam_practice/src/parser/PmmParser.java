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
		RULE_inline_var_definition = 4, RULE_inline_var_definition_aux = 5, RULE_var_definition_aux = 6, 
		RULE_function_definition = 7, RULE_statement = 8, RULE_assignment = 9, 
		RULE_assignment_aux = 10, RULE_params_aux = 11, RULE_body_aux = 12, RULE_expression = 13, 
		RULE_type = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definition", "main_function", "var_definition", "inline_var_definition", 
			"inline_var_definition_aux", "var_definition_aux", "function_definition", 
			"statement", "assignment", "assignment_aux", "params_aux", "body_aux", 
			"expression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'('", "')'", "':'", "'{'", "'}'", "';'", "','", 
			"'='", "'return'", "'print'", "'input'", "'if'", "'else'", "'while'", 
			"'for'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", 
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
			setState(35);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					((ProgramContext)_localctx).d = definition();
					_localctx.definitions.addAll(((ProgramContext)_localctx).d.ast);
					}
					} 
				}
				setState(37);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(38);
			((ProgramContext)_localctx).main = main_function();
			_localctx.definitions.add(((ProgramContext)_localctx).main.ast);
			setState(40);
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
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				((DefinitionContext)_localctx).v = var_definition();
				_localctx.ast.addAll(((DefinitionContext)_localctx).v.ast);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
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
		public Inline_var_definitionContext inline;
		public StatementContext s;
		public List<Inline_var_definitionContext> inline_var_definition() {
			return getRuleContexts(Inline_var_definitionContext.class);
		}
		public Inline_var_definitionContext inline_var_definition(int i) {
			return getRuleContext(Inline_var_definitionContext.class,i);
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
			setState(51);
			match(T__0);
			setState(52);
			((Main_functionContext)_localctx).MAIN = match(T__1);
			setState(53);
			match(T__2);
			setState(54);
			match(T__3);
			setState(55);
			match(T__4);
			setState(56);
			match(T__5);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(57);
					((Main_functionContext)_localctx).inline = inline_var_definition();
					_localctx.vars.addAll(((Main_functionContext)_localctx).inline.def); _localctx.body.addAll(((Main_functionContext)_localctx).inline.st);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285574152L) != 0)) {
				{
				{
				setState(65);
				((Main_functionContext)_localctx).s = statement();
				_localctx.body.addAll(((Main_functionContext)_localctx).s.ast);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
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
			setState(76);
			((Var_definitionContext)_localctx).v = var_definition_aux();
			setState(77);
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
	public static class Inline_var_definitionContext extends ParserRuleContext {
		public List<VariableDef> def;
		public List<Statement> st;
		public Inline_var_definition_auxContext v;
		public Inline_var_definition_auxContext inline_var_definition_aux() {
			return getRuleContext(Inline_var_definition_auxContext.class,0);
		}
		public Inline_var_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_var_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitInline_var_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_var_definitionContext inline_var_definition() throws RecognitionException {
		Inline_var_definitionContext _localctx = new Inline_var_definitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_inline_var_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			((Inline_var_definitionContext)_localctx).v = inline_var_definition_aux();
			setState(81);
			match(T__7);
			((Inline_var_definitionContext)_localctx).def = ((Inline_var_definitionContext)_localctx).v.def;((Inline_var_definitionContext)_localctx).st = ((Inline_var_definitionContext)_localctx).v.st;
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
	public static class Inline_var_definition_auxContext extends ParserRuleContext {
		public List<VariableDef> def = new ArrayList<VariableDef>();
		public List<Statement> st = new ArrayList<>();
		public List<VariableDef> vars = new ArrayList<>();;
		public Token id1;
		public Token id2;
		public TypeContext t;
		public ExpressionContext expression;
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Inline_var_definition_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_var_definition_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitInline_var_definition_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_var_definition_auxContext inline_var_definition_aux() throws RecognitionException {
		Inline_var_definition_auxContext _localctx = new Inline_var_definition_auxContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_inline_var_definition_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			((Inline_var_definition_auxContext)_localctx).id1 = match(ID);

			                VariableDef var=new VariableDef(((Inline_var_definition_auxContext)_localctx).id1.getLine(),((Inline_var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,(((Inline_var_definition_auxContext)_localctx).id1!=null?((Inline_var_definition_auxContext)_localctx).id1.getText():null),null);
			                if(_localctx.vars.contains(var)){
			                    new ErrorType(((Inline_var_definition_auxContext)_localctx).id1.getLine(),((Inline_var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,"Variable repeated: "+(((Inline_var_definition_auxContext)_localctx).id1!=null?((Inline_var_definition_auxContext)_localctx).id1.getText():null));
			                }else{
			                    _localctx.vars.add(var);
			                }
			            
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(86);
				match(T__8);
				setState(87);
				((Inline_var_definition_auxContext)_localctx).id2 = match(ID);

				                var=new VariableDef(((Inline_var_definition_auxContext)_localctx).id2.getLine(),((Inline_var_definition_auxContext)_localctx).id2.getCharPositionInLine()+1,(((Inline_var_definition_auxContext)_localctx).id2!=null?((Inline_var_definition_auxContext)_localctx).id2.getText():null),null);
				                if(_localctx.vars.contains(var)){
				                     new ErrorType(((Inline_var_definition_auxContext)_localctx).id2.getLine(),((Inline_var_definition_auxContext)_localctx).id2.getCharPositionInLine()+1,"Variable repeated: "+(((Inline_var_definition_auxContext)_localctx).id2!=null?((Inline_var_definition_auxContext)_localctx).id2.getText():null));
				                }
				                else{
				                    _localctx.vars.add(var);
				                }
				            
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(T__4);
			setState(95);
			((Inline_var_definition_auxContext)_localctx).t = type();

			                for(VariableDef v:_localctx.vars){
			                    _localctx.def.add(new VariableDef(v.getLine(),v.getColumn()+1,v.getName(),((Inline_var_definition_auxContext)_localctx).t.ast));
			                }
			            
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(97);
				match(T__9);
				setState(98);
				((Inline_var_definition_auxContext)_localctx).expression = expression(0);

				                for(VariableDef v: _localctx.def){
				                    _localctx.st.add(new Asignment(v.getLine(),v.getColumn()+1,new Variable(v.getLine(), v.getColumn()+1, v.getName()), ((Inline_var_definition_auxContext)_localctx).expression.ast));
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
		enterRule(_localctx, 12, RULE_var_definition_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((Var_definition_auxContext)_localctx).id1 = match(ID);

			                VariableDef var=new VariableDef(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null),null);
			                if(_localctx.vars.contains(var)){
			                    new ErrorType(((Var_definition_auxContext)_localctx).id1.getLine(),((Var_definition_auxContext)_localctx).id1.getCharPositionInLine()+1,"Variable repeated: "+(((Var_definition_auxContext)_localctx).id1!=null?((Var_definition_auxContext)_localctx).id1.getText():null));
			                }else{
			                    _localctx.vars.add(var);
			                }
			            
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(105);
				match(T__8);
				setState(106);
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
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(T__4);
			setState(114);
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
		public Inline_var_definitionContext inline;
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
		public List<Inline_var_definitionContext> inline_var_definition() {
			return getRuleContexts(Inline_var_definitionContext.class);
		}
		public Inline_var_definitionContext inline_var_definition(int i) {
			return getRuleContext(Inline_var_definitionContext.class,i);
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
		enterRule(_localctx, 14, RULE_function_definition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__0);
			setState(118);
			((Function_definitionContext)_localctx).ID = match(ID);
			setState(119);
			match(T__2);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(120);
				((Function_definitionContext)_localctx).v1 = var_definition_aux();
				_localctx.params.addAll(((Function_definitionContext)_localctx).v1.ast);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(122);
					match(T__8);
					{
					setState(123);
					((Function_definitionContext)_localctx).v2 = var_definition_aux();
					_localctx.params.addAll(((Function_definitionContext)_localctx).v2.ast);
					}
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(133);
			match(T__3);
			setState(134);
			match(T__4);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1065152151552L) != 0)) {
				{
				setState(135);
				((Function_definitionContext)_localctx).t1 = type();
				((Function_definitionContext)_localctx).returnType = ((Function_definitionContext)_localctx).t1.ast;
				}
			}

			setState(140);
			match(T__5);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(141);
					((Function_definitionContext)_localctx).inline = inline_var_definition();
					_localctx.vars.addAll(((Function_definitionContext)_localctx).inline.def); _localctx.body.addAll(((Function_definitionContext)_localctx).inline.st);
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					((Function_definitionContext)_localctx).s = statement();
					_localctx.body.addAll(((Function_definitionContext)_localctx).s.ast);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(157);
				match(T__10);
				setState(158);
				((Function_definitionContext)_localctx).t2 = type();
				setState(159);
				match(T__7);
				}
			}

			setState(163);
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
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__11);
				setState(167);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Print(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(169);
					match(T__8);
					setState(170);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Print(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(178);
				match(T__7);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__12);
				setState(181);
				((StatementContext)_localctx).e1 = expression(0);
				_localctx.ast.add(new Input(((StatementContext)_localctx).e1.ast.getLine(),((StatementContext)_localctx).e1.ast.getColumn()+1,((StatementContext)_localctx).e1.ast));
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(183);
					match(T__8);
					setState(184);
					((StatementContext)_localctx).e2 = expression(0);
					_localctx.ast.add(new Input(((StatementContext)_localctx).e2.ast.getLine(),((StatementContext)_localctx).e2.ast.getColumn()+1,((StatementContext)_localctx).e2.ast));
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(192);
				match(T__7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				((StatementContext)_localctx).assignment = assignment();
				setState(195);
				match(T__7);
				_localctx.ast.add(((StatementContext)_localctx).assignment.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(198);
				((StatementContext)_localctx).IF = match(T__13);
				setState(199);
				((StatementContext)_localctx).e = expression(0);
				setState(200);
				match(T__4);
				{
				setState(201);
				((StatementContext)_localctx).ifBody = body_aux();
				}
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(202);
					match(T__14);
					setState(203);
					match(T__4);
					{
					setState(204);
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
				setState(211);
				((StatementContext)_localctx).W = match(T__15);
				setState(212);
				((StatementContext)_localctx).e = expression(0);
				setState(213);
				match(T__4);
				setState(214);
				((StatementContext)_localctx).body = body_aux();
				_localctx.ast.add(new While(((StatementContext)_localctx).W.getLine(),((StatementContext)_localctx).W.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast,((StatementContext)_localctx).body.ast));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				((StatementContext)_localctx).F = match(T__16);
				setState(218);
				match(T__2);
				setState(219);
				((StatementContext)_localctx).init = assignment();
				setState(220);
				match(T__7);
				setState(221);
				((StatementContext)_localctx).cond = expression(0);
				setState(222);
				match(T__7);
				setState(223);
				((StatementContext)_localctx).change = assignment();
				setState(224);
				match(T__3);
				setState(225);
				match(T__4);
				setState(226);
				((StatementContext)_localctx).body = body_aux();
				_localctx.ast.add(new For(((StatementContext)_localctx).F.getLine(),((StatementContext)_localctx).F.getCharPositionInLine()+1,((StatementContext)_localctx).init.ast,((StatementContext)_localctx).cond.ast,((StatementContext)_localctx).change.ast,((StatementContext)_localctx).body.ast));
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(229);
				((StatementContext)_localctx).R = match(T__10);
				setState(230);
				((StatementContext)_localctx).e = expression(0);
				setState(231);
				match(T__7);
				_localctx.ast.add(new Return(((StatementContext)_localctx).R.getLine(),((StatementContext)_localctx).R.getCharPositionInLine()+1,((StatementContext)_localctx).e.ast));
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(234);
				((StatementContext)_localctx).e1 = expression(0);
				setState(235);
				match(T__2);
				setState(236);
				((StatementContext)_localctx).p = params_aux();
				setState(237);
				match(T__3);
				setState(238);
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
		public Assignment_auxContext a;
		public Assignment_auxContext assignment_aux() {
			return getRuleContext(Assignment_auxContext.class,0);
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
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((AssignmentContext)_localctx).a = assignment_aux();
			((AssignmentContext)_localctx).ast = ((AssignmentContext)_localctx).a.ast;
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
	public static class Assignment_auxContext extends ParserRuleContext {
		public Asignment ast;
		public ExpressionContext e1;
		public Token OP;
		public Assignment_auxContext a;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Assignment_auxContext assignment_aux() {
			return getRuleContext(Assignment_auxContext.class,0);
		}
		public Assignment_auxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_aux; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitAssignment_aux(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_auxContext assignment_aux() throws RecognitionException {
		Assignment_auxContext _localctx = new Assignment_auxContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment_aux);
		try {
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((Assignment_auxContext)_localctx).e1 = expression(0);
				setState(247);
				((Assignment_auxContext)_localctx).OP = match(T__9);
				setState(248);
				((Assignment_auxContext)_localctx).a = assignment_aux();
				((Assignment_auxContext)_localctx).ast = new Asignment(((Assignment_auxContext)_localctx).OP.getLine(),((Assignment_auxContext)_localctx).OP.getCharPositionInLine()+1,((Assignment_auxContext)_localctx).e1.ast,((Assignment_auxContext)_localctx).a.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				((Assignment_auxContext)_localctx).e1 = expression(0);
				setState(252);
				((Assignment_auxContext)_localctx).OP = match(T__9);
				setState(253);
				((Assignment_auxContext)_localctx).e2 = expression(0);
				((Assignment_auxContext)_localctx).ast = new Asignment(((Assignment_auxContext)_localctx).OP.getLine(),((Assignment_auxContext)_localctx).OP.getCharPositionInLine()+1,((Assignment_auxContext)_localctx).e1.ast,((Assignment_auxContext)_localctx).e2.ast);
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
		enterRule(_localctx, 22, RULE_params_aux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285346824L) != 0)) {
				{
				setState(258);
				((Params_auxContext)_localctx).e1 = expression(0);
				_localctx.ast.add(((Params_auxContext)_localctx).e1.ast);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(260);
					match(T__8);
					setState(261);
					((Params_auxContext)_localctx).e2 = expression(0);
					_localctx.ast.add(((Params_auxContext)_localctx).e2.ast);
					}
					}
					setState(268);
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
		enterRule(_localctx, 24, RULE_body_aux);
		int _la;
		try {
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				match(T__5);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285574152L) != 0)) {
					{
					{
					setState(272);
					((Body_auxContext)_localctx).s1 = statement();
					_localctx.ast.addAll(((Body_auxContext)_localctx).s1.ast);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(280);
				match(T__6);
				}
				break;
			case T__2:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__15:
			case T__16:
			case T__20:
			case T__21:
			case INT_CONSTANT:
			case REAL_CONSTANT:
			case BOOLEAN_CONSTANT:
			case CHAR_CONSTANT:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
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
		public ExpressionContext expression;
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(287);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				((ExpressionContext)_localctx).ast = new IntLiteral(((ExpressionContext)_localctx).INT_CONSTANT.getLine(),((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)));
				}
				break;
			case 2:
				{
				setState(289);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				((ExpressionContext)_localctx).ast = new DoubleLiteral(((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)));
				}
				break;
			case 3:
				{
				setState(291);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				((ExpressionContext)_localctx).ast = new CharLiteral(((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)));
				}
				break;
			case 4:
				{
				setState(293);
				((ExpressionContext)_localctx).BOOLEAN_CONSTANT = match(BOOLEAN_CONSTANT);
				((ExpressionContext)_localctx).ast = new BooleanLiteral(((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getLine(),((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getCharPositionInLine()+1,LexerHelper.lexemeToBoolean((((ExpressionContext)_localctx).BOOLEAN_CONSTANT!=null?((ExpressionContext)_localctx).BOOLEAN_CONSTANT.getText():null)));
				}
				break;
			case 5:
				{
				setState(295);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).ast = new Variable(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
				}
				break;
			case 6:
				{
				setState(297);
				match(T__2);
				setState(298);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(0);
				setState(299);
				match(T__3);
				((ExpressionContext)_localctx).ast = ((ExpressionContext)_localctx).e.ast;
				}
				break;
			case 7:
				{
				setState(302);
				match(T__2);
				setState(303);
				((ExpressionContext)_localctx).t = type();
				setState(304);
				match(T__3);
				setState(305);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(8);
				((ExpressionContext)_localctx).ast = new Cast(((ExpressionContext)_localctx).t.ast.getLine(),((ExpressionContext)_localctx).t.ast.getColumn()+1,((ExpressionContext)_localctx).e.ast,((ExpressionContext)_localctx).t.ast);
				}
				break;
			case 8:
				{
				setState(308);
				((ExpressionContext)_localctx).OP = match(T__20);
				setState(309);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(7);
				((ExpressionContext)_localctx).ast = new UnaryMinus(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 9:
				{
				setState(312);
				((ExpressionContext)_localctx).OP = match(T__21);
				setState(313);
				((ExpressionContext)_localctx).e = ((ExpressionContext)_localctx).expression = expression(6);
				((ExpressionContext)_localctx).ast = new UnaryNot(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast);
				}
				break;
			case 10:
				{
				setState(316);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(317);
				match(T__17);
				setState(318);
				match(T__18);
				setState(319);
				((ExpressionContext)_localctx).OP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4697620480L) != 0)) ) {
					((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				((ExpressionContext)_localctx).expression = expression(1);
				((ExpressionContext)_localctx).ast = new CountElementsArrayWithConditions(((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,new Variable(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null)),(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null), ((ExpressionContext)_localctx).expression.ast);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(325);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(326);
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
						setState(327);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(6);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(330);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(331);
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
						setState(332);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(5);
						((ExpressionContext)_localctx).ast = new Arithmetic(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(335);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(336);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(337);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(4);
						((ExpressionContext)_localctx).ast = new Comparator(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(340);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(341);
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
						setState(342);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(3);
						((ExpressionContext)_localctx).ast = new Logical(((ExpressionContext)_localctx).OP.getLine(),((ExpressionContext)_localctx).OP.getCharPositionInLine()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast,(((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null));
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(346);
						match(T__2);
						setState(358);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 120946285346824L) != 0)) {
							{
							setState(347);
							((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
							_localctx.params.add(((ExpressionContext)_localctx).e2.ast);
							setState(355);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__8) {
								{
								{
								setState(349);
								match(T__8);
								setState(350);
								((ExpressionContext)_localctx).e3 = ((ExpressionContext)_localctx).expression = expression(0);
								_localctx.params.add(((ExpressionContext)_localctx).e3.ast);
								}
								}
								setState(357);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(360);
						match(T__3);
						((ExpressionContext)_localctx).ast =  new FunctionCall(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, new Variable(((ExpressionContext)_localctx).e1.ast.getLine(), ((ExpressionContext)_localctx).e1.ast.getColumn()+1, (((ExpressionContext)_localctx).e1!=null?_input.getText(((ExpressionContext)_localctx).e1.start,((ExpressionContext)_localctx).e1.stop):null)), _localctx.params);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(363);
						match(T__17);
						setState(364);
						((ExpressionContext)_localctx).e2 = ((ExpressionContext)_localctx).expression = expression(0);
						setState(365);
						match(T__18);
						((ExpressionContext)_localctx).ast = new ArrayAccess(((ExpressionContext)_localctx).e2.ast.getLine(),((ExpressionContext)_localctx).e2.ast.getColumn()+1,((ExpressionContext)_localctx).e1.ast,((ExpressionContext)_localctx).e2.ast);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.e = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(368);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(369);
						match(T__19);
						setState(370);
						((ExpressionContext)_localctx).ID = match(ID);
						((ExpressionContext)_localctx).ast = new StructAccess(((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine()+1,((ExpressionContext)_localctx).e.ast,(((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null));
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		enterRule(_localctx, 28, RULE_type);
		int _la;
		try {
			setState(403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(T__34);
				((TypeContext)_localctx).ast = IntType.getInstance();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__35);
				((TypeContext)_localctx).ast = DoubleType.getInstance();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(T__36);
				((TypeContext)_localctx).ast = CharType.getInstance();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 4);
				{
				setState(383);
				match(T__37);
				((TypeContext)_localctx).ast = BooleanType.getInstance();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(385);
				match(T__17);
				setState(386);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(387);
				match(T__18);
				setState(388);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).ast = new ArrayType(((TypeContext)_localctx).t.ast.getLine(),((TypeContext)_localctx).t.ast.getColumn()+1,LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null)),((TypeContext)_localctx).t.ast);
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				((TypeContext)_localctx).STRUCT = match(T__38);
				setState(392);
				match(T__5);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(393);
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
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(401);
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
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0196\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\"\b\u0000\n\u0000\f\u0000%\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00012\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002\n\u0002\f\u0002"+
		"@\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002"+
		"\f\u0002H\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Z\b\u0005\n\u0005\f\u0005]\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005f\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u007f"+
		"\b\u0007\n\u0007\f\u0007\u0082\t\u0007\u0003\u0007\u0084\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008b"+
		"\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0091"+
		"\b\u0007\n\u0007\f\u0007\u0094\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0099\b\u0007\n\u0007\f\u0007\u009c\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00ae\b\b\n\b\f\b\u00b1\t\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00bc\b\b\n\b\f\b\u00bf"+
		"\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d0\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00f2\b\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0101\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0109\b\u000b\n\u000b\f\u000b"+
		"\u010c\t\u000b\u0003\u000b\u010e\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0114\b\f\n\f\f\f\u0117\t\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0003\f\u011d\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0144\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0162\b\r\n"+
		"\r\f\r\u0165\t\r\u0003\r\u0167\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0175"+
		"\b\r\n\r\f\r\u0178\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u018d\b\u000e\n\u000e"+
		"\f\u000e\u0190\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0194\b\u000e"+
		"\u0001\u000e\u0000\u0001\u001a\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0005\u0002\u0000\u001b"+
		"\u001c  \u0001\u0000\u0017\u0019\u0002\u0000\u0015\u0015\u001a\u001a\u0001"+
		"\u0000\u001b \u0001\u0000!\"\u01ba\u0000#\u0001\u0000\u0000\u0000\u0002"+
		"1\u0001\u0000\u0000\u0000\u00043\u0001\u0000\u0000\u0000\u0006L\u0001"+
		"\u0000\u0000\u0000\bP\u0001\u0000\u0000\u0000\nT\u0001\u0000\u0000\u0000"+
		"\fg\u0001\u0000\u0000\u0000\u000eu\u0001\u0000\u0000\u0000\u0010\u00f1"+
		"\u0001\u0000\u0000\u0000\u0012\u00f3\u0001\u0000\u0000\u0000\u0014\u0100"+
		"\u0001\u0000\u0000\u0000\u0016\u010d\u0001\u0000\u0000\u0000\u0018\u011c"+
		"\u0001\u0000\u0000\u0000\u001a\u0143\u0001\u0000\u0000\u0000\u001c\u0193"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0002\u0001\u0000\u001f \u0006"+
		"\u0000\uffff\uffff\u0000 \"\u0001\u0000\u0000\u0000!\u001e\u0001\u0000"+
		"\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000"+
		"&\'\u0003\u0004\u0002\u0000\'(\u0006\u0000\uffff\uffff\u0000()\u0005\u0000"+
		"\u0000\u0001)*\u0006\u0000\uffff\uffff\u0000*\u0001\u0001\u0000\u0000"+
		"\u0000+,\u0003\u0006\u0003\u0000,-\u0006\u0001\uffff\uffff\u0000-2\u0001"+
		"\u0000\u0000\u0000./\u0003\u000e\u0007\u0000/0\u0006\u0001\uffff\uffff"+
		"\u000002\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00002\u0003\u0001\u0000\u0000\u000034\u0005\u0001\u0000\u0000"+
		"45\u0005\u0002\u0000\u000056\u0005\u0003\u0000\u000067\u0005\u0004\u0000"+
		"\u000078\u0005\u0005\u0000\u00008>\u0005\u0006\u0000\u00009:\u0003\b\u0004"+
		"\u0000:;\u0006\u0002\uffff\uffff\u0000;=\u0001\u0000\u0000\u0000<9\u0001"+
		"\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">?\u0001\u0000\u0000\u0000?F\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000AB\u0003\u0010\b\u0000BC\u0006\u0002\uffff\uffff\u0000CE\u0001\u0000"+
		"\u0000\u0000DA\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000"+
		"HF\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0006\u0002\uffff"+
		"\uffff\u0000K\u0005\u0001\u0000\u0000\u0000LM\u0003\f\u0006\u0000MN\u0005"+
		"\b\u0000\u0000NO\u0006\u0003\uffff\uffff\u0000O\u0007\u0001\u0000\u0000"+
		"\u0000PQ\u0003\n\u0005\u0000QR\u0005\b\u0000\u0000RS\u0006\u0004\uffff"+
		"\uffff\u0000S\t\u0001\u0000\u0000\u0000TU\u0005.\u0000\u0000U[\u0006\u0005"+
		"\uffff\uffff\u0000VW\u0005\t\u0000\u0000WX\u0005.\u0000\u0000XZ\u0006"+
		"\u0005\uffff\uffff\u0000YV\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0003"+
		"\u001c\u000e\u0000`e\u0006\u0005\uffff\uffff\u0000ab\u0005\n\u0000\u0000"+
		"bc\u0003\u001a\r\u0000cd\u0006\u0005\uffff\uffff\u0000df\u0001\u0000\u0000"+
		"\u0000ea\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u000b\u0001"+
		"\u0000\u0000\u0000gh\u0005.\u0000\u0000hn\u0006\u0006\uffff\uffff\u0000"+
		"ij\u0005\t\u0000\u0000jk\u0005.\u0000\u0000km\u0006\u0006\uffff\uffff"+
		"\u0000li\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001"+
		"\u0000\u0000\u0000qr\u0005\u0005\u0000\u0000rs\u0003\u001c\u000e\u0000"+
		"st\u0006\u0006\uffff\uffff\u0000t\r\u0001\u0000\u0000\u0000uv\u0005\u0001"+
		"\u0000\u0000vw\u0005.\u0000\u0000w\u0083\u0005\u0003\u0000\u0000xy\u0003"+
		"\f\u0006\u0000y\u0080\u0006\u0007\uffff\uffff\u0000z{\u0005\t\u0000\u0000"+
		"{|\u0003\f\u0006\u0000|}\u0006\u0007\uffff\uffff\u0000}\u007f\u0001\u0000"+
		"\u0000\u0000~z\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"x\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0004\u0000\u0000\u0086\u008a"+
		"\u0005\u0005\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088\u0089"+
		"\u0006\u0007\uffff\uffff\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u008c\u0001\u0000\u0000\u0000\u008c\u0092\u0005\u0006\u0000\u0000\u008d"+
		"\u008e\u0003\b\u0004\u0000\u008e\u008f\u0006\u0007\uffff\uffff\u0000\u008f"+
		"\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0001\u0000\u0000\u0000\u0093\u009a\u0001\u0000\u0000\u0000\u0094"+
		"\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097"+
		"\u0006\u0007\uffff\uffff\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098"+
		"\u0095\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a"+
		"\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u00a1\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u000b\u0000\u0000\u009e\u009f\u0003\u001c\u000e\u0000\u009f"+
		"\u00a0\u0005\b\u0000\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009d"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\u0007\u0000\u0000\u00a4\u00a5"+
		"\u0006\u0007\uffff\uffff\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\f\u0000\u0000\u00a7\u00a8\u0003\u001a\r\u0000\u00a8\u00af"+
		"\u0006\b\uffff\uffff\u0000\u00a9\u00aa\u0005\t\u0000\u0000\u00aa\u00ab"+
		"\u0003\u001a\r\u0000\u00ab\u00ac\u0006\b\uffff\uffff\u0000\u00ac\u00ae"+
		"\u0001\u0000\u0000\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ae\u00b1"+
		"\u0001\u0000\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00f2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\r\u0000\u0000\u00b5\u00b6\u0003\u001a"+
		"\r\u0000\u00b6\u00bd\u0006\b\uffff\uffff\u0000\u00b7\u00b8\u0005\t\u0000"+
		"\u0000\u00b8\u00b9\u0003\u001a\r\u0000\u00b9\u00ba\u0006\b\uffff\uffff"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c0\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\b\u0000\u0000"+
		"\u00c1\u00f2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0003\u0012\t\u0000\u00c3"+
		"\u00c4\u0005\b\u0000\u0000\u00c4\u00c5\u0006\b\uffff\uffff\u0000\u00c5"+
		"\u00f2\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u000e\u0000\u0000\u00c7"+
		"\u00c8\u0003\u001a\r\u0000\u00c8\u00c9\u0005\u0005\u0000\u0000\u00c9\u00cf"+
		"\u0003\u0018\f\u0000\u00ca\u00cb\u0005\u000f\u0000\u0000\u00cb\u00cc\u0005"+
		"\u0005\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00ce\u0006\b"+
		"\uffff\uffff\u0000\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0006\b\uffff\uffff\u0000\u00d2\u00f2\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0005\u0010\u0000\u0000\u00d4\u00d5\u0003"+
		"\u001a\r\u0000\u00d5\u00d6\u0005\u0005\u0000\u0000\u00d6\u00d7\u0003\u0018"+
		"\f\u0000\u00d7\u00d8\u0006\b\uffff\uffff\u0000\u00d8\u00f2\u0001\u0000"+
		"\u0000\u0000\u00d9\u00da\u0005\u0011\u0000\u0000\u00da\u00db\u0005\u0003"+
		"\u0000\u0000\u00db\u00dc\u0003\u0012\t\u0000\u00dc\u00dd\u0005\b\u0000"+
		"\u0000\u00dd\u00de\u0003\u001a\r\u0000\u00de\u00df\u0005\b\u0000\u0000"+
		"\u00df\u00e0\u0003\u0012\t\u0000\u00e0\u00e1\u0005\u0004\u0000\u0000\u00e1"+
		"\u00e2\u0005\u0005\u0000\u0000\u00e2\u00e3\u0003\u0018\f\u0000\u00e3\u00e4"+
		"\u0006\b\uffff\uffff\u0000\u00e4\u00f2\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0005\u000b\u0000\u0000\u00e6\u00e7\u0003\u001a\r\u0000\u00e7\u00e8\u0005"+
		"\b\u0000\u0000\u00e8\u00e9\u0006\b\uffff\uffff\u0000\u00e9\u00f2\u0001"+
		"\u0000\u0000\u0000\u00ea\u00eb\u0003\u001a\r\u0000\u00eb\u00ec\u0005\u0003"+
		"\u0000\u0000\u00ec\u00ed\u0003\u0016\u000b\u0000\u00ed\u00ee\u0005\u0004"+
		"\u0000\u0000\u00ee\u00ef\u0005\b\u0000\u0000\u00ef\u00f0\u0006\b\uffff"+
		"\uffff\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00a6\u0001\u0000"+
		"\u0000\u0000\u00f1\u00b4\u0001\u0000\u0000\u0000\u00f1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00f1\u00c6\u0001\u0000\u0000\u0000\u00f1\u00d3\u0001\u0000"+
		"\u0000\u0000\u00f1\u00d9\u0001\u0000\u0000\u0000\u00f1\u00e5\u0001\u0000"+
		"\u0000\u0000\u00f1\u00ea\u0001\u0000\u0000\u0000\u00f2\u0011\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0003\u0014\n\u0000\u00f4\u00f5\u0006\t\uffff"+
		"\uffff\u0000\u00f5\u0013\u0001\u0000\u0000\u0000\u00f6\u00f7\u0003\u001a"+
		"\r\u0000\u00f7\u00f8\u0005\n\u0000\u0000\u00f8\u00f9\u0003\u0014\n\u0000"+
		"\u00f9\u00fa\u0006\n\uffff\uffff\u0000\u00fa\u0101\u0001\u0000\u0000\u0000"+
		"\u00fb\u00fc\u0003\u001a\r\u0000\u00fc\u00fd\u0005\n\u0000\u0000\u00fd"+
		"\u00fe\u0003\u001a\r\u0000\u00fe\u00ff\u0006\n\uffff\uffff\u0000\u00ff"+
		"\u0101\u0001\u0000\u0000\u0000\u0100\u00f6\u0001\u0000\u0000\u0000\u0100"+
		"\u00fb\u0001\u0000\u0000\u0000\u0101\u0015\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003\u001a\r\u0000\u0103\u010a\u0006\u000b\uffff\uffff\u0000\u0104"+
		"\u0105\u0005\t\u0000\u0000\u0105\u0106\u0003\u001a\r\u0000\u0106\u0107"+
		"\u0006\u000b\uffff\uffff\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108"+
		"\u0104\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a"+
		"\u0108\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b"+
		"\u010e\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d"+
		"\u0102\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e"+
		"\u0017\u0001\u0000\u0000\u0000\u010f\u0115\u0005\u0006\u0000\u0000\u0110"+
		"\u0111\u0003\u0010\b\u0000\u0111\u0112\u0006\f\uffff\uffff\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u0110\u0001\u0000\u0000\u0000\u0114"+
		"\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000\u0115"+
		"\u0116\u0001\u0000\u0000\u0000\u0116\u0118\u0001\u0000\u0000\u0000\u0117"+
		"\u0115\u0001\u0000\u0000\u0000\u0118\u011d\u0005\u0007\u0000\u0000\u0119"+
		"\u011a\u0003\u0010\b\u0000\u011a\u011b\u0006\f\uffff\uffff\u0000\u011b"+
		"\u011d\u0001\u0000\u0000\u0000\u011c\u010f\u0001\u0000\u0000\u0000\u011c"+
		"\u0119\u0001\u0000\u0000\u0000\u011d\u0019\u0001\u0000\u0000\u0000\u011e"+
		"\u011f\u0006\r\uffff\uffff\u0000\u011f\u0120\u0005)\u0000\u0000\u0120"+
		"\u0144\u0006\r\uffff\uffff\u0000\u0121\u0122\u0005*\u0000\u0000\u0122"+
		"\u0144\u0006\r\uffff\uffff\u0000\u0123\u0124\u0005-\u0000\u0000\u0124"+
		"\u0144\u0006\r\uffff\uffff\u0000\u0125\u0126\u0005+\u0000\u0000\u0126"+
		"\u0144\u0006\r\uffff\uffff\u0000\u0127\u0128\u0005.\u0000\u0000\u0128"+
		"\u0144\u0006\r\uffff\uffff\u0000\u0129\u012a\u0005\u0003\u0000\u0000\u012a"+
		"\u012b\u0003\u001a\r\u0000\u012b\u012c\u0005\u0004\u0000\u0000\u012c\u012d"+
		"\u0006\r\uffff\uffff\u0000\u012d\u0144\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\u0003\u0000\u0000\u012f\u0130\u0003\u001c\u000e\u0000\u0130\u0131"+
		"\u0005\u0004\u0000\u0000\u0131\u0132\u0003\u001a\r\b\u0132\u0133\u0006"+
		"\r\uffff\uffff\u0000\u0133\u0144\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"\u0015\u0000\u0000\u0135\u0136\u0003\u001a\r\u0007\u0136\u0137\u0006\r"+
		"\uffff\uffff\u0000\u0137\u0144\u0001\u0000\u0000\u0000\u0138\u0139\u0005"+
		"\u0016\u0000\u0000\u0139\u013a\u0003\u001a\r\u0006\u013a\u013b\u0006\r"+
		"\uffff\uffff\u0000\u013b\u0144\u0001\u0000\u0000\u0000\u013c\u013d\u0005"+
		".\u0000\u0000\u013d\u013e\u0005\u0012\u0000\u0000\u013e\u013f\u0005\u0013"+
		"\u0000\u0000\u013f\u0140\u0007\u0000\u0000\u0000\u0140\u0141\u0003\u001a"+
		"\r\u0001\u0141\u0142\u0006\r\uffff\uffff\u0000\u0142\u0144\u0001\u0000"+
		"\u0000\u0000\u0143\u011e\u0001\u0000\u0000\u0000\u0143\u0121\u0001\u0000"+
		"\u0000\u0000\u0143\u0123\u0001\u0000\u0000\u0000\u0143\u0125\u0001\u0000"+
		"\u0000\u0000\u0143\u0127\u0001\u0000\u0000\u0000\u0143\u0129\u0001\u0000"+
		"\u0000\u0000\u0143\u012e\u0001\u0000\u0000\u0000\u0143\u0134\u0001\u0000"+
		"\u0000\u0000\u0143\u0138\u0001\u0000\u0000\u0000\u0143\u013c\u0001\u0000"+
		"\u0000\u0000\u0144\u0176\u0001\u0000\u0000\u0000\u0145\u0146\n\u0005\u0000"+
		"\u0000\u0146\u0147\u0007\u0001\u0000\u0000\u0147\u0148\u0003\u001a\r\u0006"+
		"\u0148\u0149\u0006\r\uffff\uffff\u0000\u0149\u0175\u0001\u0000\u0000\u0000"+
		"\u014a\u014b\n\u0004\u0000\u0000\u014b\u014c\u0007\u0002\u0000\u0000\u014c"+
		"\u014d\u0003\u001a\r\u0005\u014d\u014e\u0006\r\uffff\uffff\u0000\u014e"+
		"\u0175\u0001\u0000\u0000\u0000\u014f\u0150\n\u0003\u0000\u0000\u0150\u0151"+
		"\u0007\u0003\u0000\u0000\u0151\u0152\u0003\u001a\r\u0004\u0152\u0153\u0006"+
		"\r\uffff\uffff\u0000\u0153\u0175\u0001\u0000\u0000\u0000\u0154\u0155\n"+
		"\u0002\u0000\u0000\u0155\u0156\u0007\u0004\u0000\u0000\u0156\u0157\u0003"+
		"\u001a\r\u0003\u0157\u0158\u0006\r\uffff\uffff\u0000\u0158\u0175\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\n\f\u0000\u0000\u015a\u0166\u0005\u0003"+
		"\u0000\u0000\u015b\u015c\u0003\u001a\r\u0000\u015c\u0163\u0006\r\uffff"+
		"\uffff\u0000\u015d\u015e\u0005\t\u0000\u0000\u015e\u015f\u0003\u001a\r"+
		"\u0000\u015f\u0160\u0006\r\uffff\uffff\u0000\u0160\u0162\u0001\u0000\u0000"+
		"\u0000\u0161\u015d\u0001\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000"+
		"\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000"+
		"\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000"+
		"\u0000\u0166\u015b\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\u0004\u0000"+
		"\u0000\u0169\u0175\u0006\r\uffff\uffff\u0000\u016a\u016b\n\n\u0000\u0000"+
		"\u016b\u016c\u0005\u0012\u0000\u0000\u016c\u016d\u0003\u001a\r\u0000\u016d"+
		"\u016e\u0005\u0013\u0000\u0000\u016e\u016f\u0006\r\uffff\uffff\u0000\u016f"+
		"\u0175\u0001\u0000\u0000\u0000\u0170\u0171\n\t\u0000\u0000\u0171\u0172"+
		"\u0005\u0014\u0000\u0000\u0172\u0173\u0005.\u0000\u0000\u0173\u0175\u0006"+
		"\r\uffff\uffff\u0000\u0174\u0145\u0001\u0000\u0000\u0000\u0174\u014a\u0001"+
		"\u0000\u0000\u0000\u0174\u014f\u0001\u0000\u0000\u0000\u0174\u0154\u0001"+
		"\u0000\u0000\u0000\u0174\u0159\u0001\u0000\u0000\u0000\u0174\u016a\u0001"+
		"\u0000\u0000\u0000\u0174\u0170\u0001\u0000\u0000\u0000\u0175\u0178\u0001"+
		"\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177\u0001"+
		"\u0000\u0000\u0000\u0177\u001b\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0005#\u0000\u0000\u017a\u0194\u0006\u000e"+
		"\uffff\uffff\u0000\u017b\u017c\u0005$\u0000\u0000\u017c\u0194\u0006\u000e"+
		"\uffff\uffff\u0000\u017d\u017e\u0005%\u0000\u0000\u017e\u0194\u0006\u000e"+
		"\uffff\uffff\u0000\u017f\u0180\u0005&\u0000\u0000\u0180\u0194\u0006\u000e"+
		"\uffff\uffff\u0000\u0181\u0182\u0005\u0012\u0000\u0000\u0182\u0183\u0005"+
		")\u0000\u0000\u0183\u0184\u0005\u0013\u0000\u0000\u0184\u0185\u0003\u001c"+
		"\u000e\u0000\u0185\u0186\u0006\u000e\uffff\uffff\u0000\u0186\u0194\u0001"+
		"\u0000\u0000\u0000\u0187\u0188\u0005\'\u0000\u0000\u0188\u018e\u0005\u0006"+
		"\u0000\u0000\u0189\u018a\u0003\u0006\u0003\u0000\u018a\u018b\u0006\u000e"+
		"\uffff\uffff\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c\u0189\u0001"+
		"\u0000\u0000\u0000\u018d\u0190\u0001\u0000\u0000\u0000\u018e\u018c\u0001"+
		"\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0191\u0001"+
		"\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0192\u0005"+
		"\u0007\u0000\u0000\u0192\u0194\u0006\u000e\uffff\uffff\u0000\u0193\u0179"+
		"\u0001\u0000\u0000\u0000\u0193\u017b\u0001\u0000\u0000\u0000\u0193\u017d"+
		"\u0001\u0000\u0000\u0000\u0193\u017f\u0001\u0000\u0000\u0000\u0193\u0181"+
		"\u0001\u0000\u0000\u0000\u0193\u0187\u0001\u0000\u0000\u0000\u0194\u001d"+
		"\u0001\u0000\u0000\u0000\u001d#1>F[en\u0080\u0083\u008a\u0092\u009a\u00a1"+
		"\u00af\u00bd\u00cf\u00f1\u0100\u010a\u010d\u0115\u011c\u0143\u0163\u0166"+
		"\u0174\u0176\u018e\u0193";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}