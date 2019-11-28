package com.company;

public class Excercise {
    private String name;
    private String description;
    private int duration;
    private String position;

    public Excercise(String name, String description, int duration, String position) {
        this.setName(name);
        this.setDescription(description);
        this.setDuration(duration);
        this.setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
