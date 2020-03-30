package com.rs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QueryExecutorImpl implements QueryExecutor {
	private static Logger logger = LoggerFactory.getLogger(QueryExecutorImpl.class);

	@Override
	public void execute(String query) {
		logger.debug("Executing query {}", query);
	}
}
