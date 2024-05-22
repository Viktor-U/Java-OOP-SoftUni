package P04SayHelloExtended;

public class Bulgarian extends BasePerson{

    private String name;

    protected Bulgarian(String name) {
        super(name);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getHello() {
        return "Здраей";
    }
}
