package P04SayHelloExtended;

public class European extends BasePerson{
    private String name;

    protected European(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHello() {
        return "Hello";
    }
}
