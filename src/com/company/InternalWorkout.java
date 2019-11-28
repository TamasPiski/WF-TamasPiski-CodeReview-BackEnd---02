package com.company;

public class InternalWorkout {
    private Excercise[] excercises;
    private int numberOfRepetitions;
    private int breakDuration;

    public InternalWorkout(Excercise[] excercises, int numberOfRepetitions, int breakDuration) {
        this.setExcercises(excercises);
        this.setNumberOfRepetitions(numberOfRepetitions);
        this.setBreakDuration(breakDuration);
    }

    public Excercise[] getExcercises() {
        return excercises;
    }

    public void setExcercises(Excercise[] excercises) {
        this.excercises = excercises;
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
