package com.rs;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(AbstractComputerFactory computerFactory) {
		return computerFactory.getComputer();
	}
}
