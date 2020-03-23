package com.rs2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@TestInstance(Lifecycle.PER_METHOD)
public class SingletonTest {
	private static Logger logger = LoggerFactory.getLogger(SingletonTest.class);

	@Test
	@Disabled
	public void testSingleton() throws ClassNotFoundException {
		logger.debug("SingletonTest#testSingleton");
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		logger.debug("hashCode: " + singleton1.hashCode());
		logger.debug("hashCode: " + singleton2.hashCode());
	}

	@Test
	@Disabled
	public void testSingletonWithMultipleThreads() {
		logger.debug("SingletonTest#testSingletonWithMultipleThreads");
		ExecutorService es = Executors.newFixedThreadPool(6);
		for (int i = 0; i < 10; i++) {
			es.execute(() -> {
				Singleton singleton = Singleton.getInstance();
				logger.debug("hashCode: " + singleton.hashCode());
			});
		}
		es.shutdown();
		Singleton.sleep(10, TimeUnit.SECONDS);
	}

	@Test
	@Disabled
	public void testSinletonUsingReflection() {
		logger.debug("Singleton#testSinletonUsingReflection");
		Class<Singleton> cls = Singleton.class;

		Constructor<?>[] constructors = cls.getDeclaredConstructors();
		try {
			Singleton singleton = Singleton.getInstance();
			logger.debug("hashCode: " + singleton.hashCode());
			Constructor<?> constructor = constructors[0];
			constructor.setAccessible(true);
			Field field = cls.getDeclaredField("instanceCount");
			field.setAccessible(true);
			byte instanceCount = (byte) field.get(cls);
			field.setByte(cls, (byte) 0);
			logger.debug("instanceCount: " + instanceCount);
			Singleton singleton2 = (Singleton) constructors[0].newInstance();
			logger.debug("hashCode: " + singleton2.hashCode());
		} catch (Exception e) {
			logger.error(e.getLocalizedMessage(), e);
		}
	}

	@Test
	@Disabled
	public void testSingletonUsingCloning() {
		Singleton singleton = Singleton.getInstance();
		logger.debug("hashCode: " + singleton.hashCode());
//		try {
//			Singleton singleton2 = singleton.clone();
//			logger.debug("hashCode: " + singleton2.hashCode());
//		} catch (CloneNotSupportedException e) {
//			logger.error(e.getLocalizedMessage(), e);
//		}
	}

	@Test
	@Disabled
	public void testSingletonUsingSerialization() {
		Singleton singleton = Singleton.getInstance();
		logger.debug("hashCode: " + singleton.hashCode());
		serializeSingleton(singleton);
		Singleton singleton2 = deserializeSingleton();
		logger.debug("hashCode: " + singleton2.hashCode());
	}

	private void serializeSingleton(Singleton singleton) {
		ObjectOutputStream oos = null;
		try {
			try {
				oos = new ObjectOutputStream(new FileOutputStream(new File("Singleton.ser")));
				oos.writeObject(singleton);
				logger.debug("Serialization Completed");
			} catch (IOException e) {
				logger.error(e.getLocalizedMessage(), e);
			}
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
				}
			}
		}
	}

	private Singleton deserializeSingleton() {
		ObjectInputStream ois = null;
		try {
			try {
				ois = new ObjectInputStream(new FileInputStream(new File("Singleton.ser")));
				return (Singleton) ois.readObject();
			} catch (IOException | ClassNotFoundException e) {
				logger.error(e.getLocalizedMessage(), e);
				throw new RuntimeException(e);
			}

		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {

				}
			}
		}
	}
}
