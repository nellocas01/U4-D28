package com.example.u4d28.composite;

import java.util.ArrayList;
import java.util.List;

public class Section extends BookComponent {
	private String title;
	private List<BookComponent> components;

	public Section(String title) {
		this.title = title;
		components = new ArrayList<>();
	}

	public void addComponent(BookComponent component) {
		components.add(component);
	}

	@Override
	public int getPageCount() {
		int total = 0;
		for (BookComponent component : components) {
			total += component.getPageCount();
		}
		return total;
	}

	@Override
	public void print() {
		System.out.println("Section: " + title);
		for (BookComponent component : components) {
			component.print();
		}
	}
}