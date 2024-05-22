package P04PizzaCalolries;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        double a = 1.5;
        if (flourType.equals("Wholegrain")){
            a = 1;
        }

        double b = 1;
        if (bakingTechnique.equals("Crispy")){
            b = 0.9;
        }else if (bakingTechnique.equals("Chewy")){
            b = 1.1;
        }

        return 2 * weight * a * b;
    }
}
