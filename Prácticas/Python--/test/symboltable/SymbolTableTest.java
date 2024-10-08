package symboltable;

import ast.definitions.VariableDef;

public class SymbolTableTest {
		
	public void testInsert() {
		SymbolTable st = new SymbolTable();
		VariableDef definition = new VariableDef(0, 0, "a", null);
		assert st.insert(definition);
		assert definition.getScope()==0;
		assert !st.insert(definition);
		st.set();
		VariableDef definition2 = new VariableDef(0, 0, "a", null);
		assert st.insert(definition2);
		assert definition2.getScope()==1;
		assert !st.insert(definition2);
		st.reset();
		assert !st.insert(definition);
	}
	
	public void testFind() {
		SymbolTable st = new SymbolTable();
		VariableDef varDefinition = new VariableDef(0, 0, "a", null);
		assert st.insert(varDefinition);
		assert st.find("a")!=null;
		assert st.find("b")==null;
		st.set();
		VariableDef varDefinition2 = new VariableDef(0, 0, "b", null);
		assert st.insert(varDefinition2);
		assert st.find("b")!=null;
		assert st.find("a")!=null;
		assert st.find("c")==null;
		st.reset();
		assert st.find("a")!=null;
		assert st.find("b")==null;
	}

	public void testFindInCurrentScope() {
		SymbolTable st = new SymbolTable();
		VariableDef varDefinition = new VariableDef(0, 0, "a", null);
		assert st.insert(varDefinition);
		assert st.findInCurrentScope("a")!=null;
		assert st.findInCurrentScope("b")==null;
		st.set();
		VariableDef varDefinition2 = new VariableDef(0, 0, "b", null);
		assert st.insert(varDefinition2);
		assert st.findInCurrentScope("b")!=null;
		assert st.findInCurrentScope("a")==null;
		assert st.findInCurrentScope("c")==null;
		st.reset();
		assert st.findInCurrentScope("a")!=null;
		assert st.findInCurrentScope("b")==null;		
	}
	
	public static void main(String[] args) {
		SymbolTableTest test = new SymbolTableTest();
		test.testInsert();
		test.testFind();
		test.testFindInCurrentScope();
	}
	
}
