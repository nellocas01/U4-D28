package com.example.u4d28.chainOfResponsibility;

public class Major extends Officer {
	public Major() {
		super("Major", 2000);
	}

	@Override
	public void handleRequest(int amount) {
		System.out.println("Major handles the salary request.");
	}
}