package com.rs;

public class LaptopFactory implements AbstractComputerFactory {
	private String ram;
	private String hdd;
	private String processor;
	private boolean isBluetoothEnabled;
	private boolean isGraphicsEnabled;

	public LaptopFactory(String ram, String hdd, String processor, boolean isBluetoothEnabled,
			boolean isGraphicsEnabled) {
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isGraphicsEnabled = isGraphicsEnabled;
	}

	@Override
	public Computer getComputer() {
		return new Laptop(ram, hdd, processor, isBluetoothEnabled, isGraphicsEnabled);
	}
}
