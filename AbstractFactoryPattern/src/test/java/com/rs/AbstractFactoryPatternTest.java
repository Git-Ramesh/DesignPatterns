package com.rs;

import org.junit.jupiter.api.Test;

public class AbstractFactoryPatternTest {

	@Test
	public void testAbstractFactoryPattern() {  
		Computer laptop = ComputerFactory.getComputer(new LaptopFactory("8 GB", "1 TB", "I7", true, false));
		System.out.println(laptop);
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "I9", true, false));
		System.out.println(server);
	}
}
