package com.rs;

import org.junit.jupiter.api.Test;

public class AdpatorPatternTest {
	@Test
	public void testAdaptorPattern() {
		PowerScocket powerScocket = new HomePowerSocket();
		MobilePowerAdaptor powerAdaptor = new MobilePowerAdaptor(powerScocket);
		Mobile mobile = new MyMobile();
		mobile.charge(powerAdaptor, powerScocket);
	}
}
