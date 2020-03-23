package com.rs.stopwatch.abuse.app;

public class StopedState implements State {

	@Override
	public void click(Stopwatch stopwatch) {
		stopwatch.setState(new RunningState());
		System.out.println("Running");
	}

}
