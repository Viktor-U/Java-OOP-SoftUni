package animals;

public class Kitten extends Cat{
    private static final String TOMCAT_GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, TOMCAT_GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
