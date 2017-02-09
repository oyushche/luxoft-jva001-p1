package com.luxoft.jva001p1.inners.xtasks.bankapp.domain;

public enum Gender {
	MALE("Mr."), FEMALE("Ms.");

	private String greeting;

	private Gender(String greeting) {
		this.greeting = greeting;
	}

	public String getGreeting() {
		return greeting;
	}
}
