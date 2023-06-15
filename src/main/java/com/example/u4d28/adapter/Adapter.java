package com.example.u4d28.adapter;

import java.util.Date;

public class Adapter implements DataSource {
	private Info info;

	public Adapter(Info info) {
		this.info = info;
	}

	@Override
	public String getNomeCompleto() {
		// TODO Auto-generated method stub
		return info.getNome() + " " + info.getCognome();
	}

	@Override
	public int getEta() {
		// TODO Auto-generated method stub
		Date now = new Date();
		long diffInMillis = now.getTime() - info.getDataDiNascita().getTime();
		long ageInMillis = 1000L * 60 * 60 * 24 * 365; // Millisecondi in un anno approssimativo
		int age = (int) (diffInMillis / ageInMillis);
		return age;
	}

}
