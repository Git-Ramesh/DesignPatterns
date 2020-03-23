package com.rs;

public class Pc implements Computer {
	private String ram;
	private String hdd;
	private String processor;
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;

	public Pc(String ram, String hdd, String processor, boolean isGraphicsEnabled, boolean isBluetoothEnabled) {
		this.ram = ram;
		this.hdd = hdd;
		this.processor = processor;
		this.isGraphicsEnabled = isGraphicsEnabled;
		this.isBluetoothEnabled = isBluetoothEnabled;
	}

	@Override
	public String ram() {
		return ram;
	}

	@Override
	public String hdd() {
		return hdd;
	}

	@Override
	public String processor() {
		return processor;
	}

	@Override
	public boolean isGraphicsEnabled() {
		return isGraphicsEnabled;
	}

	@Override
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	@Override
	public String toString() {
		return "Pc [ram=" + ram + ", hdd=" + hdd + ", processor=" + processor + ", isGraphicsEnabled="
				+ isGraphicsEnabled + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
}
