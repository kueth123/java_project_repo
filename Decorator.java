
public abstract class Decorator implements Nameable {
    protected Nameable nameable;

    public Decorator(Nameable nameable) {
        this.nameable = nameable;
    }


    @Override
    public String getCorrectName() {
        return nameable.getCorrectName();
    }
}