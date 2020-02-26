package design_patterns.builder.hamburger;

public class HamTest {

    public static void main(String[] args) {
        Hamburger h1 = Hamburger.builder()
                .withKetchup(true)
                .withCheese(true)
                .build();

        Hamburger mcCostam = Hamburger.builder()
                .name("McCostam")
                .build();


        System.out.println(h1);
        System.out.println(mcCostam);
    }
}
