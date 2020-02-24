

public class Main {

    public static void main(String[] args) {

        ///hey! what do you want to do?
        ///see my exercises /// see my weights /// add new exercises /// add new value

        ///ADD NEW EXERCISE
        //check if is there a typeOfTraining value
        //if no ---> "you don't have any training do you want to add?" / yes - create a array, add the type of training
        //if yes "choose the type of training" / "add the new training"


        Assistant Mary = new Assistant();
        Mary.addTypeofTraining("Legs");
        Mary.addTypeofTraining("Top of body");
        Mary.getAllTraining();

        Mary.addExerciseToTraining("legs", "Squads");
        Mary.addExerciseToTraining("legs", "bench");
        Mary.addExerciseToTraining("legs", "one leg squads");

        System.out.println("========================");

        Mary.getAllExercisesInTraining("legs");















    }


}
