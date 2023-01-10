package com.svg.java.designpatterns.creational.builder.example1;

import lombok.Data;

import java.util.List;

@Data
public class AdvanceCurseBuilder extends CourseBuilder {

    private List<Video> videos;
    private List<Exercise> exercises;
    private Test test;

    public CourseBuilder addVideo(String url) {
        if (course.getName() == null) throw new RuntimeException("Course needs a name");
        if (course.getVideos().size() < 4) {
            course.addVideo(new Video(url));
        } else {
            System.out.printf("The basic course %s, has already 4 videos %n", course.getName());
        }
        return this;
    }

    public CourseBuilder addExercise(String task) {
        if (course.getExercises().size() < 4) {
            course.addExercise(new Exercise(task));
        } else {
            System.out.printf("The advance course %s, has already 4 exercises %n", course.getName());
        }
        return this;
    }

    public CourseBuilder addTest(String ...questions) {
        if (test == null) {
            Test test = new Test();
            test.setQuestions1(questions[0]);
            test.setQuestions2(questions[1]);
            course.setTest(test);
        }
        return this;
    }

    public Course builder(){
        return course;
    }

}
