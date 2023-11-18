public class CapitalizeDecorator extends Decorator {
    public CapitalizeDecorator(Nameable nameable) {
        super(nameable);
    }
    @Override
    public String getCorrectName() {
        String name = nameable.getCorrectName();
        return name.toUpperCase();
    }
}

