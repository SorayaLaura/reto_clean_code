package paso_2_TDD_y_diseno_emergente;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import paso_2_TDD_y_diseno_emergente.refactorizado.DiscountCalculator;

import static org.junit.jupiter.api.Assertions.*;

public class DiscountCalculatorTest {

    private DiscountCalculator discountCalculator;

    @BeforeEach
    void setUp() {
        discountCalculator = new DiscountCalculator();
    }

    @Test
    void testPreferente() {
        assertEquals(90.0, discountCalculator.calcularDescuento(100, "preferente"));
    }

    @Test
    void testVip() {
        assertEquals(160.0, discountCalculator.calcularDescuento(200, "vip"));
    }

    @Test
    void testNormal() {
        assertEquals(50.0, discountCalculator.calcularDescuento(50, "normal"));
    }
}
