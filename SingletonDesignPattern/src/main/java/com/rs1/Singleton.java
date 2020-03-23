package com.rs1;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Singleton implements Cloneable, Serializable {
	private static Logger logger = LoggerFactory.getLogger(Singleton.class);
	private static Singleton instance;
	private static byte instanceCount;

	static {
		logger.debug("Singleton#static block");
	}

	private Singleton() {
		if (instanceCount == 1) {
			throw new RuntimeException("Can not instantiate singleton more than once");
		}
	}

	public static Singleton getInstance() {
		if (instance == null) {
//			sleep(2, TimeUnit.SECONDS);
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
					instanceCount++;
				}
			}
		}
		return instance;
	}

	public static final void sleep(long timeout, TimeUnit timeUnit) {
		try {
			timeUnit.sleep(timeout);
		} catch (InterruptedException e) {
		}
	}

	@Override
	public Singleton clone() throws CloneNotSupportedException {
		return getInstance();
	}
	
	private Object readResolve() {
		return getInstance();
	}
	
	
}
