package P03Animals;

public class Dog extends Animal{


    protected Dog(String name, String favoriteFood) {
        super(name, favoriteFood);
    }
    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + "DJAAF";
    }

}
