package com.rs.stopwatch.abuse.app;

public class Stopwatch {
	private State state;

	public Stopwatch() {
		this.state = new StopedState();
	}

	public void click() {
		state.click(this);
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
}
