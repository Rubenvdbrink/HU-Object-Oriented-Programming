package Practica.Practicum8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {

    @Test
    public void equalsTest(){
        Auto a1 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");
        Auto a2 = new Auto("Mercedes-Benz A-klasse A 180", 29995.00, 2019, "4-ZTV-94");

        assertEquals(true,a1.equals(a2), "equals methode van de klasse Auto werkt niet.");
    }

}