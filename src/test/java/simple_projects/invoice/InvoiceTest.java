package simple_projects.invoice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InvoiceTest {
    ExampleDataProvider dataProvider = new ExampleDataProvider();

    @Test
    public void testObliczSume() {

        Invoice invoice = dataProvider.getExampleInvoice();
        double sum = invoice.obliczSume();

        assertEquals(sum, 44.91);

    }

}