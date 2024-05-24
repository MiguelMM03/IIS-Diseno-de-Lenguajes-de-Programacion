package symboltable;

import java.util.*;
import ast.Definition;

public class SymbolTable {
	
	private int scope=0;
	private List<Map<String,Definition>> table;
	public SymbolTable()  {
		table=new ArrayList<>();
		table.add(new HashMap<>());
	}

	public void set() {
		scope++;
		table.add(new HashMap<>());
	}
	
	public void reset() {
		scope--;
		table.removeLast();
	}
	
	public boolean insert(Definition definition) {
		if(table.get(scope).containsKey(definition.getName())){
			return false;
		}
		table.get(scope).put(definition.getName(),definition);
		definition.setScope(scope);
		return true;
	}
	
	public Definition find(String id) {
		for(int i=scope;i>=0;i--){
			if(table.get(i).containsKey(id)){
				return table.get(i).get(id);
			}
		}
		return null;
	}

	public Definition findInCurrentScope(String id) {
		return table.get(scope).get(id);
	}
}
