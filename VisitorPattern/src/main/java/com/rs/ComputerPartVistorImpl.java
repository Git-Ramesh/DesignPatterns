package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComputerPartVistorImpl implements ComputerPartVisitor {
	private static Logger logger = LoggerFactory.getLogger(ComputerPartVistorImpl.class);

	@Override
	public void visit(Computer computer) {
		logger.info("Visiting Computer");
		ComputerPart[] computerParts = computer.getComputerParts();
		for (ComputerPart computerPart : computerParts) {
			computerPart.accept(this);
		}
	}

	@Override
	public void visit(Mouse mouse) {
		logger.info("Visiting Mouse");
	}

	@Override
	public void visit(Keyboard keyboard) {
		logger.info("Visiting Keyboard");
	}

	@Override
	public void visit(Monitor monitor) {
		logger.info("Visiting Monitor");
	}

}
