package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    void testFractionGetters() {
        Fraction fractionTest = new Fraction(1,2);

        assertEquals(1, fractionTest.getNumerator());
        assertEquals(2, fractionTest.getDenominator());
    }

    @Test
    void testFractionSetters() {
        Fraction fractionTest = new Fraction();

        fractionTest.setNumerator(1);
        fractionTest.setDenominator(2);

        assertEquals(1, fractionTest.getNumerator());
        assertEquals(2, fractionTest.getDenominator());
    }

    @Test
    void testDecimal() {
        Fraction fractionTest = new Fraction(1,2);

        assertEquals(0.5, fractionTest.decimal());
    }
    @Test
    void testToString() {
        Fraction fractionTest = new Fraction(1,2);
        assertEquals("Fraction{numerator=1, denominator=2}",fractionTest.toString());
    }
}
