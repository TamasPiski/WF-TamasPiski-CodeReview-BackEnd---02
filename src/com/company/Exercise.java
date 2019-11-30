package com.company;

public class Exercise {
    private String name;
    private String description;
    private int duration;
    private String position;

    public Exercise(String name, String description, int duration, String position) {
        this.setName(name);
        this.setDescription(description);
        this.setDuration(duration);
        this.setPosition(position);
    }

    public void show() {
        System.out.println(this.getName() + "                     " + "Duration: " + this.getDuration() + " seconds.");
        System.out.println("--------------------------------------------------");
        System.out.println("Description: " + this.getDescription());
        System.out.println("");
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
