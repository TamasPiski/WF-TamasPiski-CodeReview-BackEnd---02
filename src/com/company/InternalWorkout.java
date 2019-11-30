package com.company;

public class InternalWorkout {
    private Exercise[] exercises;
    private int numberOfRepetitions;
    private int breakDuration;

    public InternalWorkout(Exercise[] exercises, int numberOfRepetitions, int breakDuration) {
        this.setExercises(exercises);
        this.setNumberOfRepetitions(numberOfRepetitions);
        this.setBreakDuration(breakDuration);
    }

    public Exercise[] getExercises() {
        return exercises;
    }

    public void setExercises(Exercise[] exercises) {
        this.exercises = exercises;
    }

    public int getNumberOfRepetitions() {
        return numberOfRepetitions;
    }

    public void setNumberOfRepetitions(int numberOfRepetitions) {
        this.numberOfRepetitions = numberOfRepetitions;
    }

    public int getBreakDuration() {
        return breakDuration;
    }

    public void setBreakDuration(int breakDuration) {
        this.breakDuration = breakDuration;
    }
}
