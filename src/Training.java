import java.util.ArrayList;
import java.util.HashMap;

public class Training {


    private String name;
    private ArrayList<Exercise> exercises = new ArrayList<Exercise>();

    public Training(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Exercise> getExercises() {
        return exercises;
    }

    public void addExersice(String nameExercice, double currentWeight) {

        Exercise newExercise = new Exercise(nameExercice, currentWeight);
        this.exercises.add(newExercise);
    }

    public void printExercises() {
        for (Exercise exercise: this.exercises) {
            System.out.println(exercise.getName() + " with fixed weight " + exercise.getCurrentWeight());

        }
    }

    public void setName(String newName) {
        this.name = name;
    }


}
