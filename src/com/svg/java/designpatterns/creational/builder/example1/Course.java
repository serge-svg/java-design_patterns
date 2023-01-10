package com.svg.java.designpatterns.creational.builder.example1;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
public class Course {

    private String name;
    private List<Video> videos = new ArrayList<>();
    private List<Exercise> exercises = new ArrayList<>();
    private Test test = new Test();

    public void addVideo(Video video) {
        videos.add(video);
    }
    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }

}
