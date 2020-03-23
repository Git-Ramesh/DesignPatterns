package com.rs;

public class Laptop implements Computer {
	private String ram;
	private String hdd;
	private String processor;
	private boolean isBluetoothEnabled;
	private boolean isGraphicsEnabled;

	public Laptop(String ram, String hdd, String processor, boolean isBluetoothEnabled, boolean isGraphicsEnabled) {
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
		this.isBluetoothEnabled = isBluetoothEnabled;
		this.isGraphicsEnabled = isGraphicsEnabled;
	}

	public String getRAM() {
		return ram;
	}

	public String getHDD() {
		return hdd;
	}

	public String getProcessor() {
		return processor;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + ", isBluetoothEnabled="
				+ isBluetoothEnabled + ", isGraphicsEnabled=" + isGraphicsEnabled + "]";
	}
}
