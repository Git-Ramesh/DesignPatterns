package com.rs;

public class MobilePowerAdaptor implements PowerAdaptor {
	private PowerScocket powerScocket;

	public MobilePowerAdaptor(PowerScocket powerScocket) {
		this.powerScocket = powerScocket;
	}

	@Override
	public int voltage() {
		int outputVoltage = 5;
		int voltage = powerScocket.voltage();
		return outputVoltage;
	}
}
