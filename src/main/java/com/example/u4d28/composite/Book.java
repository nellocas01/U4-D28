package com.example.u4d28.composite;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private List<Page> pages;
	private List<Section> sections;
	private List<String> authors;
	private double price;

	public Book() {
		pages = new ArrayList<>();
		sections = new ArrayList<>();
		authors = new ArrayList<>();
	}

	public void addPage(Page page) {
		pages.add(page);
	}

	public void addSection(Section section) {
		sections.add(section);
	}

	public void addAuthor(String author) {
		authors.add(author);
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public int getTotalPages() {
		int total = 0;
		for (Page page : pages) {
			total += page.getPageCount();
		}
		for (Section section : sections) {
			total += section.getPageCount();
		}
		return total;
	}

	public void print() {
		System.out.println("Book Title: ");
		System.out.println("Authors: " + authors);
		System.out.println("Price: " + price);
		System.out.println("Total Pages: " + getTotalPages());

		System.out.println("Contents:");
		for (Page page : pages) {
			page.print();
		}
		for (Section section : sections) {
			section.print();
		}
	}
}