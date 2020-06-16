package simple_projects.invoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ElementTest {

    ExampleDataProvider dataProvider = new ExampleDataProvider();

    @Test
    public void shouldCalculateSumForElement() {

        Element element = dataProvider.elMleko;
        double sum = element.obliczWartosc();

        assertEquals(sum,14.97);

    }

}