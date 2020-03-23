package com.rs.app;

public class Editor {
	private String content;

	public EditorState addContent(String content) {
		this.content = content;
		return new EditorState(content);
	}

	public void undo(EditorState state) {
		if (state != null) {
			this.content = state.getContent();
		}
	}

	public String getContent() {
		return content;
	}
}
