# About

Do Your Five is a small Java based API that tracks someone doing a stripped 5x5 starting strength workout. It aims to fulfill the goal of being written in a concise and readable manner as well as giving me a chance to become more familiar with Java 8, Spark, and Lombok.

## Installation and Getting Started

* Install `maven`
* `mvn clean compile assembly:single`
* `java -jar target\doyourfive-1.0-SNAPSHOT-jar-with-dependencies.jar`
* Navigate to [127.0.0.1:4567/workouts](127.0.0.1:4567/workouts)

You should see a list of potential workouts in the form of JSON.

```JSON
[
{
id: 1,
sets: 5,
reps: 5,
title: "Barbell Deadlift",
plan: "A"
},
{
id: 2,
sets: 5,
reps: 5,
title: "Barbell Bent Over-Row",
plan: "A"
},
{
id: 3,
sets: 5,
reps: 5,
title: "Dumbell Shoulder Press",
plan: "A"
},
{
id: 4,
sets: 5,
reps: 5,
title: "Barbell Squat",
plan: "B"
},
{
id: 5,
sets: 5,
reps: 5,
title: "Dumbell Bench Press",
plan: "B"
},
{
id: 6,
sets: -1,
reps: 2,
title: "Max Rep Pull Up",
plan: "B"
}
]
```

## Junit
* `mvn test`

## Deploying to Heroku

This is a todo.
