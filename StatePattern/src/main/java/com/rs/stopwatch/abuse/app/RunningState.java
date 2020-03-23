package com.rs.stopwatch.abuse.app;

public class RunningState implements State {

	@Override
	public void click(Stopwatch stopwatch) {
		stopwatch.setState(new StopedState());
		System.out.println("stopped");
	}
}
