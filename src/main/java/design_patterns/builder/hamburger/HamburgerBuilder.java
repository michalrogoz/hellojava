package design_patterns.builder.hamburger;

public class HamburgerBuilder {
    boolean withCheese;
    boolean withOnion;
    boolean withKetchup;
    String name;

    public HamburgerBuilder withCheese(Boolean withCheese) {
        this.withCheese = withCheese;
        return this;
    }

    public HamburgerBuilder withOnion(Boolean withOnion) {
        this.withOnion = withOnion;
        return this;
    }

    public HamburgerBuilder withKetchup(Boolean withKetchup) {
        this.withKetchup = withKetchup;
        return this;
    }

    public HamburgerBuilder name(String name) {
        this.name = name;
        return this;
    }


    public Hamburger build() {
        return new Hamburger(withCheese, withOnion, withKetchup, name);
    }


}
