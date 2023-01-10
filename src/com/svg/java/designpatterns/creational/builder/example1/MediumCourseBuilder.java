package com.svg.java.designpatterns.creational.builder.example1;

import lombok.Data;

import java.util.List;

@Data
public class MediumCourseBuilder {

    private Course course;
    private List<Video> videos;
    private List<Exercise> exercises;
    private Test test;

    public void addVideo(String url){
       this.videos.add(new Video(url));
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < 2) {
            exercises.add(exercise);
        }
    }

    public void addTest(String ...questions) {
        Test test = new Test();
        test.setQuestions1(questions[0]);
        test.setQuestions1(questions[1]);
    }

    public Course builder(){
        return course;
    }

}
