package com.rs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FactoryDesignPatternTest {
	private static Logger logger = LoggerFactory.getLogger(FactoryDesignPatternTest.class);

	@Test
	public void testFactoryPattern() {
		Computer laptop = ComputerFactory.getComputer(ComputerType.LAPTOP, "10GB", "1TB", "i5", false, true);
		Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "10GB", "1TB", "i7", true, true);
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "10GB", "1TB", "i5", false, false);
		logger.debug(laptop.toString());
		logger.debug(server.toString());
		logger.debug(pc.toString());
	}
}
