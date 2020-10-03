package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
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
