package Opdr3_1;

import Practica.Practicum2.Opdr2A.Zwembad;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ZwembadTest {

    @Test
    void testBerekenDeInhoud() {
        Zwembad z1 = new Zwembad(2, 2, 2);
            assertEquals(8,z1.inhoud(),"Inhoud NIET correct berekent");
    }
}