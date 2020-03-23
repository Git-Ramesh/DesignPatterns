package com.rs;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rs.DatabaseConfiguration.Builder;

public class BuilderDesignPatternTest {
	private static Logger logger = LoggerFactory.getLogger(BuilderDesignPatternTest.class);

	@Test
	public void testBuilderPattern() {
//		DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration.Builder(
//				"jdbc:postgresql://localhost:5433/practice", "postgres", "admin")
//						.setDriverClassName("org.postgresql.Driver").build();
		Builder builder = DatabaseConfiguration.builder();
		builder.setUsername("postgres");
		builder.setPassword("admin");
		builder.setUrl("jdbc:postgresql://localhost:5433/practice");
		builder.setDriverClassName("org.postgresql.Driver");
		DatabaseConfiguration databaseConfiguration = builder.build();
		logger.debug(databaseConfiguration.toString());
	}
}
