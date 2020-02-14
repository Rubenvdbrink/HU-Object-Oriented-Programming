package Practica.Practicum2.Opdr2B;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void testPunten(){
        Voetbalclub v1 = new Voetbalclub("FC Utrecht");
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('w');
        v1.verwerkResultaat('g');
        String str1 = v1.toString();
        String str2 = "FC Utrecht 3 2 1 0 7";
        assertEquals(7,v1.aantalPunten(),"totale aantalpunten(aantalPunten()) klopt niet");
        assertEquals(str2,str1, "toString van voetbalclub is niet correct");
    }
}