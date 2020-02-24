import java.util.ArrayList;
import java.util.HashMap;

public class Assistant {

    //the list with all type of user training(it means arms, legs, top of body and so on)
    public ArrayList<Training> typeOfTraining = new ArrayList<Training>();

    public Assistant() {

    }



    public void addTypeofTraining(String nameTraining) {

      Training training = new Training(nameTraining);
      this.typeOfTraining.add(training);

    }

    public void getAllTraining() {
        System.out.println("You have next types of training: ");
        for (Training training : this.typeOfTraining) {
            System.out.println(training.getName());
        }
    }

    public void addExerciseToTraining(String trainingName, String exerciseName) {
        for (Training training : this.typeOfTraining) {
            if (training.getName().toLowerCase().equals(trainingName.toLowerCase())) {
                training.addExersice(exerciseName, 0);
                System.out.println(exerciseName + " was added to " + training.getName());
            }
        }
    }

    public void setWeightToExercise(String trainingName, String exerciseName, double weight) {
        for (Training training : this.typeOfTraining) {
            if (trainingName.toLowerCase().equals(training.getName().toLowerCase())) {
                for (Exercise exercise : training.getExercises()) {
                    if (exercise.getName().toLowerCase().equals(exerciseName)) {
                        exercise.setCurrentWeight(weight);
                        System.out.println("The " + exercise.getName() + " weight was fixed to " + weight);
                        return;
                    } else {
                        System.out.println("There is no " + exerciseName + " in " + trainingName);
                    }
                }
            } else {
                System.out.println("There is no " + trainingName + " in your Sport Assistant");
            }
        }
    }

    public void getAllExercisesInTraining(String trainingName) {
        for (Training training : this.typeOfTraining) {
            if (training.getName().toLowerCase().equals(trainingName.toLowerCase())) {
                System.out.println("You have next exercises in your " + training.getName() + " training:");
                for (Exercise exercise : training.getExercises()) {
                    System.out.println(exercise.getName());
                }
                }
        }
    }

    public void seeExerciseWeight(String trainingName, String exerciseName) {

    }


}
