package yajco.model.pattern.impl;

import yajco.annotation.After;
import yajco.annotation.Before;
import yajco.annotation.Exclude;
import yajco.model.pattern.NotationPattern;

public class Factory extends NotationPattern {

	private final String name;

	@Before({"Factory", "("})
	@After(")")
	public Factory(@Before({"method", "="}) String name) {
		super(null);
		this.name = name;
	}

	@Exclude
	public Factory(String name, Object sourceElement) {
		super(sourceElement);
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
