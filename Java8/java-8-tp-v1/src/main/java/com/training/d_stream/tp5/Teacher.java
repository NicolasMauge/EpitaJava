package com.training.d_stream.tp5;

import java.time.LocalDate;

public class Teacher {
	private String name;
	private LocalDate birthday;

	public Teacher(String name, LocalDate birthday) {
		this.name = name;
		this.birthday = birthday;
	}

	public Integer getAge() {
		return this.getBirthday().until(LocalDate.now()).getYears();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}
