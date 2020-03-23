package com.rs2;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton implements Cloneable, Serializable {
	private static Logger logger = LoggerFactory.getLogger(Singleton.class);

	static {
		logger.debug("Singleton#static block");
	}
	
	private Singleton() {
		
	}

	private static class SingletonHolder {
		private static final Singleton INATANCE = new Singleton();

		static {
			logger.debug("SingletonHolder#static block");
		}
	}

	public static Singleton getInstance() {
		return SingletonHolder.INATANCE;
	}
	
	public static final void sleep(long timeout, TimeUnit timeUnit) {
		try {
			timeUnit.sleep(timeout);
		} catch (InterruptedException e) {
		}
	}
	
	@Override
	public final Singleton clone() throws CloneNotSupportedException {
		return getInstance();
	}
	
	private final Object readResolve() {
		return getInstance();
	}
}
