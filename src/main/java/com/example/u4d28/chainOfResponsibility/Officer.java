package com.example.u4d28.chainOfResponsibility;

public abstract class Officer {
	private Officer superior;
	private String rank;
	private int salary;

	public Officer(String rank, int salary) {
		this.rank = rank;
		this.salary = salary;
	}

	public void setSuperior(Officer superior) {
		this.superior = superior;
	}

	public void processSalary(int amount) {
		if (amount >= salary) {
			handleRequest(amount);
		} else if (superior != null) {
			superior.processSalary(amount);
		}
	}

	public abstract void handleRequest(int amount);
}