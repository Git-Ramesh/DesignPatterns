package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyMobile implements Mobile {
	private static Logger logger = LoggerFactory.getLogger(MyMobile.class);

	@Override
	public void charge(MobilePowerAdaptor mobilePowerAdaptor, PowerScocket powerScocket) {
		int voltage = mobilePowerAdaptor.voltage();
		logger.info("Mobile chaging with voltage: {}", voltage);
	}
}
