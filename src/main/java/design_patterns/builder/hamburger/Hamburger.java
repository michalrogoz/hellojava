package design_patterns.builder.hamburger;

public class Hamburger {
    boolean withCheese;
    boolean withOnion;
    boolean withKetchup;
    String name;

    public Hamburger(Boolean withCheese, Boolean withOnion, Boolean withKetchup, String name) {
        this.withCheese = withCheese;
        this.withOnion = withOnion;
        this.withKetchup = withKetchup;
        this.name = name;
    }

    public static HamburgerBuilder builder() {
        return new HamburgerBuilder();
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "withCheese=" + withCheese +
                ", withOnion=" + withOnion +
                ", withKetchup=" + withKetchup +
                ", name='" + name + '\'' +
                '}';
    }
}
