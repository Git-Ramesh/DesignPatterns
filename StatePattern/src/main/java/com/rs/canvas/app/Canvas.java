package com.rs.canvas.app;

public class Canvas {
	private Tool tool;

	public void mouseDown() {
		tool.mouseDown();
	}

	public void mouseUp() {
		tool.mouseUp();
	}

	public Tool getTool() {
		return tool;
	}

	public void setTool(Tool tool) {
		this.tool = tool;
	}
}
