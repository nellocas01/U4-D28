package com.example.u4d28.composite;

public class Page extends BookComponent {
	private int pageNumber;

	public Page(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Override
	public int getPageCount() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Page " + pageNumber);
	}
}