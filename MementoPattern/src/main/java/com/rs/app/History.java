package com.rs.app;

import java.util.ArrayList;
import java.util.List;

public class History {
	private List<EditorState> states = new ArrayList<>();

	public void push(EditorState state) {
		states.add(state);
	}

	public EditorState pop() {
		if (!states.isEmpty()) {
			var lastIndex = states.size() - 1;
			return states.remove(lastIndex);
		}
		return null;
	}
}
