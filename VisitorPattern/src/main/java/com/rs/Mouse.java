package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mouse implements ComputerPart {
	private static Logger logger = LoggerFactory.getLogger(Mouse.class);
	
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		
		computerPartVisitor.visit(this);
	}
}
