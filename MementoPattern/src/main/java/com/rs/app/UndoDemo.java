package com.rs.app;

public class UndoDemo {

	public static void main(String[] args) {
		var editor = new Editor();
		var history = new History();
		history.push(editor.addContent("a"));
		history.push(editor.addContent("b"));
		editor.addContent("c");

		// Undo
		editor.undo(history.pop());
		editor.undo(history.pop());
//		editor.undo(history.pop());
		System.out.println(editor.getContent());

	}
}
