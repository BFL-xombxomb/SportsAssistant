public class Exercise  {

    private String name;
    private double currentWeight = 0;

    public Exercise (String name, double currentWeight) {

        this.name = name;
        this.currentWeight = currentWeight;
    }

    public String getName() {
        return name;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(double newCurrentWeight) {
        this.currentWeight = newCurrentWeight;
    }
}
