package com.rs.stopwatch.app;

public class Stopwatch {
	private boolean isRunning;

	public void click() {
		if (!isRunning) {
			System.out.println("stopwatch is started");
			isRunning = true;
		} else {
			System.out.println("stopwatch stoped");
			isRunning = false;
		}
	}
}
