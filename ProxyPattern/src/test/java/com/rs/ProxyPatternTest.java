package com.rs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.rs.proxy.QueryExecutorProxy;

public class ProxyPatternTest {
	private QueryExecutor queryExecutor;

	@BeforeEach
	public void setUpBeforeTest() {
		queryExecutor = new QueryExecutorImpl();
	}

	@Test
	@Disabled
	public void testInsertQueryProxyPattern() {
		final String query = "INSERT INTO EMP (EMPNO, NAME) VALUES (100, 'Ramesh)";
		QueryExecutor proxy = new QueryExecutorProxy("nonadmin", "s3cret", queryExecutor);
		proxy.execute(query);
	}

	@Test
//	@Disabled
	public void testUpdateAndDeleteQueryProxyPattern() {
		final String query = "DELETE FROM EMP WHERE EMPNO = 100";
//		QueryExecutor proxy = new QueryExecutorProxy("nonadmin", "s3cret", queryExecutor);
		QueryExecutor proxy = new QueryExecutorProxy("admin", "s3cret", queryExecutor);
		proxy.execute(query);
	}
}
