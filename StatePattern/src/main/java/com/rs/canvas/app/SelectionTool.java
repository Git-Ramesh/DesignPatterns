package com.rs.canvas.app;

public class SelectionTool implements Tool {

	@Override
	public void mouseDown() {
		System.out.println("selection icon");
	}

	@Override
	public void mouseUp() {
		System.out.println("draw a dashed rectangle");
	}
}
