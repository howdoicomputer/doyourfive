package com.howdoicomputer;
import static spark.Spark.*;
import com.google.gson.Gson;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * A simple POST API to track a stripped 5x5 workout
 *
 */
public class DoYourFive {

  /*
  A small class to represent a workout

  The @Data and @Accessors annotations allow for shorthand declarations of
  getters, setters, and method chaining.

  See https://projectlombok.org/features/GetterSetter.html
  */
  @Data
  @Accessors(chain=true)
  public static class Workout {

    private int id;
    private int sets = 5;
    private int reps = 5;
    private String title;
    private char plan;

  }

  /*
  The workout session tracks, well, a workout session.
  */
  @Data
  @Accessors(chain=true)
  public static class WorkoutSession {

    private int id;
    private char plan;
    private HashMap<int,Workout> trackSets;

  }

  public static void main(String[] args) {

    /*
    A bunch of static objects that won't really change
    */
    Workout barbellDeadlift = new Workout()
      .setId(1)
      .setTitle("Barbell Deadlift")
      .setPlan('A');

    Workout barbellBentOverRow = new Workout()
      .setId(2)
      .setTitle("Barbell Bent Over-Row")
      .setPlan('A');

    Workout dumbellShoulderPress = new Workout()
      .setId(3)
      .setTitle("Dumbell Shoulder Press")
      .setPlan('A');

    Workout barbellSquat = new Workout();
    barbellSquat.setId(4)
      .setTitle("Barbell Squat")
      .setPlan('B');

    Workout dumbellBenchPress = new Workout()
      .setId(5)
      .setTitle("Dumbell Bench Press")
      .setPlan('B');

    /*
    This workout differs in reps and sets values since you're supposed to do
    two reps at maximum sets. I'm using a -1 to represent infinity because I'm
    lazy.
    */
    Workout pullUp = new Workout()
      .setId(6)
      .setTitle("Max Rep Pull Up")
      .setPlan('B')
      .setReps(2)
      .setSets(-1);

    /*
    I started with a double brace initializer but the ArrayList would come up
    as null when being serialized so I created this immutable list. Not like
    the workouts will change, anyway.
    */
    List<Workout> workoutList = Arrays.asList(
      barbellDeadlift,
      barbellBentOverRow,
      dumbellShoulderPress,
      barbellSquat,
      dumbellBenchPress,
      pullUp
    );

    /*
    Provide the list of available workouts
    */
    get("/workouts", (request, response) -> {
      Gson gson = new Gson();
      return gson.toJson(workoutList);
    });

    /*
    Increment a workout set
    */
    post("/workout/:session/:plan/increment", (request, response) -> {
      Gson gson = new Gson();

    }
  }

}
