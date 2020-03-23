package com.rs;

public class ComputerFactory {

	private ComputerFactory() {

	}

	public static Computer getComputer(ComputerType computerType, String ram, String hdd, String processor,
			boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		switch (computerType) {
		case PC:
			return new Pc(ram, hdd, processor, isGraphicsEnabled, isBluetoothEnabled);
		case LAPTOP:
			return new Laptop(ram, hdd, processor, isGraphicsEnabled, isBluetoothEnabled);
		case SERVER:
			return new Server(ram, hdd, processor, isGraphicsEnabled, isBluetoothEnabled);
		default:
			throw new RuntimeException("Invalid ComputerType");
		}
	}
}
