package com.rs.proxy;

import com.rs.QueryExecutor;

public class QueryExecutorProxy implements QueryExecutor {
	private String username;
	private String password;
	private QueryExecutor queryExecutor;

	public QueryExecutorProxy(String username, String password, QueryExecutor queryExecutor) {
		this.username = username;
		this.password = password;
		this.queryExecutor = queryExecutor;
	}

	@Override
	public void execute(String query) {
		if (query != null && (query.contains("DELETE") || query.contains("UPDATE")) && !isAdmin()) {
			throw new RuntimeException("Unauthorized");
		}
		queryExecutor.execute(query);
		
	}

	private boolean isAdmin() {
		return ("admin".equals(username) && "s3cret".equals(password)) ? true : false;
	}
}
