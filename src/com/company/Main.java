package com.company;

public class Main {
    public static Excercise[] exercises = {
            new Excercise("Push-ups ", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, "floor"),
            new Excercise("Planks ", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "floor"),
            new Excercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels. ", 45, "standup"),
            new Excercise("Backward kick", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat. ", 60, "floor"),
            new Excercise("Leg curl", " Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, "standup"),
            new Excercise("Sidewards back strech", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand. ", 60, "standup")
    };

    public static InternalWorkout internalWorkout = new InternalWorkout(exercises, 5, 45);


    public static void main(String[] args) {
        //show();
        //exerciseShow();
        //exerciseFilterOnFloor();
        //exercisesFilterOnFloorLongerThan60secs();
        //showIntervalExercise();
    }

    // Prints exercise object
    public static void show() {
        Excercise excercise = exercises[0];
        System.out.println(excercise.getName() + "                     " + "Duration: " + excercise.getDuration() + " seconds.");
        System.out.println("--------------------------------------------------");
        System.out.println("Description: " + excercise.getDescription());
    }

    //loops through and shows all excercises in excercises array
    public static void exerciseShow() {
        for (Excercise excercise : exercises) {
            show();
        }
    }

    //loops through and shows excercises executed on the floor
    public static void exerciseFilterOnFloor() {
        for (Excercise excercise : exercises) {
            if (excercise.getPosition() == "floor") {
                show();
            }
        }
    }
    //loops through and shows exercises executed on the floor taking more than 60 seconds
    public static void exercisesFilterOnFloorLongerThan60secs(){
        for (Excercise excercise : exercises) {
            if (excercise.getPosition() == "floor" && excercise.getDuration() > 60) {
                show();
            }
        }
    }

    //show interval exercise
    public static void showIntervalExercise() {
        System.out.println("*****************************" + "\n" + "Interval Workout STARTS !!!!" + "\n" + "*****************************" + "\n" + "=============================");
        for (int i = 1; i <= internalWorkout.getNumberOfRepetitions(); i++) {
            System.out.println("Round: " + i);
            for (Excercise exercise : exercises) {
                System.out.println(exercise.getName());
            }
            if (i < internalWorkout.getNumberOfRepetitions())
                System.out.println("=============================\n" + "DO THE BREAK (" + internalWorkout.getBreakDuration() + " SECONDS)\n" + "=============================");

            else
                System.out.println("*****************************" + "\n" + "CONGRATS - YOU ARE DONE !!!" + "\n" + "*****************************");
        }

    }

}

