package com.example.u4d28.chainOfResponsibility;

public class Captain extends Officer {
	public Captain() {
		super("Captain", 1000);
	}

	@Override
	public void handleRequest(int amount) {
		System.out.println("Captain handles the salary request.");
	}
}