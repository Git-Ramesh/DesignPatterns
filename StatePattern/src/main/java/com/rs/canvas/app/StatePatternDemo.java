package com.rs.canvas.app;

public class StatePatternDemo {

	public static void main(String[] args) {
		var canvas = new Canvas();
		canvas.setTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();
	}
}
