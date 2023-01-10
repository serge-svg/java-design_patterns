package com.svg.java.designpatterns.creational.builder.example1;

public class Main {
    /** create a course:
            String name
            list of Exercise(String task)
            list of Video(String url)
            test(String question1, question2, answer1, answer2),
        create a basicCourseBuilder(less than 2 videos, one exercise, one test with just 1 questions),
        create a advanceCourseBuilder(less than 4 videos, two exercises, one test with just 2 questions)
     */

    public static void main(String[] args) {
        /*
        CourseBuilder basicCourseBuilder = new BasicCourseBuilder();
        basicCourseBuilder.addName("Java 1")
            .addVideo("www.java_video_1")
            .addVideo("www.java_video_2")
            .addVideo("www.java_video_3")
            .addExercise("Exercice 1 ...")
            .addExercise("Exercice 2 ...")
            .addExercise("Exercice 3 ...")
            .addTest("question1");

        Course courseJava1 = basicCourseBuilder.builder();
        printVideo(courseJava1);
        */

        CourseBuilder advanceCurseBuilder = new AdvanceCurseBuilder();
        advanceCurseBuilder.addName("Java 2")
            .addVideo("www.java_video_1")
            .addVideo("www.java_video_2")
            .addVideo("www.java_video_3")
            .addVideo("www.java_video_4")
            .addVideo("www.java_video_5")
            .addExercise("Exercice 1 ...")
            .addExercise("Exercice 2 ...")
            .addExercise("Exercice 3 ...")
            .addExercise("Exercice 4 ...")
            .addExercise("Exercice 5 ...")
            .addExercise("Exercice 6 ...")
            .addTest("question1", "question2");

        Course courseJava2 = advanceCurseBuilder.builder();

        printVideo(courseJava2);

    }

    private static void printVideo(Course course) {
        for (Video video : course.getVideos()){
            System.out.printf("URL: %s%n", video.getUrl());
        }
    }

}
