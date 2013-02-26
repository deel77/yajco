package yajco.grammar;

import java.util.List;
import yajco.model.pattern.Pattern;
import yajco.model.type.Type;

public class TerminalSymbol extends Symbol {

	public TerminalSymbol(String name, Type returnType) {
		super(name, returnType);
	}

	public TerminalSymbol(String name, Type returnType, String varName) {
		super(name, returnType, varName);
	}

	public TerminalSymbol(String name, Type returnType, List<Pattern> patterns) {
		super(name, returnType, patterns);
	}

	public TerminalSymbol(String name, Type returnType, String varName, List<Pattern> patterns) {
		super(name, returnType, varName, patterns);
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public int hashCode() {
		return toString().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}

		final TerminalSymbol other = (TerminalSymbol) obj;
		return getName().equals(other.getName());
	}
}
