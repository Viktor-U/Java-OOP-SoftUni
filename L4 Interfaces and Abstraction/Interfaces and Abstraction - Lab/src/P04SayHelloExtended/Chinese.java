package P04SayHelloExtended;

public class Chinese extends BasePerson{
    private String name;

    protected Chinese(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHello() {
        return "Djydjybydjy";
    }
}
