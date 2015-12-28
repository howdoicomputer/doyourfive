# About

Do Your Five is a small Java based API that tracks someone doing a stripped 5x5 starting strength workout. It aims to fulfill the goal of being written in a concise and readable manner as well as giving me a chance to become more familiar with Java 8, Spark, and Lombok.

## Design

Plain Java objects are defined in a single file in order to represent exercises. Workout sessions are ordered by a 'plan'. I.e, the set of exercises to be done on that day. A plan comprises three exercises with five sets. When an exercise is completed the workout session moves on to the next designated exercise for the specified plan. Everything is kept in memory and a workout session is referred to by a UUID.

The API is meant to be consumed via a Pebble watch.

## FAQs/Questions/Musings

* Hey Tyler, is this particularly useful?

No! There are better workout tracking options out there! Like a piece of paper and a pen.

* Hey Tyler, this isn't particularly well written.

You're right! The way I'm writing this won't scale at all! If the application crashes then it loses state relative to the user. I almost never write Java anymore so I could be writing some really inefficient code.

* Aren't you over engineering a solution to a very simple problem?

Yeah! I totally am! Keeping track of a 5x5 workout isn't hard. I'm doing this mostly because I want to play with technologies.

## Installation and Getting Started

* Install `maven`
* `mvn clean compile assembly:single`
* `java -jar target\doyourfive-1.0-SNAPSHOT-jar-with-dependencies.jar`
* Navigate to [http://127.0.0.1:4567/workouts](http://127.0.0.1:4567/workouts)

You should see a JSON representation of the available exercises.

```json
[{
    id: 1,
    sets: 5,
    reps: 5,
    title: "Barbell Deadlift",
    plan: "A"
}, {
    id: 2,
    sets: 5,
    reps: 5,
    title: "Barbell Bent Over-Row",
    plan: "A"
}, {
    id: 3,
    sets: 5,
    reps: 5,
    title: "Dumbell Shoulder Press",
    plan: "A"
}, {
    id: 4,
    sets: 5,
    reps: 5,
    title: "Barbell Squat",
    plan: "B"
}, {
    id: 5,
    sets: 5,
    reps: 5,
    title: "Dumbell Bench Press",
    plan: "B"
}, {
    id: 6,
    sets: -1,
    reps: 2,
    title: "Max Rep Pull Up",
    plan: "B"
}]
```

## Junit
* `mvn test`
