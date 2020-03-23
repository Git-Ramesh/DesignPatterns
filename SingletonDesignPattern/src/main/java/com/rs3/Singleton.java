package com.rs3;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public enum Singleton implements Cloneable, Serializable {
	INSTANCE;
	private static Logger logger = LoggerFactory.getLogger(Singleton.class);

	static {
		logger.debug("Singleton#static block");
	}

	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public static final void sleep(long timeout, TimeUnit timeUnit) {
		try {
			timeUnit.sleep(timeout);
		} catch (InterruptedException e) {
		}
	}
}
