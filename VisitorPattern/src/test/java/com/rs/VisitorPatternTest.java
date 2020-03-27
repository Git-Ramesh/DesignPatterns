package com.rs;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_METHOD)
public class VisitorPatternTest {

	@Test
	public void testComputerPart() {
		ComputerPartVisitor computerPartVisitor = new ComputerPartVistorImpl();
		Computer computer = new Computer();
		computer.accept(computerPartVisitor);
	}
}
