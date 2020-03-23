package com.rs;

public class DatabaseConfiguration {
	private String driverClassName;
	private String url;
	private String username;
	private String password;

	private DatabaseConfiguration(Builder builder) {
		this.driverClassName = builder.driverClassName;
		this.url = builder.url;
		this.username = builder.url;
		this.password = builder.password;
	}

	public static class Builder {
		private String driverClassName;
		private String url;
		private String username;
		private String password;

		public Builder() {
		}

		public Builder(String url, String username, String password) {
			this.url = url;
			this.username = username;
			this.password = password;
		}

		public Builder setDriverClassName(String driverClassName) {
			this.driverClassName = driverClassName;
			return this;
		}

		public Builder setUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder setUsername(String username) {
			this.username = username;
			return this;
		}

		public Builder setPassword(String password) {
			this.password = password;
			return this;
		}

		public DatabaseConfiguration build() {
			return new DatabaseConfiguration(this);
		}
	}

	public static Builder builder() {
		return new Builder();
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "DatabaseConfiguration [driverClassName=" + driverClassName + ", url=" + url + ", username=" + username
				+ ", password=" + password + "]";
	}

}
