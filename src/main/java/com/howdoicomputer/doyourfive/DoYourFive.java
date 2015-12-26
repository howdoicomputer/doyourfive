package com.howdoicomputer;
import static spark.Spark.*;
import com.google.gson.Gson;
import com.fasterxml.*;
import lombok.Data;
import java.io.*;

/**
 * A simple REST API to track my stripped 5x5 workout
 *
 */
 public class DoYourFive {
    public static class DumbbellLift {
      @Getter @Setter
      public Int reps, sets;
    }
  }

  public int logWorkout(String id, Int reps, Int sets) {
    WorkoutModel workout = new WorkoutModel()

  }

  public static void main(String[] args) {

    private static final int HTTP_BAD_REQUEST = 400;

    get("/", (request, response) -> "Welcome!");

    get("/hello", (request, response) -> "Hello!");

  }
}
