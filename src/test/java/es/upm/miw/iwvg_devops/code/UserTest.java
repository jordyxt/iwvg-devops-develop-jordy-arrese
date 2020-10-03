package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {
    @Test
    void testUserGetters() {
        User userTest = new User("1", "Jordy", "Arrese", new ArrayList<Fraction>());

        assertEquals("1", userTest.getId());
        assertEquals("Jordy", userTest.getName());
        assertEquals("Arrese", userTest.getFamilyName());
    }

    @Test
    void testUserSetters() {
        User userTest = new User();

        userTest.setName("Jordy");
        userTest.setFamilyName("Arrese");

        assertEquals("Jordy", userTest.getName());
        assertEquals("Arrese", userTest.getFamilyName());
    }

    @Test
    void testFraction() {
        User userTest = new User("1", "Jordy", "Arrese", new ArrayList<Fraction>());
        ArrayList<Fraction> listTest = new ArrayList<Fraction>();
        listTest.add(new Fraction(1, 2));
        userTest.setFractions(listTest);

        assertEquals(listTest.get(0).getNumerator(), userTest.getFractions().get(0).getNumerator());
        assertEquals(listTest.get(0).getDenominator(), userTest.getFractions().get(0).getDenominator());
    }

    @Test
    void testFullName() {
        User userTest = new User("1", "Jordy", "Arrese", new ArrayList<Fraction>());
        assertEquals("Jordy Arrese", userTest.fullName());
    }

    @Test
    void testInitials() {
        User userTest = new User("1", "Jordy", "Arrese", new ArrayList<Fraction>());
        assertEquals("J.", userTest.initials());
    }

    @Test
    void testToString() {
        User userTest = new User("1", "Jordy", "Arrese", new ArrayList<Fraction>());
        assertEquals("User{id='1', name='Jordy', familyName='Arrese', fractions=[]}", userTest.toString());
    }
}
