package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Monitor implements ComputerPart {
	private static Logger logger = LoggerFactory.getLogger(Monitor.class);

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}