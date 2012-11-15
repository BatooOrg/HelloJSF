package com.example.bean;

public class TeacherCourseCount {

	private Long id;
	private String name;
	private Long count;

	public TeacherCourseCount(Long id, String lastName, String firstName, Long count) {
		super();
		this.id = id;
		this.name = lastName + ", " + firstName;
		this.count = count;
	}

	public Long getId() {
		return id;
	}

	public Long getCount() {
		return count;
	}

	public String getName() {
		return name;
	}
}
