package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Computer implements ComputerPart {
	private static Logger logger = LoggerFactory.getLogger(Computer.class);
	
	public ComputerPart[] computerParts;

	public Computer() {
		this.computerParts = new ComputerPart[] { new Mouse(), new Keyboard(), new Monitor() };
	}

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
		for (ComputerPart computerPart : computerParts) {
			computerPart.accept(computerPartVisitor);
		}
	}
}
