package P03Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favouriteFood = favoriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favouriteFood;
    }

    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s", name, favouriteFood);
    }
}
