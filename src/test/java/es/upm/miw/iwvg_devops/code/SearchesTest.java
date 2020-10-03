package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindUserFamilyNameByAllNegativeSignFractionDistinct() {
        assertEquals(List.of("Blanco", "López"), new Searches().findUserFamilyNameByAllNegativeSignFractionDistinct()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameBySomeImproperFraction() {
        assertEquals(List.of("Fernandez", "Blanco", "López", "Torres", "Torres"), new Searches().findUserFamilyNameBySomeImproperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void TestFindFractionDivisionByUserId() {
        Fraction fractionTest = new Searches().findFractionDivisionByUserId("3");
        assertEquals(-48, fractionTest.getNumerator());
        assertEquals(60, fractionTest.getDenominator());
    }

    @Test
    void TestFindFirstProperFractionByUserId() {
        Fraction fractionTest = new Searches().findFirstProperFractionByUserId("2");
        assertEquals(-1, fractionTest.getNumerator());
        assertEquals(5, fractionTest.getDenominator());
    }
}
