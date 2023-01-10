package com.svg.java.designpatterns.creational.builder.example1;

public abstract class CourseBuilder {

    protected Course course;

    public CourseBuilder() {
        this.course = new Course();
    }

    public CourseBuilder addName(String name) {
        course.setName(name);
        return this;
    }

    public abstract CourseBuilder addVideo(String url);
    public abstract CourseBuilder addExercise(String task);
    public abstract CourseBuilder addTest(String... questions);
    public abstract Course builder();

}